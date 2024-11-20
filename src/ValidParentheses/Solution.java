package ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
	public boolean isValid(String s) {

		//Creamos una fila ya que es la mejor opcion
		Deque<Character> fila = new ArrayDeque<>();
		//Longitud String
		int length = s.length();
		
		//Lo rrecorremos y almacenamos en una variable
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);

			// Si es un paréntesis de apertura, lo añade a la pila en la primera posicion
			if (c == '(' || c == '[' || c == '{') {
				fila.push(c);
			}
			
			// Si es un paréntesis de cierre, chequeamos que no este vacio o que coincida para que no devuelva false
			else if (c == ')' || c == ']' || c == '}') {
				if (fila.isEmpty() || !matches(fila.pop(), c)) {
					return false;
				}
			}
		}
		return fila.isEmpty();
	}
	
	// Método para verificar si coinciden
	private boolean matches(char open, char close) {
		return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
	}
}
