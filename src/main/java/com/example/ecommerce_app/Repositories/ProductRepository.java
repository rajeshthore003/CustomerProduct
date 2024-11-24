package com.example.ecommerce_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce_app.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
