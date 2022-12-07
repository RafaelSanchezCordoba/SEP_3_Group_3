package com.example.t3_spring_dbserver.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "order", schema = "sep_db")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "numOfProducts")
    private int numOfProducts;

    @Column(name = "totalPrice")
    private float totalPrice;

    @Column(name = "date")
    private Date date;

    @Column(name = "status")
    private String status;

    @Column(name = "nameCustomer")
    private String nameCustomer;

    @Column(name = "emailCustomer")
    private String emailCustomer;

    @Column(name = "phoneNumber")
    private int phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "shoppingCart_id", referencedColumnName = "id")
    private ShoppingCart shoppingCart;

    @PrePersist
    void date() {
        this.date = new Date();
    }

    public Order() {

    }

    public Order(int numOfProducts, float totalPrice, Date date, String status, String nameCustomer, String emailCustomer, int phoneNumber, ShoppingCart shoppingCart) {
        this.numOfProducts = numOfProducts;
        this.totalPrice = totalPrice;
        this.date = date;
        this.status = status;
        this.nameCustomer = nameCustomer;
        this.emailCustomer = emailCustomer;
        this.phoneNumber = phoneNumber;
        this.shoppingCart = shoppingCart;
    }

    public long getId() {
        return id;
    }

    public int getNumOfProducts() {
        return numOfProducts;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumOfProducts(int numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", numOfProducts=" + numOfProducts +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
