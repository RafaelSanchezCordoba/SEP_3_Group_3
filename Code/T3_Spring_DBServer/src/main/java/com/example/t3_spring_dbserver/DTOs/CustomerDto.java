package com.example.t3_spring_dbserver.DTOs;

import com.example.t3_spring_dbserver.entity.ShippingInf;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

public class CustomerDto {
    private long id;
    private String name;
    private String email;
    private long phone;
    private ShippingInf shippingInf;

    public CustomerDto() {

    }

    public CustomerDto(String name, String email, long phone, ShippingInf shippingInf) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.shippingInf = shippingInf;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setShippingInf(ShippingInf shippingInf) {
        this.shippingInf = shippingInf;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public ShippingInf getShippingInf() {
        return shippingInf;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", shippingInf=" + shippingInf +
                '}';
    }
}
