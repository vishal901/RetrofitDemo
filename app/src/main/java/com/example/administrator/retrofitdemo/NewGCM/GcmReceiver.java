package com.example.administrator.retrofitdemo.NewGCM;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by Administrator on 5/21/2016.
 */
public class GcmReceiver extends  GcmListenerService {


    @Override
    public void onMessageReceived(String from, Bundle data) {

        Log.e("djkhfudf",data.toString());
    }
}
