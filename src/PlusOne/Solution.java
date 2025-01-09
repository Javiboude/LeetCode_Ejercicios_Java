package PlusOne;

class Solution {
	public int[] plusOne(int[] digits) {

		// Longitud del array digits
		int n = digits.length;

		// Recorremos n de forma inversa, -1 porque estamos recorriendo un array
		for (int i = n - 1; i >= 0; i--) {
			// Si es menor que 9, incrementamos en 1
			if (digits[i] < 9) {
				digits[i]++;
				// Retornamos el array
				return digits;
			}
			// Si el dígito es 9, lo establecemos en 0
			digits[i] = 0;
		}

		// Si no a podido devolver bada llega aqui y crea un array donde le añade una
		// casilla y añade u uno al principio mas el resto de ceros.
		int[] result = new int[n + 1];

		result[0] = 1;

		return result;
	}
}
