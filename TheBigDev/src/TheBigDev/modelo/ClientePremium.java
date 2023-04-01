package TheBigDev.modelo;

public class ClientePremium extends Cliente {

    public ClientePremium(String email, String nif, String nombre, String domicilio) {
        super(email, nif, nombre, domicilio);
    }

    public String tipoCliente() {
        return "premium";
    }
    public float calcAnual() {
        return (float)30.00;
    }
    public float descuentoEnv() {
        return (float)20.00;
    }

}
