package com.example.Ecommerce_API.controller;

import com.example.Ecommerce_API.model.Product;
import com.example.Ecommerce_API.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> getProductsByCategory(@RequestParam(value = "category") String category) {
        List<Product> products = productRepository.findByCategory(category);
        return ResponseEntity.ok().body(products);
    }

    @PostMapping("")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product newProduct = productRepository.save(product);
        return ResponseEntity.ok().body(newProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") Integer id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

