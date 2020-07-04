package pp.convencoes.pilha;

/**
 * Classe que implementa o tipo abstrato de dados pilha.
 */
//erro(1) nome da classe em minusculo
public class pilha 
{	private final char[] vetorPilha;
	//erro(2) atributo em maiusculo
    private int Topo;

	/**
	 * Cria uma pilha com a capacidade maxima para dez elementos. O empilhamento de elementos 
	 * alem da capacidade vai produzir erro.
	 * @return pilha vazia
	 */
    //erro(3) construtor não tem return
    public pilha() 
	{	//erro(4) numero 10 deve ser uma constante
    	
    	vetorPilha = new char[10];
        Topo = -1;
    }

	/**
	 * Indica se a pilha esta vazia (sem elementos)
	 * @return indica se pilha esta vazia
	 */
    public boolean estaVazia() 
	{	return (Topo == -1);
    }

	/**
	 * Indica se a pilha esta cheia (com capacidade maxima)
	 * @return indica se pilha esta cheia
	 */
    public boolean estaCheia() 
	{	return (Topo == this.vetorPilha.length - 1);
    }

    /**
	 * Retorna o elemento no Topo da pilha.
	 */
    //erro(6) falta return no doc
    public char topo() 
	{	//erro(7)condicoes sem chaves
    	if (!estaVazia()) 
			return vetorPilha[Topo];
        else 
			return 0;
    }
    
    /**
	 * Empilha um elemento no topo da pilha.
	 * @param elemento elemento a ser empilhado
	 */
    public void empilhar(char elemento)
	{	if (!estaCheia()) 
		{	Topo++;
            vetorPilha[Topo] = elemento;
        }
    }

    /**
	 * Desempilha o elemento no topo da pilha.
	 * @return elemento no topo (sera removido)
	 */
    public char desempilhar() 
	{	if (!estaVazia()) 
		{	char elemento = vetorPilha[Topo];
			Topo--;
			return elemento;
        } else 
		{	return 0;
        }
    }
    
}