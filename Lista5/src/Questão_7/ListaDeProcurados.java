package Questão_7;

public class ListaDeProcurados {
	private String[]procurado = new String[1];
	private int posicao = 0;
	private String nome;

	public void addProcurado(String nomeDoProcurado){
		this.procurado[posicao] = nomeDoProcurado;
		posicao++;
		if (posicao == procurado.length){
			String [] novoArray = new String[procurado.length*2]; 
			for (int i = 0;i < procurado.length;i++){
				for (int j = 0;j < novoArray.length;j++){
					novoArray[j] += procurado[i];
				}
			}
			procurado = novoArray;
		}
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public boolean getEstaNaLista(){
		boolean presente = false;
		for (int i = 0;i < procurado.length;i++){
			if (this.nome == (procurado[i])){
				presente = true;
			}
		}
		return presente;
	}
}
