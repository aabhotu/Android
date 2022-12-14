package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class charged extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
       // if(intent.getAction() == "android.net.wifi.STATE_CHANGE ")
            //Toast.makeText(context, "Vua cam sac", Toast.LENGTH_SHORT).show();
        //else if(intent.getAction() == Intent.ACTION_POWER_DISCONNECTED)
           // Toast.makeText(context, "vua rut sac", Toast.LENGTH_SHORT).show();
        WifiManager wf = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        if (wf.isWifiEnabled()==true){
            Toast.makeText(context, "turn on wifi", Toast.LENGTH_SHORT).show();
            Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.haui.edu.vn"));
            context.startActivity(i2);
        }

        else if (wf.isWifiEnabled()==false)
            Toast.makeText(context, "turn off wifi", Toast.LENGTH_SHORT).show();
    }
}
