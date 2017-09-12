package com.nirvanalogic.rest.controller;

import com.nirvanalogic.rest.model.Customer;
import com.nirvanalogic.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping(value="/customer",  produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> getAll() {
        return customerService.getAll();
    }

    @PostMapping(value="/postcustomer")
    public Customer postCustomer(@RequestBody Customer customer) {
        return customerService.save(new Customer(customer.getFirstName(), customer.getLastName()));
    }

    @GetMapping(value="/findbylastname/{lastName}",  produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Customer> findByLastName(@PathVariable String lastName) {
        return customerService.findByLastName(lastName);
    }

    @DeleteMapping(value="/customer/{id}")
    public void deleteCustomer(@PathVariable long id){
        customerService.delete(id);
    }
}