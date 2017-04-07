package com.torkuds.androidworld.ui;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.torkuds.androidworld.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.textinput_password)
    TextInputLayout textPassword;

    @BindView(R.id.button_login)
    Button mButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

//        textPassword.setError("密码错误");
    }

    @OnClick(R.id.button_login)
    public void login(){
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }
}
