package pp.convencoes.contador;

import java.util.Scanner;
//erro(1) import não ultilizavel
/**
 * Esta classe implementa um contador.
 */
//erro(2) nome de classe possui simbolos
public class Contador_de_numeros
{               
	//erro(3) atributo em maiusculo
	private int NUM; 
	
	/**
	 * Incrementa o contador interno em um.
	 */
	//erro(4) metodo em maiusculo
	public void Incrementar()
	{	NUM++;
	}   	
	//erro(5) falta de documentacao do metodo decrementar
	public void Decrementar()
	{   NUM--;
	}  
	
	/**
	 * Reinicia o contador para determinado valor.
	 * @param Inicial novo valor inicial
	 */
	//erro(6) parametro em maiusculo
	public void comecar(int Inicial) 
	{   NUM = Inicial;  
	}   
 } 