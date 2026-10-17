import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoEntregaTest {

    @Test
    void deveCalcularTaxaComDistancia() {
        PedidoEntrega pedido = new PedidoEntrega();
        pedido.setDistanciaKm(3.0f);
        assertEquals(11.0f, pedido.calcularTaxaEntrega(), 0.001f);
    }

    @Test
    void deveCalcularTotalComTaxa() {
        PedidoEntrega pedido = new PedidoEntrega();
        pedido.setValorLanche(20.0f);
        pedido.setDistanciaKm(3.0f);
        assertEquals(31.0f, pedido.calcularTotal(), 0.001f);
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoEntrega pedido = new PedidoEntrega();
        pedido.setValorLanche(20.0f);
        pedido.setDistanciaKm(3.0f);
        pedido.setNomeCliente("Maria");
        pedido.setNumero(1);
        assertEquals("Pedido{numero=1, cliente='Maria', total=31.0}", pedido.getInfo());
    }
}