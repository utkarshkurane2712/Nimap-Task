# Spring Boot E-commerce API

Project Overview :-
This Spring Boot project provides a RESTful API for an e-commerce system that manages categories and products. The API supports CRUD operations, paginated results, and maintains a one-to-many relationship between categories and products (one category can have multiple products).

The API is built using Spring Boot, Spring Data JPA, and Hibernate with a MySQL (or any other RDBMS) backend for data storage.

Requirements :- 
1) Java 11 or higher
2) Maven (for dependency management)
3) MySQL or another RDBMS (configurable)
4) Postman or cURL (recommended for testing APIs)

# API Endpoints

1. Category APIs
Method	Endpoint	Description
1) GET	/api/categories?page={page}	Get paginated list of categories
POST	/api/categories	Create a new category
GET	/api/categories/{id}	Get category by ID
PUT	/api/categories/{id}	Update category by ID
DELETE	/api/categories/{id}	Delete category by ID
Sample JSON for Creating/Updating Category
json
Copy code
{
  "name": "Electronics"
}
2. Product APIs
Method	Endpoint	Description
GET	/api/products?page={page}	Get paginated list of products
POST	/api/products	Create a new product
GET	/api/products/{id}	Get product by ID
PUT	/api/products/{id}	Update product by ID
DELETE	/api/products/{id}	Delete product by ID
Sample JSON for Creating/Updating Product
json
Copy code
{
  "name": "Laptop",
  "description": "A powerful laptop",
  "price": 999.99,
  "category": {
    "id": 1
  }
}
Note: The category field expects an object with the id of an existing category. This establishes the relationship between the product and its category.

