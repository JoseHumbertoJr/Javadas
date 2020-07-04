package PoliMorfo;

public class Ave extends Animal {
	private String corPena;
	
	public String getCorPena(){
		return corPena;
	}
	public void setCorPena(String corPena){
		this.corPena = corPena;
	}
	
	public void locomover() {
		System.out.println("voando");
	}
	public void alimentar() {
		System.out.println("Comendo frutas");
	}
	public void emitirSom() {
		System.out.println("Som de ave");
	}
	public void fazerNinho(){
		System.out.println("Construindo ninho");
	}
}
