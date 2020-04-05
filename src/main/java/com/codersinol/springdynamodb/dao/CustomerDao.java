package com.codersinol.springdynamodb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.codersinol.springdynamodb.model.Customer;

@Repository
public class CustomerDao {

    private DynamoDBMapper dynamoDBMapper;

    @Autowired
    public CustomerDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Customer getCustomer(String id) {
        return dynamoDBMapper.load(Customer.class, id);
    }

    public Customer save(Customer customer) {
        dynamoDBMapper.save(customer);
        return customer;
    }
}
