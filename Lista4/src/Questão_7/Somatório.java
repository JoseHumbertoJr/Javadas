package Quest�o_7;

public class Somat�rio {
	private int valorInicial;
	private int valorFinal;
	
	public Somat�rio(int valorInicial,int valorFinal){
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
	}
	public int getSomaDoIntervalo(){
		int soma = 0;
		for (int i = valorInicial;i<=valorFinal;i++){
			soma+=i;
		}
		return soma;
	}
}
