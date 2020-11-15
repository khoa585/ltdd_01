package com.example.foody.adapter.screen_order;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.foody.model.screen_order.Order_food_special;
import com.example.foody.R;
import java.util.List;

public class OrderfoodpecialAdaper extends RecyclerView.Adapter<OrderfoodpecialAdaper.orderfoodpecialViewHolder>{
    Context context;
    List<Order_food_special> orderfoodspecialFoodList;

    public OrderfoodpecialAdaper(Context context, List<Order_food_special> orderfoodspecialFoodList) {
        this.context = context;
        this.orderfoodspecialFoodList = orderfoodspecialFoodList;
    }

    @NonNull
    @Override
    public OrderfoodpecialAdaper.orderfoodpecialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_item_order_special,parent,false);
        return new OrderfoodpecialAdaper.orderfoodpecialViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderfoodpecialAdaper.orderfoodpecialViewHolder holder, int position) {
        holder.foodimage.setImageResource(orderfoodspecialFoodList.get(position).getImageUrl());
        holder.name.setText(orderfoodspecialFoodList.get(position).getDescribe());
    }

    @Override
    public int getItemCount() {
        return orderfoodspecialFoodList.size();
    }


    public static final class orderfoodpecialViewHolder extends RecyclerView.ViewHolder  {
        ImageView foodimage;
        TextView name;

        public orderfoodpecialViewHolder(@NonNull View itemView) {
            super(itemView);
            foodimage=itemView.findViewById(R.id.name_food_image_order_special);
            name=itemView.findViewById(R.id.name_food_order_special);
        }
    }

}
