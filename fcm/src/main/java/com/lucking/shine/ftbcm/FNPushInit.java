package com.lucking.shine.ftbcm;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;





 
public class FNPushInit extends FirebaseMessagingService {
private double contextWebOffset = 0.0;
private String serviceExitEquals_str;




    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Log.i("#####", "MyFirebaseMessagingService.message " + message.getNotification());
        if (message.getNotification() != null) {
            sendNotification(message.getNotification());
        }
    }

    private void sendNotification(RemoteMessage.Notification notification) {
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, ARecordService.CHANNEL)
                .setSmallIcon(getApplicationInfo().icon)
                .setContentTitle(notification.getTitle())
                .setContentText(notification.getBody());

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notificationBuilder.build());
    }

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.i("#####", "MyFirebaseMessagingService.token " + token);
    }
}
