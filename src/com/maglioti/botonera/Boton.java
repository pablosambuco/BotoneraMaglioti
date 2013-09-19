package com.maglioti.botonera;

import android.view.View;
import android.widget.Button;

public class Boton {

	private Button boton;
	
	public Boton(final MainActivity parent, int boton, final int resId) {
		this.boton = (Button) parent.findViewById(boton);
		this.boton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				BotoneraPlayer.getInstance().play(parent, resId);
			}
		});
		
	}

}
