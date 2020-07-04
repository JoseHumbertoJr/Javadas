package Ufc;

public class Lutador {
	private String nome,nacionalidade;
	private int idade;
	private float altura,peso;
	private String categoria;
	private int vitorias,derrotas,empates;
	
	public Lutador(String no,String na,int i,float a,float p,int v,int d,int e){
		setNome(no);
		setNacionalidade(na);
		setIdade(i);
		setAltura(a);
		setPeso(p);
		setVitorias(v);
		setDerrotas(d);
		setEmpates(e);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria(categoria);
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if (peso<=70.3 && peso<=52.2){
			System.out.println("Leve");
		}
		else if (peso>70.3 && peso<=83.9){
			System.out.println("Médio");
		}
		else if (peso>83.9 && peso<=120.2){
			System.out.println("Pesado");
		}
		else{
			System.out.println("Inválido");
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void apresentar(){
		System.out.println("---------------------------------------------");
		System.out.println("CHEGOU A HORA! APRESENTAMOS O Lutador: " + this.getNome());
		System.out.println("Origem: "+this.getNacionalidade());
		System.out.println("Com "+this.getAltura()+ " Anos");
		System.out.println("Pesando "+this.getPeso());
		System.out.println("Ganhou"+this.getVitorias()+" Lutas");
		System.out.println("Perdeu "+this.getDerrotas()+" Lutas");
		System.out.println("Empatou "+this.getEmpates()+" Lutas");
	}
	public void status(){
		System.out.println(this.getNome());
		System.out.println("É um peso de "+this.getPeso());
		System.out.println("Vitórias> "+this.getVitorias());
		System.out.println("Derrotas> "+this.getDerrotas());
		System.out.println("Empates> "+this.getEmpates());
		
	}
	public void empatarLuta(){
		setEmpates(getEmpates()+1);
	}
	public void ganharLuta(){
		setVitorias(getVitorias()+1);
	}
	public void perderLuta(){
		setDerrotas(getDerrotas()+1);
	}
}