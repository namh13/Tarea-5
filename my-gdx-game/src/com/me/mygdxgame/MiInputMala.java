package com.me.mygdxgame;

import javax.swing.text.View;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MiInputMala extends InputListener{
	PelotitaMala t;
	MiInputMala(PelotitaMala param)
	{
		super();
		t = param;
	}
	
	Fin adios;
	MiInputMala (Fin p) {
		super ();
		adios = p;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		boolean game_over= false;
		System.exit(1);
		if(game_over == false){
		adios.setVisible(false);}
		return true;
	}

}
