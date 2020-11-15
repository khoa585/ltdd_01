package com.example.foody.View.View_screen_order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.foody.R;
import com.example.foody.adapter.screen_order.ListrestaurantAdapter;
import com.example.foody.adapter.screen_order.NameorderAdapter;
import com.example.foody.adapter.screen_order.OrderfoodpecialAdaper;
import com.example.foody.model.screen_order.Listrestaurant;
import com.example.foody.model.screen_order.OrderFood;
import com.example.foody.model.screen_order.Order_food_special;


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
        slideModels.add(new SlideModel(R.drawable.slide_order_1));
        slideModels.add(new SlideModel(R.drawable.slide_order_2));
        slideModels.add(new SlideModel(R.drawable.slide3));
        imageSlider.setImageList(slideModels,true);


        ///nameoder
        List<OrderFood> orderFoodList = new ArrayList<>();
        orderFoodList.add(new OrderFood("Deal Mới",R.drawable.asiafood1));
        orderFoodList.add(new OrderFood("Gyu Shige",R.drawable.asiafood2));
        orderFoodList.add(new OrderFood("Buffet",R.drawable.discover_img_2));
        orderFoodList.add(new OrderFood("Sushi",R.drawable.asiafood1));
        orderFoodList.add(new OrderFood("Món Nhật",R.drawable.asiafood1));
        orderFoodList.add(new OrderFood("Món Hàn",R.drawable.asiafood2));
        orderFoodList.add(new OrderFood("Món Trung",R.drawable.discover_img_2));
        orderFoodList.add(new OrderFood("Dimsum",R.drawable.asiafood1));
        setorder_recycler(orderFoodList);


        ///nameoder_special
        List<Order_food_special> order_food_specialList = new ArrayList<>();
        order_food_specialList.add(new Order_food_special("Giảm 15% cho hóa đơn khi đặt chỗ qua NOWTABLE",R.drawable.discover_img_2));
        order_food_specialList.add(new Order_food_special("Giảm 25% cho hóa đơn khi đặt chỗ qua NOWTABLE",R.drawable.slide1));
        order_food_specialList.add(new Order_food_special("Giảm 35% cho hóa đơn khi đặt chỗ qua NOWTABLE",R.drawable.slide2));
        order_food_specialList.add(new Order_food_special("Giảm 25% cho hóa đơn khi đặt chỗ qua NOWTABLE",R.drawable.slide3));
        order_food_specialList.add(new Order_food_special("Giảm 35% cho hóa đơn khi đặt chỗ qua NOWTABLE",R.drawable.image_special_1));
        order_food_specialList.add(new Order_food_special("Giảm 15% cho hóa đơn khi đặt chỗ qua NOWTABLE",R.drawable.image_special_1));
        order_food_specialList.add(new Order_food_special("Giảm 5% cho hóa đơn khi đặt chỗ qua NOWTABLE",R.drawable.image_special_1));
        setorder_special_recycler(order_food_specialList);

        ///nameoder_special
        List<Listrestaurant> listrestaurant_ = new ArrayList<>();
        listrestaurant_.add(new Listrestaurant("Grand Sushi KO - Xuân Thủy",R.drawable.image_order_1,"83 Xuân Thủy,P. Thảo Điền,TP.HCM","Nhà Hàng/Sinh nhật"));
        listrestaurant_.add(new Listrestaurant("Sushi Osaka 88 Premium",R.drawable.image_order_2,"3A Ngô Văn Năm, P. Bến Nghé, Quận 1, TP. HCM","Nhà Hàng/Sinh nhật"));
        listrestaurant_.add(new Listrestaurant("Rin Sushi - Nguyễn Biểu",R.drawable.image_order_3,"257 Nguyễn Biểu, P. 2, Quận 5, TP. HCM","Nhà Hàng/Sinh nhật"));
        setorder_special_restaurant_recycler(listrestaurant_);

        //backHome
        findViewById(R.id.backhome_order).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


    //nameoder
    public void setorder_recycler(List<OrderFood> orderFoodlist ){
        order_recycler = findViewById(R.id.ordernamelist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        order_recycler.setLayoutManager(layoutManager);
        nameorderAdapter = new NameorderAdapter(this,orderFoodlist);
        order_recycler.setAdapter(nameorderAdapter);
    }

    //nameoder_special
    public void setorder_special_recycler(List<Order_food_special> order_food_specialList ){
        order_special_recycler = findViewById(R.id.ordernamelistpecial);
        StaggeredGridLayoutManager staggeredGridLayoutManager =new StaggeredGridLayoutManager(2, LinearLayout.HORIZONTAL);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        order_special_recycler.setLayoutManager(staggeredGridLayoutManager);
        orderfoodpecialAdaper_ = new OrderfoodpecialAdaper(this,order_food_specialList);
        order_special_recycler.setAdapter(orderfoodpecialAdaper_);
    }

    //nameoder
    public void setorder_special_restaurant_recycler(List<Listrestaurant> listrestaurant_ ){
        restaurant_recycler = findViewById(R.id.restaurant_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        restaurant_recycler.setLayoutManager(layoutManager);
        listrestaurantAdapter_ = new ListrestaurantAdapter(this,listrestaurant_);
        restaurant_recycler.setAdapter(listrestaurantAdapter_);
    }
}