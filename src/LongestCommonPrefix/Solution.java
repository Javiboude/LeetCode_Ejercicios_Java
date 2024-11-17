package LongestCommonPrefix;

class Solution {
	public String longestCommonPrefix(String[] strs) {

		//Si el array esya vacio o la longitud es igual a cero devuelve nada;
		if (strs == null || strs.length == 0) {
			return "";
		}

		//Guardamos en un String la primera palabra
		String prefijo = strs[0];

		//Recorremos las demas palabras del String
		for (int i = 1; i < strs.length; i++) {
			//Mientras la devolucion del indexOf no sea 0 sigue
			while (strs[i].indexOf(prefijo) != 0) {
				//Mete en prefijo la primera letra has la penultima
				prefijo = prefijo.substring(0, prefijo.length() - 1);
				//Si esta vacio no devuelve nada
				if (prefijo.isEmpty()) {
					return "";
				}
			}
		}
		//Devuelve el prefijo restante
		return prefijo;
	}
}