package LengthofLastWord;

import java.util.Iterator;

class Solution {
	public int lengthOfLastWord(String s) {

		// Elimina espacios al principio y al final de la cadena
		s = s.trim();

		// Divide la caddena cuando ve un espacio
		String[] palabras = s.split(" ");

		// Almacenamos la palabra
		String palabra = "";

		// Longitud del array dividido
		int longitud = palabras.length;

		// Recorremos las palabras hasta la ultima
		for (int i = 0; i < longitud; i++) {
			palabra = palabras[i];

		}
		// Devolvemos
		return palabra.length();
	}
}