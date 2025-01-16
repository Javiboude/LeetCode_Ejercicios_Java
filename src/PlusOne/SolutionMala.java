package PlusOne;

class SolutionMala {
    public int[] plusOne(int[] digits) {
        
    	int numeros = 0;
    	//Recoorremos el array y lo metemos en la variable numeros
    	for (int i = 0; i < digits.length; i++) {
    		numeros = numeros * 10 + digits[i];
		}
    	
    	//Le sumamos un numero como pide el ejercicio
    	numeros = numeros + 1;
    	
    	//Pasamos el int a string
    	String numerosStr = Integer.toString(numeros);
    	
    	////Le damos la longitud a nuestro array
    	int[] digitos = new int[numerosStr.length()];
    	
    	//Sacamos el valor de i y lo transformamos a array
    	for (int i = 0; i < numerosStr.length(); i++) {
            digitos[i] = Character.getNumericValue(numerosStr.charAt(i));
        }
    	return digitos;
    }
}