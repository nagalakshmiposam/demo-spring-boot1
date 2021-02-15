package com.nagalakshmi.demospringboot1.controller;

import com.nagalakshmi.demospringboot1.model.Customer;
import com.nagalakshmi.demospringboot1.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository repo;

    @RequestMapping("/all")
    public Iterable<Customer> getAllCustomers() {
        return repo.findAll();
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer) {
        System.out.println(customer);
        return repo.save(customer);

    }
    @PutMapping("update/{id}")
    public Customer updateCustomer(@PathVariable Long id) {
        Customer updatedCustomer = null;
        Optional<Customer> customer=repo.findById(id);
        if(customer.isPresent()) {
            updatedCustomer = customer.get();
            updatedCustomer.setFirst_name(updatedCustomer.getFirst_name() + "_update");

        }
        return repo.save(updatedCustomer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        repo.deleteById(id);

    }
}
