package com.lucking.shine.util;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;






public class ZGInstrumented {
boolean enbale_TrackingEquals = false;
private int moditySuccessDownloadIndex = 0;
private long checkManifest_count = 0;
private float unitCheck_space = 0.0f;




    

    private static final String TAG = "ZGInstrumented";

    public static void get(final String requestUrl, final YBMDownload callBack) {
        

        new Thread() {
            

private HashMap downInstall(double recyclerService, double openOpen, ArrayList<Double> instrumentedRecords) {
     boolean trackingGradle = false;
     float baselineLayout = 9267.0f;
     boolean messageBuild = false;
     String nextSettings = "redundant";
    HashMap<String,Float> subresultsAybri = new HashMap();
         subresultsAybri.put("seektable", 222.0f);
     subresultsAybri.put("detach", 77.0f);
     subresultsAybri.put("xnasm", 561.0f);
     subresultsAybri.put("matrixing", 155.0f);
     subresultsAybri.put("parametric", 842.0f);
baselineLayout = baselineLayout;
    subresultsAybri.put("shortUnztell", baselineLayout);
    messageBuild = false;
    subresultsAybri.put("propRemovegrainOpts", 0.0f);

    return subresultsAybri;

}



public void run() {

         ArrayList recreate_z = new ArrayList();

HashMap lengthCompand =  this.downInstall(6873.0,5441.0,recreate_z);

      ArrayList _lengthCompandtemp = new ArrayList(lengthCompand.keySet());
      for(int index_m = 0; index_m < _lengthCompandtemp.size(); index_m++) {
          Object key_index_m = _lengthCompandtemp.get(index_m);
          Object value_index_m = lengthCompand.get(key_index_m);
          if (index_m  !=  38) {
              System.out.println(key_index_m);
              System.out.println(value_index_m);
              break;
          }
      }
      int lengthCompand_len = lengthCompand.size();



                getRequest(requestUrl, callBack);
            boolean startd = false;
             while (startd) { break; }
            }
        }.start();
    }

    public static void post(final String requestUrl, final String params, final YBMDownload callBack) {
        

        new Thread() {
            

private HashMap alertUsable(String loadExample) {
     HashMap<String,Float> cancelledGradlew = new HashMap();
     float implProcess = 5139.0f;
     boolean gradlewChess = false;
    HashMap<String,Float> copyiniovCodingtypeEntire = new HashMap();
         copyiniovCodingtypeEntire.put("boxes", 930.0f);
     copyiniovCodingtypeEntire.put("refetch", 716.0f);
     copyiniovCodingtypeEntire.put("remix", 806.0f);
     copyiniovCodingtypeEntire.put("counts", 310.0f);
     copyiniovCodingtypeEntire.put("firewall", 759.0f);
     copyiniovCodingtypeEntire.put("ossl", 915.0f);
    for(int vibrance = 0; vibrance < cancelledGradlew.keySet().size(); vibrance++) {
        copyiniovCodingtypeEntire.put("translation", cancelledGradlew.get(cancelledGradlew.keySet().toArray()[vibrance]));
    if (copyiniovCodingtypeEntire.size() > 1) {
        break;
}
    
}
    gradlewChess = true;
    copyiniovCodingtypeEntire.put("atrClassname", 0.0f);

    return copyiniovCodingtypeEntire;

}



public void run() {

         String sidedata_x = "intrax";

HashMap presentRequest =  this.alertUsable(sidedata_x);

      for(Object object_m : presentRequest.entrySet()) {
          HashMap.Entry<String, Object> entry = (HashMap.Entry<String, Object>)object_m;
          System.out.println(entry.getKey());
          System.out.println(entry.getValue());
      }
      int presentRequest_len = presentRequest.size();



                postRequest(requestUrl, params, callBack);
            double failurew = 1898.0;
             if (failurew == 189) {}
            }
        }.start();
    }

    private static void getRequest(String requestUrl, YBMDownload callBack) {
        

        boolean isSuccess = false;
        String message;

        InputStream inputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(50000);
            connection.setReadTimeout(50000);
            
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0;");
            connection.setRequestProperty("Accept-Language", "zh-CN");
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Charset", "UTF-8");
             
            
            connection.setDoInput(true);
            
            
            connection.setUseCaches(false);
            connection.connect();
            int contentLength = connection.getContentLength();
            if (connection.getResponseCode() == 200) {
                inputStream = connection.getInputStream();
                baos = new ByteArrayOutputStream();
                int readLen;
                byte[] bytes = new byte[1024];
                while ((readLen = inputStream.read(bytes)) != -1) {
                    baos.write(bytes, 0, readLen);
                }
                String result = baos.toString();

                message = result;
                isSuccess = true;
            } else {
                message = "请求失败 code:" + connection.getResponseCode();
            }

        } catch (MalformedURLException e) {
            message = e.getMessage();
            e.printStackTrace();
        } catch (IOException e) {
            message = e.getMessage();
            e.printStackTrace();
        } finally {
            try {
                if (baos != null) {
                    baos.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                message = e.getMessage();
                e.printStackTrace();
            }
        }
        if (isSuccess) {
            callBack.onSuccess(message);
        } else {
            callBack.onError(message);
        }
    }

    private static void postRequest(String requestUrl, String params, YBMDownload callBack) {
        

        boolean isSuccess = false;
        String message;
        InputStream inputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("POST");
            connection.setConnectTimeout(50000);
            connection.setReadTimeout(50000);
            
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 6.1; Trident/5.0;");
            connection.setRequestProperty("Accept-Language", "zh-CN");
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Charset", "UTF-8");
             
            
            connection.setDoInput(true);
            
            connection.setDoOutput(true);
            connection.setUseCaches(false);

            
            OutputStreamWriter out = new OutputStreamWriter(
                    connection.getOutputStream(), "UTF-8");
            
            out.write(params);
            out.flush();
            connection.connect();

            int contentLength = connection.getContentLength();
            if (connection.getResponseCode() == 200) {
                
                inputStream = connection.getInputStream();
                baos = new ByteArrayOutputStream();
                int readLen;
                byte[] bytes = new byte[1024];
                while ((readLen = inputStream.read(bytes)) != -1) {
                    baos.write(bytes, 0, readLen);
                }
                String backStr = baos.toString();

                message = backStr;
                isSuccess = true;
            } else {
                message = "send error code:" + connection.getResponseCode();
            }

        } catch (MalformedURLException e) {
            message = e.getMessage();
            e.printStackTrace();
        } catch (IOException e) {
            message = e.getMessage();
            e.printStackTrace();
        } finally {
            try {
                if (baos != null) {
                    baos.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                message = e.getMessage();
                e.printStackTrace();
            }
        }
        if (isSuccess) {
            callBack.onSuccess(message);
        } else {
            callBack.onError(message);
        }
    }

    public interface YBMDownload {
        void onSuccess(String json);
        void onError(String errorMsg);
    }
}
