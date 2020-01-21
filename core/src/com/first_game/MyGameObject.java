package com.test;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Intersector;

public abstract class MyGameObject {
    Texture sprite;
    float x, y;
    Polygon hitBox;
    float speed;
    Intersector intersector;

    abstract void behavior();

    abstract void render();

    abstract void whenCollides();

    void dispose() {
        this.sprite.dispose();
    }

    void setSpeed(float f) {
        this.speed = f;
    }

    float getSpeed() {
        return this.speed;
    }
}
