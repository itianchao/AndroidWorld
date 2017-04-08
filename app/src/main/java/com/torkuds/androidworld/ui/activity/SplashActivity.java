package com.torkuds.androidworld.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import com.torkuds.androidworld.R;
import com.torkuds.androidworld.ui.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {
        //判断用户是否登录，如果没有登陆，跳转到登录页
        //如果已经登录，跳转到主页
        if (true){
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    gotoLogin();
                }
            }, 800);
        }else {
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    gotoMain();
                }
            }, 800);
        }
    }

    private void gotoMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    private void gotoLogin() {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
