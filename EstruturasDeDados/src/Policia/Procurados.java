package Policia;

public class Procurados {
	private String [] procurados = new String [5];
	private int posicao = 0;
	
	public void adicionaNome(String nome) {
		this.procurados[posicao] = nome;
		posicao++;
	}
	public String getProcurado(String procurado) {
		String situacao = null;
		for(int i = 0;i < procurados.length;i++) {
			if(procurados[i].equalsIgnoreCase(procurado)) {
				situacao = "Procurado";
			}
			else {
				situacao = "Nao procurado";
			}
		}
		return situacao;
	}
}
