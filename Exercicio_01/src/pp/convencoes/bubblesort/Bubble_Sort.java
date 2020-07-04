package pp.convencoes.bubblesort;

//erro (1) documentação da classe depois da classe
	/**
	 * Ordena um array de inteiros utilizando o algoritmo classico do
	 * BubbleSort, que consiste em iterar sobre o array empurando os 
	 * maiores valores para o final.
	 * @return Vetor ordenado 
	 */
//erro(6) falta parametro
//erro (2) nome da classe possui simbolo
public class Bubble_Sort 
{	
	
	//(3) falta a documentacao do metodo
    public static void ordenar(int vetor[]) 
  //erro(3) variavel vetor em maiusculo
	{   for (int i = vetor.length; i >= 1; i--) 
		{	for (int j = 1; j < i; j++)
			//erro(4) variavel j em maiusculo
			{	if (vetor[j - 1] > vetor[j]) 
				{	int aux = vetor[j];
				//erro(5) variavel aux em maiusculo
                    vetor[j] = vetor[j - 1];  
                    vetor[j - 1] = aux;  
                }  
            }  
        }  
    }  
} 