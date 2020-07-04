package pp.convencoes.processo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
//erro(1) falta a documentacao da classe
public class Processo 
{	
	//erro(2) metodo em maiusculo
	//erro(3) parametro em maiusculo
	//erro(4) falta a documentacao do metodo
	public static void CriarProcesso(String CMD) 
	{	Process novo = null;
		//(5) variavel buffer em maiusculo
		BufferedReader Buffer;
		String entrada;
		try 
		{	novo = Runtime.getRuntime().exec(CMD);
			Buffer = new BufferedReader(new InputStreamReader(novo.getInputStream()));
			novo.waitFor();
			entrada = Buffer.readLine();
			while(entrada!=null)
			{	System.out.println(entrada);
				entrada = Buffer.readLine();
			}
			Buffer=null;
			novo.destroy();
			System.gc();
		} catch (Exception expection) 
		{	System.out.println("Erro na execucao do comando");
			//erro(6) numero 3 deve ser uma constante
			System.exit(3);
		}
	}
}