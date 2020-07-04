package pp.convencoes.conta;

import java.util.Date;

//erro(1) falta a documentacao da classe
//erro(2)nome da classe conta em minusculo
public class Conta
{	
	private int numero;
	private Date dataDeAbertura;//erro(3) atributo começando em maiusculo
	private double saldo;
	
	/**
	 * Cria uma conta bancaria com o numero e a data de abertura fornecidas.
	 * @param numero numero da conta
	 * @param DataDeAbertura data de abertura da conta
	 */
	//erro(4) parametro dataDeAbertura começando em maiuscula
	public Conta(int numero, Date DataDeAbertura) 
	{	this.numero = numero;
		this.dataDeAbertura = DataDeAbertura;
		this.saldo = 0.0;
	}
	
	/**
	 * Deposita uma quantia na conta. A quantia deve ser maior que zero
	 * @param quantia quantia a ser depositada
	 * @return se o deposito foi realizado
	 */
	public boolean depositar(double quantia)
	{	boolean realizada = false;
		if (quantia > 0)
		{	this.saldo = this.saldo + quantia;
			realizada = true;
		}
		return realizada;
	}
	
	/**
	 * Saca uma quantia da conta. A quantia deve ser maior que zero
	 * e o saldo deve ser suficiente.
	 * @param quantia quantia a ser sacada
	 * @return se o saque foi realizado
	 */
	public boolean sacar(double quantia)
	{	boolean realizada;
		if (0 < quantia && quantia <= this.saldo)
		{	this.saldo = this.saldo - quantia;
			realizada = true;
		} else 
			{
			realizada = false;
			}
 		return realizada;
 		//erro(5) falta a chave { no else
 		
	}
	
	/**
	 * Transfere um valor desta conta para a conta destino fornecida.
	 * A quantia deve ser maior que zero e o saldo deve ser suficiente.
	 * @param quantia quantia a ser transferida
	 * @param destino conta de destino do valor a ser transferido
	 */
	//erro(6) falta o return do metodo transferir
	public boolean tranferir(double quantia, Conta destino)
	{	boolean realizada = false;
		if (0 < quantia && quantia <= this.saldo)
		{	this.saldo = this.saldo - quantia;
			destino.saldo = destino.saldo + quantia;
		}
		return realizada;
	}
	
	/**
	 * Retorna o numero da conta.
	 * @return numero da conta
	 */
	
	//erro(7) metodo com nome em maiusculo
	public int getNumero()
	{	return this.numero;
	}
	
	/**
	 * Retorna a data de abertura da conta.
	 * @return data de abertura da conta
	 */
	public Date getDataDeAbertura()
	{	return this.dataDeAbertura;
	}
	
	/**
	 * Retorna o saldo da conta.
	 * @return saldo da conta
	 */
	public double getSaldo()
	{	return this.saldo;
	}
}
