package com.isoftstone.example.service;

import com.isoftstone.example.entity.Customer;

import java.util.List;

public interface ICustomerService {

    void saveCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void updateCustomerById(String id,String lastName);

    void delCustomerById(String id);

    List<Customer> queryCustomerList();

    Customer findCustomerById(String id);
}
