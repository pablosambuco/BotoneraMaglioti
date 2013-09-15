package com.example.botoneramaglioti;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private MediaPlayer mp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button boton01 = (Button) this.findViewById(R.id.boton01);
		Button boton02 = (Button) this.findViewById(R.id.boton02);
		Button boton03 = (Button) this.findViewById(R.id.boton03);
		Button boton04 = (Button) this.findViewById(R.id.boton04);
		Button boton05 = (Button) this.findViewById(R.id.boton05);
		Button boton06 = (Button) this.findViewById(R.id.boton06);
		Button boton07 = (Button) this.findViewById(R.id.boton07);
		Button boton08 = (Button) this.findViewById(R.id.boton08);
		Button boton09 = (Button) this.findViewById(R.id.boton09);
		Button boton10 = (Button) this.findViewById(R.id.boton10);
		Button boton11 = (Button) this.findViewById(R.id.boton11);
		Button boton12 = (Button) this.findViewById(R.id.boton12);
		Button boton13 = (Button) this.findViewById(R.id.boton13);
		Button boton14 = (Button) this.findViewById(R.id.boton14);
		Button boton15 = (Button) this.findViewById(R.id.boton15);
		Button boton16 = (Button) this.findViewById(R.id.boton16);
		Button boton17 = (Button) this.findViewById(R.id.boton17);
		Button boton18 = (Button) this.findViewById(R.id.boton18);
		Button boton19 = (Button) this.findViewById(R.id.boton19);
		Button boton20 = (Button) this.findViewById(R.id.boton20);
		Button boton21 = (Button) this.findViewById(R.id.boton21);
		Button boton22 = (Button) this.findViewById(R.id.boton22);
		Button boton23 = (Button) this.findViewById(R.id.boton23);
		Button boton24 = (Button) this.findViewById(R.id.boton24);
		Button boton25 = (Button) this.findViewById(R.id.boton25);
		Button boton26 = (Button) this.findViewById(R.id.boton26);
		Button boton27 = (Button) this.findViewById(R.id.boton27);

		boton01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__99__botonera);
				mp.start();
			}
		});

		boton02.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__01__dieguez);
				mp.start();
			}
		});

		boton03.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__02__san_valentin);
				mp.start();
			}
		});

		boton04.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__03__valerio_interes);
				mp.start();
			}
		});

		boton05.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__04__aplicaciones);
				mp.start();
			}
		});

		boton06.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__05__mulo);
				mp.start();
			}
		});
		
		boton07.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__06__seis_partidos);
				mp.start();
			}
		});
		
		boton08.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__07__valerio_pes);
				mp.start();
			}
		});
		
		boton09.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__08__mulo_gato);
				mp.start();
			}
		});

		boton10.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__09__gato_mulo);
				mp.start();
			}
		});
		
		boton11.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__10__dormir);
				mp.start();
			}
		});
		
		boton12.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bardero__11__que_pasa_que);
				mp.start();
			}
		});

		boton13.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bostero__01__no_somo);
				mp.start();
			}
		});

		boton14.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bostero__02__no_somo_remix);
				mp.start();
			}
		});

		boton15.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_bostero__03__carpintero);
				mp.start();
			}
		});

		boton16.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_ebrio__01__deudas);
				mp.start();
			}
		});
		
		boton17.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_fiesta__01__ruido);
				mp.start();
			}
		});

		boton18.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_madrid__01__intratable);
				mp.start();
			}
		});

		boton19.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_madrid__02__gano);
				mp.start();
			}
		});

		boton20.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_misc__01__luis);
				mp.start();
			}
		});
		
		boton21.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_misc__02__la_flecha);
				mp.start();
			}
		});

		boton22.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_misc__03__lalalala);
				mp.start();
			}
		});

		boton23.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_music__01__no_culpes);
				mp.start();
			}
		});

		boton24.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_music__02__ya_tu_sabes);
				mp.start();
			}
		});

		boton25.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_music__03__adelante);
				mp.start();
			}
		});

		boton26.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_music__04__como_dice);
				mp.start();
			}
		});

		boton27.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(mp != null) mp.stop();
				mp = MediaPlayer.create(MainActivity.this,R.raw.gaglioti_rata__01__cama);
				mp.start();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onStop() {
	    super.onStop();
	    // DEALLOCATE ALL MEMORY
	    if (mp != null) {
	        if (mp.isPlaying()) {
	            mp.stop();
	        }
	        mp.release();
	        mp = null;
	    }
	}

}
