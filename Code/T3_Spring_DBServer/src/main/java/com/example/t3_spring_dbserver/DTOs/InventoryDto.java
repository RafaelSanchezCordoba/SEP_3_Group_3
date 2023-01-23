package com.example.t3_spring_dbserver.DTOs;

public class InventoryDto {
    private long id;
    private String color;
    private String size;
    private int quantity;
    private int sockCardId;

    public InventoryDto() {

    }

    public InventoryDto(long id, String color, String size, int quantity, int sockCardId) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.quantity = quantity;
        this.sockCardId = sockCardId;
    }

    public InventoryDto(String color, String size, int sockCardId) {
        this.color = color;
        this.size = size;
        this.sockCardId = sockCardId;
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

    public int getSockCard() {
        return sockCardId;
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

    public void setSockCard(int sockCardId) {
        this.sockCardId = sockCardId;
    }

    @Override
    public String toString() {
        return "InventoryDto{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", quantity=" + quantity +
                ", sockCard=" + sockCardId +
                '}';
    }
}
