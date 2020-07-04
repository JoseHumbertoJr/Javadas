package Aula_04;

public class Vetor {
	private String[] elementos = new String[5];
	private int tamanho = 0;
	
	public void adicionarElemento(String nome){
		if(tamanho < elementos.length){
			this.elementos[tamanho] = nome;
			tamanho++;
		}
		else{
			String[] novoArray = new String[elementos.length+1];
			novoArray[tamanho] = nome;
			tamanho++;
			this.elementos = novoArray;
		}
	}
	
	public int getTamanho(){
		return this.tamanho;
	}
	public String toString(){
		String Builder = null;
		for(int i = 0;i < elementos.length;i++){
			Builder+=elementos[i]+" ";
		}
		return Builder.toString();
	}
}
