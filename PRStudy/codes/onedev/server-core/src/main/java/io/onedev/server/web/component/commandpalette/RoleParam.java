package io.onedev.server.web.component.commandpalette;

import java.util.LinkedHashMap;
import java.util.Map;

import io.onedev.server.OneDev;
import io.onedev.server.entitymanager.RoleManager;
import io.onedev.server.model.Role;
import io.onedev.server.web.page.admin.role.RoleDetailPage;

public class RoleParam extends ParamSegment {

	private static final long serialVersionUID = 1L;
	
	public RoleParam(boolean optional) {
		super(RoleDetailPage.PARAM_ROLE, optional);
	}
	
	@Override
	public Map<String, String> suggest(String matchWith, 
			Map<String, String> paramValues, int count) {
		Map<String, String> suggestions = new LinkedHashMap<>();
		if (matchWith.length() == 0)
			matchWith = null;
		for (Role role: OneDev.getInstance(RoleManager.class).query(matchWith, 0, count))
			suggestions.put(role.getName(), String.valueOf(role.getId()));
		return suggestions;
	}

	@Override
	public boolean isExactMatch(String matchWith, Map<String, String> paramValues) {
		RoleManager roleManager = OneDev.getInstance(RoleManager.class);
		try {
			Long roleId = Long.valueOf(matchWith);
			if (roleManager.get(roleId) != null) 
				return true;
		} catch (NumberFormatException e) {
		}
		return false;
	}
		
}
