package com.ecommerce.ecom_product_service.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecom_product_service.domain.Product;

public interface ProductRepostory extends JpaRepository<Product, UUID>{
	
	Optional<Product> findById(UUID id);
}
