
public class Conta {
	private double numeroDaConta;
	private String nomeDaConta;
	private int ag�ncia;
	private double saldo;
	
	public void setNumeroDaConta(double numeroDaConta){
		this.numeroDaConta = numeroDaConta;
	}
	public double getNumeroDaConta(){
		return numeroDaConta;
	}
	public void setNomeDaConta(String nomeDaConta){
		this.nomeDaConta = nomeDaConta;
	}
	public Conta(double numeroDaConta, String nomeDaConta, int ag�ncia, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeDaConta = nomeDaConta;
		this.ag�ncia = ag�ncia;
		this.saldo = saldo;	}
	public String getNomeDaConta(){
		return nomeDaConta;
	}
	public int getAg�ncia() {
		return ag�ncia;
	}
	public void setAg�ncia(int ag�ncia) {
		this.ag�ncia = ag�ncia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
		

}
