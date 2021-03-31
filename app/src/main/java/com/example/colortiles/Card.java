package com.example.colortiles;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;

import androidx.annotation.RequiresApi;


public class Card {

    final Paint p = new Paint();


    public Card(double x, double y, double width, double height, int color) {
        this.color = color;

        this.x = (float) x;
        this.y = (float) y;
        this.width = (float) width;
        this.height = (float) height;
    }

    int color;
    final float x, y, width, height;
//почистила переменные
// --Commented out by Inspection START (31.03.2021 23:14):
////    сделала финальные перменные
//    int nextColor = 0;
//    закомментила ненужные вещи
// --Commented out by Inspection STOP (31.03.2021 23:14)

// --Commented out by Inspection START (31.03.2021 23:14):
//    List<Integer> colors = Arrays.asList(
//            R.color.tileColorR, R.color.tileColorG,
//            R.color.tileColorB);
// --Commented out by Inspection STOP (31.03.2021 23:14)


    public boolean changeColor(float touchX, float touchY) {
        return touchX >= x && touchX <= x + width && touchY >= y && touchY <= y + height;
    }
//упростила цикл
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void draw(Canvas c) {
        //нарисовать карту в виде прямоугольника

        p.setColor(color);
        c.drawRoundRect(x, y, x + width, y + height, 25, 25, p);
    }


}
