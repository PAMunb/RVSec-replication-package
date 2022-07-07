package io.onedev.server.search.entity.pullrequest;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import io.onedev.server.model.PullRequest;
import io.onedev.server.util.criteria.Criteria;
import io.onedev.server.util.match.WildcardUtils;

public class TitleCriteria extends Criteria<PullRequest> {

	private static final long serialVersionUID = 1L;

	private final String value;
	
	public TitleCriteria(String value) {
		this.value = value;
	}

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<PullRequest, PullRequest> from, CriteriaBuilder builder) {
		Expression<String> attribute = from.get(PullRequest.PROP_TITLE);
		return builder.like(builder.lower(attribute), "%" + value.toLowerCase().replace('*', '%') + "%");
	}

	@Override
	public boolean matches(PullRequest request) {
		String title = request.getTitle();
		return title != null && WildcardUtils.matchString("*" + value.toLowerCase() + "*", title);
	}

	@Override
	public String toStringWithoutParens() {
		return quote(PullRequest.NAME_TITLE) + " " 
				+ PullRequestQuery.getRuleName(PullRequestQueryLexer.Contains) + " " 
				+ quote(value);
	}

}
