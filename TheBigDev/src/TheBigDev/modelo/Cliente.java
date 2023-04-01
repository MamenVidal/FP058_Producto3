package TheBigDev.modelo;

public abstract class Cliente {
    private String email;
    private String nif;
    private String nombre;
    private String domicilio;

    public Cliente(String email, String nif, String nombre, String domicilio) {
        this.email = email;
        this.nif = nif;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // getters y setters
    public String getNombre() {
        return nombre;
    }
    public String getNif() {
        return nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public abstract String tipoCliente();
    public abstract float calcAnual();
    public abstract float descuentoEnv();

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", tipoCliente='" + tipoCliente() + '\'' +
                ", calcAnual='" + calcAnual() + '\'' +
                ", descuentoEnv='" + descuentoEnv() + '\'' +
                '}';
    }
}

