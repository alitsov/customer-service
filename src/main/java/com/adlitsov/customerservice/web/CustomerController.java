package com.adlitsov.customerservice.web;

import com.adlitsov.customerservice.model.Customer;
import com.adlitsov.customerservice.service.CRUDService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class CustomerController implements CRUDController<Customer> {

    private CRUDService<Customer> service;

    public CustomerController(CRUDService<Customer> service) {
        this.service = service;
    }

    @Override
    @PostMapping
    public Customer create(@RequestBody Customer entity) {
        return service.create(entity);
    }

    @Override
    @GetMapping("/{id}")
    public Customer get(@PathVariable UUID id) {
        return service.get(id);
    }

    @Override
    @PutMapping("/{id}")
    public Customer put(@PathVariable UUID id, @RequestBody Customer entity) {
        entity.setId(id);
        return service.put(entity);
    }

    @Override
    @PatchMapping("/{id}")
    public Customer patch(@PathVariable UUID id, @RequestBody Customer entity) {
        return service.patch(entity);
    }
}
