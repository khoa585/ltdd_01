package com.example.foody.model.screen_discover;

public class News_discover_food {
    Integer store_img,img_monan,img_bt,img_user1,img_user2;
    String store_name,store_location,text_bt,danhgia1,danhgia2,tinhtrang;

    public News_discover_food(Integer store_img, Integer img_monan, Integer img_bt, Integer img_user1, Integer img_user2, String store_name, String store_location, String text_bt, String danhgia1, String danhgia2, String tinhtrang) {
        this.store_img = store_img;
        this.img_monan = img_monan;
        this.img_bt = img_bt;
        this.img_user1 = img_user1;
        this.img_user2 = img_user2;
        this.store_name = store_name;
        this.store_location = store_location;
        this.text_bt = text_bt;
        this.danhgia1 = danhgia1;
        this.danhgia2 = danhgia2;
        this.tinhtrang = tinhtrang;
    }

    public Integer getStore_img() {
        return store_img;
    }

    public void setStore_img(Integer store_img) {
        this.store_img = store_img;
    }

    public Integer getImg_monan() {
        return img_monan;
    }

    public void setImg_monan(Integer img_monan) {
        this.img_monan = img_monan;
    }

    public Integer getImg_bt() {
        return img_bt;
    }

    public void setImg_bt(Integer img_bt) {
        this.img_bt = img_bt;
    }

    public Integer getImg_user1() {
        return img_user1;
    }

    public void setImg_user1(Integer img_user1) {
        this.img_user1 = img_user1;
    }

    public Integer getImg_user2() {
        return img_user2;
    }

    public void setImg_user2(Integer img_user2) {
        this.img_user2 = img_user2;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_location() {
        return store_location;
    }

    public void setStore_location(String store_location) {
        this.store_location = store_location;
    }

    public String getText_bt() {
        return text_bt;
    }

    public void setText_bt(String text_bt) {
        this.text_bt = text_bt;
    }

    public String getDanhgia1() {
        return danhgia1;
    }

    public void setDanhgia1(String danhgia1) {
        this.danhgia1 = danhgia1;
    }

    public String getDanhgia2() {
        return danhgia2;
    }

    public void setDanhgia2(String danhgia2) {
        this.danhgia2 = danhgia2;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
}
