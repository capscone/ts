package com.capstone.milkteabooking.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.capstone.milkteabooking.R;
import com.capstone.milkteabooking.models.OrderDetail;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderDetailAdapter extends BaseAdapter {
    private List<OrderDetail> list;
    private Context context;
    private LayoutInflater inflater;

    public OrderDetailAdapter(Context context, List<OrderDetail> list) {
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
        OrderDetailAdapter.ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = inflater.inflate(R.layout.item_product, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }
        OrderDetail p = (OrderDetail) getItem(i);
        holder.txtOrderDetailName.setText(p.getName());
        holder.txtOrderDetailPrice.setText(p.getPrice() + "");
        holder.btnMinusOrderDetail.setOnClickListener((v) -> {
        });
        holder.btnPlusOrderDetail.setOnClickListener((v) -> {
        });

        return view;
    }


    static class ViewHolder {

        @BindView(R.id.txt_price_item_orderdetail)
        TextView txtOrderDetailPrice;
        @BindView(R.id.txt_name_item_orderdetail)
        TextView txtOrderDetailName;
        @BindView(R.id.edt_quantity_item_orderdetail)
        EditText edtQuantityOrderDetail;
        @BindView(R.id.btn_minus_item_orderdetail)
        Button btnMinusOrderDetail;
        @BindView(R.id.btn_plus_item_orderdetail)
        Button btnPlusOrderDetail;


        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
