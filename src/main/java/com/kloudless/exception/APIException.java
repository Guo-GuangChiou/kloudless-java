package com.kloudless.exception;

public class APIException extends KloudlessException {

	private static final long serialVersionUID = 1L;

	public APIException(String message, Throwable e) {
		super(message, e);
	}
}
