package Paulete;

public class Binario extends TransformandoEmBinario{
	
	protected String getNumeroEmBinario(){
		String binario = Integer.toBinaryString(getNumero());
		return binario;
	}
}
