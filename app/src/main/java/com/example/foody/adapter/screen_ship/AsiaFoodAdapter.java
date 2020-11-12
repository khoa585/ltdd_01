package com.example.foody.adapter.screen_ship;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.foody.R;
import com.example.foody.model.screen_ship.AsiaFood;


import java.util.List;

public class AsiaFoodAdapter extends RecyclerView.Adapter<AsiaFoodAdapter.AsiaFoodViewHolder> {

    Context context;
    List<AsiaFood> asiaFoods;

    public AsiaFoodAdapter(Context context, List<AsiaFood> asiaFoods) {
        this.context = context;
        this.asiaFoods = asiaFoods;
    }

    @NonNull
    @Override
    public AsiaFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.asia_food_row_item,parent,false);
        return new AsiaFoodViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull AsiaFoodViewHolder holder, int position) {
        holder.foodimage.setImageResource(asiaFoods.get(position).getImageUrl());
        holder.name.setText(asiaFoods.get(position).getName());
        holder.price.setText(asiaFoods.get(position).getPrice());
        holder.rating.setText(asiaFoods.get(position).getRating());
        holder.retorant_name.setText(asiaFoods.get(position).getRetorant_name());

    }

    @Override
    public int getItemCount() {
        return asiaFoods.size();
    }

    public static final class AsiaFoodViewHolder extends RecyclerView.ViewHolder  {

        ImageView foodimage;
        TextView price,name,rating,retorant_name;

        public AsiaFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodimage=itemView.findViewById(R.id.food_image);
            price=itemView.findViewById(R.id.price);
            name=itemView.findViewById(R.id.name);
            rating=itemView.findViewById(R.id.rate);
            retorant_name=itemView.findViewById(R.id.restorant_name);

        }
    }
}
