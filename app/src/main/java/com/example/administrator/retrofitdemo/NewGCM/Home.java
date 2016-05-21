package com.example.administrator.retrofitdemo.NewGCM;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.retrofitdemo.R;

/**
 * Created by Administrator on 5/21/2016.
 */
public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gcmlayout);

        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
