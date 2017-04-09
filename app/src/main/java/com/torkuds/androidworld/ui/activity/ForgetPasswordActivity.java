package com.torkuds.androidworld.ui.activity;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.torkuds.androidworld.R;
import com.torkuds.androidworld.ui.base.BaseActivity;
import com.torkuds.androidworld.utils.StatusBarCompat;

public class ForgetPasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void doBeforeSetContentView() {
        super.doBeforeSetContentView();
        StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.colorBlack));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget_password;
    }

    @Override
    protected void initView() {

    }
}
