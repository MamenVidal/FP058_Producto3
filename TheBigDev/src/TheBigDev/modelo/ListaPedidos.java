package TheBigDev.modelo;

public class ListaPedidos extends Lista<Pedido> {
    public Pedido existeNumeroPedido(Integer numero) {
        for (int i = 0; i < this.lista.size(); i++) {
            Pedido p = this.lista.get(i);
            if (p.getNumero() == numero) {
                return p;
            }
        }
        return null;
    }
}
