package com.maglioti.botonera;

import com.maglioti.botonera.R.raw;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
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
		Collections.sort(fields, new Comparador());
		for (Field field : fields) {
			try {
				inflateBoton(field.getInt(null), field.getName());
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

	public void inflateBoton(final int resId, final String texto) {
		LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		final View rowView = inflater.inflate(R.layout.row, null);
		final Button boton = (Button) rowView.findViewById(R.id.boton);
		final Button botonStop = (Button) rowView.findViewById(R.id.boton_stop);
		
		boton.setText(formatearTexto(texto));

		boton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				BotoneraPlayer.getInstance().reproducir(MainActivity.this,resId,botonStop);
			}
		});
		botonStop.setVisibility(View.GONE);

		botonStop.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				BotoneraPlayer.getInstance().detener();
				botonStop.setVisibility(View.GONE);
				boton.setWidth(2000);
			}
		});

		contenido.addView(rowView, contenido.getChildCount());
	}

	public static String formatearTexto(String string) {
		char[] entrada = string.toCharArray();
		char[] salida = new char[entrada.length + 4];
		boolean letra = false;
		for (int i = 0, j = 0, espacios = 0; i < entrada.length; i++, j++) {
			salida[j]= entrada [i];
			if (!letra && Character.isLetter(entrada[i])) {
				salida[j] = Character.toUpperCase(entrada[i]);
				letra = true;
			} else if (entrada[i] == '_') {
				if (espacios < 2) {
					salida[j++] = ' ';
					salida[j++] = '-';
					espacios++;
				}
				salida[j] = ' ';
				letra = false;
			}
		}
		return String.valueOf(salida);
	}

}
