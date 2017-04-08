package com.torkuds.androidworld.ui.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.torkuds.androidworld.R;

import butterknife.ButterKnife;

/**
 * des:BaseActivity
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        doBeforeSetContentView();
        setContentView(getLayoutId());

        ButterKnife.bind(this);
        initView();
    }

    //setContentView之前的操作
    protected void doBeforeSetContentView() {
    }

    //获取布局文件ID
    protected abstract int getLayoutId();
    //初始化View
    protected abstract void initView();

    /**
     * 通过Class跳转页面
     */
    public void startActivity(Class<?> cls){
        startActivity(cls, null);
    }

    /**
     * 通过Class跳转页面，包含Bundle
     */
    public void startActivity(Class<?> cls, Bundle bundle){
        Intent intent = new Intent(this, cls);
        if (bundle != null){
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

}
