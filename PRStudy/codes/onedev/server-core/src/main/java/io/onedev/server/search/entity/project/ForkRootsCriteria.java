package io.onedev.server.search.entity.project;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import io.onedev.server.model.Project;
import io.onedev.server.util.criteria.Criteria;

public class ForkRootsCriteria extends Criteria<Project> {

	private static final long serialVersionUID = 1L;

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<Project, Project> from, CriteriaBuilder builder) {
		return builder.isNull(from.get(Project.PROP_FORKED_FROM));
	}

	@Override
	public boolean matches(Project project) {
		return project.getForkedFrom() == null;
	}

	@Override
	public String toStringWithoutParens() {
		return ProjectQuery.getRuleName(ProjectQueryLexer.ForkRoots);
	}

}
