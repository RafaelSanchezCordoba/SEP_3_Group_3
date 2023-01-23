package com.example.t3_spring_dbserver.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "inventory", schema = "sep_db")
public class Inventory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private String size;

    @Column (name = "quantity")
    private int  quantity;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pc_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ProductCard productCard;



    public Inventory() {

    }

    public Inventory(long id, String color, String size, int quantity) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.quantity = quantity;

    }

  public Inventory(String color, String size, int quantity, ProductCard productCard) {
        this.color = color;
        this.size = size;
        this.quantity = quantity;
        this.productCard = productCard;
    }





    public long getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

   public ProductCard getProductCard() {
        return productCard;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                ", sockCard=" + " " +
                '}';
    }
}
