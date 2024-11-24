package com.example.ecommerce_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce_app.Entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
