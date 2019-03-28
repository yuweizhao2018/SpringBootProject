package com.isoftstone.example.dao;

import com.isoftstone.example.entity.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ICustomerDao extends CrudRepository<Customer,String> {

    @Query("update Customer set lastName=:lastName where id=:id ")
    @Modifying
    void updateCustomerById(@Param("id") String id, @Param("lastName") String lastName);


    Customer getCustomerById(@Param("id")String id);

}
