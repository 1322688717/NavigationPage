package com.example.navigationpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class NavigationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_page);
        // 新建一个线程
        new Thread(){
            @Override
            public void run() {
                super.run();
                //休眠三秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //从导航页面跳转到到主页面
                startActivity(new Intent(NavigationPage.this,MainActivity.class));
                finish();
            }
        }.start();
    }
}