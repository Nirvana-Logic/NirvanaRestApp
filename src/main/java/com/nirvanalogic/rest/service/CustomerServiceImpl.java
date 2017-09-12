package com.nirvanalogic.rest.service;

import com.nirvanalogic.rest.model.Customer;
import com.nirvanalogic.rest.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository repository;


    @Override
    public List<Customer> getAll() {
        List<Customer> list = new ArrayList<>();
        Iterable<Customer> customers = repository.findAll();
        customers.forEach(list :: add);
        return list;
    }

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void delete(long id) {
        repository.delete(id);
    }

    @Override
    public List<Customer> findByLastName(String lastName) {
        List<Customer> customerList = new ArrayList<>();
        Iterable<Customer> customers = repository.findAll();
        customers.forEach(customerList :: add);
        return customerList;
    }
}
