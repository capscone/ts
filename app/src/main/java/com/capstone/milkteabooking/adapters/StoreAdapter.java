package com.capstone.milkteabooking.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.capstone.milkteabooking.R;
import com.capstone.milkteabooking.models.Store;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StoreAdapter extends BaseAdapter {
    private List<Store> list;
    private Context context;
    private LayoutInflater inflater;

    public StoreAdapter(Context context, List<Store> list) {
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
        StoreAdapter.ViewHolder holder;
        if (view != null) {
            holder = (StoreAdapter.ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.item_product, viewGroup, false);
            holder = new StoreAdapter.ViewHolder(view);
            view.setTag(holder);
        }
        Store p = (Store) getItem(i);
        holder.txtStoreName.setText(p.getName());
        Picasso.get().load(p.getLogo()).into(holder.imgStore);
        // etc...
        return view;
    }


    static class ViewHolder {

        @BindView(R.id.txt_name_store)
        TextView txtStoreName;
        @BindView(R.id.img_logo_store)
        ImageView imgStore;


        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
