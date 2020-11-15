package com.example.foody.View.view_screen_ship;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.foody.R;
import com.example.foody.adapter.screen_ship.ShipFoodAdapter;
import com.example.foody.adapter.screen_ship.PopularFoodAdapter;
import com.example.foody.adapter.screen_ship.RecommendFoodAdapter;
import com.example.foody.model.screen_ship.ShipFood;
import com.example.foody.model.screen_ship.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class screen_ship extends AppCompatActivity {
    RecyclerView popular_recycler,asia_recycler,recommend_recycler;
    PopularFoodAdapter popularFoodAdapter;
    ShipFoodAdapter asiaFoodAdapter;
    RecommendFoodAdapter recommendFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_ship);


        //slider
        ImageSlider imageSlider=findViewById(R.id.image_slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.slide1));
        slideModels.add(new SlideModel(R.drawable.slide2));
        slideModels.add(new SlideModel(R.drawable.slide3));
        imageSlider.setImageList(slideModels,true);

        //PopularFood
        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("Tất cả",R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Đồ ăn",R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Đồ uống",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Đồ chay",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Bánh kem",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Đồ uống",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Đồ chay",R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Bánh kem",R.drawable.popularfood1));
        setPopular_recycler(popularFoodList);

        //AsiaFood
        List<ShipFood> shipFoodList = new ArrayList<>();
        shipFoodList.add(new ShipFood("Chicago Pizza","$30",R.drawable.discover_img_2,"4.5","Briand Restaurant"));
        shipFoodList.add(new ShipFood("Straberry","$25",R.drawable.asiafood2,"4.0","Friends Restaurant"));
        shipFoodList.add(new ShipFood("Cơm Chiên 73","$20",R.drawable.image_order_1,"5.0","Briand Restaurant"));
        shipFoodList.add(new ShipFood("Straberry","$25",R.drawable.image_order_1,"4.0","Friends Restaurant"));
        shipFoodList.add(new ShipFood("Chicago Pizza","$20",R.drawable.popularfood2,"5.0","Briand Restaurant"));
        shipFoodList.add(new ShipFood("Straberry","$25",R.drawable.discover_img_2,"4.0","Friends Restaurant"));
        shipFoodList.add(new ShipFood("Chicago Pizza","$20",R.drawable.popularfood2,"5.0","Briand Restaurant"));
        setAsia_recycler(shipFoodList);


        //recommended
        List<ShipFood> recommended = new ArrayList<>();
        recommended.add(new ShipFood("Chicago Pizza","$20",R.drawable.asiafood1,"4.5","Briand Restaurant"));
        recommended.add(new ShipFood("Straberry","$25",R.drawable.asiafood2,"4.0","Friends Restaurant"));
        recommended.add(new ShipFood("Cơm Chiên 73","$20",R.drawable.image_order_1,"5.0","Briand Restaurant"));
        recommended.add(new ShipFood("Straberry","$25",R.drawable.asiafood2,"4.0","Friends Restaurant"));
        recommended.add(new ShipFood("Chicago Pizza","$20",R.drawable.asiafood1,"5.0","Briand Restaurant"));
        recommended.add(new ShipFood("Straberry","$25",R.drawable.discover_img_2,"4.0","Friends Restaurant"));
        recommended.add(new ShipFood("Chicago Pizza","$20",R.drawable.image_order_1,"5.0","Briand Restaurant"));
        setrecommend_recycler(recommended);

        //backHome
        findViewById(R.id.backhome_ship).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    //PopularFood
    public void setPopular_recycler(List<PopularFood> popularlist ){
        popular_recycler=findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        popular_recycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this,popularlist);
        popular_recycler.setAdapter(popularFoodAdapter);
    }

    //AsiaFood
    public void setAsia_recycler(List<ShipFood> shipFoodList){
        asia_recycler=findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        asia_recycler.setLayoutManager(layoutManager);
        asiaFoodAdapter = new ShipFoodAdapter(this, shipFoodList);
        asia_recycler.setAdapter(asiaFoodAdapter);
    }

    //recommended
    public void setrecommend_recycler(List<ShipFood> recommended ){
        recommend_recycler = findViewById(R.id.recommend_recycler_);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recommend_recycler.setLayoutManager(layoutManager);
        recommendFoodAdapter = new RecommendFoodAdapter(this,recommended);
        recommend_recycler.setAdapter(recommendFoodAdapter);
    }
}