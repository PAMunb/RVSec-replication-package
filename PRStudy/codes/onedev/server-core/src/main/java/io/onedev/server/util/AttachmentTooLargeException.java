package io.onedev.server.util;

import io.onedev.commons.utils.ExplicitException;

public class AttachmentTooLargeException extends ExplicitException {

	private static final long serialVersionUID = 1L;

	public AttachmentTooLargeException(String message) {
		super(message);
	}

}
