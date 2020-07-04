package prova;

public class GeradorDeMimimi {
	
	private String frase;
	private char [] vogaisMinusculas = {'a','e','i','o','u'};
	private char [] vogaisMaiusculas = {'A','E','I','O','U'};
	public static final char I_MINUSCULO = 'i';
	public static final char I_MAIUSCULO = 'I';
	
	public void setFrase(String frase){
		this.frase = frase;
	}
	public String getFraseMemetizada(){
		char [] fraseMemetizada = this.frase.toCharArray();
		for(int i = 0;i < fraseMemetizada.length;i++){
			for(int j = 0;j < vogaisMinusculas.length;j++){
				if (vogaisMinusculas[j] == fraseMemetizada[i]){
					fraseMemetizada[i] = I_MINUSCULO;
				}
			}
			for(int x = 0;x < vogaisMaiusculas.length;x++){
				if (vogaisMaiusculas[x] == fraseMemetizada[i]){
					fraseMemetizada[i] = I_MAIUSCULO;
				}
			}
		}
		String joel = new String(fraseMemetizada);
		return joel;
	}
}