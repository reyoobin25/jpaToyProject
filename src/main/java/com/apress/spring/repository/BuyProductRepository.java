package com.apress.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apress.spring.domain.BuyProduct;

@Repository
public interface BuyProductRepository extends JpaRepository<BuyProduct, Long>{

}
