package com.ecommerce.ecom_product_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ecommerce.ecom_product_service.domain.Product;
import com.ecommerce.ecom_product_service.model.ProductDTO;
import com.ecommerce.ecom_product_service.util.CommonUtility;

@Mapper(componentModel = "spring", imports = {CommonUtility.class})
public interface ProductResponseMapper {
	
	@Mappings({
		@Mapping(source = "id", target = "id"),
		@Mapping(source = "name", target = "name"),
		@Mapping(source = "description", target = "description"),
		@Mapping(source = "price", target = "price"),
		@Mapping(source = "category", target = "category"),
		@Mapping(source = "sellers", target = "sellers")
	})
	Product convert(ProductDTO productDto);
}
