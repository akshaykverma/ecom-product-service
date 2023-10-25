package com.ecommerce.ecom_product_service.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"currentPageNumber", "totalPages", "totalResults", "sellers"})
public class SellerSearchResultDTO {

	private List<SellerDTO> sellers;
	private Integer currentPageNumber;
	private Integer totalPages;
	private Long totalResults;
}
