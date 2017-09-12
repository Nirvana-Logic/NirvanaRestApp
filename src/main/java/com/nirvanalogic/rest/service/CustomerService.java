package com.nirvanalogic.rest.service;

import com.nirvanalogic.rest.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAll();
    public Customer save(Customer customer);
    public void delete(long id);
    public List<Customer> findByLastName(String lastName);
}
