package com.Nimap.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Nimap.Entites.Product;
import com.Nimap.Repos.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepo productRepo;

    public Page<Product> getAllProducts(int page, int size) {
        return productRepo.findAll(PageRequest.of(page, size));
    }

    public Product createProduct(Product product) {
    	System.err.println("===== Product Added =====");
        return productRepo.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepo.findById(id);
    }

    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Product not found"));
        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());
        System.out.println("===== Product Updated =====");
        return productRepo.save(product);
    }

    public void deleteProduct(Long id) {
    	System.out.println("===== Product Deleted =====");
    	productRepo.deleteById(id);
    }
}
