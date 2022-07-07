package io.onedev.server.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import io.onedev.commons.utils.ExplicitException;
import io.onedev.server.entitymanager.EmailAddressManager;
import io.onedev.server.entitymanager.SshKeyManager;
import io.onedev.server.entitymanager.UserManager;
import io.onedev.server.model.BuildQueryPersonalization;
import io.onedev.server.model.CodeCommentQueryPersonalization;
import io.onedev.server.model.CommitQueryPersonalization;
import io.onedev.server.model.EmailAddress;
import io.onedev.server.model.IssueQueryPersonalization;
import io.onedev.server.model.IssueVote;
import io.onedev.server.model.IssueWatch;
import io.onedev.server.model.Membership;
import io.onedev.server.model.PullRequestAssignment;
import io.onedev.server.model.PullRequestQueryPersonalization;
import io.onedev.server.model.PullRequestReview;
import io.onedev.server.model.PullRequestWatch;
import io.onedev.server.model.SshKey;
import io.onedev.server.model.User;
import io.onedev.server.model.UserAuthorization;
import io.onedev.server.model.support.NamedProjectQuery;
import io.onedev.server.model.support.build.NamedBuildQuery;
import io.onedev.server.model.support.issue.NamedIssueQuery;
import io.onedev.server.model.support.pullrequest.NamedPullRequestQuery;
import io.onedev.server.rest.annotation.Api;
import io.onedev.server.rest.annotation.EntityCreate;
import io.onedev.server.rest.exception.InvalidParamException;
import io.onedev.server.rest.support.RestConstants;
import io.onedev.server.security.SecurityUtils;
import io.onedev.server.util.validation.annotation.UserName;

@Api(order=5000)
@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Singleton
public class UserResource {

	private final UserManager userManager;
	
	private final SshKeyManager sshKeyManager;
	
	private final PasswordService passwordService;
	
	private final EmailAddressManager emailAddressManager;
	
	@Inject
	public UserResource(UserManager userManager, SshKeyManager sshKeyManager, 
			PasswordService passwordService, EmailAddressManager emailAddressManager) {
		this.userManager = userManager;
		this.sshKeyManager = sshKeyManager;
		this.passwordService = passwordService;
		this.emailAddressManager = emailAddressManager;
	}

	@Api(order=100)
	@Path("/{userId}")
    @GET
    public User getProfile(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
		return user;
    }

	@Api(order=200)
	@Path("/me")
    @GET
    public User getMyProfile() {
		User user = SecurityUtils.getUser();
		if (user == null)
			throw new UnauthenticatedException();
		return user;
    }
	
	@Api(order=250)
	@Path("/{userId}/access-token")
    @GET
    public String getAccessToken(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
		return user.getAccessToken();
    }
	
	@Api(order=275)
	@Path("/{userId}/email-addresses")
    @GET
    public Collection<EmailAddress> getEmailAddresses(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
		return user.getEmailAddresses();
    }
	
	@Api(order=300)
	@Path("/{userId}/authorizations")
    @GET
    public Collection<UserAuthorization> getAuthorizations(@PathParam("userId") Long userId) {
		if (!SecurityUtils.isAdministrator())
			throw new UnauthorizedException();
    	return userManager.load(userId).getProjectAuthorizations();
    }
	
	@Api(order=400)
	@Path("/{userId}/memberships")
    @GET
    public Collection<Membership> getMemberships(@PathParam("userId") Long userId) {
		if (!SecurityUtils.isAdministrator())
			throw new UnauthorizedException();
    	return userManager.load(userId).getMemberships();
    }
	
	@Api(order=600)
	@Path("/{userId}/pull-request-reviews")
    @GET
    public Collection<PullRequestReview> getPullRequestReviews(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getPullRequestReviews();
    }
	
	@Api(order=700)
	@Path("/{userId}/issue-votes")
    @GET
    public Collection<IssueVote> getIssueVotes(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getIssueVotes();
    }
	
	@Api(order=800)
	@Path("/{userId}/issue-watches")
    @GET
    public Collection<IssueWatch> getIssueWatches(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getIssueWatches();
    }
	
	@Api(order=900)
	@Path("/{userId}/project-build-query-personalizations")
    @GET
    public Collection<BuildQueryPersonalization> getProjectBuildQueryPersonalizations(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getBuildQueryPersonalizations();
    }
	
	@Api(order=1000)
	@Path("/{userId}/project-code-comment-query-personalizations")
    @GET
    public Collection<CodeCommentQueryPersonalization> getProjectCodeCommentQueryPersonalizations(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getCodeCommentQueryPersonalizations();
    }
	
	@Api(order=1100)
	@Path("/{userId}/project-commit-query-personalizations")
    @GET
    public Collection<CommitQueryPersonalization> getProjectCommitQueryPersonalizations(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getCommitQueryPersonalizations();
    }
	
	@Api(order=1200)
	@Path("/{userId}/project-issue-query-personalizations")
    @GET
    public Collection<IssueQueryPersonalization> getProjecIssueQueryPersonalizations(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getIssueQueryPersonalizations();
    }
	
	@Api(order=1300)
	@Path("/{userId}/project-pull-request-query-personalizations")
    @GET
    public Collection<PullRequestQueryPersonalization> getProjecPullRequestQueryPersonalizations(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getPullRequestQueryPersonalizations();
    }
	
	@Api(order=1400)
	@Path("/{userId}/pull-request-assignments")
    @GET
    public Collection<PullRequestAssignment> getPullRequestAssignments(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getPullRequestAssignments();
    }
	
	@Api(order=1500)
	@Path("/{userId}/pull-request-watches")
    @GET
    public Collection<PullRequestWatch> getPullRequestWatches(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getPullRequestWatches();
    }
	
	@Api(order=1600)
	@Path("/{userId}/ssh-keys")
    @GET
    public Collection<SshKey> getSshKeys(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return user.getSshKeys();
    }
	
	@Api(order=1700)
	@Path("/{userId}/queries-and-watches")
    @GET
    public QueriesAndWatches getQueriesAndWatches(@PathParam("userId") Long userId) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
		QueriesAndWatches queriesAndWatches = new QueriesAndWatches();
		queriesAndWatches.buildQuerySubscriptions = user.getBuildQuerySubscriptions();
		queriesAndWatches.issueQueryWatches = user.getIssueQueryWatches();
		queriesAndWatches.pullRequestQueryWatches = user.getPullRequestQueryWatches();
		queriesAndWatches.buildQueries = user.getUserBuildQueries();
		queriesAndWatches.issueQueries = user.getUserIssueQueries();
		queriesAndWatches.projectQueries = user.getUserProjectQueries();
		queriesAndWatches.pullRequestQueries = user.getUserPullRequestQueries();
		return queriesAndWatches;
    }
	
	@Api(order=1800)
	@GET
    public List<User> queryProfile(
    		@QueryParam("term") @Api(description="Any string in login name, full name or email address") String term, 
    		@QueryParam("offset") @Api(example="0") int offset, 
    		@QueryParam("count") @Api(example="100") int count) {
		
		if (!SecurityUtils.isAdministrator())
			throw new UnauthorizedException();
		
    	if (count > RestConstants.MAX_PAGE_SIZE)
    		throw new InvalidParamException("Count should not be greater than " + RestConstants.MAX_PAGE_SIZE);

    	return userManager.query(term, offset, count);
    }
	
	@Api(order=1900, description="Create new user")
    @POST
    public Long create(@NotNull @Valid UserCreateData data) {
		if (SecurityUtils.isAdministrator()) {
			if (userManager.findByName(data.getName()) != null)
				throw new ExplicitException("Login name is already used by another user");
			if (emailAddressManager.findByValue(data.getEmailAddress()) != null)
				throw new ExplicitException("Email address is already used by another user");
			
			User user = new User();
			user.setName(data.getName());
			user.setFullName(data.getFullName());
			user.setPassword(passwordService.encryptPassword(data.getPassword()));
			userManager.save(user);
			
			EmailAddress emailAddress = new EmailAddress();
			emailAddress.setGit(true);
			emailAddress.setPrimary(true);
			emailAddress.setOwner(user);
			emailAddress.setValue(data.getEmailAddress());
			emailAddress.setVerificationCode(null);
			emailAddressManager.save(emailAddress);
			
			return user.getId();
		} else {
			throw new UnauthenticatedException();
		}
    }
	
	@Api(order=1950, description="Update user profile")
	@Path("/{userId}")
    @POST
    public Long updateProfile(@PathParam("userId") Long userId, @NotNull @Valid ProfileUpdateData data) {
		User user = userManager.load(userId);
		if (SecurityUtils.isAdministrator() || user.equals(SecurityUtils.getUser())) { 
			User existingUser = userManager.findByName(data.getName());
			if (existingUser != null && !existingUser.equals(user))
				throw new ExplicitException("Login name is already used by another user");
			
			user.setName(data.getName());
			user.setFullName(data.getFullName());
			userManager.save(user);
			return user.getId();
		} else { 
			throw new UnauthenticatedException();
		}
    }
	
	@Api(order=2000)
	@Path("/{userId}/password")
    @POST
    public Response setPassword(@PathParam("userId") Long userId, @NotEmpty String password) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) { 
			throw new UnauthorizedException();
    	} else if (user.getPassword().equals(User.EXTERNAL_MANAGED)) {
			if (user.getSsoConnector() != null) {
				throw new ExplicitException("The user is currently authenticated via SSO provider '" 
						+ user.getSsoConnector() + "', please change password there instead");
			} else {
				throw new ExplicitException("The user is currently authenticated via external system, "
						+ "please change password there instead");
			}
		} else {
	    	user.setPassword(passwordService.encryptPassword(password));
	    	userManager.save(user);
	    	return Response.ok().build();
		}
    }
	
	@Api(order=2100)
	@Path("/{userId}/queries-and-watches")
    @POST
    public Response setQueriesAndWatches(@PathParam("userId") Long userId, @NotNull QueriesAndWatches queriesAndWatches) {
    	User user = userManager.load(userId);
    	if (!SecurityUtils.isAdministrator() && !user.equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
		user.setBuildQuerySubscriptions(queriesAndWatches.buildQuerySubscriptions);
		user.setIssueQueryWatches(queriesAndWatches.issueQueryWatches);
		user.setPullRequestQueryWatches(queriesAndWatches.pullRequestQueryWatches);
		user.setBuildQueries(queriesAndWatches.buildQueries);
		user.setIssueQueries(queriesAndWatches.issueQueries);
		user.setIssueQueryWatches(queriesAndWatches.issueQueryWatches);
		user.setProjectQueries(queriesAndWatches.projectQueries);
		user.setPullRequestQueries(queriesAndWatches.pullRequestQueries);
		userManager.save(user);
		return Response.ok().build();
    }
	
	@Api(order=2200)
	@Path("/{userId}/ssh-keys")
	@POST
	public Long addSshKey(@PathParam("userId") Long userId, @NotNull String content) {
		User user = SecurityUtils.getUser();
		
		SshKey sshKey = new SshKey();
		sshKey.setContent(content);
		sshKey.setCreatedAt(new Date());
		sshKey.setOwner(user);
		sshKey.digest();
        
		sshKeyManager.save(sshKey);
		return sshKey.getId();
	}
	
	@Api(order=2300)
	@Path("/{userId}")
    @DELETE
    public Response delete(@PathParam("userId") Long userId) {
    	if (!SecurityUtils.isAdministrator())
			throw new UnauthorizedException();
    	User user = userManager.load(userId);
    	if (user.isRoot())
			throw new ExplicitException("Root user can not be deleted");
    	else if (user.equals(SecurityUtils.getUser()))
    		throw new ExplicitException("Can not delete yourself");
    	else
    		userManager.delete(user);
    	return Response.ok().build();
    }

	@EntityCreate(User.class)
	public static class UserCreateData implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private String name;
		
		private String password;
		
		private String fullName;
		
		private String emailAddress;

		@Api(order=100, description="Login name of the user")
		@UserName
		@NotEmpty
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Api(order=150)
		@NotEmpty
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Api(order=200)
		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		@Api(order=300)
		@Email
		@NotEmpty
		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		
	}
	
	public static class ProfileUpdateData implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private String name;
		
		private String fullName;
		
		@Api(order=100, description="Login name of the user")
		@UserName
		@NotEmpty
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Api(order=200)
		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

	}
	
	public static class QueriesAndWatches implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		ArrayList<NamedProjectQuery> projectQueries;
		
		ArrayList<NamedIssueQuery> issueQueries;

		LinkedHashMap<String, Boolean> issueQueryWatches;
		
		ArrayList<NamedPullRequestQuery> pullRequestQueries;

		LinkedHashMap<String, Boolean> pullRequestQueryWatches;
		
		ArrayList<NamedBuildQuery> buildQueries;

		LinkedHashSet<String> buildQuerySubscriptions;
	}
	
}
