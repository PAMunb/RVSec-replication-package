package io.onedev.server.markdown;

import javax.annotation.Nullable;

import org.jsoup.nodes.Document;

import io.onedev.commons.loader.ExtensionPoint;
import io.onedev.server.model.Project;
import io.onedev.server.web.component.markdown.SuggestionSupport;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext;

@ExtensionPoint
public interface MarkdownProcessor {
	
	void process(Document rendered, @Nullable Project project, 
			@Nullable BlobRenderContext blobRenderContext, 
			@Nullable SuggestionSupport suggestionSupport);
	
}
