package Questão9_11;

public class Triangulo {
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public Triangulo(int ladoA,int ladoB,int ladoC){
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	public String getFormaTriangulo(){
		String forma = "";
		if(this.ladoA >= this.ladoB+this.ladoC){
			forma = "Não";
		}
		else{
			forma = "Sim";
		}
		return forma;
	}
	

}
