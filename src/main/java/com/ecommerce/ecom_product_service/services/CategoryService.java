package com.ecommerce.ecom_product_service.services;

import com.ecommerce.ecom_product_service.model.CategorySearchResultDTO;

public interface CategoryService {
	
	CategorySearchResultDTO listCategories(Integer pageNumber, Integer size);
}
