package io.onedev.server.job.authorization;

import static io.onedev.server.job.authorization.JobAuthorization.getRuleName;
import static io.onedev.server.job.authorization.JobAuthorizationLexer.OnBranch;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import io.onedev.server.util.ProjectAndBranch;
import io.onedev.server.util.criteria.Criteria;
import io.onedev.server.util.match.WildcardUtils;

public class BranchCriteria extends Criteria<ProjectAndBranch> {

	private static final long serialVersionUID = 1L;
	
	private final String branch;
	
	public BranchCriteria(String branch) {
		this.branch = branch;
	}
	
	@Override
	public boolean matches(ProjectAndBranch projectAndBranch) {
		return WildcardUtils.matchPath(branch, projectAndBranch.getBranch());
	}

	@Override
	public String toStringWithoutParens() {
		return getRuleName(OnBranch) + " " + quote(branch);
	}

	@Override
	public Predicate getPredicate(CriteriaQuery<?> query, From<ProjectAndBranch, ProjectAndBranch> from,
			CriteriaBuilder builder) {
		throw new UnsupportedOperationException();
	}
	
}
