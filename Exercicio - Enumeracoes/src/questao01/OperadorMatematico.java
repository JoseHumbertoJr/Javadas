package questao01;

public enum OperadorMatematico {
	
	SOMA,MULTIPLICACAO,SUBTRACAO,DIVISAO;

	public int getCalculo(int operador1, int operador2) {
		
		switch(this) {
		case SOMA:
			return operador1 + operador2;
		case MULTIPLICACAO :
			return operador1 * operador2;
		case SUBTRACAO:
			return operador1 - operador2;
			
		case DIVISAO:
			return operador1 / operador2;
		}
		return this.getCalculo(operador1, operador2);
	}
	
	
}
