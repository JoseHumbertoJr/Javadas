package Questão_7;

public class Intens {
	private String [] listaDeIntens = new String[5];
	private int posicao = 0;
	
	public String[] getLista(){
		return listaDeIntens;
	}
	
	public void addIntens(String intem){
		if (posicao < listaDeIntens.length){
			listaDeIntens[posicao] = intem;
			posicao++;
		}
	}
	public String toString(){
		String listaModificada = "";
		for (int i = 0;i < listaDeIntens.length;i++){
			listaModificada+=getIcone(i)+listaDeIntens[i]+"\n";
		}
		return listaModificada;
	}
	protected String getIcone(int indice){
		return "•";
	}
}
