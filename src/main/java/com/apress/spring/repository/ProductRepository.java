package com.apress.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apress.spring.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
