package Questão_6;

public abstract class Candidato {
	private int numero;
	private String nome;
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public abstract int getMascara();
	public int getNumeroDoPartido(){
		return this.numero / getMascara();
	}
	public String getNomeDoPartido(){
		switch (getNumeroDoPartido()) {
		case	10	:  return	"PRB";
		case	11	:  return	"PP";
		case	12	:  return	"PDT";
		case	13	:  return	"PT";
		case	14	:  return	"PTB";
		case	15	:  return	"PMDB";
		case	16	:  return	"PSTU";
		case	17	:  return	"PSL";
		case	19	:  return	"PTN";
		case	20	:  return	"PSC";
		case	21	:  return	"PCB";
		case	22	:  return	"PR";
		case	23	:  return	"PPS";
		case	25	:  return	"DEM";
		case	27	:  return	"PSDC";
		case	28	:  return	"PRTB";
		case	29	:  return	"PCO";
		case	31	:  return	"PHS";
		case	33	:  return	"PMN";
		case	36	:  return	"PTC";
		case	40	:  return	"PSB";
		case	43	:  return	"PV";
		case	44	:  return	"PRP";
		case	45	:  return	"PSDB";
		case	50	:  return	"PSOL";
		case	54	:  return	"PPL";
		case	55	:  return	"PSD";
		case	65	:  return	"PCdoB";
		case	70	:  return	"PTdoB";
		default	:  return	null;
		}
	}
	public String toString(){
		return getNome()+" "+getNumero()+" "+getNomeDoPartido();
	}
}
