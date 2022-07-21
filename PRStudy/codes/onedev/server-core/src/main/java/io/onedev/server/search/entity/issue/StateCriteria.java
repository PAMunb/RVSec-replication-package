package io.onedev.server.search.entity.issue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.SettingManager;
import io.onedev.server.model.Issue;
import io.onedev.server.model.support.administration.GlobalIssueSetting;
import io.onedev.server.util.criteria.Criteria;
import io.onedev.server.web.component.issue.workflowreconcile.UndefinedStateResolution;

public class StateCriteria extends Criteria<Issue> {

	private static final long serialVersionUID = 1L;

	private String value;
	
	private int operator;
	
	private transient Integer ordinal;
	
	public StateCriteria(String value, int operator) {
		this.value = value;
		this.operator = operator;
	}

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<Issue, Issue> from, CriteriaBuilder builder) {
		if (operator == IssueQueryLexer.IsBefore)
			return builder.lt(from.get(Issue.PROP_STATE_ORDINAL), getOrdinal());
		else if (operator == IssueQueryLexer.IsAfter)
			return builder.gt(from.get(Issue.PROP_STATE_ORDINAL), getOrdinal());
		else
			return builder.equal(from.get(Issue.PROP_STATE), value);
	}

	@Override
	public boolean matches(Issue issue) {
		if (operator == IssueQueryLexer.IsBefore)
			return issue.getStateOrdinal() < getOrdinal();
		else if (operator == IssueQueryLexer.IsAfter)
			return issue.getStateOrdinal() > getOrdinal();
		else
			return issue.getState().equals(value);
	}
	
	private long getOrdinal() {
		if (ordinal == null) 
			ordinal = getIssueSetting().getStateOrdinal(value);
		return ordinal;
	}

	@Override
	public String toStringWithoutParens() {
		return quote(Issue.NAME_STATE) + " " 
				+ IssueQuery.getRuleName(IssueQueryLexer.Is) + " " 
				+ quote(value);
	}
	
	private GlobalIssueSetting getIssueSetting() {
		return OneDev.getInstance(SettingManager.class).getIssueSetting();
	}

	@Override
	public Collection<String> getUndefinedStates() {
		List<String> undefinedStates = new ArrayList<>();
		if (getIssueSetting().getStateSpec(value) == null)
			undefinedStates.add(value);
		return undefinedStates;
	}
	
	@Override
	public boolean fixUndefinedStates(Map<String, UndefinedStateResolution> resolutions) {
		for (Map.Entry<String, UndefinedStateResolution> entry: resolutions.entrySet()) {
			if (entry.getValue().getFixType() == UndefinedStateResolution.FixType.CHANGE_TO_ANOTHER_STATE) {
				if (entry.getKey().equals(value))
					value = entry.getValue().getNewState();
			} else if (entry.getKey().equals(value)) {
				return false;
			}
		}
		return true;
	}
	
}
