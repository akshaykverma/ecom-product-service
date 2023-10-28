# ecom-product-service
E-commerce Product Microservice

# Viewing the integrated H2-DB (Spring Boot)

Access the below URL: 

- http://localhost:8080/h2-console 

JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: 

# Running docker-compose for kafka 

1. To start the containers in the background (detached mode), use:

	docker-compose up - d

2. Checking the process running in docker compose

	docker-compose ps

3. Stopping docker compose

	docker-compose down
	
4. Checking the contents in kafka topic

	docker-compose exec kafka kafka-console-consumer --topic <topic-name> --from-beginning --bootstrap-server kafka:9092

