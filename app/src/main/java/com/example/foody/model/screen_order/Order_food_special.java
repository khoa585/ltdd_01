package com.example.foody.model.screen_order;

public class Order_food_special {
    String Describe;
    Integer imageUrl;

    public Order_food_special(String Describe, Integer imageUrl) {
        this.Describe = Describe;
        this.imageUrl = imageUrl;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
