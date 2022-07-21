package io.onedev.server.web.page.project.blob.render.renderers.gitlink;

import org.apache.wicket.Component;

import io.onedev.server.web.page.project.blob.render.BlobRenderContext;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext.Mode;
import io.onedev.server.web.page.project.blob.render.BlobRendererer;

public class GitLinkRenderer implements BlobRendererer {

	private static final long serialVersionUID = 1L;

	@Override
	public Component render(String componentId, BlobRenderContext context) {
		if (context.getMode() == Mode.VIEW && context.getBlobIdent().isGitLink()) 
			return new GitLinkPanel(componentId, context);
		else 
			return null;
	}

}
