package com.yaowang.maventest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yaowang.modulelibrary1.LogUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.log("helloworld");
    }
}
