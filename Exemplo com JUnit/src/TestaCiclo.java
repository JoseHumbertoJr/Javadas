
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;

public class TestaCiclo 
{
	@BeforeClass
	public static void iniciarBateria() 
	{	System.out.println("Iniciar bateria");
	}
	
	@AfterClass
	public static void encerrarBateria() 
	{	System.out.println("Encerrar bateria");
	}

	@Before
	public void iniciarTeste() 
	{	System.out.println("Iniciar teste");
	}
	
	@After
	public void encerrarTeste() 
	{	System.out.println("Encerrar teste");
	}
	
	@Test
	public void teste1() 
	{	System.out.println("Teste 1");
	}
	
	@Test
	public void teste2() 
	{	System.out.println("Teste 2");
	}
	
	@Test
	public void teste3() 
	{	System.out.println("Teste 3");
	}
	
}
