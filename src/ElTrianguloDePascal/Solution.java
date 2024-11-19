package ElTrianguloDePascal;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<List<Integer>> generate(int numRows) {

		// Creamos una lista que contendrá las filas y posicion del triángulo 
		List<List<Integer>> triangulo = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			// Añadimos una nueva fila
			triangulo.add(new ArrayList<>());
			// Comenzamos con 1
			triangulo.get(i).add(1);
			
			for (int j = 1; j < i; j++) {
				// Calculamos la suma de los dos números superiores
				int sumNumeros = triangulo.get(i - 1).get(j - 1) + triangulo.get(i - 1).get(j);
				// Añadimos el resultado
				triangulo.get(i).add(sumNumeros);
			}
			
			// Añadimos un 0 al final
			if (i > 0) {
				triangulo.get(i).add(1);
			}
		}
		return triangulo;
	}
}