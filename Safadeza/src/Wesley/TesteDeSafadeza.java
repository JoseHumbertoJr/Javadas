package Wesley;

public class TesteDeSafadeza {
	private int dia;
	private int mes;
	private int ano;
	private long safadeza;
	private long anjo;
	
	public int getDia(){
		return dia;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public int getMes(){
		return mes;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public long getSafadeza(){
		return safadeza;
	}
	public void setSafadeza(long safadeza){
		this.safadeza = safadeza;
	}
	public long getAnjo(){
		return anjo;
	}
	public void setAnjo(int anjo){
		this.ano = anjo;
	}
	
	public void wesley_safadao(){
		safadeza = (getMes() + (getAno()/10000)*(50-getDia()));
		System.out.println(safadeza+" % de safadeza");
		anjo = 100-safadeza;
		System.out.println(anjo+" % de anjo");
	}

}
