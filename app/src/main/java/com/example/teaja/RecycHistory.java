package com.example.teaja;

public class RecycHistory {
        private int ID;
        private int resoureHIS;
        private String name1;
        private String name2;

    public RecycHistory(int ID, int resoureHIS, String name1, String name2) {
        this.ID = ID;
        this.resoureHIS = resoureHIS;
        this.name1 = name1;
        this.name2 = name2;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getResoureHIS() {
        return resoureHIS;
    }

    public void setResoureHIS(int resoureHIS) {
        this.resoureHIS = resoureHIS;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
