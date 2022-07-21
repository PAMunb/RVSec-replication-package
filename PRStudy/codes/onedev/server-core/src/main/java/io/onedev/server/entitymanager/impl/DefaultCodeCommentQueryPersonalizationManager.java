package io.onedev.server.entitymanager.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.hibernate.criterion.Restrictions;

import io.onedev.server.entitymanager.CodeCommentQueryPersonalizationManager;
import io.onedev.server.model.CodeCommentQueryPersonalization;
import io.onedev.server.model.Project;
import io.onedev.server.model.User;
import io.onedev.server.persistence.annotation.Sessional;
import io.onedev.server.persistence.annotation.Transactional;
import io.onedev.server.persistence.dao.BaseEntityManager;
import io.onedev.server.persistence.dao.Dao;
import io.onedev.server.persistence.dao.EntityCriteria;

@Singleton
public class DefaultCodeCommentQueryPersonalizationManager extends BaseEntityManager<CodeCommentQueryPersonalization> 
		implements CodeCommentQueryPersonalizationManager {

	@Inject
	public DefaultCodeCommentQueryPersonalizationManager(Dao dao) {
		super(dao);
	}

	@Sessional
	@Override
	public CodeCommentQueryPersonalization find(Project project, User user) {
		EntityCriteria<CodeCommentQueryPersonalization> criteria = newCriteria();
		criteria.add(Restrictions.and(Restrictions.eq("project", project), Restrictions.eq("user", user)));
		criteria.setCacheable(true);
		return find(criteria);
	}

	@Transactional
	@Override
	public void save(CodeCommentQueryPersonalization setting) {
		if (setting.getQueries().isEmpty()) {
			if (!setting.isNew())
				delete(setting);
		} else {
			super.save(setting);
		}
	}

}
