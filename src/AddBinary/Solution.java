package AddBinary;

class Solution {
	
	public String addBinary(String a, String b) {
		
		//La utilizamos para manejar mejor los caracteres
		StringBuilder resultado = new StringBuilder();
		
		//Medimos la longitud
		int i = a.length() -1;
		int j = b.length() -1;
		int acarreo = 0;
		
		//Recorremos los String y los sumamos a un sum global junto con el acarreo
		while (i >= 0 || j >= 0 || acarreo > 0) {
			int sum =+ acarreo;
			if (i >= 0) {
				sum += a.charAt(i--) - '0';
			}
			if (j >= 0) {
				sum += b.charAt(j--) - '0';
			}
			//Añadimos el resultado al StringBuilder
			resultado.append(sum % 2);
			//Acarreo de la siguiente
			acarreo = sum / 2;
		}
		//Le damos la vuelta al resultado
		return resultado.reverse().toString();
	}
}