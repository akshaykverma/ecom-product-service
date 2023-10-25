package com.ecommerce.ecom_product_service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ecommerce.ecom_product_service.domain.Seller;
import com.ecommerce.ecom_product_service.mapper.SellerMapper;
import com.ecommerce.ecom_product_service.model.SellerDTO;
import com.ecommerce.ecom_product_service.model.SellerSearchResultDTO;
import com.ecommerce.ecom_product_service.repository.SellerRepostory;
import com.ecommerce.ecom_product_service.services.SellerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SellerServiceImpl implements SellerService {

	private final SellerRepostory sellerRepo;
	private final SellerMapper sellerMapper;
	
	@Override
	public SellerSearchResultDTO listSellers(Integer pageNumber, Integer pageSize) {
		
		Page<Seller> pagedSeller = sellerRepo.findAll(PageRequest.of(pageNumber, pageSize));
		
		if (pagedSeller.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Data Found");
		}
		
		List<SellerDTO> sellers = pagedSeller.getContent().stream().map(sellerMapper::convertToSellerDto).collect(Collectors.toList());
		
		return SellerSearchResultDTO
				.builder()
				.sellers(sellers)
				.currentPageNumber(pagedSeller.getNumber())
				.totalPages(pagedSeller.getTotalPages())
				.totalResults(pagedSeller.getTotalElements())
				.build();
	}


}
