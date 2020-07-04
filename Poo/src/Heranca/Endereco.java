package Heranca;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	
	public Endereco(String rua,int numero,String bairro,String cidade){
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	public void setRua(String novaRua){
		this.rua = novaRua;
	}
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	}
	public void setBairro(String novoBairro){
		this.bairro = novoBairro;
	}
	public void setCidade(String novaCidade){
		this.cidade = novaCidade;
	}
	public String getRua(){
		return rua;
	}
	public int getNumero(){
		return numero;
	}
	public String getBairro(){
		return bairro;
	}
	public String getCidade(){
		return cidade;
	}

}
