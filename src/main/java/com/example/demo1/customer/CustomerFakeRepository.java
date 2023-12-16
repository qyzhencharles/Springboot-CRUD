package com.example.demo1.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "John", "password123"),
                new Customer(2L, "Maria", "password456"),
                new Customer(3L, "Anna", "password789")
        );
    }
}
