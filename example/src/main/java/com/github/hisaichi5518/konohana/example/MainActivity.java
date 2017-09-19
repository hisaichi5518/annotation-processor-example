package com.github.hisaichi5518.konohana.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.hisaichi5518.konohana.annotation.Key;

public class MainActivity extends AppCompatActivity {

    @Key
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
