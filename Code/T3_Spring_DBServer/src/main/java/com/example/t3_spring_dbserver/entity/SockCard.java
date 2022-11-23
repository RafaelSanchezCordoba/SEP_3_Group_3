package com.example.t3_spring_dbserver.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sock_card")
public class SockCard implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column (name = "price")
    private double  price;

    @Column(name = "material")
    private String material;

    @Column(name = "brand")
    private String brand;

    @Column(name = "image")
    private String image;

    @Column(name = "type")
    private String type;

    public SockCard(){

    }


    public SockCard(String title, String description, double price,String material, String brand, String image, String type) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.image = image;
        this.material = material;
        this.type = type;
    }

    public long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SockCard{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", image='" + image + '\'' +
                ", type='" + type + '\'' +
                '}';
    }



}
