package com.example.saumya.alarmexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

/**
 * Created by saumya on 16/Oct/2017.
 */

public class setalarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Wake Up....please", Toast.LENGTH_SHORT).show();

        Vibrator vibrator=(Vibrator)context.getSystemService((Context.VIBRATOR_SERVICE));
        vibrator.vibrate(2000);

    }
}
