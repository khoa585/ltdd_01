package com.example.foody.adapter.screen_home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.foody.R;
import com.example.foody.model.screen_home.Product;
import com.example.foody.View.View_screen_detail.screen_detail_food;

import java.util.List;

public class CustomGridAdapter extends RecyclerView.Adapter<CustomGridAdapter.CustomGridViewHolder> {
    Context context;
    List<Product> lisProduct;


    public CustomGridAdapter(Context context, List<Product> lisProduct) {
        this.context = context;
        this.lisProduct = lisProduct;
    }



    @NonNull
    @Override
    public CustomGridAdapter.CustomGridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_grid,parent,false);
        return new CustomGridAdapter.CustomGridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomGridAdapter.CustomGridViewHolder holder,final int position) {

        holder.nameProduct.setText(lisProduct.get(position).getName());
        holder.Address.setText(lisProduct.get(position).getAddress());
        holder.Price.setText(lisProduct.get(position).getPrice());


        Glide.with(context).load(lisProduct.get(position).getImageUrl()).into(holder.foodimage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, screen_detail_food.class);
                i.putExtra("name", lisProduct.get(position).getName());
                i.putExtra("address", lisProduct.get(position).getAddress());
                i.putExtra("price", lisProduct.get(position).getPrice());
                i.putExtra("image", lisProduct.get(position).getImageUrl());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lisProduct.size();
    }
    public static final class CustomGridViewHolder extends RecyclerView.ViewHolder  {
        ImageView foodimage;
        TextView nameProduct,Address,Price;
        public CustomGridViewHolder(@NonNull View itemView) {
            super(itemView);
            foodimage=itemView.findViewById(R.id.img);
            nameProduct=itemView.findViewById(R.id.nameProduct);
            Address=itemView.findViewById(R.id.address);
            Price=itemView.findViewById(R.id.price);
        }

    }
}
