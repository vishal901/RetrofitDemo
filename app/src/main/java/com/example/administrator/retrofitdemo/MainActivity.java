package com.example.administrator.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://nearely.com/nearely/index.php/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ResetApi resetApi = retrofit.create(ResetApi.class);
//        ProfileService profileService = mRestAdapter.create(ProfileService.class);

        Call<abc> call = resetApi.getTasks();

        call.enqueue(new Callback<abc>() {


            @Override
            public void onResponse(Call<abc> call, Response<abc> response) {

                try {
                    Log.e("massage", String.valueOf(call.execute().body()));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<abc> call, Throwable t) {

            }
        });
//        call.enqueue(new Callback<List<abc>>() {
//            @Override
//            public void onResponse(Call<List<abc>> call, Response<List<abc>> response) {
//
//                Log.e("masssage", String.valueOf(response.body()));
//
//            }
//
//            @Override
//            public void onFailure(Call<List<abc>> call, Throwable t) {
//
//                Toast.makeText(MainActivity.this, "errror", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}
