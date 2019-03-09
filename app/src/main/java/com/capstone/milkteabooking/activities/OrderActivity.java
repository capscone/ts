package com.capstone.milkteabooking.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.capstone.milkteabooking.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OrderActivity extends BaseActivity {
    /**
     * ButterKnife Code
     **/
    @BindView(R.id.txt_destination_orderdetail)
    TextView txtDestinationOrderdetail;
    @BindView(R.id.txt_source_orderdetail)
    TextView txtSourceOrderdetail;
    @BindView(R.id.txt_distance_orderdetail)
    TextView txtDistanceOrderdetail;
    @BindView(R.id.lst_order_detail)
    ListView lstOrderDetail;
    @BindView(R.id.layout_price)
    RelativeLayout layoutPrice;
    @BindView(R.id.lbl_subtotal)
    TextView lblSubtotal;
    @BindView(R.id.txt_price_orderdetail)
    TextView txtPriceOrderdetail;
    @BindView(R.id.txt_fee_price_orderdetail)
    TextView txtFeePriceOrderdetail;
    @BindView(R.id.btn_order_orderdeatail)
    Button btnOrderOrderdeatail;

    /**
     * ButterKnife Code
     **/

    @Override
    protected int getLayoutView() {
        return R.layout.activity_order;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public String getMainTitle() {
        return null;
    }

    @Override
    public void bindView() {
        ButterKnife.bind(this);
    }
}
