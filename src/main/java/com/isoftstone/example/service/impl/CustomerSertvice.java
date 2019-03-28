package com.isoftstone.example.service.impl;

import com.isoftstone.example.dao.ICustomerDao;
import com.isoftstone.example.entity.Customer;
import com.isoftstone.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerSertvice implements ICustomerService {

    @Autowired
    ICustomerDao iCustomerDao;

    @Override
    public void saveCustomer(Customer customer) {
        iCustomerDao.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        iCustomerDao.save(customer);
    }

    @Override
    public void updateCustomerById(String id,String lastName) {
        iCustomerDao.updateCustomerById(id,lastName);
    }

    @Override
    public void delCustomerById(String id) {
        iCustomerDao.deleteById(id);
    }

    @Override
    public List<Customer> queryCustomerList() {
        return (List<Customer>)iCustomerDao.findAll();
    }

    @Override
    public Customer findCustomerById(String id) {
        return iCustomerDao.getCustomerById(id);
    }
}
