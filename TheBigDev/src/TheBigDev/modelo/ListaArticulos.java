package TheBigDev.modelo;

public class ListaArticulos extends Lista<Articulo> {
    // TO-BE-DONE
    public Articulo existeArticulo(Articulo articulo) {
        for (int i = 0; i < this.lista.size(); i++) {
            Articulo a = this.lista.get(i);
            if (a.getCodigo().equals(articulo.getCodigo())) {
                return a;
            }
        }
        return null;
    }
    public Articulo existeCodigoArticulo(String codigo) {
        for (int i = 0; i < this.lista.size(); i++) {
            Articulo a = this.lista.get(i);
            if (a.getCodigo().equals(codigo)) {
                return a;
            }
        }
        return null;
    }
}