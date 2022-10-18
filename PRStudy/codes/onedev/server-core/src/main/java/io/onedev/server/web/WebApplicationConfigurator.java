package io.onedev.server.web;

import org.apache.wicket.protocol.http.WebApplication;

import io.onedev.commons.loader.ExtensionPoint;

@ExtensionPoint
public interface WebApplicationConfigurator {

	void configure(WebApplication application);
	
}
