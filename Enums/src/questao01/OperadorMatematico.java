package questao01;

public enum OperadorMatematico {
	
	SOMA(),SUBTRACAO(),MULTIPLICACAO(),DIVISAO();
	
	public int getCalculo(int operador1, int operador2) {
		
		int conta = 0;
		
		switch (this) {
		case SOMA:
			conta = operador1 + operador2;
			break;
		case SUBTRACAO:
			conta = operador1 - operador2;
			break;
		case MULTIPLICACAO:
			conta = operador1 * operador2;
			break;
		case DIVISAO:
			conta = operador1 / operador2;
			break;

		default:
			break;
		}
		
		return conta;
	}

}
