package AddBinary;

class SolutionMala {
    public String addBinary(String a, String b) {
        
    	int numeroDecimalA = Integer.parseInt(a, 2);
    	int numeroDecimalB = Integer.parseInt(b, 2);
    	
    	int resutadoDecimal = numeroDecimalA + numeroDecimalB;
    	
    	String numeroBinarioResultado = Integer.toBinaryString(resutadoDecimal);
    	
    	return numeroBinarioResultado;
    	
    }
}