package com.torkuds.androidworld.ui.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.TextInputLayout;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.torkuds.androidworld.R;
import com.torkuds.androidworld.ui.base.BaseActivity;
import com.torkuds.androidworld.utils.StatusBarCompat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.textinput_password)
    TextInputLayout textPassword;
    @BindView(R.id.image_background)
    ImageView imageBackground;

    @BindView(R.id.button_login)
    Button mButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);

//        textPassword.setError("密码错误");
    }

    @Override
    protected void doBeforeSetContentView() {
        super.doBeforeSetContentView();
        StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.colorBlack));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation animation = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.translate_anim);
                imageBackground.startAnimation(animation);
            }
        }, 200);
    }

    @OnClick(R.id.button_login)
    public void login(){
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @OnClick(R.id.tv_login_register)
    public void gotoRegister(){
        startActivity(RegisterActivity.class);
    }
}
