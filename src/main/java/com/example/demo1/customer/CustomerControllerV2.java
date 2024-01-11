package com.example.demo1.customer;

import com.example.demo1.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequestMapping(path = "api/v2/customers")
@RestController
public class CustomerControllerV2 {
    private final CustomerService customerService;
    @Autowired
    public CustomerControllerV2(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") long id) {
        return customerService.getCustomer(id);}

    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") long id) {
        throw new ApiRequestException("ApiRequestException for customer " + id);
    }


    @GetMapping
    List<Customer> getCustomers(){
//        return Collections.singletonList(new Customer(0L, "v2", "v2"));
        return customerService.getCustomers();
    }

    @PostMapping
    void createNewCustomer(@Valid @RequestBody Customer customer){
        System.out.println("POST REQUEST...");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT REQUEST...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") long id){
        System.out.println("DELETE REQUEST...");
        System.out.println(id);

    }
}
