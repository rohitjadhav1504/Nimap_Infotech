package com.example.categoryproduct.repository;

import com.example.categoryproduct.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
