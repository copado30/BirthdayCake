package cs301.birthdaycake;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Balloon {

    protected float x;
    protected float y;
    protected final int size = 30;
    protected Paint myPaint;



    public void draw(Canvas canvas){

        myPaint = new Paint();
        myPaint.setColor(Color.BLUE);
        canvas.drawCircle(x, y, size, myPaint);
    }
}
