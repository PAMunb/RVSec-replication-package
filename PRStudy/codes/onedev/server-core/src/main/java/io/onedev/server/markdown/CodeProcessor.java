package io.onedev.server.markdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Nullable;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;

import com.google.common.base.Splitter;

import io.onedev.commons.utils.StringUtils;
import io.onedev.server.model.Project;
import io.onedev.server.util.diff.DiffBlock;
import io.onedev.server.util.diff.DiffRenderer;
import io.onedev.server.util.diff.DiffUtils;
import io.onedev.server.web.component.markdown.SuggestionSupport;
import io.onedev.server.web.component.markdown.SuggestionSupport.SuggestFor;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext;

public class CodeProcessor implements MarkdownProcessor {
	
	@Override
	public void process(Document rendered, @Nullable Project project, 
			@Nullable BlobRenderContext blobRenderContext, 
			@Nullable SuggestionSupport suggestionSupport) {
		Collection<Element> codeElements = new ArrayList<>();
		NodeTraversor.traverse(new NodeVisitor() {

			@Override
			public void head(Node node, int depth) {
			}

			@Override
			public void tail(Node node, int depth) {
				if (node instanceof Element) {
					Element element = (Element) node;
					if (element.tagName().equals("code") 
							&& element.parent() != null 
							&& element.parent().tagName().equals("pre")) {
						codeElements.add(element);
					}
				}
			}
			
		}, rendered);
		
		for (Element codeElement: codeElements) {
			String language = null;
			String cssClasses = codeElement.attr("class");
			for (String cssClass: Splitter.on(" ").trimResults().omitEmptyStrings().split(cssClasses)) {
				if (cssClass.startsWith("language-")) {
					language = cssClass.substring("language-".length());
					break;
				}
			}

			if (language != null) {
				codeElement.attr("data-language", language);
				if (suggestionSupport != null && language.equals("suggestion")) {
					String suggestionContent = codeElement.wholeText();
					if (suggestionContent.endsWith("\n"))
						suggestionContent = suggestionContent.substring(0, suggestionContent.length()-1);
					List<String> suggestion = StringUtils.splitToLines(suggestionContent);
					SuggestFor suggestFor = suggestionSupport.getSuggestFor();
					List<String> content = suggestFor.getContent();
					List<DiffBlock<String>> diffBlocks = DiffUtils.diff(content, suggestion);
					codeElement.html("<div class='pb-2 mb-2 head font-size-xs mx-n2 px-2'>Suggested change</div>" 
								+ new DiffRenderer(diffBlocks).renderDiffs());
					codeElement.attr("data-suggestion", suggestionContent);
					codeElement.attr("data-suggestionfile", suggestFor.getFileName());
					codeElement.parent().addClass("suggestion");
					if (suggestionSupport.isOutdated()) 
						codeElement.attr("data-suggestionoutdated", "true");
					if (suggestionSupport.getApplySupport() != null) {
						codeElement.attr("data-suggestionappliable", "true");
						if (suggestionSupport.getApplySupport().getBatchSupport() != null) {
							codeElement.attr("data-suggestionbatchappliable", "true");
							if (suggestionSupport.getApplySupport().getBatchSupport().getInBatch() != null) {
								if (suggestionSupport.getApplySupport().getBatchSupport().getInBatch().equals(suggestion))
									codeElement.attr("data-suggestionapplyinbatch", "true");
								else
									codeElement.attr("data-suggestionoutdated", "true");
							}
						}
					}
				}
			}
			codeElement.parent().addClass("code");
		}
		
	}
	
}
