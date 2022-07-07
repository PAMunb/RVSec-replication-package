package io.onedev.server.web.component.commandpalette;

import java.util.LinkedHashMap;
import java.util.Map;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.GroupManager;
import io.onedev.server.model.Group;
import io.onedev.server.web.page.admin.group.GroupPage;

public class GroupParam extends ParamSegment {

	private static final long serialVersionUID = 1L;
	
	public GroupParam(boolean optional) {
		super(GroupPage.PARAM_GROUP, optional);
	}
	
	@Override
	public Map<String, String> suggest(String matchWith, 
			Map<String, String> paramValues, int count) {
		Map<String, String> suggestions = new LinkedHashMap<>();
		if (matchWith.length() == 0) 
			matchWith = null;
		for (Group group: OneDev.getInstance(GroupManager.class).query(matchWith, 0, count))
			suggestions.put(group.getName(), String.valueOf(group.getId()));
		return suggestions;
	}

	@Override
	public boolean isExactMatch(String matchWith, Map<String, String> paramValues) {
		GroupManager groupManager = OneDev.getInstance(GroupManager.class);
		try {
			Long groupId = Long.valueOf(matchWith);
			if (groupManager.get(groupId) != null) 
				return true;
		} catch (NumberFormatException e) {
		}
		return false;
	}
		
}
