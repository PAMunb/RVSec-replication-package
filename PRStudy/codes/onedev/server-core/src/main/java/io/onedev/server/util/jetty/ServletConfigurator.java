package io.onedev.server.util.jetty;

import org.eclipse.jetty.servlet.ServletContextHandler;

import io.onedev.commons.loader.ExtensionPoint;

@ExtensionPoint
public interface ServletConfigurator {
	void configure(ServletContextHandler context);
}
