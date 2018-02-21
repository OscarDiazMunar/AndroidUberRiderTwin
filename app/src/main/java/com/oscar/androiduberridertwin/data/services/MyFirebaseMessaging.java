package com.oscar.androiduberridertwin.data.services;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.oscar.androiduberridertwin.R;
import com.oscar.androiduberridertwin.domain.model.Notification;


/**
 * Created by oscar on 1/24/2018.
 */
public class MyFirebaseMessaging extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(final RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        //remoteMessage.getData().
        Log.e("data",remoteMessage.getData().toString());
        Log.e("type", remoteMessage.getData().get("type"));

        Log.e("remote", remoteMessage.getNotification().getBody().toString());
        switch (remoteMessage.getData().get("type")){
            case "1":
                Handler handler = new Handler(Looper.getMainLooper());
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MyFirebaseMessaging.this, ""+remoteMessage.getNotification().getBody(), Toast.LENGTH_LONG).show();
                    }
                });
                break;
            case "2":
                showArrivedNotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
                break;
        }


    }

    private void showArrivedNotification(String title, String body) {
        PendingIntent contentIntent = PendingIntent.getActivity(getBaseContext(),
                0,
                    new Intent(),
                    PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(getBaseContext());
        builder.setAutoCancel(true)
                .setDefaults(android.app.Notification.DEFAULT_LIGHTS| android.app.Notification.DEFAULT_SOUND)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle(title)
                .setContentText(body)
                .setContentIntent(contentIntent);
        NotificationManager manager = (NotificationManager)getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(1, builder.build());
    }
}
