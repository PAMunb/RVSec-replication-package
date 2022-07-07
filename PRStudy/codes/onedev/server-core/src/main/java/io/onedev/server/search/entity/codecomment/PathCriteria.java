package io.onedev.server.search.entity.codecomment;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import io.onedev.server.model.CodeComment;
import io.onedev.server.model.support.Mark;
import io.onedev.server.util.criteria.Criteria;
import io.onedev.server.util.match.WildcardUtils;

public class PathCriteria extends Criteria<CodeComment>  {

	private static final long serialVersionUID = 1L;

	private final String value;
	
	public PathCriteria(String value) {
		this.value = value;
	}

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<CodeComment, CodeComment> from, CriteriaBuilder builder) {
		Path<String> attribute = CodeCommentQuery.getPath(from, CodeComment.PROP_MARK + "." + Mark.PROP_PATH);
		String normalized = value.toLowerCase().replace('*', '%');
		if (normalized.endsWith("/"))
			normalized += "%";
		return builder.like(builder.lower(attribute), normalized);
	}
	
	@Override
	public boolean matches(CodeComment comment) {
		return WildcardUtils.matchPath(value.toLowerCase(), comment.getMark().getPath().toLowerCase());
	}

	@Override
	public String toStringWithoutParens() {
		return quote(CodeComment.NAME_PATH) + " " 
				+ CodeCommentQuery.getRuleName(CodeCommentQueryLexer.Is) + " " 
				+ quote(value);
	}

}
