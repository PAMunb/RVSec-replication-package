package io.onedev.server.web.component.markdown;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Nullable;

import org.apache.wicket.ajax.AjaxRequestTarget;

import io.onedev.commons.utils.LinearRange;

public interface SuggestionSupport extends Serializable {

	SuggestFor getSuggestFor();
	
	boolean isOutdated();
	
	@Nullable
	ApplySupport getApplySupport();
	
	interface ApplySupport extends Serializable {
		
		void applySuggestion(AjaxRequestTarget target, List<String> suggestion);

		@Nullable
		BatchApplySupport getBatchSupport();
	}
	
	interface BatchApplySupport extends Serializable {

		@Nullable
		List<String> getInBatch();
		
		void addToBatch(AjaxRequestTarget target, List<String> suggestion);

		void removeFromBatch(AjaxRequestTarget target);
		
	}
	
	class SuggestFor {
		
		private final String fileName;
		
		private final List<String> content;
		
		private final LinearRange range;
		
		public SuggestFor(String fileName, List<String> content, LinearRange range) {
			this.fileName = fileName;
			this.content = content;
			this.range = range;
		}

		public String getFileName() {
			return fileName;
		}

		public List<String> getContent() {
			return content;
		}

		public LinearRange getRange() {
			return range;
		}
		
	}
	
}
