package com.example.administrator.retrofitdemo;

import org.json.JSONObject;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 5/16/2016.
 */
public interface ResetApi {

    @GET("grocery")
  //  Call<OffresData> getTasks();
    Call<JSONObject> getTasks();

}
