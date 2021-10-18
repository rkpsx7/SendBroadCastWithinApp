package com.example.sendbroadcastwithinapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Intent openActivityIntent = new Intent(context, MainActivity2.class);
            openActivityIntent.putExtra("msg", intent.getStringExtra("msg"));
            context.startActivity(openActivityIntent);
        }
    }
}