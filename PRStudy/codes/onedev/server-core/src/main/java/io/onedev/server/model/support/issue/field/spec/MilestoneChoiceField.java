package io.onedev.server.model.support.issue.field.spec;

import java.util.List;
import java.util.Map;

import io.onedev.server.model.support.inputspec.MilestoneChoiceInput;
import io.onedev.server.web.editable.annotation.Editable;

@Editable(order=1110, name=FieldSpec.MILESTONE)
public class MilestoneChoiceField extends FieldSpec {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String getPropertyDef(Map<String, Integer> indexes) {
		return MilestoneChoiceInput.getPropertyDef(this, indexes);
	}

	@Override
	public Object convertToObject(List<String> strings) {
		return MilestoneChoiceInput.convertToObject(this, strings);
	}

	@Override
	public List<String> convertToStrings(Object value) {
		return MilestoneChoiceInput.convertToStrings(this, value);
	}

	@Override
	public long getOrdinal(String fieldValue) {
		if (fieldValue != null)
			return MilestoneChoiceInput.getOrdinal(fieldValue);
		else
			return super.getOrdinal(fieldValue);
	}

	@Override
	protected void runScripts() {
	}

}
