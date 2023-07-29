package com.achzakscode.controller;

import com.achzakscode.dto.NewCustomerRequest;
import com.achzakscode.dto.UpdateCustomerRequest;
import com.achzakscode.entity.Customer;
import com.achzakscode.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody NewCustomerRequest request) {
        return customerService.createCustomer(request);
    }

    @DeleteMapping("{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable("customerId") Integer id) {
        boolean deleted = customerService.deleteCustomer(id);
        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("{customerId}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable("customerId") Integer id, @RequestBody UpdateCustomerRequest request) {
        return customerService.updateCustomer(id, request);
    }
}
