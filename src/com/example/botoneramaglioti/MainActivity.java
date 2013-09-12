package com.example.botoneramaglioti;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final MediaPlayer mpBotonera = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__99__botonera);
		final MediaPlayer mpBardero01 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__01__dieguez);
		final MediaPlayer mpBardero02 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__02__san_valentin);
		final MediaPlayer mpBardero03 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__03__valerio_interes);
		final MediaPlayer mpBardero04 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__04__aplicaciones);
		final MediaPlayer mpBardero05 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__05__mulo);
		final MediaPlayer mpBardero06 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__06__seis_partidos);
		final MediaPlayer mpBardero07 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__07__valerio_pes);
		final MediaPlayer mpBardero08 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__08__mulo_gato);
		final MediaPlayer mpBardero09 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__09__gato_mulo);
		final MediaPlayer mpBardero10 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__10__dormir);
		final MediaPlayer mpBardero11 = MediaPlayer.create(this,
				R.raw.gaglioti_bardero__11__que_pasa_que);
		final MediaPlayer mpBostero01 = MediaPlayer.create(this,
				R.raw.gaglioti_bostero__01__no_somo);
		final MediaPlayer mpBostero02 = MediaPlayer.create(this,
				R.raw.gaglioti_bostero__02__no_somo_remix);
		final MediaPlayer mpBostero03 = MediaPlayer.create(this,
				R.raw.gaglioti_bostero__03__carpintero);
		final MediaPlayer mpEbrio01 = MediaPlayer.create(this,
				R.raw.gaglioti_ebrio__01__deudas);
		final MediaPlayer mpFiesta01 = MediaPlayer.create(this,
				R.raw.gaglioti_fiesta__01__ruido);
		final MediaPlayer mpMadrid01 = MediaPlayer.create(this,
				R.raw.gaglioti_madrid__01__intratable);
		final MediaPlayer mpMadrid02 = MediaPlayer.create(this,
				R.raw.gaglioti_madrid__02__gano);
		final MediaPlayer mpMisc01 = MediaPlayer.create(this,
				R.raw.gaglioti_misc__01__luis);
		final MediaPlayer mpMisc02 = MediaPlayer.create(this,
				R.raw.gaglioti_misc__02__la_flecha);
		final MediaPlayer mpMisc03 = MediaPlayer.create(this,
				R.raw.gaglioti_misc__03__lalalala);
		final MediaPlayer mpMusic01 = MediaPlayer.create(this,
				R.raw.gaglioti_music__01__no_culpes);
		final MediaPlayer mpMusic02 = MediaPlayer.create(this,
				R.raw.gaglioti_music__02__ya_tu_sabes);
		final MediaPlayer mpMusic03 = MediaPlayer.create(this,
				R.raw.gaglioti_music__03__adelante);
		final MediaPlayer mpMusic04 = MediaPlayer.create(this,
				R.raw.gaglioti_music__04__como_dice);
		final MediaPlayer mpRata01 = MediaPlayer.create(this,
				R.raw.gaglioti_rata__01__cama);

		Button botonBotonera = (Button) this.findViewById(R.id.BotonBotonera);
		botonBotonera.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBotonera.start();
			}
		});

		Button botonBostero01 = (Button) this.findViewById(R.id.BotonBostero01);
		botonBostero01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBostero01.start();
			}
		});

		Button botonBostero02 = (Button) this.findViewById(R.id.BotonBostero02);
		botonBostero02.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBostero02.start();
			}
		});
		Button botonBostero03 = (Button) this.findViewById(R.id.BotonBostero03);
		botonBostero03.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBostero03.start();
			}
		});

		Button botonBardero01 = (Button) this.findViewById(R.id.BotonBardero01);
		botonBardero01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero01.start();
			}
		});

		Button botonBardero02 = (Button) this.findViewById(R.id.BotonBardero02);
		botonBardero02.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero02.start();
			}
		});

		Button botonBardero03 = (Button) this.findViewById(R.id.BotonBardero03);
		botonBardero03.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero03.start();
			}
		});

		Button botonBardero04 = (Button) this.findViewById(R.id.BotonBardero04);
		botonBardero04.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero04.start();
			}
		});

		Button botonBardero05 = (Button) this.findViewById(R.id.BotonBardero05);
		botonBardero05.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero05.start();
			}
		});

		Button botonBardero06 = (Button) this.findViewById(R.id.BotonBardero06);
		botonBardero06.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero06.start();
			}
		});

		Button botonBardero07 = (Button) this.findViewById(R.id.BotonBardero07);
		botonBardero07.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero07.start();
			}
		});

		Button botonBardero08 = (Button) this.findViewById(R.id.BotonBardero08);
		botonBardero08.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero08.start();
			}
		});

		Button botonBardero09 = (Button) this.findViewById(R.id.BotonBardero09);
		botonBardero09.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero09.start();
			}
		});

		Button botonBardero10 = (Button) this.findViewById(R.id.BotonBardero10);
		botonBardero10.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero10.start();
			}
		});

		Button botonBardero11 = (Button) this.findViewById(R.id.BotonBardero11);
		botonBardero11.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpBardero11.start();
			}
		});

		Button botonEbrio01 = (Button) this.findViewById(R.id.BotonEbrio01);
		botonEbrio01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpEbrio01.start();
			}
		});

		Button botonFiesta01 = (Button) this.findViewById(R.id.BotonFiesta01);
		botonFiesta01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpFiesta01.start();
			}
		});
		Button botonMadrid01 = (Button) this.findViewById(R.id.BotonMadrid01);
		botonMadrid01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMadrid01.start();
			}
		});

		Button botonMadrid02 = (Button) this.findViewById(R.id.BotonMadrid02);
		botonMadrid02.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMadrid02.start();
			}
		});
		Button botonMisc01 = (Button) this.findViewById(R.id.BotonMisc01);
		botonMisc01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMisc01.start();
			}
		});

		Button botonMisc02 = (Button) this.findViewById(R.id.BotonMisc02);
		botonMisc02.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMisc02.start();
			}
		});
		Button botonMisc03 = (Button) this.findViewById(R.id.BotonMisc03);
		botonMisc03.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMisc03.start();
			}
		});

		Button botonMusic01 = (Button) this.findViewById(R.id.BotonMusic01);
		botonMusic01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMusic01.start();
			}
		});

		Button botonMusic02 = (Button) this.findViewById(R.id.BotonMusic02);
		botonMusic02.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMusic02.start();
			}
		});
		Button botonMusic03 = (Button) this.findViewById(R.id.BotonMusic03);
		botonMusic03.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMusic03.start();
			}
		});
		Button botonMusic04 = (Button) this.findViewById(R.id.BotonMusic04);
		botonMusic04.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpMusic04.start();
			}
		});

		Button botonRata01 = (Button) this.findViewById(R.id.BotonRata01);
		botonRata01.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				mpRata01.start();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
