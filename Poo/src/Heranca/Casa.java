package Heranca;

public class Casa {
	private Endereco endereco;
	
	public Casa(Endereco endereco){
		this.endereco = endereco;
	}
	public Endereco getEndereco(){
		return endereco;
	}
	public String getRua(){
		return endereco.getRua();
	}
	public int getNumero(){
		return endereco.getNumero();
	}
	public String getBairro(){
		return endereco.getBairro();
	}
	public String getCidade(){
		return endereco.getCidade();
	}
}
