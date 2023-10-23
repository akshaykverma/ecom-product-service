package com.ecommerce.ecom_product_service.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ecommerce.ecom_product_service.model.ProductDTO;

public interface ProductService {
	
	Optional<ProductDTO> getProductById(UUID productId);
	
	Optional<ProductDTO> getProductByCategory(UUID categoryId);
	
	Optional<List<ProductDTO>> getProductsBySeller(UUID sellerId);
	
	Optional<List<ProductDTO>> getAllProducts();
	
	void addProduct(ProductDTO productDto);
	
	void updateProduct(UUID currentProductId, ProductDTO updatedProductData);
	
	void deleteProduct(UUID productId);
}
