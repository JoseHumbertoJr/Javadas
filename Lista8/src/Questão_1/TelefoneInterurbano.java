package Questão_1;

public class TelefoneInterurbano extends Telefone {
	private long codigoDDD;
	
	public void setCondigoDDD(long codigoDDD){
		this.codigoDDD = codigoDDD;
	}
	public long getCodigoDDD(){
		return codigoDDD;
	}
	public String toString(){
		String formato = "("+getNumero()/100000000%100+")"+((getNumero()/10000)%10000)+"-"+getNumero()%10000;
		return formato;
	}
}
