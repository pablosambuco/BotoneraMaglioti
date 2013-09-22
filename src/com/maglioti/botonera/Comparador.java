package com.maglioti.botonera;

import java.lang.reflect.Field;
import java.util.Comparator;

public class Comparador implements Comparator<Field> {
	public int compare(Field field1, Field field2) {
		return field1.getName().compareTo(field2.getName());
	}
}
