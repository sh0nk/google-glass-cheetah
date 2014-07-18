package com.app.helloglass;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
 
public class Title extends Service {
     
    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }
 
    public int onStartCommand(Intent intent, int flags, int startId) {
     
        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        return START_STICKY;
    } 
 
}