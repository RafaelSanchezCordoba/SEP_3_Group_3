package com.example.t3_spring_dbserver.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shopping_cart",schema = "sep_db")
public class ShoppingCart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;



    public ShoppingCart() {

    }

    public ShoppingCart(Customer customer) {
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
