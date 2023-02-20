package com.example.Ecommerce_API.repository;

import com.example.Ecommerce_API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
