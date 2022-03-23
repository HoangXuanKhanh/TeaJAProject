package com.example.teaja.HomeRecyclerView;

import java.io.Serializable;

public class ListUser implements Serializable {
    private  int id;
    private int resourceID;
    private String name;

    public ListUser(int id, int resourceID, String name) {
        this.id = id;
        this.resourceID = resourceID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
