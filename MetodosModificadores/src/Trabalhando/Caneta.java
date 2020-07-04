package Trabalhando;
public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, float p){		//metodo construtor
		this.modelo = m;
		this.cor = c;
		this.setPonta(p);
		this.tampada();
	}
	public String getModelo(){
		return this.modelo;
	}
	public void setModelo(String n){
		this.modelo = n;
	}
	public float getPonta(){
		return this.ponta;
	}
	public void setPonta(float p){
		this.ponta = p ;
	}
	public void tampada(){
		this.tampada = true;
	}
	public void destampada(){
		this.tampada = false;
	}
	
	public void status(){
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ponta: " + getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Está tampada: " + this.tampada);
	}
}
