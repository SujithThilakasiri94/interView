package com.interview.interview.repo;

import com.interview.interview.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
