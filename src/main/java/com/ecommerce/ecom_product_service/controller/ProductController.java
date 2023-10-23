package com.ecommerce.ecom_product_service.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecom_product_service.model.ProductDTO;
import com.ecommerce.ecom_product_service.services.ProductService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
@RestController()
public class ProductController {

	private final ProductService productService;
	
	@GetMapping(path = {"product/{productId}"}, produces = { "application/json" })
    public ResponseEntity<ProductDTO>  getProductById(@PathVariable("productId") UUID productId) {
		log.debug("Get Request for ProductId: " + productId);
		
		return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
	}
    
}
