package Palindrome_Number;

class Solution {
	public boolean isPalindrome(int x) {

		int original = x;
		int reversa = 0;

		//Si es menor que 0 false
		while (x < 0) {
			return false;
		}

		//Sino es distinto de 0 no entra
		while (x != 0) {
			//Sacamos el ultimo numer del valor ingresado
			int numFinal = x % 10;
			//En una nueva variable añadimos el numFinal mas la reversa por 10 para que se sumen adecuadamente
			reversa = reversa * 10 + numFinal;
			//Le quitamo el ultimo numero a la x
			x = x / 10;
		}

		//Si en igual true sino false
		if (original == reversa) {
			return true;
		} else {
			return false;
		}
	}
}