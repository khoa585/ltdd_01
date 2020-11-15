package com.example.foody.View.View_screen_detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.foody.R;

public class screen_detail_food extends AppCompatActivity {
    TextView textContext,textContext_title,textPrice,textAddress;
    ImageView image_detail_;
    String imageUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_detail_food);

        Intent intent = getIntent();
        textContext = findViewById(R.id.name_detail);
        textContext_title = findViewById(R.id.name_detail_title);
        image_detail_ = findViewById(R.id.image_detail);
        textPrice = findViewById(R.id.price_detail);
        textAddress = findViewById(R.id.address_detail);

        textContext.setText(intent.getStringExtra("name"));
        textContext_title.setText(intent.getStringExtra("name"));
        textPrice.setText(intent.getStringExtra("price"));
        textAddress.setText(intent.getStringExtra("address"));

        imageUrl = intent.getStringExtra("image");
        Glide.with(getApplicationContext()).load(imageUrl).into(image_detail_);
    }
}