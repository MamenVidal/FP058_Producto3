package TheBigDev.modelo;

public class ClienteEstandar extends Cliente {
    public ClienteEstandar(String email, String nif, String nombre, String domicilio) {
        super(email, nif, nombre, domicilio);
    }

    public String tipoCliente() {
        return "estandar";
    }
    public float calcAnual() {
        return (float)0.00;
    }
    public float descuentoEnv() {
        return (float)0.00;
    }

}
