package com.capstone.milkteabooking.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.capstone.milkteabooking.R;
import com.capstone.milkteabooking.models.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductAdapter extends BaseAdapter {
    private List<Product> list;
    private Context context;
    private LayoutInflater inflater;

    public ProductAdapter(Context context, List<Product> list) {
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return list.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.item_product, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }
        Product p = (Product) getItem(i);
        holder.txtProductName.setText(p.getName());
        holder.txtProductPrice.setText(p.getPrice());
        Picasso.get().load(p.getImage()).into(holder.imgProduct);
        // etc...
        return view;
    }


    static class ViewHolder {

        @BindView(R.id.txt_price_product)
        TextView txtProductPrice;
        @BindView(R.id.txt_name_product)
        TextView txtProductName;
        @BindView(R.id.img_logo_product)
        ImageView imgProduct;


        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}