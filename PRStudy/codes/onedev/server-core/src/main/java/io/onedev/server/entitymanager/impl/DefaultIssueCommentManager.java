package io.onedev.server.entitymanager.impl;

import java.util.Collection;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.google.common.collect.Lists;

import io.onedev.commons.loader.ListenerRegistry;
import io.onedev.server.entitymanager.IssueCommentManager;
import io.onedev.server.event.issue.IssueCommented;
import io.onedev.server.model.IssueComment;
import io.onedev.server.persistence.annotation.Transactional;
import io.onedev.server.persistence.dao.BaseEntityManager;
import io.onedev.server.persistence.dao.Dao;

@Singleton
public class DefaultIssueCommentManager extends BaseEntityManager<IssueComment>
		implements IssueCommentManager {

	private final ListenerRegistry listenerRegistry;
	
	@Inject
	public DefaultIssueCommentManager(Dao dao, ListenerRegistry listenerRegistry) {
		super(dao);
		this.listenerRegistry = listenerRegistry;
	}

	@Transactional
	@Override
	public void save(IssueComment comment) {
		save(comment, Lists.newArrayList());
	}

	@Transactional
	@Override
	public void delete(IssueComment comment) {
		super.delete(comment);
		comment.getIssue().setCommentCount(comment.getIssue().getCommentCount()-1);
	}

	@Override
	public void save(IssueComment comment, Collection<String> notifiedEmailAddresses) {
		boolean isNew = comment.isNew();
		dao.persist(comment);
		if (isNew) {
			IssueCommented event = new IssueCommented(comment, notifiedEmailAddresses);
			listenerRegistry.post(event);
			comment.getIssue().setCommentCount(comment.getIssue().getCommentCount()+1);
		}		
	}

}
