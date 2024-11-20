package FindTheIndexOfTheFirstOcurrenceInAString;

class Solution {
	public int strStr(String haystack, String needle) {

		//Posicion en la que se encuentra la coincidencia
		int posicion = 0;

		//Si el indexOf no es igual a -1 busca la posicion donde se encuentra la coincidencia y la devuelve sino devuelve -1
		if (haystack.indexOf(needle) != -1) {
			posicion = haystack.indexOf(needle);
			return posicion;
		} else {
			return -1;
		}
	}
}