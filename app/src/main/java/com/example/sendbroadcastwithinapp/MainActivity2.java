package com.example.sendbroadcastwithinapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv_show_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_show_msg = findViewById(R.id.tv_show_msg);
        tv_show_msg.setText(getIntent().getStringExtra("msg"));


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}