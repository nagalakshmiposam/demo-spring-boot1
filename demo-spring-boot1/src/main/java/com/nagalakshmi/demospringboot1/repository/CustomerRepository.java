package com.nagalakshmi.demospringboot1.repository;

import com.nagalakshmi.demospringboot1.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
