package com.example.foody.View.View_screen_discover;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.foody.R;
import com.example.foody.adapter.screen_discover.News_discover_foodAdapter;
import com.example.foody.model.screen_discover.News_discover_food;

import java.util.ArrayList;
import java.util.List;

public class discover_food extends AppCompatActivity {
    RecyclerView moinhat_Recycle;
    News_discover_foodAdapter news_discover_foodAdapter_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_food);


        List<News_discover_food> arrayList = new ArrayList<>();
        arrayList.add(new News_discover_food(R.drawable.logo,R.drawable.img_discover_1,R.drawable.img_discover_1,R.drawable.img_discover_1,R.drawable.img_discover_1,
                "Cơm Tấm Nhị Kiều","Hùng Vương - Ninh Kiều Cần Thơ","Giao tận nơi",
                "Quán ăn ngon lắm luôn, trưa mà vào đây ăn ngon cả cái bụng thích quá đi mất ",
                "Quán ăn ngon lắm luôn, trưa mà vào đây ăn ngon cả cái bụng thích quá đi mất ","Đang mở cửa"));
        arrayList.add(new News_discover_food(R.drawable.logo,R.drawable.discover_img_2,R.drawable.discover_img_2,R.drawable.discover_img_2,R.drawable.discover_img_2,
                "Gân Bò Trung Sang","Hùng Vương","Giao tận nơi",
                "Quán ăn ngon lắm luôn",
                "Quán ăn ngon lắm luôn","Đang mở cửa"));
        setMoinhat_Recycle(arrayList);

        //backHome
        findViewById(R.id.back_hometodiscover).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void setMoinhat_Recycle(List<News_discover_food> moinhatProducts){
        moinhat_Recycle=findViewById(R.id.moinhat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        moinhat_Recycle.setLayoutManager(layoutManager);
        news_discover_foodAdapter_  = new News_discover_foodAdapter(this,moinhatProducts);
        moinhat_Recycle.setAdapter(news_discover_foodAdapter_);
    }
}