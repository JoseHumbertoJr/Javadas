package Questão_9;

public class OperacoesMatematicas {
	private String operacao;
	private double primeiro_Valor;
	private double segundo_Valor;
	private double resultado;
	
	public void setOperacao(String operacao){
		this.operacao = operacao;
	}
	public String getOperacao(){
		return operacao;
	}
	public void setPrimeiroValor(double primeiro_Valor){
		this.primeiro_Valor = primeiro_Valor;
	}
	public double getPrimeiro_Valor(){
		return primeiro_Valor;
	}
	public void setSegundo_Valor(double segundo_Valor){
		this.segundo_Valor = segundo_Valor;
	}
	public double getSegundo_Valor(){
		return segundo_Valor;
	}
	public double getResultado(){
		return resultado;
	}
}
