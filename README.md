# Spring Boot E-commerce API

Project Overview :-
This Spring Boot project provides a RESTful API for an e-commerce system that manages categories and products. The API supports CRUD operations, paginated results, and maintains a one-to-many relationship between categories and products (one category can have multiple products).

The API is built using Spring Boot, Spring Data JPA, and Hibernate with a MySQL (or any other RDBMS) backend for data storage.

Requirements :- 
1) Java 11 or higher
2) Maven (for dependency management)
3) MySQL or another RDBMS (configurable)
4) Postman or cURL (recommended for testing APIs)

### API Endpoints ###

# Category APIs
Method	Endpoint	Description
1) GET	/api/categories?page={page}	Get paginated list of categories
   
2) POST	/api/categories	Create a new category
   
3) GET	/api/categories/{id}	Get category by ID
   
4) PUT	/api/categories/{id}	Update category by ID
   
5) DELETE	/api/categories/{id}	Delete category by ID

   
Sample JSON for Creating/Updating Category
json

{
  "name": "Electronics"
}

### Product APIs ###

Method	Endpoint	Description

1) GET	/api/products?page={page}	Get paginated list of products
   
2) POST	/api/products	Create a new product
   
3) GET	/api/products/{id}	Get product by ID
   
4) PUT	/api/products/{id}	Update product by ID
   
5) DELETE	/api/products/{id}	Delete product by ID
   
Sample JSON for Creating/Updating Product
json

{
  "name": "Laptop",
  "description": "A powerful laptop",
  "price": 999.99,
  "category": {
    "id": 1
  }
}

### Details of Key Components ###

1) Category Entity: Represents a category with fields id, name, and a one-to-many relationship with products.
   
2) Product Entity: Represents a product with fields id, name, description, price, and a many-to-one relationship with category.
   
3) CategoryService and ProductService: Services contain business logic and interact with the repositories for data operations.
   
4) CategoryController and ProductController: Expose RESTful endpoints for performing CRUD operations on categories and products.

### Postman Instructions ###

1) Open Postman and create a new collection.

2) Add requests for each API endpoint described above, setting the appropriate HTTP method (GET, POST, PUT, DELETE) and JSON payload.
   
3) For GET and DELETE requests, simply enter the endpoint and click Send.
   
4) For POST and PUT requests:  Select Body -> Raw -> JSON to enter the JSON payload.


