package com.example.demo1.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers(){
        // TODO: connect to real database
        return Collections.singletonList(new Customer(1L, "TODO", "passwordTODO"));
    }

}
