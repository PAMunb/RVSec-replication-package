package io.onedev.server.entitymanager;

import javax.annotation.Nullable;

import io.onedev.server.model.Milestone;
import io.onedev.server.model.Project;
import io.onedev.server.persistence.dao.EntityManager;

public interface MilestoneManager extends EntityManager<Milestone> {
	
	@Nullable
	Milestone findInHierarchy(Project project, String name);
	
	void delete(Milestone milestone);

	Milestone findInHierarchy(String milestoneFQN);
	
}