package com.example.yassinesef.billingservice.repository;


import com.example.yassinesef.billingservice.entites.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}