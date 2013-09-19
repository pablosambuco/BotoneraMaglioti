package com.maglioti.botonera;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@SuppressWarnings("unused")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Boton boton01 = new Boton(this, R.id.boton01,R.raw.gaglioti_bardero__99__botonera);
		Boton boton02 = new Boton(this, R.id.boton02,R.raw.gaglioti_bardero__01__dieguez);
		Boton boton03 = new Boton(this, R.id.boton03,R.raw.gaglioti_bardero__02__san_valentin);
		Boton boton04 = new Boton(this, R.id.boton04,R.raw.gaglioti_bardero__03__valerio_interes);
		Boton boton05 = new Boton(this, R.id.boton05,R.raw.gaglioti_bardero__04__aplicaciones);
		Boton boton06 = new Boton(this, R.id.boton06,R.raw.gaglioti_bardero__05__mulo);
		Boton boton07 = new Boton(this, R.id.boton07,R.raw.gaglioti_bardero__06__seis_partidos);
		Boton boton08 = new Boton(this, R.id.boton08,R.raw.gaglioti_bardero__07__valerio_pes);
		Boton boton09 = new Boton(this, R.id.boton09,R.raw.gaglioti_bardero__08__mulo_gato);
		Boton boton10 = new Boton(this, R.id.boton10,R.raw.gaglioti_bardero__09__gato_mulo);
		Boton boton11 = new Boton(this, R.id.boton11,R.raw.gaglioti_bardero__10__dormir);
		Boton boton12 = new Boton(this, R.id.boton12,R.raw.gaglioti_bardero__11__que_pasa_que);
		Boton boton13 = new Boton(this, R.id.boton13,R.raw.gaglioti_bostero__01__no_somo);
		Boton boton14 = new Boton(this, R.id.boton14,R.raw.gaglioti_bostero__02__no_somo_remix);
		Boton boton15 = new Boton(this, R.id.boton15,R.raw.gaglioti_bostero__03__carpintero);
		Boton boton16 = new Boton(this, R.id.boton16,R.raw.gaglioti_ebrio__01__deudas);
		Boton boton17 = new Boton(this, R.id.boton17,R.raw.gaglioti_fiesta__01__ruido);
		Boton boton18 = new Boton(this, R.id.boton18,R.raw.gaglioti_madrid__01__intratable);
		Boton boton19 = new Boton(this, R.id.boton19,R.raw.gaglioti_madrid__02__gano);
		Boton boton20 = new Boton(this, R.id.boton20,R.raw.gaglioti_misc__01__luis);
		Boton boton21 = new Boton(this, R.id.boton21,R.raw.gaglioti_misc__02__la_flecha);
		Boton boton22 = new Boton(this, R.id.boton22,R.raw.gaglioti_misc__03__lalalala);
		Boton boton23 = new Boton(this, R.id.boton23,R.raw.gaglioti_music__01__no_culpes);
		Boton boton24 = new Boton(this, R.id.boton24,R.raw.gaglioti_music__02__ya_tu_sabes);
		Boton boton25 = new Boton(this, R.id.boton25,R.raw.gaglioti_music__03__adelante);
		Boton boton26 = new Boton(this, R.id.boton26,R.raw.gaglioti_music__04__como_dice);
		Boton boton27 = new Boton(this, R.id.boton27,R.raw.gaglioti_rata__01__cama);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onStop() {
	    super.onStop();
	    BotoneraPlayer.getInstance().stop();
	}

}
