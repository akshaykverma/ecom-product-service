package com.ecommerce.ecom_product_service.serviceImpl;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ecommerce.ecom_product_service.model.ProductDTO;
import com.ecommerce.ecom_product_service.util.AppConstants;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@Service
public class KafkaProducerService {

	private final KafkaTemplate<String, ProductDTO> kafkaTemplate;
	
	public void sendMessage(ProductDTO product) {
		
		log.debug("sending message in kafka {} ", product);
		
		kafkaTemplate.send(AppConstants.TOPIC_NAME, product);
	}
	
}
