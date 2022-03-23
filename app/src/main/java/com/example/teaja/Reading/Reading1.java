package com.example.teaja.Reading;

public class Reading1 {
    private int id;
    private int resoucedID;
    private String name;
    private int resouceN1;

    public Reading1(int id, int resoucedID, String name, int resouceN1) {
        this.id = id;
        this.resoucedID = resoucedID;
        this.name = name;
        this.resouceN1 = resouceN1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResoucedID() {
        return resoucedID;
    }

    public void setResoucedID(int resoucedID) {
        this.resoucedID = resoucedID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResouceN1() {
        return resouceN1;
    }

    public void setResouceN1(int resouceN1) {
        this.resouceN1 = resouceN1;
    }
}
