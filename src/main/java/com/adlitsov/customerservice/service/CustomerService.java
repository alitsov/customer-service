package com.adlitsov.customerservice.service;

import com.adlitsov.customerservice.model.Customer;
import com.adlitsov.customerservice.repository.CRUDRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService implements CRUDService<Customer> {

    private CRUDRepository<Customer> repo;

    public CustomerService(CRUDRepository<Customer> repo) {
        this.repo = repo;
    }

    @Override
    public Customer create(Customer entity) {
        return repo.create(entity);
    }

    @Override
    public Customer get(UUID id) {
        return repo.get(id);
    }

    @Override
    public Customer put(Customer entity) {
        return repo.put(entity);
    }

    @Override
    public Customer patch(Customer entity) {
        return repo.patch(entity);
    }
}
