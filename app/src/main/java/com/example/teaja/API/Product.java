package com.example.teaja.API;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("id")
    @Expose
    String id;
    @SerializedName("publisher_id")
    @Expose
    String publisher_id;
    @SerializedName("conten_type")
    @Expose
    String conten_type;
    @SerializedName("tab")
    @Expose
    String tab;
    @SerializedName("title")
    @Expose
    String title;
    @SerializedName("avatar")
    @Expose
    String avatar;
    @SerializedName("status")
    @Expose
    String status;

    public Product(String id, String publisher_id, String conten_type, String tab, String title, String avatar, String status) {
        this.id = id;
        this.publisher_id = publisher_id;
        this.conten_type = conten_type;
        this.tab = tab;
        this.title = title;
        this.avatar = avatar;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(String publisher_id) {
        this.publisher_id = publisher_id;
    }

    public String getConten_type() {
        return conten_type;
    }

    public void setConten_type(String conten_type) {
        this.conten_type = conten_type;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
