package com.androidtest.project1;

import static com.androidtest.project1.GfxUtils.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Explosion {
    private NewAnimation animation;
    Music music;
    private Vector2 position;

    public Explosion(String texture, Animation.PlayMode mode, int columns, int lines, int fps, String mName){
        animation = new NewAnimation(texture, mode, columns, lines, fps);
        music = Gdx.audio.newMusic(Gdx.files.internal(mName));
        music.setVolume(0.025f);
        music.play();
        position = getPosition(animation.getRegion().getRegionWidth(), animation.getRegion().getRegionHeight());
    }

    public void setTime(float dTime) { animation.setTime(dTime);}
    public Vector2 getPos() {return position;}
    public TextureRegion getRegion() {return animation.getRegion();}
    public boolean isFinished(){return animation.isFinished();}
    public void dispose(){
        animation.dispose();
        music.dispose();
    }
}
