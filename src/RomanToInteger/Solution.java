package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int romanToInt(String s) {

		
		int resultado = 0;
		//Medimos la longitud del String
		int length = s.length();

		//Mapa para poner los diferentes valores de los numeros romanos
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		//Recorremos el String, - 1 para no salirnos del String cuando queramos comprobar si el siguiente es menor.
		for (int i = 0; i < s.length() - 1; i++) {
			
			//Añadimos los valores que vallan saliendo, charAt para coger de letra en letra y no todo el String
			int valorActual = romanMap.get(s.charAt(i));

			//Si el calor actual es menor que el siguiente se resta sino se suma, el + 1 para que coja el siguiente valor
			if (valorActual < romanMap.get(s.charAt(i + 1))) {
				resultado -= valorActual;
			}else {
				resultado += valorActual;
			}
		}
		//Como al se -1 en el bucle for no cohe todos los valores añadimos nosotros el ultimo
		return resultado + romanMap.get(s.charAt(length - 1));
	}
}