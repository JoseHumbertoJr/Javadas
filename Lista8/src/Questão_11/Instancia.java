package Questão_11;

public class Instancia extends Metodo {
	private String retorno;
	
	public String getRetorno() {
		return retorno;
	}
	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}
	public String toString(){
		return getVisibilidade()+" "+getRetorno()+" "+getNome()+"(){}";
	}
}
