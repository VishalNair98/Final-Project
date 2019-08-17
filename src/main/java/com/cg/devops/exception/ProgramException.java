package com.cg.devops.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/***
 * Common Custom Exception Class
 * @author Amit Kumar
 *
 */
@ResponseStatus
public class ProgramException extends RuntimeException {
	private HttpStatus title;
	private static final long serialVersionUID = 1L;

	/**
	 * Single Parameterised Constructor
	 * @param errorMessage
	 */
	public ProgramException(String errorMessage) {
		super(errorMessage);
	}

	/**
	 * Multiple Parameterised Constructor
	 * @param errorMessage
	 * @param httpStatus
	 */
	public ProgramException(String errorMessage, HttpStatus httpStatus) {
		super(errorMessage);
		title = httpStatus;
	}

	public HttpStatus getTitle() {
		return title;
	}

}
