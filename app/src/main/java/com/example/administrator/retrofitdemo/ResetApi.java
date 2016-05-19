package com.example.administrator.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Administrator on 5/16/2016.
 */
public interface ResetApi {



    @GET("grocery")
    Call<OffresData> getTasks();
}
