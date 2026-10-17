import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoRetiradaTest {

    @Test
    void naoDeveCobrarTaxa() {
        PedidoRetirada pedido = new PedidoRetirada();
        pedido.setDistanciaKm(3.0f);
        assertEquals(0.0f, pedido.calcularTaxaEntrega(), 0.001f);
    }

    @Test
    void deveCalcularTotalSemTaxa() {
        PedidoRetirada pedido = new PedidoRetirada();
        pedido.setValorLanche(20.0f);
        pedido.setDistanciaKm(3.0f);
        assertEquals(20.0f, pedido.calcularTotal(), 0.001f);
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoRetirada pedido = new PedidoRetirada();
        pedido.setValorLanche(20.0f);
        pedido.setNomeCliente("João");
        pedido.setNumero(2);
        assertEquals("PedidoRetirada{numero=2, cliente='João', total=20.0}", pedido.getInfo());
    }
}