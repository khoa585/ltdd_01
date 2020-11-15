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
import com.example.foody.model.screen_order.Listrestaurant;

import java.util.List;

public class ListrestaurantAdapter extends RecyclerView.Adapter<ListrestaurantAdapter.ListrestaurantViewHolder>{
    Context context;
    List<Listrestaurant> listrestaurant;


    public ListrestaurantAdapter(Context context,  List<Listrestaurant> listrestaurant) {
        this.context = context;
        this.listrestaurant = listrestaurant;
    }

    @NonNull
    @Override
    public ListrestaurantAdapter.ListrestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_item_restaurant,parent,false);
        return new ListrestaurantAdapter.ListrestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListrestaurantAdapter.ListrestaurantViewHolder holder, int position) {
        holder.foodimage.setImageResource(listrestaurant.get(position).getImageUrl());
        holder.name.setText(listrestaurant.get(position).getName());
        holder.Address.setText(listrestaurant.get(position).getAddress());
        holder.Category.setText(listrestaurant.get(position).getCategory());
    }

    @Override
    public int getItemCount() {
        return listrestaurant.size();
    }

    public static final class ListrestaurantViewHolder extends RecyclerView.ViewHolder  {
        ImageView foodimage;
        TextView name,Address,Category;
        public ListrestaurantViewHolder(@NonNull View itemView) {
            super(itemView);
            foodimage=itemView.findViewById(R.id.food_image_restaurant);
            name=itemView.findViewById(R.id.name_restaurant);
            Address=itemView.findViewById(R.id.Address_restaurant);
            Category=itemView.findViewById(R.id.category_restaurant);
        }
    }
}
