package com.mobis.demo.exception;

public class CustomerAlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public CustomerAlreadyExistsException() {
	
	}

	public CustomerAlreadyExistsException(String msg) {
		super(msg);
		this.message = msg;
	}
	
	
	
	

}
