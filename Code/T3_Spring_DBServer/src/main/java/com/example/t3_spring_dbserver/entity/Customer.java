package com.example.t3_spring_dbserver.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer", schema = "sep_db")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private long phone;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "shipping_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ShippingInf shippingInf;

    public Customer() {

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

    public Customer(String name, String email, long phone, ShippingInf shippingInf) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.shippingInf = shippingInf;
    }
}
