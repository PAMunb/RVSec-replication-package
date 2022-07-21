package io.onedev.server.model.support.inputspec;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.ValidationException;

import com.google.common.collect.Lists;

public class PullRequestChoiceInput {
	
	public static String getPropertyDef(InputSpec inputSpec, Map<String, Integer> indexes) {
		int index = indexes.get(inputSpec.getName());
		StringBuffer buffer = new StringBuffer();
		inputSpec.appendField(buffer, index, "Long");
		inputSpec.appendCommonAnnotations(buffer, index);
		if (!inputSpec.isAllowEmpty())
			buffer.append("    @NotNull\n");
		buffer.append("    @PullRequestChoice\n");
		inputSpec.appendMethods(buffer, index, "Long", null, null);
		
		return buffer.toString();
	}

	public static Object convertToObject(List<String> strings) {
		if (strings.size() == 0) {
			return null;
		} else if (strings.size() == 1) {
			String value = strings.iterator().next();
			try {
				return Long.valueOf(value);
			} catch (NumberFormatException e) {
				throw new ValidationException("Invalid pull request number");
			}
		} else {
			throw new ValidationException("Not eligible for multi-value");
		}
	}

	public static List<String> convertToStrings(Object value) {
		if (value instanceof Long)
			return Lists.newArrayList(value.toString());
		else
			return new ArrayList<>();
	}

}
