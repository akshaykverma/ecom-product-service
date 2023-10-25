package com.ecommerce.ecom_product_service.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ecom_product_service.model.SellerSearchResultDTO;
import com.ecommerce.ecom_product_service.services.SellerService;
import com.ecommerce.ecom_product_service.util.CommonUtility;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/sellers/")
@RestController()
public class SellerController {

	private final SellerService sellerService;
	
	@GetMapping(path = {"page/{page}/size/{size}"}, produces = { "application/json" })
    public ResponseEntity<SellerSearchResultDTO>  listSellers(@PathVariable("page") @NotNull @Min(0) Integer page,
    		@Min(0) @Max(50) @NotNull @PathVariable("size") Integer size) {
		log.debug("list sellers request with params : page = {} and size = {}", page, size);
		
		return ResponseEntity.ok()
				.headers(CommonUtility.getHttpHeaders())
				.body(sellerService.listSellers(page, size));
	}
	
}
