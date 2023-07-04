package com.lucking.shine.tiamshow;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.lucking.shine.tiamshow.game.BaseComputerAi;
import com.lucking.shine.tiamshow.game.ChessBoard;
import com.lucking.shine.tiamshow.game.HumanPlayer;
import com.lucking.shine.tiamshow.game.IChessboard;
import com.lucking.shine.tiamshow.game.IPlayer;
import com.lucking.shine.tiamshow.game.Point;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class ChessView extends View {

    public interface CallBack {
        void onPlayer(boolean black);

        void onStart(boolean black);

        void onEnd(int statue);
    }

    private CallBack callBack;

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
        callBack.onStart(isBlack);
    }

    private int mPanelWidth;
    private static int MAX_LINE = 15;
    private float mLineHeight;

    private Paint paint = new Paint();

    //棋子图片
    private Bitmap whiteChess;
    private Bitmap blackChess;

    private float pieceLineHeight = 0.75f;

    private boolean isBlack = true; //玩家是否为黑棋
    private boolean isWin = false;//是否已获胜


    private IPlayer humanPlayer; //玩家
    private IPlayer aiPlayer; //电脑
    private IChessboard chessboard = new ChessBoard(MAX_LINE);//棋盘

    Drawable select = null;


    public ChessView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setKeepScreenOn(true);//设置屏幕常亮
        //setBackgroundColor(0x44ff0000);

        Resources resources = getResources();
        blackChess = BitmapFactory.decodeResource(resources, R.drawable.stone_b1);
        whiteChess = BitmapFactory.decodeResource(resources, R.drawable.stone_w2);

        select = resources.getDrawable(R.drawable.baseline_point_24);
        initPaint();
        initGame();
    }

    //音效
    private SoundPool soundWin;
    private SoundPool soundDefeat;
    private SoundPool soundChess;

    private void initGame() {
        humanPlayer = new HumanPlayer();
        humanPlayer.setChessboard(chessboard);
        aiPlayer = new BaseComputerAi();
        aiPlayer.setChessboard(chessboard);
        humanPlayer.clear();
        aiPlayer.clear();

        soundWin = new SoundPool(1, AudioManager.STREAM_SYSTEM, 0);
        soundDefeat = new SoundPool(1, AudioManager.STREAM_SYSTEM, 0);
        soundChess = new SoundPool(1, AudioManager.STREAM_SYSTEM, 0);
        soundWin.load(getContext(), R.raw.win, 1);
        soundDefeat.load(getContext(), R.raw.defeat, 1);
        soundChess.load(getContext(), R.raw.chess, 1);
    }

    private void initPaint() {
        paint.setColor(0x88000000);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthModel = MeasureSpec.getMode(widthMeasureSpec);

        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightModel = MeasureSpec.getMode(heightMeasureSpec);

        int size = Math.min(widthSize, heightSize);
//        if (widthModel == MeasureSpec.UNSPECIFIED) {
//            size = heightSize;
//        } else if (heightModel == MeasureSpec.UNSPECIFIED) {
//            size = widthSize;
//        } else {
//            size = Math.min(widthSize, heightSize);
//        }
        setMeasuredDimension(size, size);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mPanelWidth = w;
        mLineHeight = mPanelWidth / MAX_LINE;

        int pieceWidth = (int) (mLineHeight * pieceLineHeight);

        whiteChess = Bitmap.createScaledBitmap(whiteChess, pieceWidth, pieceWidth, false);
        blackChess = Bitmap.createScaledBitmap(blackChess, pieceWidth, pieceWidth, false);

        if (select != null) {
            select.setBounds(0, 0, pieceWidth + 3, pieceWidth + 3);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        drawChessBoard(canvas);
        drawPieces(canvas);
    }

    private void drawPieces(Canvas canvas) {
        if (lastPoint != null && select != null) {
            Log.e("wzh", "point: " + lastPoint);

            float x = (lastPoint.x + (1 - pieceLineHeight) / 2) * mLineHeight;
            float y = (lastPoint.y + (1 - pieceLineHeight) / 2) * mLineHeight;

            canvas.save();
            canvas.translate(x, y);
            select.draw(canvas);
            canvas.restore();
        }

        for (Point point : humanPlayer.getMyPoints()) {
            canvas.drawBitmap(isBlack ? blackChess : whiteChess, (point.x + (1 - pieceLineHeight) / 2) * mLineHeight, (point.y + (1 - pieceLineHeight) / 2) * mLineHeight, null);
        }
        for (Point point : aiPlayer.getMyPoints()) {
            canvas.drawBitmap(!isBlack ? blackChess : whiteChess, (point.x + (1 - pieceLineHeight) / 2) * mLineHeight, (point.y + (1 - pieceLineHeight) / 2) * mLineHeight, null);
        }
    }

    private void drawChessBoard(Canvas canvas) {
        int w = mPanelWidth;
        float lineHeight = mLineHeight;

        for (int i = 0; i < MAX_LINE; i++) {
            float startX = lineHeight / 2;
            float endX = w - lineHeight / 2;

            float y = (float) ((0.5 + i) * lineHeight);
            canvas.drawLine(startX, y, endX, y, paint);
            canvas.drawLine(y, startX, y, endX, paint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = event.getAction();
        if (action == MotionEvent.ACTION_UP) {

            int x = (int) (event.getX() / mLineHeight);
            int y = (int) (event.getY() / mLineHeight);

            if (x >= 0 && x < MAX_LINE && y >= 0 && y < MAX_LINE) {
                onPoint(x, y);
            }
            return true;
        } else if (action == MotionEvent.ACTION_DOWN) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    private Point lastPoint = null;

    private void onPoint(int x, int y) {
        if (isWin) {
            return;
        }
        Point point = new Point(x, y);
        if (chessboard.getFreePoints().contains(point)) {
            lastPoint = humanPlayer.run(aiPlayer.getMyPoints(), point);
            invalidate();
            soundChess.play(1, 1, 1, 0, 0, 1);
            checkWin(true);
            if (!isWin) {
                lastPoint = aiPlayer.run(humanPlayer.getMyPoints(), null);
                invalidate();
                checkWin(false);
            }
        }
    }


    private void checkWin(boolean black) {
        if (black && humanPlayer.hasWin()) {
            callBack.onEnd(1);
            isWin = true;
            soundWin.play(1, 1, 1, 0, 0, 1);
            alert(getContext().getString(R.string.tip_you_won));
        }
        if (!black && aiPlayer.hasWin()) {
            callBack.onEnd(-1);
            isWin = true;
            soundDefeat.play(1, 1, 1, 0, 0, 1);
            alert(getContext().getString(R.string.tip_you_lost));
        }
        if (chessboard.getFreePoints().isEmpty()) {
            isWin = true;
            callBack.onEnd(0);
            alert(getContext().getString(R.string.tip_you_draw));
        }
    }


    private void alert(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(R.string.app_name);
        builder.setMessage(msg);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
//        builder.setNegativeButton("重新开局", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                isWin = false;
//                dialogInterface.dismiss();
//                clear();
//            }
//        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public synchronized void startBlack() {
        isBlack = true;
        clear();

        callBack.onStart(true);
    }

    public synchronized void startWhite() {
        isBlack = true;
        clear();
        callBack.onStart(false);

        Point point = new Point(MAX_LINE / 2, MAX_LINE / 2);
        lastPoint = point;
        aiPlayer.getMyPoints().add(point);
        chessboard.getFreePoints().remove(point);
        invalidate();
    }

    private void clear() {
        isWin = false;
        lastPoint = null;
        chessboard.clear();
        aiPlayer.clear();
        humanPlayer.clear();
        //我方是白棋，电脑第一个棋子一定下在正中心
        if (!isBlack) {
            Point point = new Point(MAX_LINE / 2, MAX_LINE / 2);
            lastPoint = point;
            aiPlayer.getMyPoints().add(point);
            chessboard.getFreePoints().remove(point);
        }
        invalidate();
    }

    public synchronized void back() {
        //悔棋
        if (!humanPlayer.getMyPoints().isEmpty() && !aiPlayer.getMyPoints().isEmpty()) {
            LinkedList<Point> list1 = (LinkedList<Point>) humanPlayer.getMyPoints();
            LinkedList<Point> list2 = (LinkedList<Point>) aiPlayer.getMyPoints();
            Point p1 = list1.removeLast();
            Point p2 = list2.removeLast();
            chessboard.getFreePoints().add(p1);
            chessboard.getFreePoints().add(p2);
            isWin = false;
            invalidate();
        }
    }

    private static final String instance = "INSTANCE";
    private static final String win = "ISWIN";
    private static final String black = "ISBLACK";
    private static final String human = "HUMAN";
    private static final String ai = "AI";

    //view的存储与恢复

    @Override
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        Log.d("ChessView", "保存棋局");
        bundle.putParcelable(instance, super.onSaveInstanceState());
        bundle.putBoolean(win, isWin);
        bundle.putBoolean(black, isBlack);
        bundle.putSerializable(human, (Serializable) humanPlayer.getMyPoints());
        bundle.putSerializable(ai, (Serializable) aiPlayer.getMyPoints());
        return bundle;
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof Bundle) {
            Log.d("ChessView", "加载棋局");
            Bundle bundle = (Bundle) state;
            isWin = bundle.getBoolean(win);
            isBlack = bundle.getBoolean(black);
            chessboard = new ChessBoard(MAX_LINE);
            humanPlayer = new HumanPlayer();
            humanPlayer.setChessboard(chessboard);
            aiPlayer = new BaseComputerAi();
            aiPlayer.setChessboard(chessboard);
            List<Point> humanPoints = (List<Point>) bundle.getSerializable(human);
            List<Point> aiPoints = (List<Point>) bundle.getSerializable(ai);
            humanPlayer.getMyPoints().addAll(humanPoints);
            aiPlayer.getMyPoints().addAll(aiPoints);
            for (Point point : humanPoints) {
                chessboard.getFreePoints().remove(point);
            }
            for (Point point : aiPoints) {
                chessboard.getFreePoints().remove(point);
            }
            super.onRestoreInstanceState(bundle.getParcelable(instance));
            return;
        }
        super.onRestoreInstanceState(state);
    }
}
