package com.androidtest.project1;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

public class GfxUtils {

    public static Vector2 getPosition() {
        float x = Gdx.input.getX();
        float y = Gdx.graphics.getHeight() - Gdx.input.getY();
        return new Vector2(x,y);
    }

    public static Vector2 getPosition(int width, int height){
        float x = Gdx.input.getX();
        float y = Gdx.graphics.getHeight() - Gdx.input.getY();
        x -= width/2;
//        x = (x<0)?0:x;
//        x = (x>Gdx.graphics.getWidth()-width)?Gdx.graphics.getWidth()-width:x;
        y -= height/2;
//        x = (y<0)?0:y;
//        x = (y>Gdx.graphics.getHeight()-height)?Gdx.graphics.getHeight()-height:y;
        return new Vector2(x,y);
    }
}
