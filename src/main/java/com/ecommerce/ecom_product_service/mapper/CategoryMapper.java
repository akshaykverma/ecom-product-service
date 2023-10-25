package com.ecommerce.ecom_product_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ecommerce.ecom_product_service.domain.Category;
import com.ecommerce.ecom_product_service.model.CategoryDTO;
import com.ecommerce.ecom_product_service.util.CommonUtility;

@Mapper(componentModel = "spring", imports = {CommonUtility.class})
public interface CategoryMapper {
	
	@Mappings({
		@Mapping(source = "id", target = "id"),
		@Mapping(source = "name", target = "name"),
		@Mapping(source = "description", target = "description"),
	})
	CategoryDTO convertToCategoryDto(Category category);
	
}
