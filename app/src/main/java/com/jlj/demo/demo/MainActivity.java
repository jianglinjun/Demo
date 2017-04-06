package com.jlj.demo.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jlj.demo.mylibrary.lib.Lib2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("22222222");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        System.out.println("111111");
    }
}
