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
import com.example.foody.model.screen_ship.ShipFood;


import java.util.List;

public class ShipFoodAdapter extends RecyclerView.Adapter<ShipFoodAdapter.AsiaFoodViewHolder> {

    Context context;
    List<ShipFood> shipFoods;

    public ShipFoodAdapter(Context context, List<ShipFood> shipFoods) {
        this.context = context;
        this.shipFoods = shipFoods;
    }

    @NonNull
    @Override
    public AsiaFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.food_row_item_ship,parent,false);
        return new AsiaFoodViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull AsiaFoodViewHolder holder, int position) {
        holder.foodimage.setImageResource(shipFoods.get(position).getImageUrl());
        holder.name.setText(shipFoods.get(position).getName());
        holder.price.setText(shipFoods.get(position).getPrice());
        holder.rating.setText(shipFoods.get(position).getRating());
        holder.retorant_name.setText(shipFoods.get(position).getRetorant_name());

    }

    @Override
    public int getItemCount() {
        return shipFoods.size();
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
