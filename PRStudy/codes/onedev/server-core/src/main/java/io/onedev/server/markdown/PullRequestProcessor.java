package io.onedev.server.markdown;

import javax.annotation.Nullable;

import org.apache.wicket.request.cycle.RequestCycle;
import org.jsoup.nodes.Document;

import io.onedev.server.entityreference.ReferenceParser;
import io.onedev.server.model.Project;
import io.onedev.server.model.PullRequest;
import io.onedev.server.util.ProjectScopedNumber;
import io.onedev.server.web.component.markdown.SuggestionSupport;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext;
import io.onedev.server.web.page.project.pullrequests.detail.activities.PullRequestActivitiesPage;

public class PullRequestProcessor extends ReferenceParser implements MarkdownProcessor {
	
	public PullRequestProcessor() {
		super(PullRequest.class);
	}

	@Override
	public void process(Document document, @Nullable Project project, 
			@Nullable BlobRenderContext blobRenderContext, 
			@Nullable SuggestionSupport suggestionSupport) {
		parseReferences(document, project);
	}

	@Override
	protected String toHtml(ProjectScopedNumber referenceable, String referenceText) {
		if (RequestCycle.get() != null) {
			CharSequence url = RequestCycle.get().urlFor(
					PullRequestActivitiesPage.class, PullRequestActivitiesPage.paramsOf(referenceable)); 
			return String.format("<a href='%s' class='pull-request reference' data-reference='%s'>%s</a>", 
					url, referenceable.toString(), referenceText);
		} else {
			return super.toHtml(referenceable, referenceText);
		}
	}
	
}
