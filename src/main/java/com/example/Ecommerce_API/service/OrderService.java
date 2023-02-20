package com.example.Ecommerce_API.service;

import com.example.Ecommerce_API.exception.ResourceNotFoundException;
import com.example.Ecommerce_API.model.Address;
import com.example.Ecommerce_API.model.Order;
import com.example.Ecommerce_API.model.Product;
import com.example.Ecommerce_API.model.User;
import com.example.Ecommerce_API.repository.AddressRepository;
import com.example.Ecommerce_API.repository.OrderRepository;
import com.example.Ecommerce_API.repository.ProductRepository;
import com.example.Ecommerce_API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AddressRepository addressRepository;

    public Order placeOrder(Integer userId, Integer productId, Integer addressId, Integer productQuantity) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + productId));
        Address address = addressRepository.findById(addressId)
                .orElseThrow(() -> new ResourceNotFoundException("Address not found with id: " + addressId));

        Order order = new Order();
        order.setUser(user);
        order.setProduct(product);
        order.setAddress(address);

        Order newOrder = orderRepository.save(order);
        return newOrder;
    }

    public Order getOrderById(Integer id) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
        return order;
    }
}

