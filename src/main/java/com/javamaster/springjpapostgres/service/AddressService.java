package com.javamaster.springjpapostgres.service;

import com.javamaster.springjpapostgres.entity.Address;
import com.javamaster.springjpapostgres.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void createAddress(Address address) {
        addressRepository.save(address);
    }
}
