package com.example.teaja.sqlTracNghiem;

public class Cataloties {
    private int id;
    private String name;

    public Cataloties(){}

    public Cataloties(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
