package com.example.foody.adapter.screen_order;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foody.R;
import com.example.foody.model.screen_order.OrderFood;

import java.util.List;

public class NameorderAdapter extends RecyclerView.Adapter<NameorderAdapter.NameorderFoodViewHolder>{
    Context context;
    List<OrderFood> orderFoodList;


    public NameorderAdapter(Context context, List<OrderFood> orderFoodList) {
        this.context = context;
        this.orderFoodList = orderFoodList;
    }

    @NonNull
    @Override
    public NameorderAdapter.NameorderFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_item_food,parent,false);
        return new NameorderAdapter.NameorderFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameorderAdapter.NameorderFoodViewHolder holder, int position) {
        holder.foodimage.setImageResource(orderFoodList.get(position).getImageUrl());
        holder.name.setText(orderFoodList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return orderFoodList.size();
    }

        public static final class NameorderFoodViewHolder extends RecyclerView.ViewHolder  {
        ImageView foodimage;
        TextView name;
        public NameorderFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodimage=itemView.findViewById(R.id.name_food_image_order);
            name=itemView.findViewById(R.id.name_food);
        }
    }
}
