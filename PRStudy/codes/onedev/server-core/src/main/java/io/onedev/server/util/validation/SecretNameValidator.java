package io.onedev.server.util.validation;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import io.onedev.server.util.validation.annotation.SecretName;

public class SecretNameValidator implements ConstraintValidator<SecretName, String> {

	public static final Pattern PATTERN = Pattern.compile("\\w([\\w-\\.]*\\w)?");
	
	private String message;
	
	@Override
	public void initialize(SecretName constaintAnnotation) {
		message = constaintAnnotation.message();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext constraintContext) {
		if (value == null)
			return true;
		
		if (!PATTERN.matcher(value).matches()) {
			String message = this.message;
			if (message.length() == 0) {
				message = "Should start and end with alphanumeric or underscore. "
						+ "Only alphanumeric, underscore, dash, and dot are allowed in the middle.";
			}
			constraintContext.buildConstraintViolationWithTemplate(message).addConstraintViolation();
			return false;
		} else {
			return true;
		}
	}
	
}
