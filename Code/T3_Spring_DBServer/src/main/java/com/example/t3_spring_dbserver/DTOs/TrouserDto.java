package com.example.t3_spring_dbserver.DTOs;

public class TrouserDto {

    private long id;
    private String size;
    private String color;
    private int tc_id;

    public TrouserDto(long id, String size, String color, int tc_id) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.tc_id = tc_id;
    }

    public TrouserDto() {}

    public long getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getTc_id() {
        return tc_id;
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

    public void setTc_id(int tc_id) {
        this.tc_id = tc_id;
    }

    @Override
    public String toString() {
        return "TrouserDto{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", tc_id=" + tc_id +
                '}';
    }
}
