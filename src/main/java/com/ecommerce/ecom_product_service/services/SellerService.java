package com.ecommerce.ecom_product_service.services;

import com.ecommerce.ecom_product_service.model.SellerSearchResultDTO;

public interface SellerService {
	
	SellerSearchResultDTO listSellers(Integer pageNumber, Integer pageSize);
}
