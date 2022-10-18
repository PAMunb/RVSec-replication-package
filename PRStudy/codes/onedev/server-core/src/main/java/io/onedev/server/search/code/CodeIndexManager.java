package io.onedev.server.search.code;

import javax.annotation.Nullable;

import org.eclipse.jgit.lib.ObjectId;

import io.onedev.commons.jsymbol.Symbol;
import io.onedev.commons.jsymbol.SymbolExtractor;
import io.onedev.server.model.Project;

public interface CodeIndexManager {
	
	void indexAsync(Project project, ObjectId commitId);
	
	boolean isIndexed(Project project, ObjectId commitId);
	
	String getIndexVersion();
	
	String getIndexVersion(@Nullable SymbolExtractor<Symbol> extractor);
	
}
