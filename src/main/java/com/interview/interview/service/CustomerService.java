package com.interview.interview.service;

import com.interview.interview.entity.Customer;
import com.interview.interview.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer saveCustomer( Customer customer){
        return customerRepo.save(customer);
    }
}
