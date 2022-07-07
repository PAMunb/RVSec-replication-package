package io.onedev.server.entitymanager.impl;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.onedev.commons.loader.ListenerRegistry;
import io.onedev.server.entitymanager.PullRequestAssignmentManager;
import io.onedev.server.event.pullrequest.PullRequestAssigned;
import io.onedev.server.event.pullrequest.PullRequestUnassigned;
import io.onedev.server.model.PullRequestAssignment;
import io.onedev.server.persistence.annotation.Transactional;
import io.onedev.server.persistence.dao.BaseEntityManager;
import io.onedev.server.persistence.dao.Dao;
import io.onedev.server.security.SecurityUtils;

@Singleton
public class DefaultPullRequestAssignmentManager extends BaseEntityManager<PullRequestAssignment> 
		implements PullRequestAssignmentManager {

	private final ListenerRegistry listenerRegistry;
	
	@Inject
	public DefaultPullRequestAssignmentManager(Dao dao, ListenerRegistry listenerRegistry) {
		super(dao);
		this.listenerRegistry = listenerRegistry;
	}

	@Transactional
	@Override
	public void save(PullRequestAssignment assignment) {
		super.save(assignment);

		listenerRegistry.post(new PullRequestAssigned(
				SecurityUtils.getUser(), new Date(), 
				assignment.getRequest(), assignment.getUser()));
	}

	@Transactional
	@Override
	public void delete(PullRequestAssignment assignment) {
		super.delete(assignment);
		
		listenerRegistry.post(new PullRequestUnassigned(
				SecurityUtils.getUser(), new Date(), 
				assignment.getRequest(), assignment.getUser()));
	}
		
}
