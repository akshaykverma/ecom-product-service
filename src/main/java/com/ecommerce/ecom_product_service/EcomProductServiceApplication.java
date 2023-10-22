package com.ecommerce.ecom_product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = {"com.ecommerce.ecom_product_service.*"})
//@EntityScan(basePackages = )
public class EcomProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomProductServiceApplication.class, args);
	}

}
