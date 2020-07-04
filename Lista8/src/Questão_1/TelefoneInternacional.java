package Questão_1;

public class TelefoneInternacional extends Telefone {
	private long codigoPais;
	
	public void setCodigoPais(long codigoPais){
		this.codigoPais = codigoPais;
	}
	public long getCondigoPais(){
		return codigoPais;
	}
	public String toString(){
		String formato = ((getNumero()/1000000000)/10)+"("+getNumero()/100000000%100+")"+((getNumero()/10000)%10000)+"-"+getNumero()%10000;
		return formato;
	}
}
