package com.ecommerce.ecom_product_service.exception;

public class ProductNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String errorMessage) {
		super(errorMessage);
	}
	
	public ProductNotFoundException(String errorMessage, Throwable throwable) {
		super(errorMessage, throwable);
	}
}
