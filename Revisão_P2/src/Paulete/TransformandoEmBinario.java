package Paulete;

public abstract class TransformandoEmBinario {
	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	protected abstract String getNumeroEmBinario();
	
}
