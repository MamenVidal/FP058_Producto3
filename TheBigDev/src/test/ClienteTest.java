import TheBigDev.modelo.ClientePremium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {

    @Test
    public  void testDescuentoEnv() {
        ClientePremium clientePremium = new ClientePremium("juan@juan.es", "12345678A", "Juan Pérez", "Calle prueba 3");

        float expectedDescuentoEnv = 20.0f;
        float actualDescuentoEnv = clientePremium.descuentoEnv();

        assertEquals(expectedDescuentoEnv, actualDescuentoEnv, 0.01, "El descuento en el envío no es correcto");
    }

}
