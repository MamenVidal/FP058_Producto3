package TheBigDev.modelo;

import TheBigDev.modelo.dao.FabricaDao;

import java.util.ArrayList;

public class ListaPedidos {

    public ArrayList<Pedido> getListaPedidos() {
        return FabricaDao.crePedidoDao().list();
    }

    public int getSize() {
        return getListaPedidos().size();
    }

    public void add(Pedido t) {
        FabricaDao.crePedidoDao().insert(t);
    }

    public void borrar(Pedido t) {
        FabricaDao.crePedidoDao().delete(t);
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
        return FabricaDao.crePedidoDao().read(numero);
    }
}
