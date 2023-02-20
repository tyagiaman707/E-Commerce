package com.example.Ecommerce_API.controller;

import com.example.Ecommerce_API.model.Address;
import com.example.Ecommerce_API.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("")
    public ResponseEntity<Address> createAddress(@RequestBody Address address) {
        Address newAddress = addressRepository.save(address);
        return ResponseEntity.ok().body(newAddress);
    }
}

