package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MiInputMala extends InputListener{
	PelotitaMala t;
	MiInputMala(PelotitaMala param)
	{
		super();
		t = param;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		System.exit(0);
		System.out.print(Math.random()*1000%10);
		return true;
	}

}
