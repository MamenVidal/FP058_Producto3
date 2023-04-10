package TheBigDev.modelo;

import TheBigDev.modelo.dao.PedidoDao;

import java.util.ArrayList;

public class ListaPedidos {

    public ArrayList<Pedido> getListaPedidos() {
        return PedidoDao.list();
    }

    public int getSize() {
        return getListaPedidos().size();
    }

    public void add(Pedido t) {
        PedidoDao.insert(t);
    }

    public void borrar(Pedido t) {
        PedidoDao.delete(t);
    }

    public Pedido getAt(int position) {
        return getListaPedidos().get(position);
    }

    public boolean isEmpty() {
        return getListaPedidos().isEmpty();
    }

    public ArrayList<Pedido> getArrayList() {
        return getListaPedidos();
    }

    public Pedido existeNumeroPedido(Integer numero) {
        return PedidoDao.read(numero);
    }
}
