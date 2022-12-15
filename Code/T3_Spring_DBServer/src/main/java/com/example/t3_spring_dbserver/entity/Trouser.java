package com.example.t3_spring_dbserver.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "trouser", schema = "sep_db")
public class Trouser implements Serializable {
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
    private TrouserCard trouserCard;

    public Trouser(long id, String size, String color, TrouserCard trouserCard) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.trouserCard = trouserCard;
    }

    public Trouser() {}

    public long getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public TrouserCard getTrouserCard() {
        return trouserCard;
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

    public void setTrouserCard(TrouserCard trouserCard) {
        this.trouserCard = trouserCard;
    }

    @Override
    public String toString() {
        return "Trouser{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", trouserCard=" + trouserCard +
                '}';
    }
}
