package com.example.Ecommerce_API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @NotNull(message = "Product quantity is mandatory")
    @Column(name = "product_quantity")
    private Integer productQuantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Order() {
    }

    public Order(User user, Product product, Address address, Integer productQuantity) {
        this.user = user;
        this.product = product;
        this.address = address;
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                ", address=" + address +
                ", productQuantity=" + productQuantity +
                '}';
    }
}

