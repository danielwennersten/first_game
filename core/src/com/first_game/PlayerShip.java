package com.first_game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Intersector;

public class PlayerShip extends MyGameObject{
    PlayerShip (float startX, float startY){
        this.x = startX;
        this.y = startY;
        this.hitBox = new Polygon(new float[]{0f, 31f, 32f, 51f, 63f, 31f, 38f, 17f, 24f, 17f});
        this.hitBox.setOrigin(x, y);
        this.speed = 300;
        this.sprite = new Texture("ship.png");
        this.intersector = new Intersector();
    }

    @Override
    void behavior() {
        float translate = Gdx.graphics.getDeltaTime() * this.speed;
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            if (x < 575) {
                x = x + translate;
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            if (x > 0) {
                x = x - translate;
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            if (y < 415) {
                y += translate;
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            if (y > 0) {
                y -= translate;
            }
        }
    }

    @Override
    void render() {
        behavior();
        TestGame.batch.draw(sprite,x,y);
    }

    @Override
    void whenCollides() {

    }
}
