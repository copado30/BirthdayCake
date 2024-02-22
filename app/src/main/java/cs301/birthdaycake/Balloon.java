package cs301.birthdaycake;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Balloon {

    protected float x;
    protected float y;
    protected final float width = 60;
    protected final float height = 80;
    protected final int size = 30;
    protected Paint paintBalloon;

    public Balloon(){
        paintBalloon = new Paint();
        paintBalloon.setColor(Color.BLUE);
    }

    public void draw(Canvas canvas){
        canvas.drawOval(x - width/2, y - height, x + width/2, y, paintBalloon);
        canvas.drawLine(x, y, x, y + 200, paintBalloon);

    }

    public void setLocation(float x, float y){
        this.x = x;
        this.y = y;
    }
}