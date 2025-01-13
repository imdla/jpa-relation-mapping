package com.example.relationprac.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // productName 중복 검사
    boolean existsByProductName(String productName);

    // productName 조회
    Optional<Product> findByProductName(String productName);
}
