package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class pausa extends InputListener {
	Pausa stop;
	pausa (Pausa p) {
		super ();
		stop = p;
	}

static boolean pausar = false;

	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)	{
	    if(pausa.pausar==true){
	    	pausa.pausar=false;
	    }
	    else
	    {
	    	pausa.pausar=true;
	    	System.out.println("Pausa Presionada");
	    }
		
		return true;		
		}
}
