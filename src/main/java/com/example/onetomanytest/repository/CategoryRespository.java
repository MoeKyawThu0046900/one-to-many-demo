package com.example.onetomanytest.repository;

import com.example.onetomanytest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRespository extends JpaRepository<Category,Long> {
}
