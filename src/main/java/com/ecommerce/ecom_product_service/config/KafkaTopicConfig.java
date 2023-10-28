package com.ecommerce.ecom_product_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.ecommerce.ecom_product_service.util.AppConstants;

@Configuration
public class KafkaTopicConfig {

	@Bean
    public NewTopic javaguidesTopic() {
		return TopicBuilder.name(AppConstants.TOPIC_NAME).build();
	}
}
