package com.torkuds.androidworld.ui.activity;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.torkuds.androidworld.R;
import com.torkuds.androidworld.ui.base.BaseActivity;
import com.torkuds.androidworld.utils.StatusBarCompat;

import butterknife.OnClick;
/**
 * des：注册页面
 */
public class RegisterActivity extends BaseActivity {

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
        return R.layout.activity_register;
    }

    @Override
    protected void initView() {

    }

    //注册
    @OnClick(R.id.button_register)
    public void doRegister(){

    }
    //跳转到登录页面
    @OnClick(R.id.tv_login)
    public void gotoLogin(){
        startActivity(LoginActivity.class);
        finish();
    }
    //跳转到忘记密码页面
    @OnClick(R.id.tv_login_forgot)
    public void gotoForgotPassword(){

    }
}
