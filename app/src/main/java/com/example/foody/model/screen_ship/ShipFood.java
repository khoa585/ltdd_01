package com.example.foody.model.screen_ship;

public class ShipFood {
    String name;
    String price;
    Integer imageUrl;
    String rating;
    String retorant_name;

    public ShipFood(String name, String price, Integer imageUrl, String rating, String retorant_name) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.retorant_name = retorant_name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRetorant_name() {
        return retorant_name;
    }

    public void setRetorant_name(String retorant_name) {
        this.retorant_name = retorant_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
