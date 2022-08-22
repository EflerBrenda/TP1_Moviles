package com.ulp.trabajopracticouno;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class WifiReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("salida","conectado a wifi");

        Boolean estado = intent.getBooleanExtra("connected", false);
        if (estado){
            Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:2664553747"));
            context.startActivity(i);
        }

    }
}