package hibernate.anotacoes;

import junit.framework.TestCase;

public class PessoaTest extends TestCase {
	
	public void testeDeCadastroDePessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf(1267792540);
		pessoa.setId(1);
		pessoa.setNome("José");
		pessoa.setTelefone(33942251);
		
	}
	
	public void testeDeObtencaoDePessoaPorId() {
		
	}
}
