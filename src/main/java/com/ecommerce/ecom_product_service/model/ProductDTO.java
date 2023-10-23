package com.ecommerce.ecom_product_service.model;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	
	private UUID id;
	private String name;
	private String description;
	private Double price;
	private CategoryDTO category;
	private List<SellerDTO> sellers;
}
