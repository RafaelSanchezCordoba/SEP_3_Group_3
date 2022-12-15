package com.example.t3_spring_dbserver.DTOs;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TrouserCardDto {

    private long id;
    private String title;
    private String description;
    private double  price;
    private String material;
    private String brand;
    private String image;
    private String type;

    public TrouserCardDto(long id, String title, String description, double price, String material, String brand, String image, String type) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.material = material;
        this.brand = brand;
        this.image = image;
        this.type = type;
    }

    public TrouserCardDto(String title, String description, double price, String material, String brand, String image, String type) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.material = material;
        this.brand = brand;
        this.image = image;
        this.type = type;
    }

    public TrouserCardDto() {}

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public String getImage() {
        return image;
    }

    public String getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TrouserCard{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", brand='" + brand + '\'' +
                ", image='" + image + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
