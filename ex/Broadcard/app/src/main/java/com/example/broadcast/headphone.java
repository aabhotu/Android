package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class headphone extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == Intent.ACTION_HEADSET_PLUG)
            Toast.makeText(context, "Cam tai nghe", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(context, "Rut tai nghe", Toast.LENGTH_SHORT).show();
    }
}
