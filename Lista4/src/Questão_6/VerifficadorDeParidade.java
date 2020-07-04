package Questão_6;

public class VerifficadorDeParidade {
	private long bits;
	
	public void setBits(long bits){
		this.bits = bits;
	}
	public boolean hasParidade(){
		int aux = 0;
		long copia = this.bits;
		while (copia > 0){
			if (copia % 10 == 1){
				aux++;
			}
			copia /= 10;
		}
		return aux % 2 == 0;
	}

}
