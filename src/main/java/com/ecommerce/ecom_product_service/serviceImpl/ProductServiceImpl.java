package com.ecommerce.ecom_product_service.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ecommerce.ecom_product_service.domain.Product;
import com.ecommerce.ecom_product_service.exception.ProductNotFoundException;
import com.ecommerce.ecom_product_service.mapper.ProductMapper;
import com.ecommerce.ecom_product_service.model.ProductDTO;
import com.ecommerce.ecom_product_service.repository.ProductRepostory;
import com.ecommerce.ecom_product_service.services.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepostory productRepo;
	private final ProductMapper productMapper;

	@Override
	public ProductDTO getProductById(UUID productId) {
		Optional<Product> productOptional = productRepo.findById(productId);
		
		if (productOptional.isPresent()) {
			return productMapper.convertToProductDto(productOptional.get());
		}
		throw new ProductNotFoundException("product with product id" + productId.toString() + " not found");
	}

	@Override
	public Optional<ProductDTO> getProductByCategory(UUID categoryId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<ProductDTO>> getProductsBySeller(UUID sellerId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<ProductDTO>> getAllProducts() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void addProduct(ProductDTO productDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(UUID currentProductId, ProductDTO updatedProductData) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(UUID productId) {
		// TODO Auto-generated method stub
		
	}

}
