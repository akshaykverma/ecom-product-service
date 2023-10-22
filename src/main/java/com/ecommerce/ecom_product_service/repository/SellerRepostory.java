package com.ecommerce.ecom_product_service.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecom_product_service.domain.Seller;

public interface SellerRepostory extends JpaRepository<Seller, UUID>{

}
