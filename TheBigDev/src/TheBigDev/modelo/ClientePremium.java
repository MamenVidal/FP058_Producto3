package TheBigDev.modelo;

public class ClientePremium extends Cliente {

    public ClientePremium(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email);
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
