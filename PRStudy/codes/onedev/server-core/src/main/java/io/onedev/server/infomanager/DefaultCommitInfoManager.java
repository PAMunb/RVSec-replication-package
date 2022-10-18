package io.onedev.server.infomanager;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.apache.commons.lang3.SerializationUtils;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevObject;
import org.eclipse.jgit.revwalk.RevWalk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;

import io.onedev.commons.loader.Listen;
import io.onedev.commons.utils.FileUtils;
import io.onedev.commons.utils.PathUtils;
import io.onedev.commons.utils.StringUtils;
import io.onedev.server.entitymanager.EmailAddressManager;
import io.onedev.server.entitymanager.ProjectManager;
import io.onedev.server.event.RefUpdated;
import io.onedev.server.event.entity.EntityRemoved;
import io.onedev.server.event.system.SystemStarted;
import io.onedev.server.git.GitContribution;
import io.onedev.server.git.GitContributor;
import io.onedev.server.git.GitUtils;
import io.onedev.server.git.command.FileChange;
import io.onedev.server.git.command.GitCommit;
import io.onedev.server.git.command.ListFileChangesCommand;
import io.onedev.server.git.command.ListFilesCommand;
import io.onedev.server.git.command.ListNumStatsCommand;
import io.onedev.server.git.command.LogCommand;
import io.onedev.server.git.command.RevListCommand;
import io.onedev.server.git.command.RevListCommand.Order;
import io.onedev.server.model.EmailAddress;
import io.onedev.server.model.Project;
import io.onedev.server.model.User;
import io.onedev.server.persistence.SessionManager;
import io.onedev.server.persistence.annotation.Sessional;
import io.onedev.server.storage.StorageManager;
import io.onedev.server.util.Day;
import io.onedev.server.util.ElementPumper;
import io.onedev.server.util.NameAndEmail;
import io.onedev.server.util.Pair;
import io.onedev.server.util.ProgrammingLanguageDetector;
import io.onedev.server.util.concurrent.BatchWorkManager;
import io.onedev.server.util.concurrent.BatchWorker;
import io.onedev.server.util.concurrent.Prioritized;
import jetbrains.exodus.ArrayByteIterable;
import jetbrains.exodus.ByteIterable;
import jetbrains.exodus.backup.BackupStrategy;
import jetbrains.exodus.backup.BackupStrategy.FileDescriptor;
import jetbrains.exodus.backup.VirtualFileDescriptor;
import jetbrains.exodus.env.Environment;
import jetbrains.exodus.env.Store;
import jetbrains.exodus.env.Transaction;
import jetbrains.exodus.env.TransactionalComputable;
import jetbrains.exodus.env.TransactionalExecutable;

@Singleton
public class DefaultCommitInfoManager extends AbstractMultiEnvironmentManager implements CommitInfoManager {

	private static final Logger logger = LoggerFactory.getLogger(DefaultCommitInfoManager.class);
	
	private static final int INFO_VERSION = 14;
	
	private static final long LOG_FILE_SIZE = 256*1024;
	
	private static final int COLLECT_BATCH_SIZE = 10000;
	
	private static final int MAX_HISTORY_PATHS = 100;
	
	private static final int MAX_COMMIT_FILES = 100;
	
	private static final String INFO_DIR = "commit";
	
	private static final String DEFAULT_STORE = "default";
	
	private static final String COMMITS_STORE = "commits";
	
	private static final String FIX_COMMITS_STORE = "fixCommits";
	
	private static final String COMMIT_COUNTS_STORE = "commitCounts";

	private static final String HISTORY_PATHS_STORE = "historyPaths";
	
	private static final String PATH_TO_INDEX_STORE = "pathToIndex";
	
	private static final String INDEX_TO_PATH_STORE = "indexToPath";
	
	private static final String USER_TO_INDEX_STORE = "userToIndex";
	
	private static final String INDEX_TO_USER_STORE = "indexToUser";
	
	private static final String EMAIL_TO_INDEX_STORE = "emailToIndex";
	
	private static final String DAILY_CONTRIBUTIONS_STORE = "dailyContributions";
	
	private static final ByteIterable NEXT_PATH_INDEX_KEY = new StringByteIterable("nextPathIndex");
	
	private static final ByteIterable NEXT_USER_INDEX_KEY = new StringByteIterable("nextUserIndex");
	
	private static final ByteIterable NEXT_EMAIL_INDEX_KEY = new StringByteIterable("nextEmailIndex");
	
	private static final ByteIterable LAST_COMMIT_KEY = new StringByteIterable("lastCommit");
	
	private static final ByteIterable LAST_COMMIT_OF_LINE_STATS_KEY = new StringByteIterable("lastCommitOfLineStats");
	
	private static final ByteIterable LAST_COMMIT_OF_CONTRIBS_KEY = new StringByteIterable("lastCommitOfContribs");
	
	private static final ByteIterable LAST_COMMIT_OF_FILES_KEY = new StringByteIterable("lastCommitOfFiles");
	
	private static final ByteIterable LINE_STATS_KEY = new StringByteIterable("lineStats");
	
	private static final ByteIterable USERS_KEY = new StringByteIterable("users");
	
	private static final ByteIterable FILES_KEY = new StringByteIterable("files");
	
	private static final ByteIterable OVERALL_CONTRIBUTIONS_KEY = new StringByteIterable("overallContributions");
	
	private static final ByteIterable COMMIT_COUNT_KEY = new StringByteIterable("commitCount");
	
	private static final int PRIORITY = 100;
		
	private final StorageManager storageManager;
	
	private final BatchWorkManager batchWorkManager;
	
	private final ProjectManager projectManager;
	
	private final SessionManager sessionManager;
	
	private final EmailAddressManager emailAddressManager;
	
	private final Map<Long, List<String>> filesCache = new ConcurrentHashMap<>();
	
	private final Map<Long, Integer> totalCommitCountCache = new ConcurrentHashMap<>();
	
	private final Map<Long, List<NameAndEmail>> usersCache = new ConcurrentHashMap<>();
	
	@Inject
	public DefaultCommitInfoManager(ProjectManager projectManager, StorageManager storageManager, 
			BatchWorkManager batchWorkManager, SessionManager sessionManager, 
			EmailAddressManager emailAddressManager) {
		this.projectManager = projectManager;
		this.storageManager = storageManager;
		this.batchWorkManager = batchWorkManager;
		this.sessionManager = sessionManager;
		this.emailAddressManager = emailAddressManager;
	}
	
	private boolean isCommitCollected(byte[] commitBytes) {
		/*
		 * Collected commits stores an additional byte to differentiate from those not collected but with parent 
		 * information stored 
		 */
		return commitBytes != null && commitBytes.length % 20 != 0;
	}
	
	private void doCollect(Project project, ObjectId commitId, String refName) {
		logger.debug("Collecting commit information (project: {}, ref: {})...", project.getPath(), refName);
		
		Environment env = getEnv(project.getId().toString());
		Store defaultStore = getStore(env, DEFAULT_STORE);
		Store commitsStore = getStore(env, COMMITS_STORE);
		Store commitCountsStore = getStore(env, COMMIT_COUNTS_STORE); 
		Store historyPathsStore = getStore(env, HISTORY_PATHS_STORE);
		Store pathToIndexStore = getStore(env, PATH_TO_INDEX_STORE);
		Store indexToPathStore = getStore(env, INDEX_TO_PATH_STORE);
		Store userToIndexStore = getStore(env, USER_TO_INDEX_STORE);
		Store emailToIndexStore = getStore(env, EMAIL_TO_INDEX_STORE);
		Store indexToUserStore = getStore(env, INDEX_TO_USER_STORE);
		Store fixCommitsStore = getStore(env, FIX_COMMITS_STORE);
		
		Repository repository = project.getRepository();

		Pair<byte[], ObjectId> result = env.computeInTransaction(new TransactionalComputable<Pair<byte[], ObjectId>>() {
			
			@Override
			public Pair<byte[], ObjectId> compute(Transaction txn) {
				ByteIterable commitKey = new CommitByteIterable(commitId);
				byte[] commitBytes = readBytes(commitsStore, txn, commitKey);
				
				ObjectId lastCommitId;
				byte[] lastCommitBytes = readBytes(defaultStore, txn, LAST_COMMIT_KEY);
				if (lastCommitBytes != null) {
					lastCommitId = ObjectId.fromRaw(lastCommitBytes);
					try {
						if (!repository.getObjectDatabase().has(lastCommitId))
							lastCommitId = null;
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				} else {
					lastCommitId = null;
				}
				
				return new Pair<>(commitBytes, lastCommitId);
			}
		});
		
		if (!isCommitCollected(result.getFirst())) {
			processCommitRange(project, commitId, result.getSecond(), new CommitRangeProcessor() {

				@Override
				public void process(ObjectId untilCommitId, ObjectId sinceCommitId) {
					env.executeInTransaction(new TransactionalExecutable() {
						
						@SuppressWarnings("unchecked")
						@Override
						public void execute(Transaction txn) {
							AtomicInteger totalCommitCount = new AtomicInteger(readInt(defaultStore, txn, COMMIT_COUNT_KEY, 0));
							
							NextIndex nextIndex = new NextIndex();
							nextIndex.user = readInt(defaultStore, txn, NEXT_USER_INDEX_KEY, 0);
							nextIndex.email = readInt(defaultStore, txn, NEXT_EMAIL_INDEX_KEY, 0);
							nextIndex.path = readInt(defaultStore, txn, NEXT_PATH_INDEX_KEY, 0);
							
							Map<Long, Integer> commitCountCache = new HashMap<>();
							
							Set<NameAndEmail> users;
							byte[] userBytes = readBytes(defaultStore, txn, USERS_KEY);
							if (userBytes != null)
								users = (Set<NameAndEmail>) SerializationUtils.deserialize(userBytes);
							else
								users = new HashSet<>();

							new ElementPumper<GitCommit>() {

								@Override
								public void generate(Consumer<GitCommit> consumer) {
									List<String> revisions = new ArrayList<>();
									revisions.add(untilCommitId.name());

									if (sinceCommitId != null)
										revisions.add("^" + sinceCommitId.name());

									EnumSet<LogCommand.Field> fields = EnumSet.allOf(LogCommand.Field.class);
									fields.remove(LogCommand.Field.LINE_CHANGES);
									new LogCommand(project.getGitDir()) {

										@Override
										protected void consume(GitCommit commit) {
											consumer.accept(commit);
										}
										
									}.revisions(revisions).fields(fields).call();
								}

								@Override
								public void process(GitCommit currentCommit) {
									ObjectId currentCommitId = ObjectId.fromString(currentCommit.getHash());
									ByteIterable currentCommitKey = new CommitByteIterable(currentCommitId);
									byte[] currentCommitBytes = readBytes(commitsStore, txn, currentCommitKey);
									
									if (!isCommitCollected(currentCommitBytes)) {
										totalCommitCount.incrementAndGet();
										
										byte[] newCurrentCommitBytes;
										if (currentCommitBytes == null) {
											newCurrentCommitBytes = new byte[1];
										} else {
											newCurrentCommitBytes = new byte[1+currentCommitBytes.length];
											System.arraycopy(currentCommitBytes, 0, newCurrentCommitBytes, 1, currentCommitBytes.length);
										}
										
										commitsStore.put(txn, currentCommitKey, new ArrayByteIterable(newCurrentCommitBytes));
										
										for (String parentCommitHash: currentCommit.getParentHashes()) {
											ByteIterable parentCommitKey = new CommitByteIterable(ObjectId.fromString(parentCommitHash));
											byte[] parentCommitBytes = readBytes(commitsStore, txn, parentCommitKey);
											byte[] newParentCommitBytes;
											if (parentCommitBytes != null) {
												newParentCommitBytes = new byte[parentCommitBytes.length+20];
												System.arraycopy(parentCommitBytes, 0, newParentCommitBytes, 0, parentCommitBytes.length);
											} else {
												newParentCommitBytes = new byte[20];
											}
											currentCommitId.copyRawTo(newParentCommitBytes, newParentCommitBytes.length-20);
											commitsStore.put(txn, parentCommitKey, new ArrayByteIterable(newParentCommitBytes));
										}
										
										String commitMessage = currentCommit.getSubject();
										if (currentCommit.getBody() != null)
											commitMessage += "\n\n" + currentCommit.getBody();
										
										for (Long issueId: project.parseFixedIssueIds(commitMessage)) {
											ByteIterable issueKey = new LongByteIterable(issueId);
											Collection<ObjectId> fixingCommits = readCommits(fixCommitsStore, txn, issueKey);
											
											boolean addNextCommit = true;
											for (Iterator<ObjectId> it = fixingCommits.iterator(); it.hasNext();) {
												ObjectId fixCommit = it.next();
												if (GitUtils.isMergedInto(project.getRepository(), null, fixCommit, currentCommitId)) { 
													it.remove();
												} else if (GitUtils.isMergedInto(project.getRepository(), null, currentCommitId, fixCommit)) {
													addNextCommit = false;
													break;
												}
											}
											if (addNextCommit)
												fixingCommits.add(currentCommitId);
											writeCommits(fixCommitsStore, txn, issueKey, fixingCommits);
										}
										
										if (currentCommit.getCommitter() != null)
											users.add(new NameAndEmail(currentCommit.getCommitter()));

										if (currentCommit.getAuthor() != null) {
											NameAndEmail nameAndEmail = new NameAndEmail(currentCommit.getAuthor());
											users.add(nameAndEmail);
											
											ByteIterable authorKey = new ArrayByteIterable(SerializationUtils.serialize(nameAndEmail));											
											int userIndex = readInt(userToIndexStore, txn, authorKey, -1);
											if (userIndex == -1) {
												userIndex = nextIndex.user++;
												writeInt(userToIndexStore, txn, authorKey, userIndex);
												indexToUserStore.put(txn, new IntByteIterable(userIndex), authorKey);
											}
											
											ByteIterable emailKey = new StringByteIterable(nameAndEmail.getEmailAddress());											
											int emailIndex = readInt(emailToIndexStore, txn, emailKey, -1);
											if (emailIndex == -1) {
												emailIndex = nextIndex.email++;
												writeInt(emailToIndexStore, txn, emailKey, emailIndex);
											}
											
											for (FileChange change: currentCommit.getFileChanges()) {
												for (String path: change.getPaths()) {
													int pathIndex = getPathIndex(pathToIndexStore, indexToPathStore, txn, 
															nextIndex, path);
													updateCommitCount(commitCountsStore, txn, commitCountCache, emailIndex, pathIndex);
													while (path.contains("/")) {
														path = StringUtils.substringBeforeLast(path, "/");
														pathIndex = getPathIndex(pathToIndexStore, indexToPathStore, txn, 
																nextIndex, path);
														updateCommitCount(commitCountsStore, txn, commitCountCache, emailIndex, pathIndex);
													}
													pathIndex = getPathIndex(pathToIndexStore, indexToPathStore, txn, 
															nextIndex, "");
													updateCommitCount(commitCountsStore, txn, commitCountCache, emailIndex, pathIndex);
												}
											}
										}
										
										for (FileChange change: currentCommit.getFileChanges()) {
											if (change.getOldPath() != null && change.getNewPath() != null 
													&& !change.getOldPath().equals(change.getNewPath())) {
												int pathIndex = getPathIndex(pathToIndexStore, indexToPathStore, txn, 
														nextIndex, change.getNewPath());
												ByteIterable pathKey = new IntByteIterable(pathIndex);
												Set<Integer> historyPathIndexes = new HashSet<>();
												byte[] bytesOfHistoryPaths = readBytes(historyPathsStore, txn, pathKey);
												if (bytesOfHistoryPaths == null) {
													bytesOfHistoryPaths = new byte[0];
													int pos = 0;
													for (int i=0; i<bytesOfHistoryPaths.length/Integer.SIZE; i++) {
														historyPathIndexes.add(ByteBuffer.wrap(bytesOfHistoryPaths, pos, Integer.SIZE).getInt());
														pos += Integer.SIZE;
													}
												} else {
													historyPathIndexes = new HashSet<>();
												}
												if (historyPathIndexes.size() < MAX_HISTORY_PATHS) {
													int oldPathIndex = getPathIndex(pathToIndexStore, indexToPathStore, txn, 
															nextIndex, change.getOldPath());
													if (!historyPathIndexes.contains(oldPathIndex)) {
														historyPathIndexes.add(oldPathIndex);
														byte[] newBytesOfHistoryPaths = 
																new byte[bytesOfHistoryPaths.length+Integer.SIZE];
														System.arraycopy(bytesOfHistoryPaths, 0, 
																newBytesOfHistoryPaths, 0, bytesOfHistoryPaths.length);
														ByteBuffer buffer = ByteBuffer.wrap(newBytesOfHistoryPaths, 
																bytesOfHistoryPaths.length, Integer.BYTES);
														buffer.putInt(oldPathIndex);
														historyPathsStore.put(txn, pathKey, 
																new ArrayByteIterable(newBytesOfHistoryPaths));
													}
												}
											}
										}											
									}
								}

							}.pump();

							writeInt(defaultStore, txn, COMMIT_COUNT_KEY, totalCommitCount.get());
							totalCommitCountCache.remove(project.getId());
							
							writeInt(defaultStore, txn, NEXT_USER_INDEX_KEY, nextIndex.user);
							writeInt(defaultStore, txn, NEXT_EMAIL_INDEX_KEY, nextIndex.email);
							writeInt(defaultStore, txn, NEXT_PATH_INDEX_KEY, nextIndex.path);
							
							userBytes = SerializationUtils.serialize((Serializable) users);
							defaultStore.put(txn, USERS_KEY, new ArrayByteIterable(userBytes));
							usersCache.remove(project.getId());
							
							for (Map.Entry<Long, Integer> entry: commitCountCache.entrySet()) 
								writeInt(commitCountsStore, txn, new LongByteIterable(entry.getKey()), entry.getValue());
							
							defaultStore.put(txn, LAST_COMMIT_KEY, new CommitByteIterable(untilCommitId));
						}
					});
				}
				
			});
		}
		
		if (GitUtils.branch2ref(project.getDefaultBranch()).equals(refName)) {
			collectLineStats(project, commitId);
			collectContribs(project, commitId);
			collectFiles(project, commitId);
		}		
		
		logger.debug("Collected commit information (project: {}, ref: {})", project.getPath(), refName);
	}

	private void collectContribs(Project project, ObjectId commitId) {
		Environment env = getEnv(project.getId().toString());
		Store defaultStore = getStore(env, DEFAULT_STORE);
		Store userToIndexStore = getStore(env, USER_TO_INDEX_STORE);
		Store dailyContributionsStore = getStore(env, DAILY_CONTRIBUTIONS_STORE);	
		
		Repository repository = project.getRepository();
		
		ObjectId lastCommitId = env.computeInTransaction(new TransactionalComputable<ObjectId>() {
			
			@Override
			public ObjectId compute(Transaction txn) {
				ObjectId lastCommitId;
				byte[] lastCommitBytes = readBytes(defaultStore, txn, LAST_COMMIT_OF_CONTRIBS_KEY);
				if (lastCommitBytes != null) {
					lastCommitId = ObjectId.fromRaw(lastCommitBytes);
					try {
						if (!repository.getObjectDatabase().has(lastCommitId))
							lastCommitId = null;
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				} else {
					lastCommitId = null;
				}
				return lastCommitId;
			}
		});
	
		processCommitRange(project, commitId, lastCommitId, new CommitRangeProcessor() {

			@Override
			public void process(ObjectId untilCommitId, ObjectId sinceCommitId) {
				env.executeInTransaction(new TransactionalExecutable() {
					
					@Override
					public void execute(Transaction txn) {
						Map<Integer, GitContribution> overallContributions = 
								deserializeContributions(readBytes(defaultStore, txn, OVERALL_CONTRIBUTIONS_KEY));
						
						Map<Integer, Map<Integer, GitContribution>> dailyContributionsCache = new HashMap<>();
						
						new ElementPumper<GitCommit>() {

							@Override
							public void generate(Consumer<GitCommit> consumer) {
								List<String> revisions = new ArrayList<>();
								revisions.add(untilCommitId.name());

								if (sinceCommitId != null)
									revisions.add("^" + sinceCommitId.name());

								EnumSet<LogCommand.Field> fields = EnumSet.of(
										LogCommand.Field.AUTHOR, 
										LogCommand.Field.COMMIT_DATE,
										LogCommand.Field.PARENTS,
										LogCommand.Field.LINE_CHANGES);
								
								new LogCommand(project.getGitDir()) {

									@Override
									protected void consume(GitCommit commit) {
										consumer.accept(commit);
									}
									
								}.revisions(revisions).fields(fields).call();
							}

							@Override
							public void process(GitCommit currentCommit) {
								if (currentCommit.getCommitDate() != null && currentCommit.getParentHashes().size() <= 1) {
									int dayValue = new Day(currentCommit.getCommitDate()).getValue();
									updateContribution(overallContributions, dayValue, currentCommit);

									if (currentCommit.getAuthor() != null) {
										NameAndEmail author = new NameAndEmail(currentCommit.getAuthor());
										ByteIterable authorKey = new ArrayByteIterable(SerializationUtils.serialize(author));											
										int userIndex = readInt(userToIndexStore, txn, authorKey, -1);
										Preconditions.checkState(userIndex != -1);

										Map<Integer, GitContribution> contributionsOnDay = dailyContributionsCache.get(dayValue);
										if (contributionsOnDay == null) {
											contributionsOnDay = deserializeContributions(readBytes(
													dailyContributionsStore, txn, new IntByteIterable(dayValue)));
											dailyContributionsCache.put(dayValue, contributionsOnDay);
										}
										updateContribution(contributionsOnDay, userIndex, currentCommit);
									}
								}
							}

						}.pump();
						
						for (Map.Entry<Integer, Map<Integer, GitContribution>> entry: dailyContributionsCache.entrySet()) {
							byte[] bytesOfContributionsOnDay = serializeContributions(entry.getValue());
							dailyContributionsStore.put(txn, new IntByteIterable(entry.getKey()), 
									new ArrayByteIterable(bytesOfContributionsOnDay));
						}
						defaultStore.put(txn, OVERALL_CONTRIBUTIONS_KEY, 
								new ArrayByteIterable(serializeContributions(overallContributions)));
						
						defaultStore.put(txn, LAST_COMMIT_OF_CONTRIBS_KEY, new CommitByteIterable(untilCommitId));
					}
					
				});
			}
			
		});
	}
	
	private void collectFiles(Project project, ObjectId commitId) {
		Environment env = getEnv(project.getId().toString());
		Store defaultStore = getStore(env, DEFAULT_STORE);
		
		Repository repository = project.getRepository();
		
		ObjectId lastCommitId = env.computeInTransaction(new TransactionalComputable<ObjectId>() {
			
			@Override
			public ObjectId compute(Transaction txn) {
				ObjectId lastCommitId;
				byte[] lastCommitBytes = readBytes(defaultStore, txn, LAST_COMMIT_OF_FILES_KEY);
				if (lastCommitBytes != null) {
					lastCommitId = ObjectId.fromRaw(lastCommitBytes);
					try {
						if (!repository.getObjectDatabase().has(lastCommitId))
							lastCommitId = null;
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				} else {
					lastCommitId = null;
				}
				return lastCommitId;
			}
		});

		if (lastCommitId == null) {
			env.executeInTransaction(new TransactionalExecutable() {
				
				@Override
				public void execute(Transaction txn) {
					ListFilesCommand command = new ListFilesCommand(project.getGitDir());
					Collection<String> files = command.revision(commitId.name()).call();
					
					byte[] bytesOfFiles = SerializationUtils.serialize((Serializable) files);
					defaultStore.put(txn, FILES_KEY, new ArrayByteIterable(bytesOfFiles));
					defaultStore.put(txn, LAST_COMMIT_OF_FILES_KEY, new CommitByteIterable(commitId));
					filesCache.remove(project.getId());
				}
				
			});
		} else {
			env.executeInTransaction(new TransactionalExecutable() {
				
				@SuppressWarnings("unchecked")
				@Override
				public void execute(Transaction txn) {
					Collection<String> files;
					byte[] bytesOfFiles = readBytes(defaultStore, txn, FILES_KEY);
					if (bytesOfFiles != null) 
						files = (Set<String>) SerializationUtils.deserialize(bytesOfFiles);
					else 
						files = new HashSet<>();
					
					boolean filesChanged = false;
					ListFileChangesCommand command = new ListFileChangesCommand(project.getGitDir());
					for (FileChange change: command.fromRev(lastCommitId.name()).toRev(commitId.name()).call()) {
						if (change.getOldPath() == null && change.getNewPath() != null) {
							files.add(change.getNewPath());
							filesChanged = true;
						} else if (change.getOldPath() != null && change.getNewPath() == null) {
							files.remove(change.getOldPath());
							filesChanged = true;
						}
					}

					if (filesChanged) {
						bytesOfFiles = SerializationUtils.serialize((Serializable) files);
						defaultStore.put(txn, FILES_KEY, new ArrayByteIterable(bytesOfFiles));
						defaultStore.put(txn, LAST_COMMIT_OF_FILES_KEY, new CommitByteIterable(commitId));
						filesCache.remove(project.getId());
					}
				}
				
			});
		} 
	}	
	
	private void collectLineStats(Project project, ObjectId commitId) {
		Environment env = getEnv(project.getId().toString());
		Store defaultStore = getStore(env, DEFAULT_STORE);
		
		Repository repository = project.getRepository();
		
		ObjectId lastCommitId = env.computeInTransaction(new TransactionalComputable<ObjectId>() {
			
			@Override
			public ObjectId compute(Transaction txn) {
				byte[] lastCommitBytes = readBytes(defaultStore, txn, LAST_COMMIT_OF_LINE_STATS_KEY);
				if (lastCommitBytes != null) {
					try {
						ObjectId lastCommitId = ObjectId.fromRaw(lastCommitBytes);
						if (repository.getObjectDatabase().has(lastCommitId) 
								&& GitUtils.isMergedInto(repository, null, lastCommitId, commitId)) {
							return lastCommitId;
						}
					} catch (IOException e) {
						throw new RuntimeException(e);
					} 
				} 
				return null;
			}
			
		});

		if (lastCommitId == null) {
			env.executeInTransaction(new TransactionalExecutable() {
				
				@Override
				public void execute(Transaction txn) {
					Map<Integer, Map<String, Integer>> lineStats = new HashMap<>();
					
					new ElementPumper<GitCommit>() {

						@Override
						public void generate(Consumer<GitCommit> consumer) {
							List<String> revisions = new ArrayList<>();
							revisions.add(commitId.name());

							EnumSet<LogCommand.Field> fields = EnumSet.of(
									LogCommand.Field.COMMIT_DATE, 
									LogCommand.Field.LINE_CHANGES);
							
							new LogCommand(project.getGitDir()) {

								@Override
								protected void consume(GitCommit commit) {
									consumer.accept(commit);
								}
								
							}.firstParent(true).revisions(revisions).fields(fields).call();
						}

						@Override
						public void process(GitCommit currentCommit) {
							updateLineStats(txn, currentCommit, lineStats);
						}
						
					}.pump();
					
					byte[] bytesOfLineStats = SerializationUtils.serialize((Serializable) lineStats);
					defaultStore.put(txn, LINE_STATS_KEY, new ArrayByteIterable(bytesOfLineStats));
					
					defaultStore.put(txn, LAST_COMMIT_OF_LINE_STATS_KEY, new CommitByteIterable(commitId));
				}
				
			});
		} else {
			env.executeInTransaction(new TransactionalExecutable() {
				
				@SuppressWarnings("unchecked")
				@Override
				public void execute(Transaction txn) {
					Map<Integer, Map<String, Integer>> lineStats;
					byte[] bytesOfLineStats = readBytes(defaultStore, txn, LINE_STATS_KEY);
					if (bytesOfLineStats != null) {
						lineStats = (Map<Integer, Map<String, Integer>>) SerializationUtils.deserialize(
								bytesOfLineStats);
					} else {
						lineStats = new HashMap<>();
					}
					
					ListNumStatsCommand command = new ListNumStatsCommand(project.getGitDir());
					List<FileChange> fileChanges = command.fromRev(lastCommitId.name()).toRev(commitId.name()).call();
					RevCommit revCommit = project.getRevCommit(commitId, true);
					GitCommit gitCommit = new GitCommit(revCommit.name(), null, null, revCommit.getAuthorIdent(), 
							revCommit.getCommitterIdent().getWhen(), null, null, fileChanges);
					
					updateLineStats(txn, gitCommit, lineStats);

					bytesOfLineStats = SerializationUtils.serialize((Serializable) lineStats);
					defaultStore.put(txn, LINE_STATS_KEY, new ArrayByteIterable(bytesOfLineStats));
					
					defaultStore.put(txn, LAST_COMMIT_OF_LINE_STATS_KEY, new CommitByteIterable(commitId));
				}
				
			});
		}		
	}
	
	private void processCommitRange(Project project, ObjectId untilCommitId, 
			@Nullable ObjectId sinceCommitId, CommitRangeProcessor commitRangeProcessor) {
		RevListCommand revList = new RevListCommand(project.getGitDir());
		List<String> revisions = new ArrayList<>();
		revisions.add(untilCommitId.name());
		if (sinceCommitId != null) 
			revisions.add("^" + sinceCommitId.name());
		revList.revisions(revisions).order(Order.TOPO);
		
		List<ObjectId> historyIds = new ArrayList<>();
		for (String commitHash: revList.call()) 
			historyIds.add(ObjectId.fromString(commitHash));
		
		revList = new RevListCommand(project.getGitDir());
		revList.revisions(revisions).order(null).firstParent(true);
		
		Set<ObjectId> firstParentIds = new HashSet<>();
		for (String commitHash: revList.call()) 
			firstParentIds.add(ObjectId.fromString(commitHash));

		/*
		 * Instead of collecting information of master branch all at once, we identify some  
		 * intermediate commits and collect the information using these intermediate commits 
		 * multiple times for two reasons:
		 * 1. Use less memory
		 * 2. Commit Exodus transaction sooner so user can use auto-completion when search 
		 * commits even if collection is not done yet
		 */
		List<ObjectId> intermediateCommitIds = new ArrayList<>();
		int count = 0;
		for (ObjectId historyId: historyIds) {
			count++;
			/*
			 * Only use intermediate commits that are part of first parent chain. This 
			 * makes sure that subsequent intermediate commits are always ancestor of 
			 * current intermediate commit (after reverse done below), to avoid 
			 * collecting some commits multiple times
			 */
			if (count > COLLECT_BATCH_SIZE && firstParentIds.contains(historyId)) {
				intermediateCommitIds.add(historyId);
				count = 0;
			}
		}

		Collections.reverse(intermediateCommitIds);
		intermediateCommitIds.add(untilCommitId);
		
		for(ObjectId intermediateCommitId: intermediateCommitIds) {
			commitRangeProcessor.process(intermediateCommitId, sinceCommitId);
			sinceCommitId = intermediateCommitId;
		}		
	}
		
	private void updateLineStats(Transaction txn, GitCommit currentCommit, Map<Integer, Map<String, Integer>> lineStats) {		
		int dayValue = new Day(currentCommit.getCommitDate()).getValue();
		
		Map<String, Integer> lineStatsOnDay = lineStats.get(dayValue);
		if (lineStatsOnDay == null) {
			lineStatsOnDay = new HashMap<>();
			lineStats.put(dayValue, lineStatsOnDay);
		}
		
		Map<String, Integer> languageLines = new HashMap<>();
		for (FileChange change: currentCommit.getFileChanges()) {
			int lines = change.getAdditions() - change.getDeletions();
			if (lines != 0 && !change.getNewExtension().equals("")) {
				String language = ProgrammingLanguageDetector.getLanguageForExtension(change.getNewExtension());
				if (language != null) {
					Integer accumulatedLines = languageLines.get(language);
					if (accumulatedLines != null) 
						lines += accumulatedLines;
					languageLines.put(language, lines);
				}
			}
		}
		
		for (Map.Entry<String, Integer> entry: languageLines.entrySet()) {
			String language = entry.getKey();
			Integer lines = entry.getValue();
			Integer accumulatedLines = lineStatsOnDay.get(language);
			if (accumulatedLines != null)
				lines += accumulatedLines;
			lineStatsOnDay.put(language, lines);
		}
	}
	
	private int getPathIndex(Store pathToIndexStore, Store indexToPathStore, Transaction txn, 
			NextIndex nextIndex, String path) {
		StringByteIterable pathKey = new StringByteIterable(path);
		int pathIndex = readInt(pathToIndexStore, txn, pathKey, -1);
		if (pathIndex == -1) {
			pathIndex = nextIndex.path++;
			writeInt(pathToIndexStore, txn, pathKey, pathIndex);
			indexToPathStore.put(txn, new IntByteIterable(pathIndex), new StringByteIterable(path));
		}
		return pathIndex;
	}
	
	private void updateCommitCount(Store store, Transaction txn, 
			Map<Long, Integer> commitCountCache, int emailIndex, int pathIndex) {
		long commitCountKey = ((long)emailIndex<<32)|pathIndex;
		
		Integer commitCountOfPathByEmail = commitCountCache.get(commitCountKey);
		if (commitCountOfPathByEmail == null)
			commitCountOfPathByEmail = readInt(store, txn, new LongByteIterable(commitCountKey), 0);
		commitCountOfPathByEmail ++;
		commitCountCache.put(commitCountKey, commitCountOfPathByEmail);
	}
	
	public List<NameAndEmail> getUsers(Project project) {
		List<NameAndEmail> users = usersCache.get(project.getId());
		if (users == null) {
			Environment env = getEnv(project.getId().toString());
			Store store = getStore(env, DEFAULT_STORE);

			users = env.computeInReadonlyTransaction(new TransactionalComputable<List<NameAndEmail>>() {

				@SuppressWarnings("unchecked")
				@Override
				public List<NameAndEmail> compute(Transaction txn) {
					byte[] bytes = readBytes(store, txn, USERS_KEY);
					if (bytes != null) { 
						List<NameAndEmail> users = 
								new ArrayList<>((Set<NameAndEmail>) SerializationUtils.deserialize(bytes));
						Collections.sort(users);
						return users;
					} else { 
						return new ArrayList<>();
					}
				}
				
			});
			usersCache.put(project.getId(), users);
		}
		return users;	
	}

	@Override
	public List<String> getFiles(Project project) {
		List<String> files = filesCache.get(project.getId());
		if (files == null) {
			Environment env = getEnv(project.getId().toString());
			Store store = getStore(env, DEFAULT_STORE);

			files = env.computeInReadonlyTransaction(new TransactionalComputable<List<String>>() {

				@SuppressWarnings("unchecked")
				@Override
				public List<String> compute(Transaction txn) {
					byte[] bytes = readBytes(store, txn, FILES_KEY);
					if (bytes != null) {
						List<String> files = new ArrayList<>((Collection<String>)SerializationUtils.deserialize(bytes));
						Map<String, List<String>> segmentsMap = new HashMap<>();
						Splitter splitter = Splitter.on("/");
						for (String file: files) 
							segmentsMap.put(file, splitter.splitToList(file));
						files.sort(new Comparator<String>() {

							@Override
							public int compare(String o1, String o2) {
								return PathUtils.compare(segmentsMap.get(o1), segmentsMap.get(o2));
							}
							
						});
						return files;
					} else {
						return new ArrayList<>();
					}
				}
			});
			filesCache.put(project.getId(), files);
		}
		return files;
	}

	@Override
	public Map<Day, Map<String, Integer>> getLineIncrements(Project project) {
		Environment env = getEnv(project.getId().toString());
		Store store = getStore(env, DEFAULT_STORE);

		return env.computeInReadonlyTransaction(new TransactionalComputable<Map<Day, Map<String, Integer>>>() {

			@Override
			public Map<Day, Map<String, Integer>> compute(Transaction txn) {
				Map<Day, Map<String, Integer>> lineIncrements = new HashMap<>();
				byte[] bytes = readBytes(store, txn, LINE_STATS_KEY);
				if (bytes != null) {
					@SuppressWarnings("unchecked")
					Map<Integer, Map<String, Integer>> storedMap = 
							(Map<Integer, Map<String, Integer>>) SerializationUtils.deserialize(bytes);
					for (Map.Entry<Integer, Map<String, Integer>> entry: storedMap.entrySet())
						lineIncrements.put(new Day(entry.getKey()), entry.getValue());
				} 
				return lineIncrements;
			}
			
		});
	}
	
	private void updateContribution(Map<Integer, GitContribution> contributions, int key, GitCommit commit) {
		GitContribution contribution = contributions.get(key);
		if (contribution != null) {
			contribution = new GitContribution(
					contribution.getCommits()+1, 
					contribution.getAdditions()+commit.getAdditions(), 
					contribution.getDeletions()+commit.getDeletions());
		} else {
			contribution = new GitContribution(1, commit.getAdditions(), commit.getDeletions());
		}
		contributions.put(key, contribution);
	}
	
	@Override
	public int getCommitCount(Project project, User user, String path) {
		Environment env = getEnv(project.getId().toString());
		Store emailToIndexStore = getStore(env, EMAIL_TO_INDEX_STORE);
		Store pathToIndexStore = getStore(env, PATH_TO_INDEX_STORE);
		Store commitCountStore = getStore(env, COMMIT_COUNTS_STORE);

		return env.computeInReadonlyTransaction(new TransactionalComputable<Integer>() {

			@Override
			public Integer compute(Transaction txn) {
				AtomicInteger count = new AtomicInteger(0);
				user.getEmailAddresses().stream().filter(it->it.isVerified()).forEach(it-> {
					int emailIndex = readInt(emailToIndexStore, txn, new StringByteIterable(it.getValue()), -1);
					if (emailIndex != -1) {
						int pathIndex = readInt(pathToIndexStore, txn, new StringByteIterable(path), -1);
						if (pathIndex != -1) {
							long commitCountKey = ((long)emailIndex<<32)|pathIndex;
							count.addAndGet(readInt(commitCountStore, txn, new LongByteIterable(commitCountKey), 0));
						} 
					} 
				});
				return count.get();
			}
		});
	}
	
	@Override
	public Collection<ObjectId> getDescendants(Project project, Collection<ObjectId> ancestors) {
		Environment env = getEnv(project.getId().toString());
		final Store store = getStore(env, COMMITS_STORE);

		return env.computeInReadonlyTransaction(new TransactionalComputable<Set<ObjectId>>() {

			@Override
			public Set<ObjectId> compute(Transaction txn) {
				Set<ObjectId> descendants = new HashSet<>();
				
				// Use stack instead of recursion to avoid StackOverflowException
				Stack<ObjectId> stack = new Stack<>();
				descendants.addAll(ancestors);
				stack.addAll(ancestors);
				while (!stack.isEmpty()) {
					ObjectId current = stack.pop();
					byte[] valueBytes = readBytes(store, txn, new CommitByteIterable(current));
					if (valueBytes != null) {
						if (valueBytes.length % 20 == 0) {
							for (int i=0; i<valueBytes.length/20; i++) {
								ObjectId child = ObjectId.fromRaw(valueBytes, i*20);
								if (!descendants.contains(child)) {
									descendants.add(child);
									stack.push(child);
								}
							}
						} else { 
							for (int i=0; i<(valueBytes.length-1)/20; i++) {
								ObjectId child = ObjectId.fromRaw(valueBytes, i*20+1);
								if (!descendants.contains(child)) {
									descendants.add(child);
									stack.push(child);
								}
							}
						}
					}
				}
				
				return descendants;
			}
			
		});
	}

	@Listen
	public void on(EntityRemoved event) {
		if (event.getEntity() instanceof Project) {
			Long projectId = event.getEntity().getId();
			removeEnv(projectId.toString());
			filesCache.remove(projectId);
			totalCommitCountCache.remove(projectId);
			usersCache.remove(projectId);
		}
	}
	
	private BatchWorker getBatchWorker(Long projectId) {
		return new BatchWorker("project-" + projectId + "-collectCommitInfo") {

			@Override
			public void doWorks(Collection<Prioritized> works) {
				sessionManager.run(new Runnable() {

					@Override
					public void run() {
						Project project = projectManager.load(projectId);
						List<CollectingWork> collectingWorks = new ArrayList<>();
						for (Object work: works)
							collectingWorks.add((CollectingWork)work);
						Collections.sort(collectingWorks, new CommitTimeComparator());
						
						for (CollectingWork work: collectingWorks) 
							doCollect(project, work.getCommit().copy(), work.getRefName());
					}
					
				});
			}
			
		};		
	}
	
	private void collect(Project project) {
		List<CollectingWork> works = new ArrayList<>();
		try (RevWalk revWalk = new RevWalk(project.getRepository())) {
			Collection<Ref> refs = new ArrayList<>();
			refs.addAll(project.getRepository().getRefDatabase().getRefsByPrefix(Constants.R_HEADS));
			refs.addAll(project.getRepository().getRefDatabase().getRefsByPrefix(Constants.R_TAGS));

			for (Ref ref: refs) {
				RevObject revObj = revWalk.peel(revWalk.parseAny(ref.getObjectId()));
				if (revObj instanceof RevCommit)
					works.add(new CollectingWork(PRIORITY, (RevCommit) revObj, ref.getName()));
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		Collections.sort(works, new CommitTimeComparator());
		
		for (CollectingWork work: works)
			batchWorkManager.submit(getBatchWorker(project.getId()), work);
	}

	@Sessional
	@Listen
	public void on(SystemStarted event) {
		for (Project project: projectManager.query()) {
			checkVersion(getEnvDir(project.getId().toString()));
			collect(project);
		}
	}
	
	@Sessional
	@Listen
	public void on(RefUpdated event) {
		if (!event.getNewCommitId().equals(ObjectId.zeroId()) 
				&& (event.getRefName().startsWith(Constants.R_HEADS) 
						|| event.getRefName().startsWith(Constants.R_TAGS))) {
			try (RevWalk revWalk = new RevWalk(event.getProject().getRepository())) {
				RevCommit commit = GitUtils.parseCommit(revWalk, event.getNewCommitId());
				if (commit != null) {
					CollectingWork work = new CollectingWork(PRIORITY, commit, event.getRefName());
					batchWorkManager.submit(getBatchWorker(event.getProject().getId()), work);
				}
			}
		}
	}

	@Sessional
	@Override
	public int getCommitCount(Project project) {
		Integer commitCount = totalCommitCountCache.get(project.getId());
		if (commitCount == null) {
			Environment env = getEnv(project.getId().toString());
			Store store = getStore(env, DEFAULT_STORE);

			commitCount = env.computeInReadonlyTransaction(new TransactionalComputable<Integer>() {

				@Override
				public Integer compute(Transaction txn) {
					return readInt(store, txn, COMMIT_COUNT_KEY, 0);
				}
			});
			totalCommitCountCache.put(project.getId(), commitCount);
		}
		return commitCount;
	}

	static class CollectingWork extends Prioritized {
		
		private final String refName;
		
		private final RevCommit commit;
		
		public CollectingWork(int priority, RevCommit commit, String refName) {
			super(priority);
			this.commit = commit;
			this.refName = refName;
		}

		public RevCommit getCommit() {
			return commit;
		}

		public String getRefName() {
			return refName;
		}

	}
	
	static class CommitTimeComparator implements Comparator<CollectingWork> {

		@Override
		public int compare(CollectingWork o1, CollectingWork o2) {
			return o1.getCommit().getCommitTime() - o2.getCommit().getCommitTime();
		}
		
	}

	@Sessional
	@Override
	public void cloneInfo(Project source, Project target) {
		BackupStrategy backupStrategy = getEnv(source.getId().toString()).getBackupStrategy();
		try {
			File targetDir = getEnvDir(target.getId().toString());
			backupStrategy.beforeBackup();
			try {
				for (VirtualFileDescriptor descriptor: backupStrategy.getContents()) {
					FileUtils.copyFileToDirectory(((FileDescriptor)descriptor).getFile(), targetDir);
				}
			} finally {
				backupStrategy.afterBackup();
			}
			writeVersion(getEnvDir(target.getId().toString()));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected File getEnvDir(String envKey) {
		File infoDir = new File(storageManager.getProjectInfoDir(Long.valueOf(envKey)), INFO_DIR);
		if (!infoDir.exists()) 
			FileUtils.createDir(infoDir);
		return infoDir;
	}
	
	@Sessional
	@Override
	public Collection<String> getHistoryPaths(Project project, String path) {
		Environment env = getEnv(project.getId().toString());
		Store historyPathsStore = getStore(env, HISTORY_PATHS_STORE);
		Store pathToIndexStore = getStore(env, PATH_TO_INDEX_STORE);
		Store indexToPathStore = getStore(env, INDEX_TO_PATH_STORE);
		
		return env.computeInReadonlyTransaction(new TransactionalComputable<Collection<String>>() {

			private Collection<String> getPaths(Transaction txn, Set<Integer> pathIndexes) {
				Set<String> paths = new HashSet<>();
				for (int pathIndex: pathIndexes) {
					byte[] pathBytes = readBytes(indexToPathStore, txn, new IntByteIterable(pathIndex));
					if (pathBytes != null)
						paths.add(new String(pathBytes, StandardCharsets.UTF_8));
				}
				return paths;
			}
			
			@Override
			public Collection<String> compute(Transaction txn) {
				int pathIndex = readInt(pathToIndexStore, txn, new StringByteIterable(path), -1);
				if (pathIndex != -1) {
					Set<Integer> pathIndexes = new HashSet<>();
					pathIndexes.add(pathIndex);
					while (true) {
						Set<Integer> newPathIndexes = new HashSet<>(pathIndexes);
						for (int eachPathIndex: pathIndexes) {
							byte[] bytesOfHistoryPaths = 
									readBytes(historyPathsStore, txn, new IntByteIterable(eachPathIndex));
							if (bytesOfHistoryPaths != null) {
								int pos = 0;
								for (int i=0; i<bytesOfHistoryPaths.length/Integer.BYTES; i++) {
									newPathIndexes.add(ByteBuffer.wrap(bytesOfHistoryPaths, pos, Integer.BYTES).getInt());
									if (newPathIndexes.size() == MAX_HISTORY_PATHS)
										return getPaths(txn, newPathIndexes);
									pos += Integer.BYTES;
								}
							}
						}
						if (pathIndexes.equals(newPathIndexes))
							break;
						else
							pathIndexes = newPathIndexes;
					}
					return getPaths(txn, pathIndexes);
				} else {
					return new HashSet<>();
				}
			}
		});
	}
	
	@Sessional
	@Override
	public Map<Day, GitContribution> getOverallContributions(Project project) {
		Environment env = getEnv(project.getId().toString());
		Store store = getStore(env, DEFAULT_STORE);

		return env.computeInReadonlyTransaction(new TransactionalComputable<Map<Day, GitContribution>>() {

			@Override
			public Map<Day, GitContribution> compute(Transaction txn) {
				Map<Day, GitContribution> overallContributions = new HashMap<>();
				for (Map.Entry<Integer, GitContribution> entry: 
							deserializeContributions(readBytes(store, txn, OVERALL_CONTRIBUTIONS_KEY)).entrySet()) {
					overallContributions.put(new Day(entry.getKey()), entry.getValue());
				}
				return overallContributions;
			}
			
		});
	}
	
	@Sessional
	@Override
	public List<GitContributor> getTopContributors(Project project, int top, GitContribution.Type type, 
			int fromDay, int toDay) {
		Environment env = getEnv(project.getId().toString());
		Store defaultStore = getStore(env, DEFAULT_STORE);
		Store indexToUserStore = getStore(env, INDEX_TO_USER_STORE);
		Store dailyContributionsStore = getStore(env, DAILY_CONTRIBUTIONS_STORE);
		
		return env.computeInReadonlyTransaction(new TransactionalComputable<List<GitContributor>>() {

			@Nullable
			private NameAndEmail getUser(Transaction txn, Map<Integer, Optional<NameAndEmail>> users, 
					Integer userIndex) {
				Optional<NameAndEmail> userOpt = users.get(userIndex);
				if (userOpt == null) {
					byte[] userBytes = readBytes(indexToUserStore, txn, new IntByteIterable(userIndex));
					if (userBytes != null) { 
						NameAndEmail user = (NameAndEmail) SerializationUtils.deserialize(userBytes);
						EmailAddress emailAddress = emailAddressManager.findByValue(user.getEmailAddress());
						if (emailAddress != null && emailAddress.isVerified()) {
							User owner = emailAddress.getOwner();
							EmailAddress primaryEmailAddress = owner.getPrimaryEmailAddress();
							if (primaryEmailAddress != null && primaryEmailAddress.isVerified())
								user = new NameAndEmail(owner.getDisplayName(), primaryEmailAddress.getValue());
							else
								user = new NameAndEmail(owner.getDisplayName(), emailAddress.getValue());
						}
						userOpt = Optional.of(user);
					} else { 
						userOpt = Optional.empty();
					}
					users.put(userIndex, userOpt);
				}
				return userOpt.orElse(null);
			}
			
			@Override
			public List<GitContributor> compute(Transaction txn) {
				Map<Integer, GitContribution> overallContributions = 
						deserializeContributions(readBytes(defaultStore, txn, OVERALL_CONTRIBUTIONS_KEY));
				Map<NameAndEmail, GitContribution> totalContributions = new HashMap<>();
				Map<Integer, Optional<NameAndEmail>> users = new HashMap<>();
				Map<Integer, Map<Integer, GitContribution>> contributionsByDay = new LinkedHashMap<>();
				
				for (int dayValue: overallContributions.keySet()) {
					if (dayValue >= fromDay && dayValue <= toDay) {
						ByteIterable dayKey = new IntByteIterable(dayValue);
						Map<Integer, GitContribution> contributionsOnDay = 
								deserializeContributions(readBytes(dailyContributionsStore, txn, dayKey));
						contributionsByDay.put(dayValue, contributionsOnDay);
						for (Map.Entry<Integer, GitContribution> entry: contributionsOnDay.entrySet()) {
							NameAndEmail user = getUser(txn, users, entry.getKey());
							if (user != null) {
								GitContribution totalContribution = totalContributions.get(user);
								if (totalContribution == null) {
									totalContribution = entry.getValue();
								} else {
									totalContribution = new GitContribution(
											totalContribution.getCommits() + entry.getValue().getCommits(), 
											totalContribution.getAdditions() + entry.getValue().getAdditions(), 
											totalContribution.getDeletions() + entry.getValue().getDeletions());
								}
								totalContributions.put(user, totalContribution);
							}
						}
					}
				}
				
				List<NameAndEmail> topUsers = new ArrayList<>(totalContributions.keySet());
				Collections.sort(topUsers, new Comparator<NameAndEmail>() {

					@Override
					public int compare(NameAndEmail o1, NameAndEmail o2) {
						if (type == GitContribution.Type.COMMITS)
							return totalContributions.get(o2).getCommits() - totalContributions.get(o1).getCommits();
						else if (type == GitContribution.Type.ADDITIONS)
							return totalContributions.get(o2).getAdditions() - totalContributions.get(o1).getAdditions();
						else
							return totalContributions.get(o2).getDeletions() - totalContributions.get(o1).getDeletions();
					}
					
				});

				if (top < topUsers.size())
					topUsers = topUsers.subList(0, top);
				
				Set<NameAndEmail> topUserSet = new HashSet<>(topUsers);
				
				Map<NameAndEmail, Map<Day, Integer>> userContributions = new HashMap<>();
				
				for (Map.Entry<Integer, Map<Integer, GitContribution>> dayEntry: contributionsByDay.entrySet()) {
					for (Map.Entry<Integer, GitContribution> userEntry: dayEntry.getValue().entrySet()) {
						NameAndEmail user = getUser(txn, users, userEntry.getKey());
						if (user != null && topUserSet.contains(user)) {
							Map<Day, Integer> contributionsOfUser = userContributions.get(user);
							if (contributionsOfUser == null) {
								contributionsOfUser = new HashMap<>();
								userContributions.put(user, contributionsOfUser);
							}
							Day day = new Day(dayEntry.getKey());
							if (type == GitContribution.Type.COMMITS)
								contributionsOfUser.put(day, userEntry.getValue().getCommits());
							else if (type == GitContribution.Type.ADDITIONS)
								contributionsOfUser.put(day, userEntry.getValue().getAdditions());
							else
								contributionsOfUser.put(day, userEntry.getValue().getDeletions());
						}
					}
				}

				List<GitContributor> topContributors = new ArrayList<>();
				
				for (NameAndEmail user: topUsers) {
					topContributors.add(new GitContributor(user.asPersonIdent(), 
							totalContributions.get(user), userContributions.get(user)));
				}
				
				return topContributors;
			}
			
		});
	}

	private Map<Integer, GitContribution> deserializeContributions(byte[] bytes) {
		if (bytes != null) {
			Map<Integer, GitContribution> contributions = new HashMap<>();
			int pos = 0;
			for (int i=0; i<bytes.length/4/Integer.BYTES; i++) {
				int key = ByteBuffer.wrap(bytes, pos, Integer.BYTES).getInt();
				pos += Integer.BYTES;
				int commits = ByteBuffer.wrap(bytes, pos, Integer.BYTES).getInt(); 
				pos += Integer.BYTES;
				int additions = ByteBuffer.wrap(bytes, pos, Integer.BYTES).getInt();
				pos += Integer.BYTES;
				int deletions = ByteBuffer.wrap(bytes, pos, Integer.BYTES).getInt(); 
				pos += Integer.BYTES;
				contributions.put(key, new GitContribution(commits, additions, deletions));
			}
			return contributions;
		} else {
			return new HashMap<>();
		}
	}
	
	private byte[] serializeContributions(Map<Integer, GitContribution> contributions) {
		byte[] bytes = new byte[contributions.size()*Integer.BYTES*4];
		int pos = 0;
		for (Map.Entry<Integer, GitContribution> entry: contributions.entrySet()) {
			byte[] keyBytes = ByteBuffer.allocate(Integer.BYTES).putInt(entry.getKey()).array(); 
			System.arraycopy(keyBytes, 0, bytes, pos, Integer.BYTES);
			pos += Integer.BYTES;
			byte[] commitsBytes = ByteBuffer.allocate(Integer.BYTES).putInt(entry.getValue().getCommits()).array();
			System.arraycopy(commitsBytes, 0, bytes, pos, Integer.BYTES);
			pos += Integer.BYTES;
			byte[] additionsBytes = ByteBuffer.allocate(Integer.BYTES).putInt(entry.getValue().getAdditions()).array();
			System.arraycopy(additionsBytes, 0, bytes, pos, Integer.BYTES);
			pos += Integer.BYTES;
			byte[] deletionsBytes = ByteBuffer.allocate(Integer.BYTES).putInt(entry.getValue().getDeletions()).array();
			System.arraycopy(deletionsBytes, 0, bytes, pos, Integer.BYTES);
			pos += Integer.BYTES;
		}
		return bytes;
	}
	
	@Override
	protected long getLogFileSize() {
		return LOG_FILE_SIZE;
	}

	@Override
	protected int getEnvVersion() {
		return INFO_VERSION;
	}

	@Override
	public Collection<ObjectId> getFixCommits(Project project, Long issueId) {
		Environment env = getEnv(project.getId().toString());
		Store store = getStore(env, FIX_COMMITS_STORE);
		
		return env.computeInTransaction(new TransactionalComputable<Collection<ObjectId>>() {
			
			@Override
			public Collection<ObjectId> compute(Transaction txn) {
				return readCommits(store, txn, new LongByteIterable(issueId));
			}
			
		});
		
	}
	
	@Override
	public void sortUsersByContribution(List<User> users, Project project, Collection<String> files) {
		if (users.size() <= 1)
			return;
		
		Map<User, Long> commitCounts = new HashMap<>();
		for (User user: users)
			commitCounts.put(user, 0L);

		int count = 0;
		for (String path: files) {
			int addedCommitCount = addCommitCounts(project, commitCounts, path);
			while (addedCommitCount == 0) {
				if (path.contains("/")) {
					path = StringUtils.substringBeforeLast(path, "/");
					addedCommitCount = addCommitCounts(project, commitCounts, path);
				} else {
					addCommitCounts(project, commitCounts, "");
					break;
				}
			}
			if (++count >= MAX_COMMIT_FILES)
				break;
		}

		Collections.sort(users, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				if (commitCounts.get(o1) < commitCounts.get(o2))
					return 1;
				else
					return -1;
			}
			
		});
	}
	
	private int addCommitCounts(Project project, Map<User, Long> commitCounts, String path) {
		int addedCommitCount = 0;
		for (Map.Entry<User, Long> entry: commitCounts.entrySet()) {
			User user = entry.getKey();
			int commitCount = getCommitCount(project, user, path);
			entry.setValue(entry.getValue() + commitCount);
			addedCommitCount += commitCount;
		}
		return addedCommitCount;
	}

	private static class NextIndex {
		int user;
		
		int email;
		
		int path;
	}

	private static interface CommitRangeProcessor {
		
		void process(ObjectId untilCommitId, @Nullable ObjectId sinceCommitId);
		
	}
}
