package com.Nimap.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Nimap.Entites.Category;
import com.Nimap.Repos.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired
    private CategoryRepo categoryRepo;

    public Page<Category> getAllCategories(int page, int size) {
        return categoryRepo.findAll(PageRequest.of(page, size));
    }

    public Category createCategory(Category category) {
    	System.err.println("===== Category Added =====");
        return categoryRepo.save(category);
    }

    public Optional<Category> getCategoryById(Long id) {
        return categoryRepo.findById(id);
    }

    public Category updateCategory(Long id, Category categoryDetails) {
        Category category = categoryRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Category not found"));
        category.setName(categoryDetails.getName());
        System.out.println("===== Category Updated =====");
        return categoryRepo.save(category);
    }

    public void deleteCategory(Long id) {
    	System.out.println("===== Category Deleted =====");
    	categoryRepo.deleteById(id);
    }
}
