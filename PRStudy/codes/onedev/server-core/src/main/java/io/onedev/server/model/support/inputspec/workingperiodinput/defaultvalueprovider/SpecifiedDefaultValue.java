package io.onedev.server.model.support.inputspec.workingperiodinput.defaultvalueprovider;

import javax.validation.constraints.NotNull;

import io.onedev.server.web.editable.annotation.Editable;
import io.onedev.server.web.editable.annotation.OmitName;
import io.onedev.server.web.editable.annotation.WorkingPeriod;

@Editable(order=100, name="Use specified default value")
public class SpecifiedDefaultValue implements DefaultValueProvider {

	private static final long serialVersionUID = 1L;

	private Integer value;

	@Editable(name="Specified default value")
	@NotNull(message="may not be empty")
	@WorkingPeriod
	@OmitName
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public Integer getDefaultValue() {
		return getValue();
	}

}
