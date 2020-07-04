package email;

import org.junit.Test;

import email.excecoes.EmailInvalidoException;

import static org.junit.Assert.assertEquals;

public class EmailTest 
{
	@Test
	public void testEmailValido() throws EmailInvalidoException 
	{	Email email = new EmailImpl();
		email.setEndereco("hamurabi@gmail.com.br");
		assertEquals("hamurabi@gmail.com.br", email.getEndereco());
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testAVazio() throws EmailInvalidoException 
	{	Email email = new EmailImpl();
		email.setEndereco("@gmail.com.br");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testBVazio() throws EmailInvalidoException 
	{	Email email = new EmailImpl();
		email.setEndereco("hamurabi@.com.br");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testAComMaiusculaInicial() throws EmailInvalidoException 
	{	Email email = new EmailImpl();
		email.setEndereco("Hamurabi@gmail.com.br");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testAComMaiusculaMeio() throws EmailInvalidoException 
	{	Email email = new EmailImpl();
		email.setEndereco("hamUrabi@gmail.com.br");
	}
	
	@Test(expected=EmailInvalidoException.class)
	public void testAComMaiusculaFinal() throws EmailInvalidoException 
	{	Email email = new EmailImpl();
		email.setEndereco("hamurabI@gmail.com.br");
	}
	
	@Test
	public void testAComPonto() throws EmailInvalidoException 
	{	Email email = new EmailImpl();
		email.setEndereco("hamurabi.medeiros@gmail.com.br");
		assertEquals("hamurabi.medeiros@gmail.com.br", email.getEndereco());
	}
	
}
