package io.onedev.server.entitymanager;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Nullable;

import org.eclipse.jgit.lib.ObjectId;

import io.onedev.server.model.Agent;
import io.onedev.server.model.Build;
import io.onedev.server.model.Project;
import io.onedev.server.model.PullRequest;
import io.onedev.server.persistence.dao.EntityManager;
import io.onedev.server.search.entity.EntityQuery;
import io.onedev.server.util.ProjectBuildStats;
import io.onedev.server.util.ProjectScopedNumber;
import io.onedev.server.util.StatusInfo;
import io.onedev.server.util.criteria.Criteria;

public interface BuildManager extends EntityManager<Build> {

	@Nullable
	Build find(Project project, long number);

	@Nullable
	Build find(String buildFQN);

	@Nullable
	Build find(ProjectScopedNumber buildFQN);
	
	@Nullable
	Build findLastFinished(Project project, String jobName);

	@Nullable
	Build findStreamPrevious(Build build, @Nullable Build.Status status);

	Collection<Long> queryStreamPreviousNumbers(Build build, @Nullable Build.Status status, int limit);

	Collection<Build> query(Project project, ObjectId commitId, @Nullable String jobName, 
			@Nullable String refName, @Nullable Optional<PullRequest> request, 
			Map<String, List<String>> params, @Nullable String pipeline);

	Collection<Build> query(Project project, ObjectId commitId, @Nullable String jobName, 
			@Nullable String pipeline);

	Collection<Build> query(Project project, ObjectId commitId, @Nullable String pipeline);

	Map<ObjectId, Map<String, Collection<StatusInfo>>> queryStatus(Project project, Collection<ObjectId> commitIds);

	void create(Build build);

	Collection<Build> queryUnfinished();
	
	Collection<Build> queryUnfinished(Project project, String jobName, @Nullable String refName, 
			@Nullable Optional<PullRequest> request, Map<String, List<String>> params);
	
	List<Build> query(Project project, String term, int count);

	List<Build> query(@Nullable Project project, EntityQuery<Build> buildQuery, int firstResult, int maxResults);

	int count(@Nullable Project project, Criteria<Build> buildCriteria);

	Collection<Long> queryIds(Project project, EntityQuery<Build> buildQuery, int firstResult, int maxResults);

	Collection<Long> getNumbersByProject(Long projectId);

	Collection<Long> filterNumbers(Long projectId, Collection<String> commitHashes);

	Collection<String> getJobNames(@Nullable Project project);

	List<String> queryVersions(Project project, String matchWith, int count);

	Collection<String> getAccessibleJobNames(Project project);

	Map<Project, Collection<String>> getAccessibleJobNames();
	
	void populateBuilds(Collection<PullRequest> requests);

	void delete(Collection<Build> builds);
	
	Collection<Build> query(Agent agent, @Nullable Build.Status status);
	
	List<ProjectBuildStats> queryStats(Collection<Project> projects);
	
}
