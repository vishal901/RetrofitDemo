package com.example.administrator.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://nearely.com/nearely/index.php/api/";
    private RecyclerView mRecyclerView;
    private SpeckMainAdapter adpater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ResetApi resetApi = retrofit.create(ResetApi.class);
//        ProfileService profileService = mRestAdapter.create(ProfileService.class);

        Call<OffresData> call = resetApi.getTasks();

        call.enqueue(new Callback<OffresData>() {


            @Override
            public void onResponse(Call<OffresData> call, Response<OffresData> response) {

               int code = response.code();

                Log.e("fhgdfy",""+code);

                OffresData myResp =response.body();
                myResp.getOffers();

                adpater = new SpeckMainAdapter(MainActivity.this,  myResp.getOffers());

                mRecyclerView.setAdapter(adpater);

            }

            @Override
            public void onFailure(Call<OffresData> call, Throwable t) {

                Log.e("failure",""+t.getMessage());
            }
        });
//        call.enqueue(new Callback<List<OffresData>>() {
//            @Override
//            public void onResponse(Call<List<OffresData>> call, Response<List<OffresData>> response) {
//
//                Log.e("masssage", String.valueOf(response.body()));
//
//            }
//
//            @Override
//            public void onFailure(Call<List<OffresData>> call, Throwable t) {
//
//                Toast.makeText(MainActivity.this, "errror", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}
