package com.example.demo1.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "John", "password123", "email@gmail.com"),
                new Customer(2L, "Maria", "password456", "email@gmail.com"),
                new Customer(3L, "Anna", "password789", "email@gmail.com")
        );
    }
}
