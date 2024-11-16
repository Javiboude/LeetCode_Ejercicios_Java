package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int romanToInt(String s) {

		int resultado = 0;
		int length = s.length();

		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		for (int i = 0; i < s.length() - 1; i++) {
			int valorActual = romanMap.get(s.charAt(i));

			if (valorActual < romanMap.get(s.charAt(i + 1))) {
				resultado -= valorActual;
			}else {
				resultado += valorActual;
			}
		}
		return resultado + romanMap.get(s.charAt(length - 1));
	}
}