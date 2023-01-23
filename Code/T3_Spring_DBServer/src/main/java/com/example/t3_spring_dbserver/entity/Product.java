package com.example.t3_spring_dbserver.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product", schema = "sep_db")

public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;

    @Column(name = "category")
    private String category;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "pc_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ProductCard sockCard;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "shc_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ShoppingCart shoppingCart;



    public Product(long id, String size, String color, ProductCard sockCard, String category, ShoppingCart shoppingCart) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.sockCard = sockCard;
        this.category = category;
        this.shoppingCart = shoppingCart;
    }

    public Product(String size, String color, ProductCard sockCard) {
        this.size = size;
        this.color = color;
        this.sockCard = sockCard;
    }

    public Product() {

    }
    public String getCategory() {
        return category;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSockCard(ProductCard sockCard) {
        this.sockCard = sockCard;
    }

    public long getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public ProductCard getSockCard() {
        return sockCard;
    }
}
