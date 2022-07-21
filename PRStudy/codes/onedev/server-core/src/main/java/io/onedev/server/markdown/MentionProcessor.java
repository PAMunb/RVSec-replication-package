package io.onedev.server.markdown;

import javax.annotation.Nullable;

import org.apache.wicket.request.cycle.RequestCycle;
import org.jsoup.nodes.Document;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.UserManager;
import io.onedev.server.model.Project;
import io.onedev.server.web.component.markdown.SuggestionSupport;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext;

public class MentionProcessor extends MentionParser implements MarkdownProcessor {
	
	@Override
	public void process(Document document, Project project, 
			@Nullable BlobRenderContext blobRenderContext, 
			@Nullable SuggestionSupport suggestionSupport) {
		parseMentions(document);
	}

	@Override
	protected String toHtml(String userName) {
		if (RequestCycle.get() != null && OneDev.getInstance(UserManager.class).findByName(userName) != null) {
			return String.format("<a class='reference mention' data-reference='%s'>@%s</a>", 
					userName, userName);
		} else {
			return super.toHtml(userName);
		}
	}
	
}
