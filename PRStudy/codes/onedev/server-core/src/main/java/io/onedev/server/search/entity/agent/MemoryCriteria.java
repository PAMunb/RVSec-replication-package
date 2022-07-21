package io.onedev.server.search.entity.agent;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import io.onedev.server.model.Agent;
import io.onedev.server.search.entity.EntityQuery;
import io.onedev.server.util.criteria.Criteria;

public class MemoryCriteria extends Criteria<Agent> {

	private static final long serialVersionUID = 1L;

	private int value;
	
	private int operator;
	
	public MemoryCriteria(String value, int operator) {
		this.value = EntityQuery.getIntValue(value);
		this.operator = operator;
	}

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<Agent, Agent> from, CriteriaBuilder builder) {
		Path<Integer> attribute = from.get(Agent.PROP_MEMORY);
		if (operator == AgentQueryLexer.IsGreaterThan)
			return builder.greaterThan(attribute, value);
		else if (operator == AgentQueryLexer.IsLessThan)
			return builder.lessThan(attribute, value);
		else
			return builder.equal(attribute, value);
	}

	@Override
	public boolean matches(Agent agent) {
		if (operator == AgentQueryLexer.IsGreaterThan)
			return agent.getMemory() > value;
		else if (operator == AgentQueryLexer.IsLessThan)
			return agent.getMemory() < value;
		else
			return agent.getMemory() < value;
	}

	@Override
	public String toStringWithoutParens() {
		return quote(Agent.NAME_MEMORY) + " " 
				+ AgentQuery.getRuleName(operator) + " " 
				+ quote(String.valueOf(value));
	}
	
}
