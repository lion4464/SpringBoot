package com.example.demo.category.repositories;

import com.example.demo.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategryRepo extends JpaRepository<Category,Long> {
}
