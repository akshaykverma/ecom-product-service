package com.ecommerce.ecom_product_service.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecom_product_service.domain.Category;

public interface CategoryRepostory extends JpaRepository<Category, UUID>{

}
