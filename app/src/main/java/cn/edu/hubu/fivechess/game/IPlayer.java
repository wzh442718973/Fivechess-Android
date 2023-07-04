package cn.edu.hubu.fivechess.game;

import java.util.List;


public interface IPlayer {
    //下一步棋子，传入对手已经下的棋子集合
    public Point run(List<Point> enemyPoints, Point point);

    public boolean hasWin();

    public void setChessboard(IChessboard chessboard);

    public List<Point> getMyPoints();

    void clear();
}
