package com.ecommerce.ecom_product_service.controller;

import java.util.UUID;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecom_product_service.model.ProductDTO;
import com.ecommerce.ecom_product_service.model.ProductSearchResultDTO;
import com.ecommerce.ecom_product_service.services.ProductService;
import com.ecommerce.ecom_product_service.util.CommonUtility;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/products/")
@RestController()
public class ProductController {

	private final ProductService productService;
	
	@GetMapping(path = {"{productId}"}, produces = { "application/json" })
    public ResponseEntity<ProductDTO>  getProductById(@PathVariable("productId") UUID productId) {
		log.debug("Get Request for ProductId: " + productId);
		
		return ResponseEntity.ok()
				.headers(CommonUtility.getHttpHeaders())
				.body(productService.getProductById(productId));
	}
	
	@GetMapping(path = {"page/{page}/size/{size}"}, produces = { "application/json" })
    public ResponseEntity<ProductSearchResultDTO>  listProducts(@PathVariable("page") @NotNull @Min(0) Integer page,
    		@Min(0) @Max(50) @NotNull @PathVariable("size") Integer size) {
		log.debug("list product request with params : page = {} and size = {}", page, size);
		
		return ResponseEntity.ok()
				.headers(CommonUtility.getHttpHeaders())
				.body(productService.listProducts(page, size));
	}
	
	@PostMapping(produces = { "application/json" })
    public ResponseEntity<Void>  addProduct(@RequestBody ProductDTO productDto) {
		log.debug("Add Request for a Product ");

		productService.saveProduct(productDto);
		
		return ResponseEntity.
				noContent().
				build();
	}
}
