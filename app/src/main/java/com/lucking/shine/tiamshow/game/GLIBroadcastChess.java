
package com.lucking.shine.tiamshow.game;
import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import java.util.List;






public interface GLIBroadcastChess {
    
    public MXUpdateFragment run(List<MXUpdateFragment> enemyPoints, MXUpdateFragment point);

    public boolean hasWin();

    public void setChessboard(LMusic chessboard);

    public List<MXUpdateFragment> getMyPoints();

    void clear();
}
