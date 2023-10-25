package com.ecommerce.ecom_product_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ecommerce.ecom_product_service.domain.Seller;
import com.ecommerce.ecom_product_service.model.SellerDTO;
import com.ecommerce.ecom_product_service.util.CommonUtility;

@Mapper(componentModel = "spring", imports = {CommonUtility.class})
public interface SellerMapper {
	
	@Mappings({
		@Mapping(source = "id", target = "id"),
		@Mapping(source = "name", target = "name")
	})
	SellerDTO convertToSellerDto(Seller seller);
	
}
