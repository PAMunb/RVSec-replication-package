package io.onedev.server.notification;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;

import io.onedev.commons.loader.Listen;
import io.onedev.server.entitymanager.SettingManager;
import io.onedev.server.entitymanager.UrlManager;
import io.onedev.server.entitymanager.UserManager;
import io.onedev.server.event.build.BuildEvent;
import io.onedev.server.event.build.BuildUpdated;
import io.onedev.server.markdown.MarkdownManager;
import io.onedev.server.model.Build;
import io.onedev.server.model.BuildQueryPersonalization;
import io.onedev.server.model.EmailAddress;
import io.onedev.server.model.Project;
import io.onedev.server.model.User;
import io.onedev.server.model.support.NamedQuery;
import io.onedev.server.persistence.annotation.Sessional;
import io.onedev.server.search.entity.build.BuildQuery;

@Singleton
public class BuildNotificationManager extends AbstractNotificationManager {
	
	private static final Logger logger = LoggerFactory.getLogger(BuildNotificationManager.class);
	
	private final MailManager mailManager;
	
	private final UrlManager urlManager;
	
	private final UserManager userManager;
	
	@Inject
	public BuildNotificationManager(MailManager mailManager, UrlManager urlManager, 
			UserManager userManager, SettingManager settingManager, 
			MarkdownManager markdownManager) {
		super(markdownManager, settingManager);
		this.mailManager = mailManager;
		this.urlManager = urlManager;
		this.userManager = userManager;
	}

	private void fillSubscribedQueryStrings(Map<User, Collection<String>> subscribedQueryStrings, 
			User user, @Nullable NamedQuery query) {
		if (query != null) {
			Collection<String> value = subscribedQueryStrings.get(user);
			if (value == null) {
				value = new HashSet<>();
				subscribedQueryStrings.put(user, value);
			}
			value.add(query.getQuery());
		}
	}
	
	public void notify(BuildEvent event, Collection<String> emails) {
		Build build = event.getBuild();
		String subject = String.format("[Build %s] %s", build.getFQN(), build.getJobName());

		String summary = build.getStatus().toString();
		if (build.getVersion() != null)
			summary = build.getVersion() + " " + summary;
			
		String url = urlManager.urlFor(build);
		String threadingReferences = "<" + build.getProject().getPath() + "-build-" + build.getNumber() + "@onedev>";
		String htmlBody = getHtmlBody(event, summary, null, url, false, null);
		String textBody = getTextBody(event, summary, null, url, false, null);
		mailManager.sendMailAsync(Lists.newArrayList(), Lists.newArrayList(), emails, subject, htmlBody, 
				textBody, null, threadingReferences);
	}
	
	@Sessional
	@Listen
	public void on(BuildEvent event) {
		if (!(event instanceof BuildUpdated)) {
			Project project = event.getProject();
			Map<User, Collection<String>> subscribedQueryStrings = new HashMap<>();
			for (BuildQueryPersonalization personalization: project.getBuildQueryPersonalizations()) {
				for (String name: personalization.getQuerySubscriptionSupport().getQuerySubscriptions()) {
					String commonName = NamedQuery.getCommonName(name);
					if (commonName != null) {
						fillSubscribedQueryStrings(subscribedQueryStrings, personalization.getUser(), 
								NamedQuery.find(project.getNamedBuildQueries(), commonName));
					}
					String personalName = NamedQuery.getPersonalName(name);
					if (personalName != null) {
						fillSubscribedQueryStrings(subscribedQueryStrings, personalization.getUser(), 
								NamedQuery.find(personalization.getQueries(), personalName));
					}
				}
			}

			Build build = event.getBuild();
			Collection<String> notifyEmails = new HashSet<>();
			for (Map.Entry<User, Collection<String>> entry: subscribedQueryStrings.entrySet()) {
				User user = entry.getKey();
				for (String queryString: entry.getValue()) {
					User.push(user);
					try {
						if (BuildQuery.parse(event.getProject(), queryString, true, true).matches(build)) {
							EmailAddress emailAddress = user.getPrimaryEmailAddress();
							if (emailAddress != null && emailAddress.isVerified())
								notifyEmails.add(emailAddress.getValue());
							break;
						}
					} catch (Exception e) {
						String message = String.format("Error processing build subscription (user: %s, build: %s, query: %s)", 
								user.getName(), build.getFQN(), queryString);
						logger.error(message, e);
					} finally {
						User.pop();
					}
				}
			}
			
			subscribedQueryStrings.clear();
			for (User user: userManager.query()) {
				for (String name: user.getBuildQueryPersonalization().getQuerySubscriptionSupport().getQuerySubscriptions()) {
					String globalName = NamedQuery.getCommonName(name);
					if (globalName != null) {
						fillSubscribedQueryStrings(subscribedQueryStrings, user, 
								NamedQuery.find(settingManager.getBuildSetting().getNamedQueries(), globalName));
					}
					String personalName = NamedQuery.getPersonalName(name);
					if (personalName != null) {
						fillSubscribedQueryStrings(subscribedQueryStrings, user, 
								NamedQuery.find(user.getBuildQueryPersonalization().getQueries(), personalName));
					}
				}
			}

			for (Map.Entry<User, Collection<String>> entry: subscribedQueryStrings.entrySet()) {
				User user = entry.getKey();
				for (String queryString: entry.getValue()) {
					User.push(user);
					try {
						if (BuildQuery.parse(null, queryString, true, true).matches(build)) {
							EmailAddress emailAddress = user.getPrimaryEmailAddress();
							if (emailAddress != null && emailAddress.isVerified())
								notifyEmails.add(emailAddress.getValue());
							break;
						}
					} catch (Exception e) {
						String message = String.format("Error processing build subscription (user: %s, build: %s, query: %s)", 
								user.getName(), build.getFQN(), queryString);
						logger.error(message, e);
					} finally {
						User.pop();
					}
				}
			}
			
			notify(event, notifyEmails);
		}
	}

}
