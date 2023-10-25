package com.ecommerce.ecom_product_service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ecommerce.ecom_product_service.domain.Category;
import com.ecommerce.ecom_product_service.mapper.CategoryMapper;
import com.ecommerce.ecom_product_service.model.CategoryDTO;
import com.ecommerce.ecom_product_service.model.CategorySearchResultDTO;
import com.ecommerce.ecom_product_service.repository.CategoryRepostory;
import com.ecommerce.ecom_product_service.services.CategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

	private final CategoryRepostory categoryRepo;
	private final CategoryMapper categoryMapper;
	
	@Override
	public CategorySearchResultDTO listCategories(Integer pageNumber, Integer pageSize) {
		
		Page<Category> pagedCategory = categoryRepo.findAll(PageRequest.of(pageNumber, pageSize));
		
		if (pagedCategory.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Data Found");
		}
		
		List<CategoryDTO> categoryList = pagedCategory.getContent().stream().map(categoryMapper::convertToCategoryDto).collect(Collectors.toList());
		
		return CategorySearchResultDTO
				.builder()
				.categories(categoryList)
				.currentPageNumber(pagedCategory.getNumber())
				.totalPages(pagedCategory.getTotalPages())
				.totalResults(pagedCategory.getTotalElements())
				.build();
	}


}
