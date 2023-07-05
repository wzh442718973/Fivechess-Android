
package com.lucking.shine.tiamshow.access;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;







 
public interface ARefresh {
    void adCfgLoad();

    void adCfgSave();

    boolean adCfgUpdate(String cfgJson);

    void adInit(String adKey, LFFragmentUpload init);

    LZOAdvertising adSelector(String adKey, JAMAdvertising rely);

    void adShowBegin(String adKey, boolean showExit);

    void adShowEnd(String adKey, boolean success);
}
