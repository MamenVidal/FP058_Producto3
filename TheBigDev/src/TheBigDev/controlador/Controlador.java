package TheBigDev.controlador;

import java.util.List;
import TheBigDev.modelo.Datos;
import TheBigDev.modelo.Articulo;

public class Controlador {
    private Datos datos;

    public Controlador() {
        datos = new Datos();
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public void addArticulo(String codigo,String descripcion,float precioVenta,float gastoEnvio,int tiempo) {
        try {
            Articulo articulo = new Articulo(codigo, descripcion, precioVenta, gastoEnvio, tiempo);
            if( datos.getListaArticulos().existeArticulo(articulo) != null ) {
                System.out.println(ANSI_RED_BACKGROUND+"ERROR: Ya existe un articulo añadido con codigo: "+articulo.getCodigo()+ANSI_RESET);
                return;
            }
            try {
                datos.getListaArticulos().add(articulo);
            } catch (Exception e) {
                System.out.println(ANSI_RED_BACKGROUND+"ERROR: Se produjo un error al añadir el articulo a la lista de articulos: "+e+ANSI_RESET);
            }
            System.out.println(ANSI_GREEN_BACKGROUND+"EXITO: articulo añadido con codigo: "+articulo.getCodigo()+ANSI_RESET);
        } catch (Exception e) {
            System.out.println(ANSI_RED_BACKGROUND+"ERROR: Se produjo el siguiente error al crear el articulo: "+e+ANSI_RESET);
        }
    }
    // TO-BE-DONE
}
