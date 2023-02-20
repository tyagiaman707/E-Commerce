package com.example.Ecommerce_API.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Landmark is mandatory")
    @Column(name = "landmark")
    private String landmark;

    @NotBlank(message = "Phone number is mandatory")
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotBlank(message = "Zipcode is mandatory")
    @Column(name = "zipcode")
    private String zipcode;

    @NotBlank(message = "State is mandatory")
    @Column(name = "state")
    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public Address() {}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address(Integer id, String name, String landmark, String phoneNumber, String zipcode, String state, User user) {
        this.id = id;
        this.name = name;
        this.landmark = landmark;
        this.phoneNumber = phoneNumber;
        this.zipcode = zipcode;
        this.state = state;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", landmark='" + landmark + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", state='" + state + '\'' +
                ", user=" + user +
                '}';
    }
}

