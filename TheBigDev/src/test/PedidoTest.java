import TheBigDev.modelo.Articulo;
import TheBigDev.modelo.Cliente;
import TheBigDev.modelo.ClienteEstandar;
import TheBigDev.modelo.Pedido;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void precioTotal() {
        Cliente cliente = new ClienteEstandar("juan@juan.es", "12345678A", "Juan P", "Calle prueba 3");
        Articulo articulo = new Articulo("001", "Producto A", 100.0f, 10.0f, 7);
        Pedido pedido = new Pedido(1, cliente, articulo, 2, LocalDateTime.now(), false);

        float expectedPrecioTotal = 220.0f;
        float actualPrecioTotal = pedido.precioTotal();

        assertEquals(expectedPrecioTotal, actualPrecioTotal, 0.01, "El precio total calculado no es correcto");
    }
}