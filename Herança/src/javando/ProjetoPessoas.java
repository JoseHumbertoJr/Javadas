package javando;

public class ProjetoPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		Professor p2 = new Professor();
		Funcion�rio f1 = new Funcion�rio();

		p1.setNome("Pedro");
		a1.setNome("Maria");
		f1.setNome("Jo�o");
		p2.setNome("Onildo");
		p1.status();
		a1.status();

	}
}
