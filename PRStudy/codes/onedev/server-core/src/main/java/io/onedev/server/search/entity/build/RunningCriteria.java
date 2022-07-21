package io.onedev.server.search.entity.build;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import io.onedev.server.model.Build;
import io.onedev.server.util.criteria.Criteria;

public class RunningCriteria extends Criteria<Build> {

	private static final long serialVersionUID = 1L;

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<Build, Build> from, CriteriaBuilder builder) {
		Path<?> attribute = from.get(Build.PROP_STATUS);
		return builder.equal(attribute, Build.Status.RUNNING);
	}

	@Override
	public boolean matches(Build build) {
		return build.getStatus() == Build.Status.RUNNING;
	}

	@Override
	public String toStringWithoutParens() {
		return BuildQuery.getRuleName(BuildQueryLexer.Running);
	}

}
