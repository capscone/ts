package com.capstone.milkteabooking.activities;

import android.os.Bundle;

import com.capstone.milkteabooking.R;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public String getMainTitle() {
        return "Trang chủ";
    }

    @Override
    public void bindView() {

    }
}
