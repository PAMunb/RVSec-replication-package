package io.onedev.server.web.component.build.log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.wicket.core.request.handler.IPartialPageRequestHandler;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.head.OnDomReadyHeaderItem;
import org.apache.wicket.markup.html.panel.GenericPanel;
import org.apache.wicket.model.IModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Sets;

import io.onedev.server.OneDev;
import io.onedev.server.buildspec.job.log.JobLogEntryEx;
import io.onedev.server.buildspec.job.log.Message;
import io.onedev.server.model.Build;
import io.onedev.server.tasklog.JobLogManager;
import io.onedev.server.tasklog.LogSnippet;
import io.onedev.server.web.asset.emoji.Emojis;
import io.onedev.server.web.behavior.WebSocketObserver;

@SuppressWarnings("serial")
public class BuildLogPanel extends GenericPanel<Build> {

	private static final int MAX_LOG_ENTRIES = 1000;
	
	private int nextOffset;
	
	public BuildLogPanel(String id, IModel<Build> model) {
		super(id, model);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(new WebSocketObserver() {
			
			private void appendRecentLogEntries(IPartialPageRequestHandler handler) {
				List<JobLogEntryEx> logEntries = getLogManager().readLogEntries(getBuild(), nextOffset, 0);

				if (!logEntries.isEmpty()) {
					nextOffset += logEntries.size();
					
					String script = String.format("onedev.server.buildLog.appendLogEntries('%s', %s, %d);", 
							getMarkupId(), asJSON(logEntries), MAX_LOG_ENTRIES);
					handler.appendJavaScript(script);
				}
			}
			
			@Override
			public void onObservableChanged(IPartialPageRequestHandler handler) {
				appendRecentLogEntries(handler);
			}
			
			@Override
			public Collection<String> getObservables() {
				return Sets.newHashSet(Build.getLogWebSocketObservable(getBuild().getId()));
			}
			
		});
		
		setOutputMarkupId(true);
	}

	private JobLogManager getLogManager() {
		return OneDev.getInstance(JobLogManager.class);
	}
	
	private String asJSON(List<JobLogEntryEx> entries) {
		List<JobLogEntryEx> transformed = new ArrayList<>();
		Emojis emojis = Emojis.getInstance();
		for (JobLogEntryEx entry: entries) {
			List<Message> messages = new ArrayList<>();
			for (Message message: entry.getMessages()) 
				messages.add(new Message(message.getStyle(), emojis.apply(message.getText())));
			transformed.add(new JobLogEntryEx(entry.getDate(), messages));
		}
		try {
			return OneDev.getInstance(ObjectMapper.class).writeValueAsString(transformed);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
		
		response.render(JavaScriptHeaderItem.forReference(new BuildLogResourceReference()));
		
		LogSnippet snippet = getLogManager().readLogSnippetReversely(getBuild(), MAX_LOG_ENTRIES+1);
		
		nextOffset = snippet.offset + snippet.entries.size();
		
		String script = String.format("onedev.server.buildLog.appendLogEntries('%s', %s, %d);", 
				getMarkupId(), asJSON(snippet.entries), MAX_LOG_ENTRIES);
		
		response.render(OnDomReadyHeaderItem.forScript(script));
	}

	private Build getBuild() {
		return getModelObject();
	}
}
