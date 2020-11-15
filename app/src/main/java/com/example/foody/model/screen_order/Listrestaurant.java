package com.example.foody.model.screen_order;

public class Listrestaurant {
    String name;
    Integer imageUrl;
    String category;
    String address;

    public Listrestaurant(String name, Integer imageUrl, String category, String address) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.category = category;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
