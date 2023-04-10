package TheBigDev.modelo;

import TheBigDev.modelo.dao.ClientesDao;

import java.util.ArrayList;

public class ListaClientes {

    public ArrayList<Cliente> getListaClientes() {
        return ClientesDao.list();
    }

    public int getSize() {
        return getListaClientes().size();
    }

    public void add(Cliente t) {
        ClientesDao.insert(t);
    }

    public void borrar(Cliente t) {
        ClientesDao.delete(t);
    }

    public Cliente getAt(int position) {
        return getListaClientes().get(position);
    }

    public boolean isEmpty() {
        return getListaClientes().isEmpty();
    }

    public ArrayList<Cliente> getArrayList() {
        return getListaClientes();
    }

    public Cliente existeCliente(Cliente cliente) {
        for (int i = 0; i < getListaClientes().size(); i++) {
            Cliente c = getListaClientes().get(i);
            if (c.getEmail().equals(cliente.getEmail())) {
                return c;
            }
        }
        return null;
    }
    public static Cliente existeEmailCliente(String email) {
        return ClientesDao.read(email);
    }
}