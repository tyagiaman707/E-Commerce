package com.example.Ecommerce_API.controller;

import com.example.Ecommerce_API.exception.ResourceNotFoundException;
import com.example.Ecommerce_API.model.User;
import com.example.Ecommerce_API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return ResponseEntity.ok().body(user);
    }
}

