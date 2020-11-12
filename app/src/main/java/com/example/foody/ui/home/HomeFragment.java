package com.example.foody.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.foody.MainActivity;
import com.example.foody.View.view_screen_ship.screen_ship;
import com.example.foody.View.View_screen_order.screen_order;
import com.example.foody.adapter.screen_home.CustomGridAdapter;
import com.example.foody.model.screen_home.Product;
import com.example.foody.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    ViewFlipper viewFlipper;
    private GridView gridView;

    Context context;
    List<CustomGridAdapter> custListView;
    CustomGridAdapter customAdapter;
    CustomGridAdapter customItem;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        gridView = root.findViewById(R.id.gridView_home);
        custListView = new ArrayList<>();
        registerForContextMenu(gridView);
        List<Product> image_details = getListData();
        gridView.setAdapter(new CustomGridAdapter(getActivity(), image_details));

        //slide
        ImageSlider imageSlider=root.findViewById(R.id.home_image_slider);
        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.slide1));
        slideModels.add(new SlideModel(R.drawable.slide2));
        slideModels.add(new SlideModel(R.drawable.slide3));
        imageSlider.setImageList(slideModels,true);

        //active
        root.findViewById(R.id.giaohang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action();
            }
        });


        ///
        root.findViewById(R.id.order_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), screen_order.class);
                startActivity(intent);
            }
        });
        return root;
    }

    private List<Product> getListData() {
        List<Product> list = new ArrayList<Product>();
        Product product1 = new Product("Trà sữa TC đường đen", R.drawable.popularfood1,"48 Cao Thắng", 12000000);
        Product product2 = new Product("Trà sữa TC đường đen", R.drawable.popularfood1,"48 Cao Thắng", 12000000);
        Product product3 = new Product("Trà sữa TC đường đen", R.drawable.popularfood1,"48 Cao Thắng", 12000000);
        Product product4 = new Product("Trà sữa TC đường đen", R.drawable.popularfood1,"48 Cao Thắng", 12000000);
        Product product5 = new Product("Trà sữa TC đường đen", R.drawable.popularfood1,"48 Cao Thắng", 12000000);
        Product product6 = new Product("Trà sữa TC đường đen", R.drawable.popularfood1,"48 Cao Thắng", 12000000);
        Product product7 = new Product("Trà sữa TC đường đen", R.drawable.popularfood1,"48 Cao Thắng", 12000000);
        Product product8 = new Product("Trà sữa TC đường đen", R.drawable.popularfood1,"48 Cao Thắng", 12000000);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);
        return list;
    }

    public void action(){
        Intent intent = new Intent(getActivity(), screen_ship.class);
        startActivity(intent);
    }
}