package com.maglioti.botonera;

import android.content.Context;
import android.media.MediaPlayer;

public class BotoneraPlayer {
	
	static BotoneraPlayer instancia;
	MediaPlayer mp; 
	
	public static BotoneraPlayer getInstance()
	{
		if(instancia == null) instancia = new BotoneraPlayer();
		return instancia;
	}
	
	public void reproducir(Context context, int resId) {
		if(mp != null) mp.stop();
		mp = MediaPlayer.create(context, resId);
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
