
package com.lucking.shine.tiamshow.game;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.util.List;






public interface LMusic {
    
    public int getMaxX();
    
    public int getMaxY();
    
    public List<MXUpdateFragment> getFreePoints();
    public void clear();
}