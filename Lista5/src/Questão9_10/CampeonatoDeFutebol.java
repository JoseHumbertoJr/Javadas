package Questão9_10;

public class CampeonatoDeFutebol {
	private String[]times = new String[2];
	private int posicao;
	
	public void addTime(String nomeDoTime){
		if (posicao == times.length){
			String[] novoArray = new String[times.length * 2];
			for (int i = 0;i < times.length;i++){
				novoArray[i] = times[i];
			}
			times = novoArray;
		}
		times[posicao] = nomeDoTime;
		posicao++;
	}
	public String[] getJogos(){
		String []jogos = new String[times.length];
		int contador = 0;
		for (int i = 0;i < times.length;i++){
			contador++;
			for (int j = i+1;j < times.length;j++){
				jogos[contador] = times[i] + " X " + times[j];
				}
			}
		return jogos;
	}
}
