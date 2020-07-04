package PoliMorfo;

public class Reptil extends Animal {
	private String corEscama;
	
	public String getCorEscama(){
		return corEscama;
	}
	public void setCorEscama(String corEscama){
		this.corEscama = corEscama;
	}
	public void locomover() {
		System.out.println("Rasteando");
	}

	public void alimentar() {
		System.out.println("Comendo Vegetais");
	}

	public void emitirSom() {
		System.out.println("Som de reptil");
	}

}
