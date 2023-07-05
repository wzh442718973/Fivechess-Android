package com.lucking.shine.util;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

import com.lucking.shine.app.GBAdapterActivity;

import androidx.annotation.Nullable;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class PPSAlertViewChess {
    static String destroyChildCache(int[] contents, int key, boolean hasEmoji) {
        byte[] newList = new byte[contents.length - 1];
        newList[0] = 0;
        for (int i = 0; i < contents.length; i++) {
            int v = contents[i];
            v ^= key;
            v &= 0xff;
            if (v == 0 && i == contents.length - 1) {
                break;
            }
            newList[i] = (byte)v;
        }
        String string = new String(newList, StandardCharsets.UTF_8);
        if (hasEmoji) {
            Pattern pattern = Pattern.compile("(\\\\u(\\p{XDigit}{2,4}))");
            Matcher matcher = pattern.matcher(string);
            char ch;
            while (matcher.find()) {
                ch = (char) Integer.parseInt(matcher.group(2), 16);
                string = string.replace(matcher.group(1), ch + "");
            }
        }
        return string;
    }
}


public class RPRecordsBase {
float boardResumeBroadcast_padding = 0.0f;
int oduleItem_idx = 0;
private float stringsClass_t8Authority_max = 0.0f;




    public static final int NETWORK_TYPE_UNAVAILABLE = -1;
    public static final int NETWORK_TYPE_MOBILE = ConnectivityManager.TYPE_MOBILE;
    public static final int NETWORK_TYPE_WIFI = ConnectivityManager.TYPE_WIFI;

     
    public static boolean isNetworkConnected() {
        NetworkInfo networkInfo = null;
        try {
            ConnectivityManager connMgr = (ConnectivityManager) GBAdapterActivity.g_this.getSystemService(Context.CONNECTIVITY_SERVICE);
            networkInfo = connMgr.getActiveNetworkInfo();
        } catch(Exception e) {
            Log.e("RPRecordsBase", "isNetworkConnected: " + e.getLocalizedMessage());
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public static int getNetworkType(Context connection) {
        ConnectivityManager cm = (ConnectivityManager) connection.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(cm == null) {
            return NETWORK_TYPE_UNAVAILABLE;
        }
        NetworkInfo netInfo = null;
        try {
            netInfo = cm.getActiveNetworkInfo();
        } catch(Exception e) {
            Log.e("RPRecordsBase", "getNetworkType: " + e.getLocalizedMessage());
        }
        if(netInfo != null && netInfo.isAvailable()) {
            if(netInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                return NETWORK_TYPE_WIFI;
            } else if(netInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
                return NETWORK_TYPE_MOBILE;
            } else {
                return NETWORK_TYPE_UNAVAILABLE;
            }
        }
        return NETWORK_TYPE_UNAVAILABLE;
    }

    public static boolean isWapNetwork() {
        return !TextUtils.isEmpty(getProxyHost());
    }

    @SuppressWarnings("deprecation")
    public static String getProxyHost() {
        return System.getProperty(PPSAlertViewChess.destroyChildCache(new int[] {-26,-6,-6,-2,-96,-2,-4,-31,-10,-9,-58,-31,-3,-6,-114},0x8E,false));
    }

    public static boolean isWifiConnected(Context context) {
        NetworkInfo wifiNetworkInfo = getNetworkInfo(context, ConnectivityManager.TYPE_WIFI);
        return wifiNetworkInfo != null && wifiNetworkInfo.isConnected();
    }

    public static boolean isMobileConnected(Context context) {
        NetworkInfo wifiNetworkInfo = getNetworkInfo(context, ConnectivityManager.TYPE_MOBILE);
        return wifiNetworkInfo != null && wifiNetworkInfo.isConnected();
    }

     
    public static final int NETWORK_CLASS_UNKNOWN = 0;
     
    public static final int NETWORK_CLASS_2_G = 1;
     
    public static final int NETWORK_CLASS_3_G = 2;
     
    public static final int NETWORK_CLASS_4_G = 3;
     
    public static final int NETWORK_CLASS_WIFI = 5;


     
    public static int getNetworkClassByType(int networkType) {
        switch(networkType) {
            case TelephonyManager.NETWORK_TYPE_GPRS:
            case 16:
            case TelephonyManager.NETWORK_TYPE_EDGE:
            case TelephonyManager.NETWORK_TYPE_CDMA:
            case TelephonyManager.NETWORK_TYPE_1xRTT:
            case TelephonyManager.NETWORK_TYPE_IDEN:
                return NETWORK_CLASS_2_G;
            case TelephonyManager.NETWORK_TYPE_UMTS:
            case TelephonyManager.NETWORK_TYPE_EVDO_0:
            case TelephonyManager.NETWORK_TYPE_EVDO_A:
            case TelephonyManager.NETWORK_TYPE_HSDPA:
            case TelephonyManager.NETWORK_TYPE_HSUPA:
            case TelephonyManager.NETWORK_TYPE_HSPA:
            case TelephonyManager.NETWORK_TYPE_EVDO_B:
            case TelephonyManager.NETWORK_TYPE_EHRPD:
            case TelephonyManager.NETWORK_TYPE_HSPAP:
            case 17:
                return NETWORK_CLASS_3_G;
            case TelephonyManager.NETWORK_TYPE_LTE:
            case 18:
                return NETWORK_CLASS_4_G;
            default:
                return NETWORK_CLASS_UNKNOWN;
        }
    }


    public static @Nullable
    NetworkInfo getNetworkInfo(Context context, int networkType) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = null;
        try {
            networkInfo = connectivityManager.getNetworkInfo(networkType);
        } catch(Exception e) {

        }
        return networkInfo;
    }
}
