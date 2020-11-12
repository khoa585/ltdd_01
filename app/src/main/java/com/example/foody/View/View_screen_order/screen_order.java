package com.example.foody.View.View_screen_order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.foody.R;
import com.example.foody.adapter.screen_order.ListrestaurantAdapter;
import com.example.foody.adapter.screen_order.NameorderAdapter;
import com.example.foody.adapter.screen_order.OrderfoodpecialAdaper;
import com.example.foody.model.screen_order.listrestaurant;
import com.example.foody.model.screen_order.orderFood;
import com.example.foody.model.screen_order.order_food_special;


import java.util.ArrayList;
import java.util.List;

public class screen_order extends AppCompatActivity {
    RecyclerView order_recycler,order_special_recycler,restaurant_recycler;
    NameorderAdapter nameorderAdapter;
    OrderfoodpecialAdaper orderfoodpecialAdaper_;
    ListrestaurantAdapter listrestaurantAdapter_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_order);

        //slider
        ImageSlider imageSlider=findViewById(R.id.image_slider_order);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.slide1));
        slideModels.add(new SlideModel(R.drawable.slide2));
        slideModels.add(new SlideModel(R.drawable.slide3));
        imageSlider.setImageList(slideModels,true);


        ///nameoder
        List<orderFood> orderFoodList = new ArrayList<>();
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        orderFoodList.add(new orderFood("Tất cả",R.drawable.popularfood2));
        setorder_recycler(orderFoodList);


        ///nameoder_special
        List<order_food_special> order_food_specialList = new ArrayList<>();
        order_food_specialList.add(new order_food_special("Tất cả Tất cả Tất cả Tất cả Tất cảất cả Tất cả Tất cả Tất cả Tất cả",R.drawable.slide1));
        order_food_specialList.add(new order_food_special("Tất cả",R.drawable.slide1));
        order_food_specialList.add(new order_food_special("Tất cả",R.drawable.slide1));
        order_food_specialList.add(new order_food_special("Tất cả",R.drawable.slide1));
        order_food_specialList.add(new order_food_special("Tất cả",R.drawable.slide1));
        order_food_specialList.add(new order_food_special("Tất cả",R.drawable.slide1));
        order_food_specialList.add(new order_food_special("Tất cả",R.drawable.slide1));
        setorder_special_recycler(order_food_specialList);

        ///nameoder_special
        List<listrestaurant> listrestaurant_ = new ArrayList<>();
        listrestaurant_.add(new listrestaurant("Tất cả",R.drawable.slide1,"2","2"));
        setorder_special_restaurant_recycler(listrestaurant_);
    }


    //nameoder
    public void setorder_recycler(List<orderFood> orderFoodlist ){
        order_recycler = findViewById(R.id.ordernamelist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        order_recycler.setLayoutManager(layoutManager);
        nameorderAdapter = new NameorderAdapter(this,orderFoodlist);
        order_recycler.setAdapter(nameorderAdapter);
    }

    //nameoder_special
    public void setorder_special_recycler(List<order_food_special> order_food_specialList ){
        order_special_recycler = findViewById(R.id.ordernamelistpecial);
        StaggeredGridLayoutManager staggeredGridLayoutManager =new StaggeredGridLayoutManager(2, LinearLayout.HORIZONTAL);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        order_special_recycler.setLayoutManager(staggeredGridLayoutManager);
        orderfoodpecialAdaper_ = new OrderfoodpecialAdaper(this,order_food_specialList);
        order_special_recycler.setAdapter(orderfoodpecialAdaper_);
    }

    //nameoder
    public void setorder_special_restaurant_recycler(List<listrestaurant> listrestaurant_ ){
        restaurant_recycler = findViewById(R.id.restaurant_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        restaurant_recycler.setLayoutManager(layoutManager);
        listrestaurantAdapter_ = new ListrestaurantAdapter(this,listrestaurant_);
        restaurant_recycler.setAdapter(listrestaurantAdapter_);
    }
}