package com.maglioti.botonera;

public class Auxiliar {
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
