package com.maglioti.botonera;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Botonera {

	static Botonera instancia;
	static private ArrayList<Button> botones;
	static private ArrayList<Button> botonesStop;

	public static Botonera getInstance() {
		if (instancia == null) {
			instancia = new Botonera();
			botones = new ArrayList<Button>();
			botonesStop = new ArrayList<Button>();
		}
		return instancia;
	}

	public void agregarBoton(final MainActivity contexto,
			final LinearLayout contenido, final int resId, final String nombre) {
		LayoutInflater inflater = (LayoutInflater) contexto
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		final View rowView = inflater.inflate(R.layout.row, null);

		final Button boton;
		final Button botonStop;

		contenido.addView(rowView, contenido.getChildCount());

		boton = (Button) rowView.findViewById(R.id.boton);
		botonStop = (Button) rowView.findViewById(R.id.boton_stop);

		boton.setText(Auxiliar.formatearTexto(nombre));

		boton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				BotoneraPlayer.getInstance().reproducir((Context) contexto,
						resId, botonStop);
			}
		});
		botonStop.setVisibility(View.GONE);

		botonStop.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				BotoneraPlayer.getInstance().detener();
				botonStop.setVisibility(View.GONE);
			}
		});

		botones.add(boton);
		botonesStop.add(botonStop);

	}

	public static void ocultarStop() {
		for (Button botonStop : botonesStop) {
			botonStop.setVisibility(View.GONE);
		}
	}
}
