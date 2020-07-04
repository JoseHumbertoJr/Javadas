package Questão_11;

public class Abstrato extends Metodo {
	private String tipo;
	private String retorno;
	public void setRetorno(String retorno){
		this.retorno = retorno;
	}
	public String getRetorno(){
		return retorno;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String toString(){
		return getVisibilidade()+" "+getTipo()+getRetorno()+" "+getNome()+"();";
	}
}
