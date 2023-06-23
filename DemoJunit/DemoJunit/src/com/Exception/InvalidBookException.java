package com.Exception;
public class InvalidBookException extends Exception 
{
	private static final long serialVersionUID = 8948109616853237484L;
	public InvalidBookException(String cause) {
		super(cause);
	}
}
