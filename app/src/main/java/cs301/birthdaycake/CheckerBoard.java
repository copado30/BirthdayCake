package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class CheckerBoard {
    protected float x; //x-coord
    protected float y; //y-coord
    protected final int size = 20; //box is size 20
    protected Paint myPaint; //how spot is drawn

    public CheckerBoard(float initX, float initY) {
        x = initX;
        y = initY;
    }
}
