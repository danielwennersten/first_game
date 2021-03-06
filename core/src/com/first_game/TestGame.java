package com.first_game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TestGame extends ApplicationAdapter {

	static SpriteBatch batch;
	PlayerShip myShip;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		myShip = new PlayerShip(0,0);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		myShip.render();
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		myShip.dispose();
	}
}
