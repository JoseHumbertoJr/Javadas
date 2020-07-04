package pagamento;

import static org.junit.Assert.*;

import org.junit.Test;

public class PagamentoTest {

	@Test
	public void testPagamentoAVista() {
		PagamentoAVista pagamento = new PagamentoAVista(300);
		assertEquals(0,pagamento.getQtdParcelas());
		assertEquals(300, pagamento.getValorAPagar(),1);

	}

	@Test
	public void testPagamentoAVistaComDesconto() {
		PagamentoAVistaComDesconto pagamento = new PagamentoAVistaComDesconto(300, 50);
		assertEquals(250,pagamento.getValorAPagar(),1);

	}

}
