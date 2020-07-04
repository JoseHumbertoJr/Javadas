package Bb
;
public class ContaBanco {
	public int conta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estatusAtual(){
		System.out.println("---------------------");
		System.out.println("Conta: "+this.getConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.getStatus());
	}
	
	public ContaBanco(){
		this.setSaldo(0);
		this.setStatus(false);	
	}
	
	public void setConta(int conta){
		this.conta = conta;
	}
	
	public int getConta(){
		return this.conta;
	}
	
	public void setTipo(String t){
		this.tipo = t ;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setDono(String d){
		this.dono = d;
	}
	
	public String getDono(){
		return this.dono;
	}
	
	public void setSaldo(float s){
		this.saldo = s;
	}
	public float getSaldo(){
		return this.saldo;
	}
	
	public void setStatus(boolean e){
		this.status = e;
	}
	
	public boolean getStatus(){
		return this.status;
	}
	
	public void AbrirConta(String t,boolean e){
		this.setTipo(t);
		this.setStatus(e);
		if (this.getTipo()== "cc"){
			this.setSaldo(50);
			if(this.getStatus()==true);
				System.out.println("Conta aberta com sucesso");
		}
		else if (this.getTipo()=="cp"){
			this.setSaldo(150);
			if(this.getStatus()==true);
				System.out.println("Conta aberta com sucesso");
		}
	}
	public void FecharConta(){
		if (this.getSaldo() > 0){
			System.out.println("Naõ pode ser fechada,ponta com dinheiro");
		}
		else if (this.getSaldo() < 0){
			System.out.println("Não pode ser fechada,ponta em debito");
		}
		else{
			setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
		
	}
	public void Deposita(float v){
		if (this.getStatus()){
			this.setSaldo(this.getSaldo()+v);
			System.out.println("Deposito realizado na conta " + this.getDono());
		}
		else{
			System.out.println("Impossivel depositar");
		}
	}
	public void Sacar(float v){
		if(this.getStatus()==true){
			if(this.getSaldo() > v){
				this.setSaldo(getSaldo()-v);
				System.out.println("Saque realizado da conta de "+this.getDono()); 
			}
			else{
				System.out.println("Saldo insuficiente");
			}
		}
		else{
			System.out.println("Impossivel sacar");
		}
	}
	public void PagarMensal(float v){
		if (this.getTipo()=="cc"){
			v = 12;
		}
		else if(this.getTipo()=="cp"){
			v = 20;
		}
		if(this.status==true){
			if(saldo > v){
				this.setSaldo(getSaldo()-v);
				System.out.println("Mensalidade paga conta de "+this.dono);
			}
			else{
				System.out.println("Saldo insuficiente");
			}
		}
		else{
			System.out.println("Impossivel pagar");
		}
	}
}
