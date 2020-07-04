package Questão_1;

public class PontoCartesiano {
	private int coordenadaX;
	private int coordenadaY;
	private String rotulo;
	
	public PontoCartesiano(int coordenadaX,int coordenadaY,String rotulo){
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.rotulo = rotulo;
	}
	
	public String toString(){
		String copia = null;
		copia = this.coordenadaX+" "+this.coordenadaY+""+this.rotulo;
		return copia;
	}
}
