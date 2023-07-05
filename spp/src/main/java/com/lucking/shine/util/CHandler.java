package com.lucking.shine.util;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;

import com.lucking.shine.app.NYService;
import com.lucking.shine.app.VBasePaytm;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;






public class CHandler extends AsyncTask<Void, Integer, Long> {
private int correctWorkaroundMap_index = 0;
String androidAccess_str;



	

	private Context mContext;
	private String url;
	private VBasePaytm downloadAgent;
	private File downLoadFile;
	 
	private QIXChannelMain downloadInfo;

	private long temp_lastTime;

	private final static int EVENT_START = 1;
	private final static int EVENT_PROGRESS = 2;

	public CHandler(Context context, String url, VBasePaytm downloadAgent) {
		

		this.url = url;
		this.mContext = context;
		this.downloadAgent = downloadAgent;
		this.downloadInfo = new QIXChannelMain();
		this.temp_lastTime = 0;
	}

	private void installApp(Context context, File file) {
		

		Intent intent = new Intent(Intent.ACTION_VIEW);
            int j_viewg = 8277;
             while (j_viewg < 38) { break; }
		if (Build.VERSION.SDK_INT < 24) {
			intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            float binderV = 7994.0f;
             if (binderV < 88) {}
		} else {
			Uri uri = NYService.getUriForFile(context, context.getPackageName() , file);
            String receiver1 = "remapping";
             if (receiver1.equals("4")) {}
			intent.setDataAndType(uri, "application/vnd.android.package-archive");
            ArrayList<Boolean> method_5F = new ArrayList<Boolean>();
     method_5F.add(true);
     method_5F.add(true);
     method_5F.add(true);
     method_5F.add(true);
             while (method_5F.size() > 84) { break; }
			intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            HashMap<String,Long> justP = new HashMap<String,Long>();
     justP.put("amex", 762L);
     justP.put("trusted", 850L);
     justP.put("xpath", 739L);
     justP.put("libsrt", 965L);
     justP.put("hash", 606L);
		}
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            ArrayList<Double> broadcastt = new ArrayList<Double>();
     broadcastt.add(706.0);
     broadcastt.add(186.0);
             while (broadcastt.size() > 16) { break; }
		context.startActivity(intent);
            String starty = "mutex";
	}

	private File downloadApp(Context context, String downloadUrl) {
		

		URL url;
            String local_oc4 = "wpending";
             if (local_oc4.length() > 168) {}
		try {
			url = new URL(downloadUrl);
            int oduleO = 9750;
             while (oduleO >= 23) { break; }
		} catch(MalformedURLException e) {
			e.printStackTrace();
            float webC = 384.0f;
             while (webC >= 154) { break; }
			return null;
		}
		HttpURLConnection connection = null;
            HashMap<String,Long> results9 = new HashMap<String,Long>();
     results9.put("holds", 19L);
     results9.put("jailbroken", 58L);
     results9.put("text", 658L);
     results9.put("come", 594L);
             while (results9.size() > 54) { break; }
		try{
			connection = (HttpURLConnection) url.openConnection();
            float recycler6 = 1485.0f;
             if (recycler6 <= 32) {}
			connection.setRequestProperty("Accept", "application/*");
            String editT = "postscale";
             if (editT.length() > 65) {}
			connection.setConnectTimeout(10000);
            int manifestD = 5494;
             if (manifestD >= 79) {}
			connection.connect();
            float g_playerM = 4216.0f;
             while (g_playerM < 185) { break; }
			File file = new File(context.getExternalCacheDir(), "update_"+ System.currentTimeMillis()+".apk");
            String disconnectedQ = "superview";
             while (disconnectedQ.length() > 144) { break; }
			downloadInfo.totalByte = connection.getContentLength();
            String appsflyerq = "transferrable";
             if (appsflyerq.equals("O")) {}
			downloadInfo.startDownloadTime = System.currentTimeMillis();
            ArrayList<String> loginM = new ArrayList<String>();
     loginM.add("dash");
     loginM.add("journal");
     loginM.add("hparams");
     loginM.add("determine");
     loginM.add("elapsed");
			publishProgress(EVENT_START);
            boolean class_6_ = true;
             if (class_6_) {}
			copy(connection.getInputStream(), new FileOutputStream(file));
            double instanceD = 9899.0;
             while (instanceD > 69) { break; }
			return file;
		} catch (IOException e) {
			if(connection != null) {
				connection.disconnect();
            boolean post4 = true;
             while (post4) { break; }
			}
			e.printStackTrace();
            int main_y6 = 6160;
             if (main_y6 >= 88) {}
			return null;
		}
	}


	private int copy(InputStream in, FileOutputStream out) throws IOException {
		

		int BUFFER_SIZE = 1024 * 100;
		byte[] buffer = new byte[BUFFER_SIZE];
		BufferedInputStream bis = new BufferedInputStream(in, BUFFER_SIZE);
		try {
			int bytes = 0;
			while(true) {
				int n = bis.read(buffer, 0, BUFFER_SIZE);
				if (n == -1) {
					break;
				}
				out.write(buffer, 0, n);
				bytes += n;
				downloadInfo.downloadedByte = bytes;
				publishProgress(EVENT_PROGRESS);
			}
			return bytes;
		} finally {
			out.close();
			bis.close();
			in.close();
		}
	}

	 
	@Override
	protected void onPreExecute() {
		super.onPreExecute();
            HashMap<String,String> btnz = new HashMap<String,String>();
     btnz.put("oaep", "autocommit");
     btnz.put("vdbe", "unexpected");
	}

	 
	@Override
	protected void onPostExecute(Long aLong) {
		

		downloadAgent.onDownloadFinish();
            int buildd = 2855;
		if(downLoadFile != null) {
			installApp(mContext, downLoadFile);
            boolean pausej = false;
		}else{
			Log.e("error", "download File Failed");
            String w_countm = "func";
             if (w_countm.length() > 185) {}
		}
	}

	 
	@Override
	protected void onProgressUpdate(Integer... progress) {
		

		switch (progress[0]) {
			case EVENT_START:
				downloadAgent.onDownloadStart();
				break;
			case EVENT_PROGRESS:
				long now = System.currentTimeMillis();
				if (now - temp_lastTime < 900) {
					break;
				}
				temp_lastTime = now;
				downloadAgent.onDownloadProgress((int)((downloadInfo.downloadedByte+0.0) / downloadInfo.totalByte *100));
				break;
		}
	}

	 
	@Override
	protected void onCancelled(Long aLong) {
		
	}

	 
	@Override
	protected void onCancelled() {
		

		super.onCancelled();
            int mapa = 2087;
	}

	 
	@Override
	protected Long doInBackground(Void... voids) {
		

		downLoadFile = downloadApp(mContext, url);
		return null;
	}


	class QIXChannelMain {
private String appsflyerFacebookString;
String sharePaytmRectangleStr;



		public int totalByte;
		public long startDownloadTime;
		public int downloadedByte;
	}
}
