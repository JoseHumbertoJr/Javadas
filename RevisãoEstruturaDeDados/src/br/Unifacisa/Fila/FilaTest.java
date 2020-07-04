package br.Unifacisa.Fila;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilaTest {

	@Test
	public void testFila() {
		Fila novaFila = new Fila();
		novaFila.enfileirar("Zé de pai");
		novaFila.enfileirar("Nilda");
		int resultado = novaFila.tamanho();
		assertEquals("Zé de pai", novaFila.primeiro());
		assertEquals(2, resultado);
	}
	@Test
	public void testFila2() {
		Fila novaFila = new Fila();
		novaFila.enfileirar("Zé de pai");
		novaFila.enfileirar("Nilda");
		novaFila.desenfileirar();
		novaFila.desenfileirar();
	
	}

}
