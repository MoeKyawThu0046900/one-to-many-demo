package com.example.onetomanytest.repository;

import com.example.onetomanytest.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
