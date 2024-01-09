package com.example.security.service;

import com.example.security.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findOne(Long id);

    void save(Customer customer);

    void deleteById(Long id);
}
