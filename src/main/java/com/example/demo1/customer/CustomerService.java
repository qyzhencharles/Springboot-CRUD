package com.example.demo1.customer;

import com.example.demo1.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;
    @Autowired
    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers(){
        return customerRepo.getCustomers();
    }

    Customer getCustomer(long id) {
        return getCustomers()
                .stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Customer " + id + " does not exist")
                );}
}
