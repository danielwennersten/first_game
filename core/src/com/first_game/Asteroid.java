package com.test;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Polygon;

public class Asteroid extends MyGameObject {

    Asteroid (float startX, float startY){
        this.x = startX;
        this.y = startY;
        this.hitBox = new Polygon(new float[]{0f, 0f, 32f, 51f, 63f, 31f, 38f, 17f, 24f, 17f});
        this.hitBox.setOrigin(x, y);
        this.speed = 300;
        this.sprite = new Texture("ship.png");
        this.intersector = new Intersector();
    }

    @Override
    void behavior() {

    }

    @Override
    void render() {

    }

    @Override
    void whenCollides() {

    }
}
