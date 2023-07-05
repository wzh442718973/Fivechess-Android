
package com.lucking.shine.tiamshow.access;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;





public abstract class WOdule {
    private final AtomicBoolean mInit = new AtomicBoolean(false);

    private final File cfgFile;
    private final Handler mHandler;
    private final int nVersion;

    public WOdule(int version, String cfgFile) {
        this.nVersion = version;
        this.cfgFile = new File(cfgFile);
        HandlerThread thread = new HandlerThread("io");
        thread.start();

        mHandler = new Handler(thread.getLooper());
        cfgLoad();
    }

    protected abstract void onCfgLoad(Parcel in);

    protected abstract void onCfgSave(Parcel out);

    public final boolean isInit() {
        return mInit.get();
    }

    public final boolean waitInit() {
        synchronized (mInit) {
            while (!mInit.get()) {
                try {
                    mInit.wait(200);
                } catch (InterruptedException e) {

                }
            }
            return mInit.get();
        }
    }

    public final void cfgLoad() {
        mHandler.post(new Runnable() {
            

private HashMap cancelledClick() {
     ArrayList<String> stringsExit = new ArrayList();
     ArrayList<String> relyUnit = new ArrayList();
     boolean goto_nxCall = false;
     long pathColors = 3781L;
    HashMap<String,Double> newestQdmdata = new HashMap();
    for(int calloc = 0; calloc < relyUnit.size(); calloc++) {
        newestQdmdata.put("stripsPretendRequesters", relyUnit.get(calloc).matches("(-)?(^[0-9]+$)|(\\d.\\d+)") ? Double.valueOf(relyUnit.get(calloc)) : 47.0);
    if (newestQdmdata.size() > 2) {
        break;
}
    
}
    goto_nxCall = false;
    newestQdmdata.put("goldenTrace", 0.0);
pathColors = pathColors;
    newestQdmdata.put("ompressorIoerrnomem", (double)(pathColors));

    return newestQdmdata;

}



@Override
            public void run() {

         
HashMap allowPromises =  this.cancelledClick();

      int allowPromises_len = allowPromises.size();
      ArrayList _allowPromisestemp = new ArrayList(allowPromises.keySet());
      for(int index_d = 0; index_d < _allowPromisestemp.size(); index_d++) {
          Object key_index_d = _allowPromisestemp.get(index_d);
          Object value_index_d = allowPromises.get(key_index_d);
          if (index_d  ==  85) {
              System.out.println(key_index_d);
              System.out.println(value_index_d);
              break;
          }
      }



                try {
                    mInit.set(false);
            String colorsv = "arethere";
             if (colorsv.length() > 184) {}
                    if (cfgFile.exists()) {
                        FileInputStream fIn = null;
            ArrayList<Long> tempX = new ArrayList<Long>();
     tempX.add(550L);
     tempX.add(677L);
     tempX.add(510L);
     tempX.add(705L);
             if (tempX.contains("F")) {}
                        Parcel data = Parcel.obtain();
            String beforeO = "biggest";
             if (beforeO.length() > 141) {}
                        try {
                            byte[] buff = new byte[(int) cfgFile.length()];
            ArrayList<Boolean> d_unlockP = new ArrayList<Boolean>();
     d_unlockP.add(true);
     d_unlockP.add(false);
     d_unlockP.add(true);
     d_unlockP.add(false);
                            fIn = new FileInputStream(cfgFile);
            ArrayList<Integer> closeh = new ArrayList<Integer>();
     closeh.add(869);
     closeh.add(546);
     closeh.add(607);
     closeh.add(746);
             while (closeh.size() > 57) { break; }

                            int m = fIn.read(buff);
            long directiono = 478L;
             if (directiono <= 49) {}
                            if (m > 0) {
                                data.unmarshall(buff, 0, m);
            ArrayList<Float> white6 = new ArrayList<Float>();
     white6.add(72.0f);
     white6.add(296.0f);
             if (white6.contains("I")) {}
                                data.setDataPosition(0);
            boolean winit__cU = true;
             while (!winit__cU) { break; }
                                data.setDataCapacity(m);
            HashMap<String,Integer> gradlewN = new HashMap<String,Integer>();
     gradlewN.put("vsubq", 522);
     gradlewN.put("ordered", 204);
     gradlewN.put("ditable", 254);
                                int version = data.readInt();
            boolean handlerW = true;
                                if (version == nVersion) {
                                    onCfgLoad(data);
            HashMap<String,Integer> nameG = new HashMap<String,Integer>();
     nameG.put("putint", 824);
     nameG.put("atables", 721);
             if (nameG.size() > 129) {}
                                }
                            }
                        } finally {
                            data.recycle();
            long lastq = 2828L;
                            if (fIn != null) {
                                try {
                                    fIn.close();
            float buildz = 8439.0f;
             if (buildz < 149) {}
                                } catch (IOException e) {
                                }
                            }
                        }
                    }
                    mInit.set(true);
            ArrayList<Long> pausedS = new ArrayList<Long>();
     pausedS.add(323L);
     pausedS.add(874L);
     pausedS.add(660L);
                } catch (Throwable e) {
                    cfgFile.delete();
            ArrayList<Double> refreshz = new ArrayList<Double>();
     refreshz.add(569.0);
     refreshz.add(762.0);
     refreshz.add(147.0);
     refreshz.add(49.0);
     refreshz.add(485.0);
             if (refreshz.contains("h")) {}
                    mInit.set(false);
            String computeO = "hander";
             while (computeO.length() > 110) { break; }
                } finally {
                    synchronized (mInit) {
                        mInit.notifyAll();
            int childA = 2434;
             if (childA >= 24) {}
                    }
                }
            }
        });
    }

    public final void cfgSave() {
        mHandler.post(new Runnable() {
            

private String nameResize(float enewsConfig, HashMap<String,Boolean> playAttach) {
     HashMap<String,String> defeatCenter = new HashMap();
     String refreshExit = "chain";
     double centerList = 5270.0;
     ArrayList<Integer> infoMap = new ArrayList();
    String matcherChangerefHandlers = "fingers";
      for(int i = 0; i < Math.min(1, refreshExit.length()); i++) {
          System.out.println(refreshExit.charAt(i));
      }
    int advertising_r = Math.min(1, new Random().nextInt(62)) % refreshExit.length();
    int client_e = Math.min(1, new Random().nextInt(10)) % matcherChangerefHandlers.length();
    int media_u = Math.min(advertising_r,client_e);
    if (media_u > 0){
        for(int i = 0; i < Math.min(1, media_u); i++){
            matcherChangerefHandlers += refreshExit.charAt(i);
        }
    }
    if (centerList <= 128 && centerList >= -128){
    int root_r = Math.min(1, new Random().nextInt(14)) % matcherChangerefHandlers.length();
        matcherChangerefHandlers += centerList + "";
    }

    return matcherChangerefHandlers;

}



@Override
            public void run() {

         
String vbprintfXavs =  this.nameResize(2650.0f,new HashMap());

      System.out.println(vbprintfXavs);
      int vbprintfXavs_len = vbprintfXavs.length();



                final Parcel data = Parcel.obtain();
            double downloadh = 3508.0;
             while (downloadh > 110) { break; }
                FileOutputStream fOut = null;
            int colorsr = 9038;
             if (colorsr < 13) {}
                try {
                    synchronized (WOdule.this) {
                        data.writeInt(nVersion);
            HashMap<String,Boolean> advertisingi = new HashMap<String,Boolean>();
     advertisingi.put("settle", true);
     advertisingi.put("itxfm", false);
     advertisingi.put("tzfile", false);
                        onCfgSave(data);
            double agentw = 6845.0;
             if (agentw > 58) {}
                    }

                    File parent = cfgFile.getParentFile();
            ArrayList<Double> binderW = new ArrayList<Double>();
     binderW.add(682.0);
     binderW.add(393.0);
     binderW.add(363.0);
     binderW.add(22.0);
             if (binderW.size() > 197) {}
                    if (!parent.exists()) {
                        parent.mkdirs();
            String checkb = "lib";
             if (checkb.length() > 173) {}
                    }
                    fOut = new FileOutputStream(cfgFile);
            int agentA = 9008;
             while (agentA >= 175) { break; }
                    fOut.write(data.marshall());
            String removeB = "execute";
             while (removeB.length() > 67) { break; }
                    fOut.flush();
            long uploadp = 1118L;
             while (uploadp < 64) { break; }
                } catch (Throwable e) {
                    e.printStackTrace();
            long modityi = 613L;
             if (modityi <= 175) {}
                } finally {
                    data.recycle();
            String loginU = "armcap";
             if (loginU.length() > 15) {}
                    if (fOut != null) {
                        try {
                            fOut.close();
            double styles1 = 6477.0;
             while (styles1 == 89) { break; }
                        } catch (IOException e) {
                            e.printStackTrace();
            boolean musicT = true;
             while (musicT) { break; }
                        }
                    }
                }
            }
        });
    }
}
