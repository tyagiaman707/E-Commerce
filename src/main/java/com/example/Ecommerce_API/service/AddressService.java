package com.example.Ecommerce_API.service;

import com.example.Ecommerce_API.exception.ResourceNotFoundException;
import com.example.Ecommerce_API.model.Address;
import com.example.Ecommerce_API.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddressById(Integer id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Address not found with id: " + id));
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Integer id, Address addressDetails) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Address not found with id: " + id));

        address.setName(addressDetails.getName());
        address.setLandmark(addressDetails.getLandmark());
        address.setPhoneNumber(addressDetails.getPhoneNumber());
        address.setZipcode(addressDetails.getZipcode());
        address.setState(addressDetails.getState());

        return addressRepository.save(address);
    }

    public void deleteAddress(Integer id) {
        addressRepository.deleteById(id);
    }
}

