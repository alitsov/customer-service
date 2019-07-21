package com.adlitsov.customerservice.repository;

import com.adlitsov.customerservice.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class CustomerRepository implements CRUDRepository<Customer> {

    @Override
    public Customer create(Customer entity) {
        return entity;
    }

    @Override
    public Customer get(UUID id) {
        Customer result = new Customer();

        result.setId(id);
        result.setName("I'm temporary customer existing only during this requess");

        return result;
    }

    @Override
    public Customer put(Customer entity) {
        return entity;
    }

    @Override
    public Customer patch(Customer entity) {
        return entity;
    }
}
