package com.example.t3_spring_dbserver.entity;

import org.apache.catalina.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shipping_inf", schema = "sep_db")
public class ShippingInf implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @OneToOne
    @Column(name="uId")
    private Customer customer;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "postCode")
    private int postCode;

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private int number;

    @Column(name = "extra_inf", nullable = true)
    private String extraInf;

    public ShippingInf() {

    }

    public ShippingInf(String country, String city, int postCode, String street, int number, String extraInf, Customer customer) {
        this.country = country;
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.number = number;
        this.extraInf = extraInf;
        this.customer= customer;
    }

    public long getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getExtraInf() {
        return extraInf;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setExtraInf(String extraInf) {
        this.extraInf = extraInf;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "ShippingInf{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", postCode=" + postCode +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", extraInf='" + extraInf + '\'' +
                '}';
    }
}
