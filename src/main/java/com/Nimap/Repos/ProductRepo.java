package com.Nimap.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nimap.Entites.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
