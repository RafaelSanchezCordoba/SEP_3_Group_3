package com.example.t3_spring_dbserver.DTOs;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ShippingInfDto {
    private long id;
    private String country;
    private String city;
    private int postCode;
    private String street;
    private int number;
    private String extraInf;

    public ShippingInfDto() {

    }

    public ShippingInfDto(String country, String city, int postCode, String street, int number, String extraInf) {
        this.country = country;
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.number = number;
        this.extraInf = extraInf;
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

    @Override
    public String toString() {
        return "ShippingInfDto{" +
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
