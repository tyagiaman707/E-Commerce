package com.example.Ecommerce_API.repository;

import com.example.Ecommerce_API.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
