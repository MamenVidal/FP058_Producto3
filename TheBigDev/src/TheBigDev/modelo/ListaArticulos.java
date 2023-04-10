package TheBigDev.modelo;

import TheBigDev.modelo.dao.ArticuloDao;

import java.util.ArrayList;

public class ListaArticulos {

    public ArrayList<Articulo> getListaArticulos() {
        return ArticuloDao.list();
    }

    public int getSize() {
        return getListaArticulos().size();
    }

    public void add(Articulo t) {
        ArticuloDao.insert(t);
    }

    public void borrar(Articulo t) {
        ArticuloDao.delete(t);
    }

    public Articulo getAt(int position) {
        return getListaArticulos().get(position);
    }

    public boolean isEmpty() {
        return getListaArticulos().isEmpty();
    }

    public ArrayList<Articulo> getArrayList() {
        return getListaArticulos();
    }

    public Articulo existeArticulo(Articulo articulo) {
        for (int i = 0; i < getListaArticulos().size(); i++) {
            Articulo a = getListaArticulos().get(i);
            if (a.getCodigo().equals(articulo.getCodigo())) {
                return a;
            }
        }
        return null;
    }
    public static Articulo existeCodigoArticulo(String codigo) {
        return ArticuloDao.read(codigo);
    }
}