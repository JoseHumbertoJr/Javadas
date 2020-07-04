package pp.convencoes.complexo;


//erro(1) import java.util.Date desnecessaria

//erro(2) classe não comeca com letra minuscula 

//erro(3) falta a documentação da classe
public class Complexo
{
	//erro (6) atributo real em letra maiuscula 
    private double real;
	private double imaginario;   

	/**
	 * Controi um numero complexo. A parte Real sera 0.0 e a parte
	 * imaginaria tambem sera 0.0.
	 */
	
    public Complexo() 
    {	real = 0.0;
		imaginario = 0.0;
    }

	/**
	 * Cria um numero complexo.
	 * @param I parte imaginaria do numero complexo		
	 */
  //erro(6)falta @param r
    
    //erro(5) variavel i em maiusculo
    public Complexo(double r, double i) 
    { 	real = r;	
		imaginario = i;
    }  

	/**
	 * Soma um valor inteiro ao numero imaginario
	 * @param n valor inteiro a ser somado
	 */
    public void soma(int n)
    {	real += n;
		imaginario += n;
    }
	
	/**
	 * Soma um numero imaginario a este numero imaginario
	 * @param c numero imaginario a ser somado
	 */
    
    //erro(7) numero imaginario c em maiusculo
    public void soma(Complexo c)
    {	real += c.real;
		imaginario += c.imaginario;
    }
}