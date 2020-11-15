package com.example.foody.model.screen_home;

public class Product {

    private String name,imageUrl,price,address;
    public Product(String name, String imageUrl,String address,String price) {
        this.name= name;
        this.imageUrl= imageUrl;
        this.price= price;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

