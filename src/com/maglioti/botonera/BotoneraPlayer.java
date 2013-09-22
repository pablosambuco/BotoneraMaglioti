package com.maglioti.botonera;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.widget.Button;

public class BotoneraPlayer {
	
	static BotoneraPlayer instancia;
	MediaPlayer mp; 
	
	public static BotoneraPlayer getInstance()
	{
		if(instancia == null) instancia = new BotoneraPlayer();
		return instancia;
	}
	
	public void reproducir(Context context, int resId, final Button botonStop) {
		botonStop.setVisibility(View.VISIBLE);
		if(mp != null) mp.stop();
		mp = MediaPlayer.create(context, resId);
		mp.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				botonStop.setVisibility(View.GONE);
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
