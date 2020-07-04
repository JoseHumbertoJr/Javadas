import org.junit.Test;

import br.unifacisa.testeMaven.GerenteDePessoa;
import junit.framework.TestCase;

public class TesteDeGerenteDePessoa extends TestCase {
	
	@Test 
	public void testPessoasDeMaiorIdade() {
		GerenteDePessoa gerente = new GerenteDePessoa();
		gerente.cadastrarPessoa("Matheus", 22, 5.000);
		assertEquals("Matheus", gerente.getPessoa());
	}
	@Test
	public void testPessoaDeSexoFeminino() {
		
	}
	
	@Test
	public void testSalarioAcimaDeCincoMil() {
		
	}

}
