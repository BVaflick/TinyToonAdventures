package com.benvaflick.tinytoonadventures.character;


import com.badlogic.gdx.math.Rectangle;

abstract class Character {

    private int x;
    private int y;
    private int width;
    private int height;
    private int speed;
    private Rectangle primaryRectangle;

    abstract void jump();
    abstract void doSkill();

}
