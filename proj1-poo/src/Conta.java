
public class Conta {
	private double numeroDaConta;
	private String nomeDaConta;
	private int agência;
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
	public Conta(double numeroDaConta, String nomeDaConta, int agência, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeDaConta = nomeDaConta;
		this.agência = agência;
		this.saldo = saldo;	}
	public String getNomeDaConta(){
		return nomeDaConta;
	}
	public int getAgência() {
		return agência;
	}
	public void setAgência(int agência) {
		this.agência = agência;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
		

}
