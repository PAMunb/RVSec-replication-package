package io.onedev.server.rest;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.shiro.authz.UnauthorizedException;

import io.onedev.server.entitymanager.BuildQueryPersonalizationManager;
import io.onedev.server.model.BuildQueryPersonalization;
import io.onedev.server.rest.annotation.Api;
import io.onedev.server.security.SecurityUtils;

@Api(order=5300)
@Path("/build-query-personalizations")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Singleton
public class BuildQueryPersonalizationResource {

	private final BuildQueryPersonalizationManager queryPersonalizationManager;

	@Inject
	public BuildQueryPersonalizationResource(BuildQueryPersonalizationManager queryPersonalizationManager) {
		this.queryPersonalizationManager = queryPersonalizationManager;
	}

	@Api(order=100)
	@Path("/{queryPersonalizationId}")
	@GET
	public BuildQueryPersonalization get(@PathParam("queryPersonalizationId") Long queryPersonalizationId) {
		BuildQueryPersonalization queryPersonalization = queryPersonalizationManager.load(queryPersonalizationId);
    	if (!SecurityUtils.isAdministrator() && !queryPersonalization.getUser().equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
    	return queryPersonalization;
	}
	
	@Api(order=200, description="Update build query personalization of specified id in request body, or create new if id property not provided")
	@POST
	public Long createOrUpdate(@NotNull BuildQueryPersonalization queryPersonalization) {
    	if (!SecurityUtils.isAdministrator() && !queryPersonalization.getUser().equals(SecurityUtils.getUser()))  
			throw new UnauthorizedException();
		queryPersonalizationManager.save(queryPersonalization);
		return queryPersonalization.getId();
	}
	
	@Api(order=300)
	@Path("/{queryPersonalizationId}")
	@DELETE
	public Response delete(@PathParam("queryPersonalizationId") Long queryPersonalizationId) {
		BuildQueryPersonalization queryPersonalization = queryPersonalizationManager.load(queryPersonalizationId);
    	if (!SecurityUtils.isAdministrator() && !queryPersonalization.getUser().equals(SecurityUtils.getUser())) 
			throw new UnauthorizedException();
		queryPersonalizationManager.delete(queryPersonalization);
		return Response.ok().build();
	}
	
}
