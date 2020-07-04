package Prova;

public class NumeroOctal {
	private static final long BASE_OCTAL = 8;

	private static final long BASE_DECIMAL = 10;

	private static final long[] OCTA_PARA_BIN = new long []

	{0, 1, 10, 11, 100, 101, 110, 111};

	private static final int SALTO = 1000;

	private long valor;

	public NumeroOctal(long valor) throws NumeroInvalidoException

	{ 
		if(valor < BASE_OCTAL){
			throw new NumeroInvalidoException();
		}
		this.valor = valor;

	}
	public int getBinario()

	{ int binario = 0;

	int multiplicador = 1;

	long valor = this.valor;

	while(valor > 0)

	{ int digito = (int)(valor % BASE_DECIMAL);

	binario += multiplicador * OCTA_PARA_BIN[digito];

	valor /= BASE_DECIMAL;

	multiplicador *= SALTO;

	}return binario;

	}
}
