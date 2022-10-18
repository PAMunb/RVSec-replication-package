package io.onedev.server.entitymanager.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.hibernate.criterion.Restrictions;

import io.onedev.server.entitymanager.PullRequestQueryPersonalizationManager;
import io.onedev.server.model.Project;
import io.onedev.server.model.PullRequestQueryPersonalization;
import io.onedev.server.model.User;
import io.onedev.server.model.support.NamedQuery;
import io.onedev.server.persistence.annotation.Sessional;
import io.onedev.server.persistence.annotation.Transactional;
import io.onedev.server.persistence.dao.BaseEntityManager;
import io.onedev.server.persistence.dao.Dao;
import io.onedev.server.persistence.dao.EntityCriteria;

@Singleton
public class DefaultPullRequestQueryPersonalizationManager extends BaseEntityManager<PullRequestQueryPersonalization> 
		implements PullRequestQueryPersonalizationManager {

	@Inject
	public DefaultPullRequestQueryPersonalizationManager(Dao dao) {
		super(dao);
	}

	@Sessional
	@Override
	public PullRequestQueryPersonalization find(Project project, User user) {
		EntityCriteria<PullRequestQueryPersonalization> criteria = newCriteria();
		criteria.add(Restrictions.and(Restrictions.eq("project", project), Restrictions.eq("user", user)));
		criteria.setCacheable(true);
		return find(criteria);
	}

	@Transactional
	@Override
	public void save(PullRequestQueryPersonalization personalization) {
		Collection<String> retainNames = new HashSet<>();
		retainNames.addAll(personalization.getQueries().stream()
				.map(it->NamedQuery.PERSONAL_NAME_PREFIX+it.getName()).collect(Collectors.toSet()));
		retainNames.addAll(personalization.getProject().getNamedPullRequestQueries().stream()
				.map(it->NamedQuery.COMMON_NAME_PREFIX+it.getName()).collect(Collectors.toSet()));
		personalization.getQueryWatchSupport().getQueryWatches().keySet().retainAll(retainNames);
		
		if (personalization.getQueryWatchSupport().getQueryWatches().isEmpty() && personalization.getQueries().isEmpty()) {
			if (!personalization.isNew())
				delete(personalization);
		} else {
			super.save(personalization);
		}
	}

}
