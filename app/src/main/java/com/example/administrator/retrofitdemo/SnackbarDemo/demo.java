package com.example.administrator.retrofitdemo.SnackbarDemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.administrator.retrofitdemo.R;

/**
 * Created by Administrator on 5/21/2016.
 */
public class demo extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snackbar);

        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.lay);

        Snackbar snack = Snackbar.make(linearLayout, "No Internet Coonection", Snackbar.LENGTH_SHORT);
        View view = snack.getView();
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams)view.getLayoutParams();
        params.gravity = Gravity.TOP;
        view.setLayoutParams(params);
        snack.show();
    }
}
