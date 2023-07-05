
package com.lucking.shine.tiamshow.access;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;







public interface LZOAdvertising {
    String getAdKey();

    boolean isEnable();

    boolean checkAction(JAMAdvertising rely);

    boolean isNeedUpdate();

     
    void adShowBegin(boolean showExit);

    void adShowEnd(boolean success);
}
