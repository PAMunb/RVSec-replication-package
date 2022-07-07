package io.onedev.server.search.entity.issue;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import io.onedev.commons.utils.ExplicitException;
import io.onedev.server.model.Issue;
import io.onedev.server.model.PullRequest;
import io.onedev.server.util.criteria.Criteria;

public class FixedInCurrentPullRequestCriteria extends Criteria<Issue> {

	private static final long serialVersionUID = 1L;
	
	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<Issue, Issue> from, CriteriaBuilder builder) {
		if (PullRequest.get() != null)
			return new FixedInPullRequestCriteria(PullRequest.get()).getPredicate(query, from, builder);
		else
			throw new ExplicitException("No pull request in query context");
	}

	@Override
	public boolean matches(Issue issue) {
		if (PullRequest.get() != null)
			return new FixedInPullRequestCriteria(PullRequest.get()).matches(issue);
		else
			throw new ExplicitException("No pull request in query context");
	}

	@Override
	public String toStringWithoutParens() {
		return IssueQuery.getRuleName(IssueQueryLexer.FixedInCurrentPullRequest);
	}

}
