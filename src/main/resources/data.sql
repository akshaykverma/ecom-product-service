-- Sample data for the Category table
INSERT INTO category (category_id, name, description)
VALUES
('c94e7a1e-2a6a-4e00-9b33-5a96ea8f250a', 'Electronics', 'Electronic products category'),
('318d35ce-5964-4c47-8c7c-228ced5f8574', 'Clothing', 'Clothing and apparel category'),
('6f8b3a46-0ebc-4e15-8485-9e847f0047f5', 'Furniture', 'Furniture and home decor'),
('213078c6-4469-4e7b-8870-58aa3bb8d1ea', 'Books', 'Books and literature'),
('e7b7b82f-7ebd-4de1-973b-477c2c32fb86', 'Toys', 'Children''s toys');


-- Sample data for the Product table
INSERT INTO product (product_id, version, name, description, category_id, price, created_date, last_modified_date)
VALUES
('d50c65a3-22e6-457e-a0f9-cd4930d6efec', 1, 'Smartphone', 'High-end smartphone', 'c94e7a1e-2a6a-4e00-9b33-5a96ea8f250a', 799.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('04b82a83-5efb-4d83-89f7-c7e5b18b6c6b', 1, 'Laptop', 'Powerful laptop for gaming', 'c94e7a1e-2a6a-4e00-9b33-5a96ea8f250a', 1299.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('e191ce5a-7e7f-4ce2-a59d-ea789f8c3e26', 1, 'Leather Jacket', 'Men''s leather jacket', '318d35ce-5964-4c47-8c7c-228ced5f8574', 149.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('c3f12092-7e78-45f7-8e11-349d1c9e01e9', 1, 'Headphones', 'High-quality headphones', 'c94e7a1e-2a6a-4e00-9b33-5a96ea8f250a', 99.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('ffa7b8e3-9b1e-41c3-8c7f-c8e0cfa0eafa', 1, 'T-shirt', 'Men''s cotton T-shirt', '318d35ce-5964-4c47-8c7c-228ced5f8574', 19.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('74de38c6-6e4a-4a4b-8d51-aa4613dc7b25', 1, 'Coffee Table', 'Wooden coffee table', '6f8b3a46-0ebc-4e15-8485-9e847f0047f5', 299.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('dabfb56d-0bf3-48e7-8ed9-9863d9c1a4e0', 1, 'Novel', 'Bestselling novel', '213078c6-4469-4e7b-8870-58aa3bb8d1ea', 14.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('9b7dcee8-4da3-4bf6-8b51-777779ae0e46', 1, 'Action Figure', 'Collectible action figure', 'e7b7b82f-7ebd-4de1-973b-477c2c32fb86', 24.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('ceb7b3b4-8bd2-45d9-8f38-2d9f9c4cfb8c', 1, 'Tablet', 'High-performance tablet', 'c94e7a1e-2a6a-4e00-9b33-5a96ea8f250a', 499.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('eebd5a7d-8e38-4d64-9c47-7e6f2bd1a2a8', 1, 'Jeans', 'Women''s skinny jeans', '318d35ce-5964-4c47-8c7c-228ced5f8574', 39.99,CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('48efb3c8-5f8d-42c7-8a7a-5e8e7af1c3d7', 1, 'Desk Chair', 'Ergonomic desk chair', '6f8b3a46-0ebc-4e15-8485-9e847f0047f5', 149.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('2d6d8e9e-1ee3-4bfc-9d6b-dbeb2a4da1f2', 1, 'Historical Novel', 'Historical fiction novel', '213078c6-4469-4e7b-8870-58aa3bb8d1ea', 17.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('9c1d2cde-88a6-40eb-8d1c-1e8ec3d4dbd6', 1, 'Board Game', 'Family board game', 'e7b7b82f-7ebd-4de1-973b-477c2c32fb86', 29.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('8bbff5b9-4a5d-48f2-8e8b-5e3b9c5f4df5', 1, 'Digital Camera', 'High-resolution digital camera', 'c94e7a1e-2a6a-4e00-9b33-5a96ea8f250a', 499.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('b9c8a2ed-1a9e-42c4-8d4b-6c3ef8e2ce0e', 1, 'LED TV', '55-inch LED TV with 4K resolution', 'c94e7a1e-2a6a-4e00-9b33-5a96ea8f250a', 699.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('a8f8e3b2-1c9e-45cc-8d4c-7b6f8a1b6c5b', 1, 'Running Shoes', 'Men''s running shoes', '318d35ce-5964-4c47-8c7c-228ced5f8574', 79.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('d8c3b4c1-4c4b-4a7d-8b6c-0d1edab1a1ed', 1, 'Coffee Maker', 'Automatic coffee maker', '6f8b3a46-0ebc-4e15-8485-9e847f0047f5', 59.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('e6c7d8ad-0e1c-42c8-8f3d-1b5d8ad4ea5d', 1, 'Science Fiction Novel', 'Sci-fi adventure novel', '213078c6-4469-4e7b-8870-58aa3bb8d1ea', 19.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('f1d2a1e6-8e1a-4bda-8a1e-6e8a2a2e4da2', 1, 'Backpack', 'Hiking backpack', 'e7b7b82f-7ebd-4de1-973b-477c2c32fb86', 49.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP),
('b6d4e7f5-8d7a-4d4b-8f5e-2c1d4f5ecf5e', 1, 'Gaming Console', 'Video game console', 'c94e7a1e-2a6a-4e00-9b33-5a96ea8f250a', 399.99, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP);

-- Sample data for the Seller table
INSERT INTO seller (seller_id, name)
VALUES
('a8d79344-2cb6-44cc-b45d-0dab1c197d14', 'ElectroShop'),
('a8e22ad4-6677-4b03-82c4-2a8e6930bfff', 'TechWorld'),
('7b2a4e12-670c-42c4-9980-8696a1cf5d9e', 'Furniture World'),
('3d14245c-0c5e-4ec4-8f7a-60e7abf3b1a6', 'Book Haven');

-- Sample data for the product_seller Join Table
INSERT INTO product_seller (product_id, seller_id)
VALUES
('d50c65a3-22e6-457e-a0f9-cd4930d6efec', 'a8d79344-2cb6-44cc-b45d-0dab1c197d14'),
('d50c65a3-22e6-457e-a0f9-cd4930d6efec', 'a8e22ad4-6677-4b03-82c4-2a8e6930bfff'),
('04b82a83-5efb-4d83-89f7-c7e5b18b6c6b', 'a8d79344-2cb6-44cc-b45d-0dab1c197d14'),
('e191ce5a-7e7f-4ce2-a59d-ea789f8c3e26', '7b2a4e12-670c-42c4-9980-8696a1cf5d9e'),
('c3f12092-7e78-45f7-8e11-349d1c9e01e9', 'a8d79344-2cb6-44cc-b45d-0dab1c197d14'),
('ffa7b8e3-9b1e-41c3-8c7f-c8e0cfa0eafa', 'a8e22ad4-6677-4b03-82c4-2a8e6930bfff'),
('74de38c6-6e4a-4a4b-8d51-aa4613dc7b25', '7b2a4e12-670c-42c4-9980-8696a1cf5d9e'),
('dabfb56d-0bf3-48e7-8ed9-9863d9c1a4e0', '3d14245c-0c5e-4ec4-8f7a-60e7abf3b1a6');
-- Add more entries as needed...

-- Sample data for the Product-Seller relationship
-- Map all products to sellers
INSERT INTO product_seller (product_id, seller_id)
SELECT
  product_id,
  seller_id
FROM Product
CROSS JOIN Seller;
