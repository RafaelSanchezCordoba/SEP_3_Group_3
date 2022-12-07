package com.example.t3_spring_dbserver.DTOs;

public class SocksDto {
    private long id;
    private String size;
    private String color;
    private int sc_id;

    public SocksDto() {

    }

    public SocksDto(String size, String color, int sc_id) {
        this.size = size;
        this.color = color;
        this.sc_id = sc_id;
    }

    public SocksDto(long id, String size, String color, int sc_id) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.sc_id = sc_id;
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

    public void setSc_id(int sc_id) {
        this.sc_id = sc_id;
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

    public int getSc_id() {
        return sc_id;
    }
}
