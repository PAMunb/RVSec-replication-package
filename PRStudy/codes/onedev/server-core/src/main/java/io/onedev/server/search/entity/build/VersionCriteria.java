package io.onedev.server.search.entity.build;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import io.onedev.server.model.Build;
import io.onedev.server.util.criteria.Criteria;
import io.onedev.server.util.match.WildcardUtils;

public class VersionCriteria extends Criteria<Build> {

	private static final long serialVersionUID = 1L;

	private final String value;
	
	public VersionCriteria(String value) {
		this.value = value;
	}

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<Build, Build> from, CriteriaBuilder builder) {
		Path<String> attribute = from.get(Build.PROP_VERSION);
		String normalized = value.toLowerCase().replace("*", "%");
		return builder.like(builder.lower(attribute), normalized);
	}

	@Override
	public boolean matches(Build build) {
		String version = build.getVersion();
		return version != null && WildcardUtils.matchString(value.toLowerCase(), version.toLowerCase());
	}

	@Override
	public String toStringWithoutParens() {
		return quote(Build.NAME_VERSION) + " " 
				+ BuildQuery.getRuleName(BuildQueryLexer.Is) + " " 
				+ quote(value);
	}

}
