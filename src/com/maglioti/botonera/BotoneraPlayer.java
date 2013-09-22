package com.maglioti.botonera;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.widget.Button;

public class BotoneraPlayer {
	
	static BotoneraPlayer instancia;
	MediaPlayer mp;
	Botonera botonera;
	
	public static BotoneraPlayer getInstance()
	{
		if(instancia == null) instancia = new BotoneraPlayer();
		return instancia;
	}
	
	public void reproducir(Context contexto, int resId, final Button botonStop) {
		Botonera.ocultarStop();
		botonStop.setVisibility(View.VISIBLE);
		if(mp != null) mp.stop();
		mp = MediaPlayer.create(contexto, resId);
		mp.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				Botonera.ocultarStop();
			}
		});
		mp.start();
	}

	public void detener() {
	    if (mp != null) {
	        if (mp.isPlaying()) {
	            mp.stop();
	        }
	        mp.release();
	        mp = null;
	    }
	}
}
