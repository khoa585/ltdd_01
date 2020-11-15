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

public class RecommendFoodAdapter extends RecyclerView.Adapter<RecommendFoodAdapter.RecommendFoodViewHolder>{
    Context context;
    List<ShipFood> RecommendFoods;

    public RecommendFoodAdapter(Context context, List<ShipFood> RecommendFoods) {
        this.context = context;
        this.RecommendFoods = RecommendFoods;
    }

    public static final class RecommendFoodViewHolder extends RecyclerView.ViewHolder  {
        ImageView foodimage;
        TextView price,name,rating,retorant_name;

        public RecommendFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodimage=itemView.findViewById(R.id.recommend_food_image);
            price=itemView.findViewById(R.id.price);
            name=itemView.findViewById(R.id.recommend_name);
            rating=itemView.findViewById(R.id.recommend_rate);
            retorant_name=itemView.findViewById(R.id.recommend_restorant_name);

        }

    }

    @NonNull
    @Override
    public RecommendFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recommended_items,parent,false);
        return new RecommendFoodAdapter.RecommendFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendFoodViewHolder holder, int position) {
        holder.foodimage.setImageResource(RecommendFoods.get(position).getImageUrl());
        holder.name.setText(RecommendFoods.get(position).getName());
        holder.price.setText(RecommendFoods.get(position).getPrice());
        holder.rating.setText(RecommendFoods.get(position).getRating());
        holder.retorant_name.setText(RecommendFoods.get(position).getRetorant_name());
    }

    @Override
    public int getItemCount() {
        return RecommendFoods.size();
    }
}
