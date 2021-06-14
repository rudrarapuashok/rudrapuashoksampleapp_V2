package com.nsgi.rudrapuashoksampleapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.nsgi.ashoklibrary.ToastMessage;


public class MainActivity extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastMessage.s(MainActivity.this,"toast message");
    }
}
