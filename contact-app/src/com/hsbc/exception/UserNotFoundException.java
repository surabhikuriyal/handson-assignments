package com.hsbc.exception;

public class UserNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	public UserNotFoundException()
	{
		super("User not found");
	}
	public UserNotFoundException(String msg)
	{
		super(msg);
	}
}
