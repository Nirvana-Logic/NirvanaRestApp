package com.nirvanalogic.rest.repo;

import java.util.List;

import com.nirvanalogic.rest.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    List<Customer> findByFirstName(String firstName);

    void delete(long id);
}