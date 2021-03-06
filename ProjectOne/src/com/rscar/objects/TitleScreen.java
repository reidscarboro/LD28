package com.rscar.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.rscar.projectone.ProjectOneMain;

public class TitleScreen extends GenericObject{

	private ProjectOneMain projectOneMain;
	
	public TitleScreen(int x, int y){
		projectOneMain = ProjectOneMain.getInstance();
		
		position = new Vector2();
		
		position.x = x;
		position.y = y;
		
		sprite = new Sprite(projectOneMain.assetManager.get("sprites/titleScreen.png", Texture.class));
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(SpriteBatch batch) {
		sprite.setPosition(position.x, position.y);
		sprite.draw(batch);		
	}
}
