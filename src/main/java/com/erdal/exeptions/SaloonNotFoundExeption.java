package com.erdal.exeptions;

public class SaloonNotFoundExeption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Long id;

	public SaloonNotFoundExeption(String message) {
		super(message);
	}

	public SaloonNotFoundExeption(String message, Long id) {
		super(message);
		this.id = id;

	}
}