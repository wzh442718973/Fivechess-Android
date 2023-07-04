package com.lucking.shine.tiamshow.game;

import java.util.List;

public class HumanPlayer extends BasePlayer {

    @Override
    public Point run(List<Point> enemyPoints, Point p) {
        getMyPoints().add(p);
        allFreePoints.remove(p);

        return p;
    }
}