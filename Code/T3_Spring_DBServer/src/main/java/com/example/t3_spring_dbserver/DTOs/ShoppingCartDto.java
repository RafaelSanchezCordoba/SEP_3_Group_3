package com.example.t3_spring_dbserver.DTOs;

import com.example.t3_spring_dbserver.entity.Customer;

import javax.persistence.*;

public class ShoppingCartDto {
    private long id;
    private Customer customer;

    public ShoppingCartDto() {

    }

    public ShoppingCartDto(Customer customer) {
        this.customer = customer;
    }

    public long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", customer=" + customer +
                '}';
    }
}
