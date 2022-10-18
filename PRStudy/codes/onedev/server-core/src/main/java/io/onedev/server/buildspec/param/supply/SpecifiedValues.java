package io.onedev.server.buildspec.param.supply;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import io.onedev.server.buildspec.param.ParamCombination;
import io.onedev.server.model.Build;
import io.onedev.server.web.editable.annotation.Editable;
import io.onedev.server.web.editable.annotation.Interpolative;

@Editable(name="Use specified values or job secrets")
public class SpecifiedValues implements ValuesProvider {

	private static final long serialVersionUID = 1L;

	public static final String DISPLAY_NAME = "Use specified values";
	
	public static final String SECRET_DISPLAY_NAME = "Use specified job secrets";

	private List<List<String>> values = new ArrayList<>();
	
	@Editable
	@Interpolative
	public List<List<String>> getValues() {
		return values;
	}
	
	public void setValues(List<List<String>> values) {
		this.values = values;
	}

	@Override
	public List<List<String>> getValues(Build build, ParamCombination paramCombination) {
		return getValues();
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof SpecifiedValues)) 
			return false;
		if (this == other)
			return true;
		SpecifiedValues otherSpecifiedValues = (SpecifiedValues) other;
		return new EqualsBuilder()
			.append(values, otherSpecifiedValues.values)
			.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
			.append(values)
			.toHashCode();
	}

}
