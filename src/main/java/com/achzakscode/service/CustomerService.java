package com.achzakscode.service;

import com.achzakscode.dto.NewCustomerRequest;
import com.achzakscode.dto.UpdateCustomerRequest;
import com.achzakscode.entity.Customer;
import com.achzakscode.repository.CustomerRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer createCustomer(NewCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        return customerRepository.save(customer);
    }

    public boolean deleteCustomer(Integer id) {
        try {
            customerRepository.deleteById(id);
            return true; // Delete successful
        } catch (EmptyResultDataAccessException ex) {
            return false; // Customer with given ID not found
        }
    }

    public ResponseEntity<Customer> updateCustomer(Integer id, UpdateCustomerRequest request) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Customer existingCustomer = optionalCustomer.get();
        existingCustomer.setName(request.name());
        existingCustomer.setEmail(request.email());
        existingCustomer.setAge(request.age());
        Customer updatedCustomer = customerRepository.save(existingCustomer);

        return ResponseEntity.ok(updatedCustomer);
    }
}