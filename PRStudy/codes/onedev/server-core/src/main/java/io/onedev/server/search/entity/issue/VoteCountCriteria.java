package io.onedev.server.search.entity.issue;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import io.onedev.server.model.Issue;
import io.onedev.server.util.criteria.Criteria;

public class VoteCountCriteria extends Criteria<Issue> {

	private static final long serialVersionUID = 1L;

	private final int operator;
	
	private final int value;
	
	public VoteCountCriteria(int value, int operator) {
		this.operator = operator;
		this.value = value;
	}

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<Issue, Issue> from, CriteriaBuilder builder) {
		Path<Integer> attribute = from.get(Issue.PROP_VOTE_COUNT);
		if (operator == IssueQueryLexer.Is)
			return builder.equal(attribute, value);
		else if (operator == IssueQueryLexer.IsGreaterThan)
			return builder.greaterThan(attribute, value);
		else
			return builder.lessThan(attribute, value);
	}

	@Override
	public boolean matches(Issue issue) {
		if (operator == IssueQueryLexer.Is)
			return issue.getVoteCount() == value;
		else if (operator == IssueQueryLexer.IsGreaterThan)
			return issue.getVoteCount() > value;
		else
			return issue.getVoteCount() < value;
	}

	@Override
	public String toStringWithoutParens() {
		return quote(Issue.NAME_VOTE_COUNT) + " " 
				+ IssueQuery.getRuleName(operator) + " " 
				+ quote(String.valueOf(value));
	}

}
