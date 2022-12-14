package com.example.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    BroadcastReceiver br;
    IntentFilter f1, f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        br = new charged();
//        f1 = new IntentFilter(Intent.ACTION_POWER_CONNECTED);
//        f2 = new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);
//        registerReceiver(br, f1);
//        registerReceiver(br, f2);
        f1 = new IntentFilter("android.net.wifi.STATE_CHANGE");
        registerReceiver(br, f1);
        f2 = new IntentFilter(Intent.ACTION_HEADSET_PLUG);
        registerReceiver(br, f2);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(br);
    }
}