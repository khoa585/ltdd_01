package com.example.foody.adapter.screen_home;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;
import com.example.foody.model.screen_home.Product;

import java.util.List;

public class CustomGridAdapter extends BaseAdapter {

    private List<Product> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomGridAdapter(Context aContext, List<Product> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.row_grid, null);
            holder = new ViewHolder();
            holder.flagView = (ImageView) convertView.findViewById(R.id.img);
            holder.productNameView = (TextView) convertView.findViewById(R.id.nameProduct);
            holder.addressView = (TextView) convertView.findViewById(R.id.address);
            holder.priceView = (TextView) convertView.findViewById(R.id.price);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Product country = this.listData.get(position);
        holder.productNameView.setText(country.getProductName());
        holder.priceView.setText("" + country.getPrice());
        holder.addressView.setText(country.getAddress());

        int imageId = this.getMipmapResIdByName(country.getFlagName());

        holder.flagView.setImageResource(imageId);

        return convertView;
    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(int resName)  {
        String pkgName = context.getPackageName();

        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(String.valueOf(resName), "mipmap", pkgName);
        Log.i("CustomGridView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView flagView;
        TextView productNameView;
        TextView priceView;
        TextView addressView;
    }

}
