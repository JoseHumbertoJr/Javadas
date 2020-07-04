package PoliMorfo;

public class Peixe extends Animal {
	private String corEscama;
	
	public String corEscama(){
		return corEscama;
	}
	public void setCorEscama(String corEscama){
		this.corEscama = corEscama;
	}

	public void locomover() {
		System.out.println("Nadando");
	}

	public void alimentar() {
		System.out.println("Comendo Substancias");
	}

	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
	public void soltarBolha(){
		System.out.println("Soltando bolha");
	}

}
