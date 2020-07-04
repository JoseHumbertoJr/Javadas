package Questão_2;

public class DescritorMusical {
	private String artista;
	private String album;
	private String nome;
	private int numero;
	
	public DescritorMusical(String cantor,String album,String cd,int numero){
		this.artista = cantor;
		this.album = album;
		this.nome = cd;
		this.numero = numero;
	}
	
	public String toString(){
		String copiaArtista = this.artista;
		String copiaAlbum = this.album;
		String copiaNome = this.nome;
		int copiaNumero = this.numero;
		String copia = null;
		copia = "Artista: "+copiaArtista+"   Album: "+copiaAlbum+"   Nome: "+copiaNome+"   Número: "+copiaNumero;
		return copia;
	}
}
