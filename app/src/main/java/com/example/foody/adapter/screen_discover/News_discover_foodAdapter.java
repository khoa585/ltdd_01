package com.example.foody.adapter.screen_discover;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foody.R;
import com.example.foody.model.screen_discover.News_discover_food;

import java.util.List;

public class News_discover_foodAdapter extends RecyclerView.Adapter<News_discover_foodAdapter.NewsfoodViewHolder> {

    Context context;
    List<News_discover_food> moinhatProductList;

    public News_discover_foodAdapter(Context context, List<News_discover_food> moinhatProductList) {
        this.context = context;
        this.moinhatProductList = moinhatProductList;
    }

    @NonNull
    @Override
    public News_discover_foodAdapter.NewsfoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_item_discover_food,parent,false);
        return new NewsfoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull News_discover_foodAdapter.NewsfoodViewHolder holder, int position) {
        holder.store_img.setImageResource(moinhatProductList.get(position).getStore_img());
        holder.img_monan.setImageResource(moinhatProductList.get(position).getImg_monan());
        holder.img_bt.setImageResource(moinhatProductList.get(position).getImg_bt());
        holder.img_user1.setImageResource(moinhatProductList.get(position).getImg_user1());
        holder.img_user2.setImageResource(moinhatProductList.get(position).getImg_user2());
        holder.store_name.setText(moinhatProductList.get(position).getStore_name());
        holder.store_location.setText(moinhatProductList.get(position).getStore_location());
        holder.text_bt.setText(moinhatProductList.get(position).getText_bt());
        holder.danhgia1.setText(moinhatProductList.get(position).getDanhgia1());
        holder.danhgia2.setText(moinhatProductList.get(position).getDanhgia2());
    }

    @Override
    public int getItemCount() {
        return moinhatProductList.size();
    }

    public static final class NewsfoodViewHolder extends RecyclerView.ViewHolder  {
        ImageView store_img,img_monan,img_bt,img_user1,img_user2;
        TextView store_name,store_location,text_bt,danhgia1,danhgia2,tinhtrang;
        public NewsfoodViewHolder(@NonNull View itemView) {
            super(itemView);
            store_img=itemView.findViewById(R.id.store_img);
            img_monan=itemView.findViewById(R.id.img_monan);
            img_bt=itemView.findViewById(R.id.img_bt);
            img_user1=itemView.findViewById(R.id.user1);
            img_user2=itemView.findViewById(R.id.user2);
            store_name=itemView.findViewById(R.id.store_name);
            store_location=itemView.findViewById(R.id.store_location);
            text_bt=itemView.findViewById(R.id.text_bt);
            danhgia1=itemView.findViewById(R.id.danhgia1);
            danhgia2=itemView.findViewById(R.id.danhgia2);
        }
    }
}
