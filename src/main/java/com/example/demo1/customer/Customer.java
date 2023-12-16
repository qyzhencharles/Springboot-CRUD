package com.example.demo1.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private final long id;
    private final String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    Customer(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @JsonProperty("customerId")
    public long getId() {
        return id;
    }

//    public long getCustomerId(){
//        return id;
//    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name='" + name + '\'' + ", password='" + password + '\'' + '}';
    }
}
