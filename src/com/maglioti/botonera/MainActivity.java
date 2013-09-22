package com.maglioti.botonera;

import com.maglioti.botonera.R.raw;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private LinearLayout contenido;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		contenido = (LinearLayout) findViewById(R.id.parentView);

		Class<raw> raw = R.raw.class;
		List<Field> fields = Arrays.asList(raw.getFields());

		for (Field field : fields) {
			try {
				Botonera.getInstance().agregarBoton(MainActivity.this, contenido, field.getInt(null), field.getName());
				
			} catch (IllegalArgumentException e) {
			} catch (IllegalAccessException e) {
			}

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onStop() {
		super.onStop();
		BotoneraPlayer.getInstance().detener();
	}

}
