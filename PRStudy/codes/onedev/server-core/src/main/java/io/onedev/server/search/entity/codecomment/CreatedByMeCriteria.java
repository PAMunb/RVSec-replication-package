package io.onedev.server.search.entity.codecomment;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import io.onedev.commons.utils.ExplicitException;
import io.onedev.server.model.CodeComment;
import io.onedev.server.model.User;
import io.onedev.server.util.criteria.Criteria;

public class CreatedByMeCriteria extends Criteria<CodeComment> {

	private static final long serialVersionUID = 1L;

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<CodeComment, CodeComment> from, CriteriaBuilder builder) {
		if (User.get() != null) {
			Path<?> attribute = from.get(CodeComment.PROP_USER);
			return builder.equal(attribute, User.get());
		} else {
			throw new ExplicitException("Please login to perform this query");
		}
	}

	@Override
	public boolean matches(CodeComment comment) {
		if (User.get() != null)
			return User.get().equals(comment.getUser());
		else
			throw new ExplicitException("Please login to perform this query");
	}

	@Override
	public String toStringWithoutParens() {
		return CodeCommentQuery.getRuleName(CodeCommentQueryLexer.CreatedByMe);
	}

}
