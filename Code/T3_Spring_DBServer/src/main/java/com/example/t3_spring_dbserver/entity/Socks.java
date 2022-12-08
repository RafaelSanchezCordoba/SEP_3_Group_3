package com.example.t3_spring_dbserver.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "socks", schema = "sep_db")

public class Socks implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sc_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private SockCard sockCard;

    public Socks(long id, String size, String color, SockCard sockCard) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.sockCard = sockCard;
    }

    public Socks(String size, String color, SockCard sockCard) {
        this.size = size;
        this.color = color;
        this.sockCard = sockCard;
    }

    public Socks() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSockCard(SockCard sockCard) {
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

    public SockCard getSockCard() {
        return sockCard;
    }
}
