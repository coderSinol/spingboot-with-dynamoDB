package com.codersinol.springdynamodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.codersinol.springdynamodb.dao.CustomerDao;
import com.codersinol.springdynamodb.model.Customer;

@RestController
public class CustomerController {
    
    private @Autowired CustomerDao customerDao;
    
    @RequestMapping(value = "/users", produces = {"application/json"}, method = RequestMethod.GET)
    public Customer getCustomer() {
//        Customer newCustomer = new Customer();
//        newCustomer.setName("Supun Amarasinghe");
//        Customer cus = customerDao.save(newCustomer);
        Customer c = customerDao.getCustomer("sss");
        return c;
    }

}
