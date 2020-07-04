package Javando;


public class Caneta {
	String modelo;
	String cor;
	float ponta;
	float carga;
	int peso;
	boolean tampada;
	void status(){
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Esta tampada? " + this.tampada);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Peso: " + this.peso);
	}
	
	void rabiscar(){
		
	}
	void tampar(){
		
	}
	void destampar(){
	}
}
