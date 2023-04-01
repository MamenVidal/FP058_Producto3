package TheBigDev.modelo;

public class ListaClientes extends Lista<Cliente> {
    public Cliente existeCliente(Cliente cliente) {
        for (int i = 0; i < this.lista.size(); i++) {
            Cliente c = this.lista.get(i);
            if (c.getEmail().equals(cliente.getEmail())) {
                return c;
            }
        }
        return null;
    }
}
