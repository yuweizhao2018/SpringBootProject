package com.isoftstone.example.controller;

import com.isoftstone.example.entity.Customer;
import com.isoftstone.example.service.ICustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/jpa")
public class CustomerController {

    @Autowired
    ICustomerService iCustomerService;

    @RequestMapping("hello")
    public String hello(){
        return "Helo World!";
    }

    @RequestMapping("saveCutomer")
    public String saveCustomer(Customer customer){
        log.info("进入saveCustomer。。。");
        try {
            iCustomerService.saveCustomer(customer);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return "保存成功！";
    }


    @RequestMapping("updateCustomer")
    public String updateCustomer(Customer customer){
        iCustomerService.updateCustomer(customer);
        return "修改成功！";
    }

    @RequestMapping("updateLastNameById")
    public String updateLastNameById(@RequestParam("id") String id, @RequestParam("lastName") String lastName){
        iCustomerService.updateCustomerById(id,lastName);
        return "修改成功！";
    }

    @RequestMapping("delCustomerById/{id}")
    public  String delCustomerById(@PathVariable("id") String id){
        try {
            iCustomerService.delCustomerById(id);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return "删除成功！";
    }

    @RequestMapping("queryCustomerList")
    public List<Customer> queryCustomerList(){
        return iCustomerService.queryCustomerList();
    }

    @RequestMapping("findCustomerById/{id}")
    public Customer findCustomerById(@PathVariable("id")String id){
        return iCustomerService.findCustomerById(id);
    }
}
