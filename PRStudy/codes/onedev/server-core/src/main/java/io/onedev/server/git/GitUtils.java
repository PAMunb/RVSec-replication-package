package io.onedev.server.git;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.apache.commons.lang3.RandomStringUtils;
import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.bcpg.BCPGOutputStream;
import org.bouncycastle.bcpg.HashAlgorithmTags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.PGPCompressedData;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.openpgp.PGPPrivateKey;
import org.bouncycastle.openpgp.PGPPublicKey;
import org.bouncycastle.openpgp.PGPSecretKeyRing;
import org.bouncycastle.openpgp.PGPSignature;
import org.bouncycastle.openpgp.PGPSignatureGenerator;
import org.bouncycastle.openpgp.PGPSignatureList;
import org.bouncycastle.openpgp.PGPSignatureSubpacketGenerator;
import org.bouncycastle.openpgp.PGPUtil;
import org.bouncycastle.openpgp.jcajce.JcaPGPObjectFactory;
import org.bouncycastle.openpgp.operator.jcajce.JcaPGPContentSignerBuilder;
import org.bouncycastle.openpgp.operator.jcajce.JcaPGPContentVerifierBuilderProvider;
import org.bouncycastle.openpgp.operator.jcajce.JcePBESecretKeyDecryptorBuilder;
import org.eclipse.jgit.diff.DiffEntry;
import org.eclipse.jgit.diff.DiffEntry.ChangeType;
import org.eclipse.jgit.diff.DiffFormatter;
import org.eclipse.jgit.diff.RawTextComparator;
import org.eclipse.jgit.errors.AmbiguousObjectException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.errors.RevisionSyntaxException;
import org.eclipse.jgit.lib.AnyObjectId;
import org.eclipse.jgit.lib.CommitBuilder;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.FileMode;
import org.eclipse.jgit.lib.GpgSignature;
import org.eclipse.jgit.lib.ObjectBuilder;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectInserter;
import org.eclipse.jgit.lib.ObjectReader;
import org.eclipse.jgit.lib.PersonIdent;
import org.eclipse.jgit.lib.RefUpdate;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.merge.MergeStrategy;
import org.eclipse.jgit.merge.Merger;
import org.eclipse.jgit.merge.ResolveMerger;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevObject;
import org.eclipse.jgit.revwalk.RevTag;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.RevWalkUtils;
import org.eclipse.jgit.revwalk.filter.RevFilter;
import org.eclipse.jgit.treewalk.CanonicalTreeParser;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.TreeFilter;
import org.eclipse.jgit.util.RawParseUtils;
import org.eclipse.jgit.util.SystemReader;
import org.eclipse.jgit.util.io.NullOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;

import io.onedev.commons.utils.PathUtils;
import io.onedev.server.git.command.FetchCommand;
import io.onedev.server.git.command.IsAncestorCommand;
import io.onedev.server.git.exception.ObsoleteCommitException;
import io.onedev.server.git.exception.RefUpdateException;
import io.onedev.server.git.signature.SignatureUnverified;
import io.onedev.server.git.signature.SignatureVerification;
import io.onedev.server.git.signature.SignatureVerificationKey;
import io.onedev.server.git.signature.SignatureVerificationKeyLoader;
import io.onedev.server.git.signature.SignatureVerified;
import io.onedev.server.util.GpgUtils;

public class GitUtils {

	public static final int SHORT_SHA_LENGTH = 8;
	
	private static final Logger logger = LoggerFactory.getLogger(GitUtils.class);
	
	public static final String HOOK_TOKEN = RandomStringUtils.randomAlphanumeric(20); 
	
	public static boolean isEmptyPath(String path) {
		return Strings.isNullOrEmpty(path) || Objects.equal(path, DiffEntry.DEV_NULL);
	}

	public static String abbreviateSHA(String sha, int length) {
		Preconditions.checkArgument(ObjectId.isId(sha));
		return sha.substring(0, length);
	}

	public static String abbreviateSHA(String sha) {
		return abbreviateSHA(sha, SHORT_SHA_LENGTH);
	}

	public static List<DiffEntry> diff(Repository repository, AnyObjectId oldRevId, AnyObjectId newRevId) {
		List<DiffEntry> diffs = new ArrayList<>();
		try (DiffFormatter diffFormatter = new DiffFormatter(NullOutputStream.INSTANCE);
				RevWalk revWalk = new RevWalk(repository);
				ObjectReader reader = repository.newObjectReader();) {
			diffFormatter.setRepository(repository);
			diffFormatter.setDetectRenames(true);
			diffFormatter.setDiffComparator(RawTextComparator.DEFAULT);

			CanonicalTreeParser oldTreeParser = new CanonicalTreeParser();
			if (!oldRevId.equals(ObjectId.zeroId()))
				oldTreeParser.reset(reader, revWalk.parseCommit(oldRevId).getTree());

			CanonicalTreeParser newTreeParser = new CanonicalTreeParser();
			if (!newRevId.equals(ObjectId.zeroId()))
				newTreeParser.reset(reader, revWalk.parseCommit(newRevId).getTree());

			for (DiffEntry entry : diffFormatter.scan(oldTreeParser, newTreeParser)) {
				if (!Objects.equal(entry.getOldPath(), entry.getNewPath())
						|| !Objects.equal(entry.getOldMode(), entry.getNewMode()) || entry.getOldId() == null
						|| !entry.getOldId().isComplete() || entry.getNewId() == null || !entry.getNewId().isComplete()
						|| !entry.getOldId().equals(entry.getNewId())) {
					diffs.add(entry);
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return diffs;
	}

	@Nullable
	public static String getDetailMessage(RevCommit commit) {
		int start = 0;
		String fullMessage = commit.getFullMessage();
		while (true) {
			int index = fullMessage.indexOf('\n', start);
			if (index == -1)
				return null;
			start = index + 1;
			int nextIndex = fullMessage.indexOf('\n', start);
			if (nextIndex == -1)
				return null;
			start = nextIndex + 1;
			if (fullMessage.substring(index, nextIndex).trim().length() == 0) {
				String detailMessage = fullMessage.substring(start).trim();
				return detailMessage.length() != 0 ? detailMessage : null;
			}
		}
	}

	public static String getBlobTypeName(int blobType) {
		if (blobType == FileMode.TYPE_FILE)
			return "File";
		else if (blobType == FileMode.TYPE_GITLINK)
			return "Sub module";
		else if (blobType == FileMode.TYPE_SYMLINK)
			return "Symbol link";
		else
			return "Folder";
	}

	public static PersonIdent newPersonIdent(String name, String email, Date when) {
		return new PersonIdent(name, email, when.getTime(), SystemReader.getInstance().getTimezone(when.getTime()));
	}

	/**
	 * Parse the original git raw date to Java date. The raw git date is in unix
	 * timestamp with timezone like: 1392312299 -0800
	 * 
	 * @param input the input raw date string
	 * @return Java date
	 */
	public static Date parseRawDate(String input) {
		String[] pieces = Iterables.toArray(Splitter.on(" ").split(input), String.class);
		return new Date(Long.valueOf(pieces[0]) * 1000L);
	}

	/**
	 * Parse the raw user information into PersonIdent object, the raw information
	 * should be in format <code>[name] [<email>] [epoch timezone]</code>, for
	 * example:
	 * 
	 * Jacob Thornton <jacobthornton@gmail.com> 1328060294 -0800
	 * 
	 * @param raw
	 * @return
	 */
	public static @Nullable PersonIdent parsePersonIdent(String raw) {
		if (Strings.isNullOrEmpty(raw))
			return null;

		int pos1 = raw.indexOf('<');
		if (pos1 <= 0)
			throw new IllegalArgumentException("Raw " + raw);

		String name = raw.substring(0, pos1 - 1);

		int pos2 = raw.indexOf('>');
		if (pos2 <= 0)
			throw new IllegalArgumentException("Raw " + raw);

		String time = raw.substring(pos2 + 1).trim();
		Date when = parseRawDate(time);

		String email = raw.substring(pos1 + 1, pos2 - 1);

		return newPersonIdent(name, email, when);
	}

	public static int comparePath(@Nullable String path1, @Nullable String path2) {
		List<String> segments1 = splitPath(path1);
		List<String> segments2 = splitPath(path2);

		int index = 0;
		for (String segment1 : segments1) {
			if (index < segments2.size()) {
				int result = segment1.compareTo(segments2.get(index));
				if (result != 0)
					return result;
			} else {
				return 1;
			}
			index++;
		}
		if (index < segments2.size())
			return -1;
		else
			return 0;
	}

	public static List<String> splitPath(@Nullable String path) {
		List<String> pathSegments;
		if (path != null)
			pathSegments = Splitter.on("/").omitEmptyStrings().splitToList(path);
		else
			pathSegments = new ArrayList<>();
		return pathSegments;
	}

	public static @Nullable String normalizePath(@Nullable String path) {
		List<String> pathSegments = splitPath(PathUtils.normalizeDots(path));
		if (!pathSegments.isEmpty())
			return Joiner.on("/").join(pathSegments);
		else
			return null;
	}

	/**
	 * Convert a git reference name to branch name.
	 * 
	 * @param refName name of the git reference
	 * @return name of the branch, or <tt>null</tt> if specified ref does not
	 *         represent a branch
	 */
	public static @Nullable String ref2branch(String refName) {
		if (refName.startsWith(Constants.R_HEADS))
			return refName.substring(Constants.R_HEADS.length());
		else
			return null;
	}

	public static String branch2ref(String branch) {
		return Constants.R_HEADS + branch;
	}

	/**
	 * Convert a git reference name to tag name.
	 * 
	 * @param refName name of the git reference
	 * @return name of the tag, or <tt>null</tt> if specified ref does not represent
	 *         a tag
	 */
	public static @Nullable String ref2tag(String refName) {
		if (refName.startsWith(Constants.R_TAGS))
			return refName.substring(Constants.R_TAGS.length());
		else
			return null;
	}

	public static String tag2ref(String tag) {
		return Constants.R_TAGS + tag;
	}

	public static BlobIdent getOldBlobIdent(DiffEntry diffEntry, String oldRev) {
		BlobIdent blobIdent;
		if (diffEntry.getChangeType() != ChangeType.ADD) {
			blobIdent = new BlobIdent(oldRev, diffEntry.getOldPath(), diffEntry.getOldMode().getBits());
		} else {
			blobIdent = new BlobIdent(oldRev, null, null);
		}
		return blobIdent;
	}

	public static BlobIdent getNewBlobIdent(DiffEntry diffEntry, String newRev) {
		BlobIdent blobIdent;
		if (diffEntry.getChangeType() != ChangeType.DELETE) {
			blobIdent = new BlobIdent(newRev, diffEntry.getNewPath(), diffEntry.getNewMode().getBits());
		} else {
			blobIdent = new BlobIdent(newRev, null, null);
		}
		return blobIdent;
	}

	/**
	 * @return merge base of specified commits, or <tt>null</tt> if two commits do
	 *         not have related history. In this case, these two commits can not be
	 *         merged
	 */
	@Nullable
	public static ObjectId getMergeBase(Repository repository, ObjectId commitId1, ObjectId commitId2) {
		try (RevWalk revWalk = new RevWalk(repository)) {
			revWalk.setRevFilter(RevFilter.MERGE_BASE);

			revWalk.markStart(revWalk.parseCommit(commitId1));
			revWalk.markStart(revWalk.parseCommit(commitId2));
			RevCommit mergeBase = revWalk.next();
			return mergeBase != null ? mergeBase.copy() : null;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * @return merge base of specified commits, or <tt>null</tt> if two commits do
	 *         not have related history. In this case, these two commits can not be
	 *         merged
	 */
	@Nullable
	public static ObjectId getMergeBase(Repository repository1, ObjectId commit1, Repository repository2,
			ObjectId commit2) {
		if (repository1.getDirectory() == null || !repository1.getDirectory().equals(repository2.getDirectory())) {
			fetch(repository2, commit2, repository1);
		}
		return GitUtils.getMergeBase(repository1, commit1, commit2);
	}

	public static void fetch(Repository fromRepository, ObjectId fromCommit, Repository toRepository) {
		new FetchCommand(toRepository.getDirectory(), null)
				.from(fromRepository.getDirectory().getAbsolutePath())
				.refspec(fromCommit.name())
				.force(true)
				.quiet(true)
				.call();
	}

	public static boolean isMergedInto(Repository repository, @Nullable Map<String, String> gitEnvs, ObjectId base,
			ObjectId tip) {
		if (gitEnvs != null && !gitEnvs.isEmpty()) {
			IsAncestorCommand cmd = new IsAncestorCommand(repository.getDirectory(), gitEnvs);
			cmd.ancestor(base.name()).descendant(tip.name());
			return cmd.call();
		} else {
			try (RevWalk revWalk = new RevWalk(repository)) {
				RevCommit baseCommit;
				try {
					baseCommit = revWalk.parseCommit(base);
				} catch (MissingObjectException e) {
					return false;
				}
				return revWalk.isMergedInto(baseCommit, revWalk.parseCommit(tip));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

	/**
	 * Get commit of specified revision id.
	 * 
	 * @param revWalk
	 * @param revId
	 * @return <tt>null</tt> if specified id does not exist or does not represent a
	 *         commit
	 */
	@Nullable
	public static RevCommit parseCommit(RevWalk revWalk, ObjectId revId) {
		RevObject peeled;
		try {
			peeled = revWalk.peel(revWalk.parseAny(revId));
			if (peeled instanceof RevCommit)
				return (RevCommit) peeled;
			else
				return null;
		} catch (MissingObjectException e) {
			return null;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Nullable
	public static ObjectId resolve(Repository repository, String revision) {
		try {
			return repository.resolve(revision);
		} catch (RevisionSyntaxException | AmbiguousObjectException | IncorrectObjectTypeException e) {
			return null;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Nullable
	public static ObjectId rebase(Repository repository, ObjectId source, ObjectId target, PersonIdent committer) {
		try (RevWalk revWalk = new RevWalk(repository); ObjectInserter inserter = repository.newObjectInserter();) {
			RevCommit sourceCommit = revWalk.parseCommit(source);
			RevCommit targetCommit = revWalk.parseCommit(target);
			revWalk.setRevFilter(RevFilter.NO_MERGES);
			List<RevCommit> commits = RevWalkUtils.find(revWalk, sourceCommit, targetCommit);
			Collections.reverse(commits);
			RevCommit headCommit = targetCommit;
			for (RevCommit commit : commits) {
				ResolveMerger merger = (ResolveMerger) MergeStrategy.RECURSIVE.newMerger(repository, true);
				merger.setBase(commit.getParent(0));
				if (merger.merge(headCommit, commit)) {
					if (!headCommit.getTree().getId().equals(merger.getResultTreeId())) {
						if (!commit.getTree().getId().equals(merger.getResultTreeId())
								|| !commit.getParent(0).equals(headCommit)) {
							CommitBuilder commitBuilder = new CommitBuilder();
							commitBuilder.setAuthor(commit.getAuthorIdent());
							commitBuilder.setCommitter(committer);
							commitBuilder.setParentId(headCommit);
							commitBuilder.setMessage(commit.getFullMessage());
							commitBuilder.setTreeId(merger.getResultTreeId());
							headCommit = revWalk.parseCommit(inserter.insert(commitBuilder));
						} else {
							headCommit = commit;
						}
					}
				} else {
					return null;
				}
			}
			inserter.flush();
			return headCommit.copy();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Nullable
	public static ObjectId merge(Repository repository, ObjectId targetCommitId, ObjectId sourceCommitId,
			boolean squash, PersonIdent committer, PersonIdent author, String commitMessage,
			boolean useOursOnConflict) {
		try (RevWalk revWalk = new RevWalk(repository); ObjectInserter inserter = repository.newObjectInserter();) {
			RevCommit sourceCommit = revWalk.parseCommit(sourceCommitId);
			RevCommit targetCommit = revWalk.parseCommit(targetCommitId);
			Merger merger;
			if (useOursOnConflict)
				merger = MergeStrategy.OURS.newMerger(repository, true);
			else
				merger = MergeStrategy.RECURSIVE.newMerger(repository, true);
			if (merger.merge(targetCommit, sourceCommit)) {
				CommitBuilder mergedCommit = new CommitBuilder();
				mergedCommit.setAuthor(author);
				mergedCommit.setCommitter(committer);
				if (squash)
					mergedCommit.setParentId(targetCommit);
				else
					mergedCommit.setParentIds(targetCommit, sourceCommit);
				mergedCommit.setMessage(commitMessage);
				mergedCommit.setTreeId(merger.getResultTreeId());
				ObjectId mergedCommitId = inserter.insert(mergedCommit);
				inserter.flush();
				return mergedCommitId;
			} else {
				return null;
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static Collection<String> getChangedFiles(Repository repository, ObjectId oldCommitId,
			ObjectId newCommitId) {
		Collection<String> changedFiles = new HashSet<>();
		try (RevWalk revWalk = new RevWalk(repository); TreeWalk treeWalk = new TreeWalk(repository)) {
			treeWalk.setFilter(TreeFilter.ANY_DIFF);
			treeWalk.setRecursive(true);
			RevCommit oldCommit = revWalk.parseCommit(oldCommitId);
			RevCommit newCommit = revWalk.parseCommit(newCommitId);
			treeWalk.addTree(oldCommit.getTree());
			treeWalk.addTree(newCommit.getTree());
			while (treeWalk.next()) {
				changedFiles.add(treeWalk.getPathString());
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return changedFiles;
	}

	public static boolean isValid(File gitDir) {
		return new File(gitDir, "objects").exists();
	}

	public static RefUpdate getRefUpdate(Repository repository, String refName) {
		try {
			return repository.updateRef(refName);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void updateRef(RefUpdate refUpdate) {
		try {
			RefUpdate.Result result = refUpdate.forceUpdate();
			if (result == RefUpdate.Result.LOCK_FAILURE && refUpdate.getExpectedOldObjectId() != null
					&& !refUpdate.getExpectedOldObjectId().equals(refUpdate.getOldObjectId())) {
				throw new ObsoleteCommitException(refUpdate.getOldObjectId());
			} else if (result != RefUpdate.Result.FAST_FORWARD && result != RefUpdate.Result.FORCED
					&& result != RefUpdate.Result.NEW && result != RefUpdate.Result.NO_CHANGE) {
				throw new RefUpdateException(result);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void deleteRef(RefUpdate refUpdate) {
		try {
			refUpdate.setForceUpdate(true);
			RefUpdate.Result result = refUpdate.delete();
			if (result == RefUpdate.Result.LOCK_FAILURE && refUpdate.getExpectedOldObjectId() != null
					&& !refUpdate.getExpectedOldObjectId().equals(refUpdate.getOldObjectId())) {
				throw new ObsoleteCommitException(refUpdate.getOldObjectId());
			} else if (result != RefUpdate.Result.FAST_FORWARD && result != RefUpdate.Result.FORCED
					&& result != RefUpdate.Result.NEW && result != RefUpdate.Result.NO_CHANGE) {
				throw new RefUpdateException(result);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void linkRef(RefUpdate refUpdate, String target) {
		try {
			RefUpdate.Result result = refUpdate.link(target);
			if (result != RefUpdate.Result.FORCED && result != RefUpdate.Result.NEW
					&& result != RefUpdate.Result.NO_CHANGE)
				throw new RefUpdateException(result);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void sign(ObjectBuilder object, PGPSecretKeyRing signingKey) {
		JcePBESecretKeyDecryptorBuilder decryptorBuilder = new JcePBESecretKeyDecryptorBuilder()
				.setProvider(BouncyCastleProvider.PROVIDER_NAME);
		PGPPrivateKey privateKey;
		try {
			privateKey = signingKey.getSecretKey().extractPrivateKey(
					decryptorBuilder.build(new char[0]));
		} catch (PGPException e) {
			throw new RuntimeException(e);
		}
		
		PGPPublicKey publicKey = signingKey.getPublicKey();
		
		PGPSignatureGenerator signatureGenerator = new PGPSignatureGenerator(
				new JcaPGPContentSignerBuilder(publicKey.getAlgorithm(), HashAlgorithmTags.SHA256)
						.setProvider(BouncyCastleProvider.PROVIDER_NAME));
		try {
			signatureGenerator.init(PGPSignature.BINARY_DOCUMENT, privateKey);
			PGPSignatureSubpacketGenerator subpackets = new PGPSignatureSubpacketGenerator();
			subpackets.setIssuerFingerprint(false, publicKey);
			
			String emailAddress = GpgUtils.getEmailAddress(publicKey.getUserIDs().next());
			subpackets.addSignerUserID(false, emailAddress);
			
			signatureGenerator.setHashedSubpackets(subpackets.generate());
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			try (BCPGOutputStream out = new BCPGOutputStream(new ArmoredOutputStream(buffer))) {
				signatureGenerator.update(object.build());
				signatureGenerator.generate().encode(out);
			}
			object.setGpgSignature(new GpgSignature(buffer.toByteArray()));		
		} catch (IOException | PGPException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Nullable
	public static SignatureVerification verifyTagSignature(byte[] raw, 
			SignatureVerificationKeyLoader keyLoader) {
		byte[] signatureData = TagParser.getRawGpgSignature(raw); 
		if (signatureData == null) {
			return null;
		}

		// The signature is just tacked onto the end of the message, which
		// is last in the buffer.
		byte[] data = Arrays.copyOfRange(raw, 0, raw.length - signatureData.length);
		
		PersonIdent taggerIdent = TagParser.getTaggerIdent(raw);
		if (taggerIdent == null)
			return null;
		
		return verify(data, signatureData, taggerIdent.getEmailAddress(), keyLoader);
	}
	
	/*
	 * Most logic here is copied from JGit
	 */
	@Nullable
	public static SignatureVerification verifyCommitSignature(byte[] raw, 
			SignatureVerificationKeyLoader keyLoader) {
		byte[] header = {'g', 'p', 'g', 's', 'i', 'g'};
		int start = RawParseUtils.headerStart(header, raw, 0);
		if (start < 0)
			return null;
		int end = RawParseUtils.headerEnd(raw, start);
		byte[] signatureData = Arrays.copyOfRange(raw, start, end);
		
		// start is at the beginning of the header's content
		start -= header.length + 1;
		// end is on the terminating LF; we need to skip that, too
		if (end < raw.length) {
			end++;
		}
		byte[] data = new byte[raw.length - (end - start)];
		System.arraycopy(raw, 0, data, 0, start);
		System.arraycopy(raw, end, data, start, raw.length - end);

		int nameB = RawParseUtils.committer(raw, 0);
		if (nameB < 0)
			return null;
		PersonIdent committerIdent = RawParseUtils.parsePersonIdent(raw, nameB);
		String emailAddress = committerIdent.getEmailAddress();
		return verify(data, signatureData, emailAddress, keyLoader);
	}
	
	@Nullable
	public static SignatureVerification verifySignature(RevObject object, SignatureVerificationKeyLoader keyLoader) {
		if (object instanceof RevCommit) {
			RevCommit commit = (RevCommit) object;
			return verifyCommitSignature(commit.getRawBuffer(), keyLoader);
		} else if (object instanceof RevTag) {
			RevTag tag = (RevTag) object;
			return verifyTagSignature(tag.getRawBuffer(), keyLoader);
		} else {
			return null;
		}
	}

	private static PGPSignature parseSignature(InputStream in) throws IOException, PGPException {
		try (InputStream sigIn = PGPUtil.getDecoderStream(in)) {
			JcaPGPObjectFactory pgpFactory = new JcaPGPObjectFactory(sigIn);
			Object obj = pgpFactory.nextObject();
			if (obj instanceof PGPCompressedData) {
				obj = new JcaPGPObjectFactory(((PGPCompressedData) obj).getDataStream()).nextObject();
			}
			if (obj instanceof PGPSignatureList) {
				return ((PGPSignatureList) obj).get(0);
			}
			return null;
		}
	}

	@Nullable
	private static SignatureVerification verify(byte[] data, byte[] signatureData, String dataWriter, 
			SignatureVerificationKeyLoader keyLoader) {
		try (InputStream sigIn = new ByteArrayInputStream(signatureData)) {
			PGPSignature signature = parseSignature(sigIn);
			if (signature != null) {
				SignatureVerificationKey key = keyLoader.getSignatureVerificationKey(signature.getKeyID());
				if (key != null) {
					try {
						signature.init(
								new JcaPGPContentVerifierBuilderProvider().setProvider(BouncyCastleProvider.PROVIDER_NAME),
								key.getPublicKey());
						signature.update(data);
						if (signature.verify()) {
							if (!key.shouldVerifyDataWriter() || key.getEmailAddress().equals(dataWriter)) 
								return new SignatureVerified(key);
							else 
								return new SignatureUnverified(key, "Email address of signing key and committer is different");
						} else {
							return new SignatureUnverified(key, "Invalid commit signature");
						}
					} catch (PGPException e) {
						logger.error("Commit signature verification failed", e);
						return new SignatureUnverified(key, "Signature verification failed");
					}
				} else {
					return new SignatureUnverified(null, "Signature is signed with an unknown key "
							+ "(key ID: " + GpgUtils.getKeyIDString(signature.getKeyID()) + ")");
				}
			} else {
				return new SignatureUnverified(null, "Signature does not decode into a signature object");
			}
		} catch (PGPException e) {
			logger.error("Error parsing commit signature", e);
			return new SignatureUnverified(null, "Signature cannot be parsed");
		} catch (IOException e2) {
			throw new RuntimeException(e2);
		}
	}
	
	/*
	 * Copied from JGit
	 */
	private static class TagParser {
		
		private static final byte[] hSignature = Constants.encodeASCII("-----BEGIN PGP SIGNATURE-----");

		private static int nextStart(byte[] prefix, byte[] buffer, int from) {
			int stop = buffer.length - prefix.length + 1;
			int ptr = from;
			if (ptr > 0) {
				ptr = RawParseUtils.nextLF(buffer, ptr - 1);
			}
			while (ptr < stop) {
				int lineStart = ptr;
				boolean found = true;
				for (byte element : prefix) {
					if (element != buffer[ptr++]) {
						found = false;
						break;
					}
				}
				if (found) {
					return lineStart;
				}
				do {
					ptr = RawParseUtils.nextLF(buffer, ptr);
				} while (ptr < stop && buffer[ptr] == '\n');
			}
			return -1;
		}

		private static int getSignatureStart(byte[] raw) {
			int msgB = RawParseUtils.tagMessage(raw, 0);
			if (msgB < 0) {
				return msgB;
			}
			// Find the last signature start and return the rest
			int start = nextStart(hSignature, raw, msgB);
			if (start < 0) {
				return start;
			}
			int next = RawParseUtils.nextLF(raw, start);
			while (next < raw.length) {
				int newStart = nextStart(hSignature, raw, next);
				if (newStart < 0) {
					break;
				}
				start = newStart;
				next = RawParseUtils.nextLF(raw, start);
			}
			return start;
		}
		
		private static byte[] getRawGpgSignature(byte[] raw) {
			int start = getSignatureStart(raw);
			if (start < 0) {
				return null;
			}
			return Arrays.copyOfRange(raw, start, raw.length);
		}

		private static PersonIdent getTaggerIdent(byte[] raw) {
			int nameB = RawParseUtils.tagger(raw, 0);
			if (nameB < 0)
				return null;
			return RawParseUtils.parsePersonIdent(raw, nameB);
		}
		
	}
	
}
