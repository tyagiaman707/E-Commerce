package com.example.Ecommerce_API.repository;

import com.example.Ecommerce_API.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
