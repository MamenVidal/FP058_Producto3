package TheBigDev.vista;

import TheBigDev.controlador.Controlador;
import java.util.Scanner;

public class GestionOS {

    private Controlador controlador;
    Scanner teclado = new Scanner(System.in);

    public GestionOS() {
        controlador = new Controlador();
    }

    public void inicio() {

        boolean salir = false;
        char opcion;

        do {
            System.out.println("1. Gestión Articulos");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedidos");
            System.out.println("0. Salir");
            opcion = pedirOpcion("1,2,3 o 0");
            switch (opcion) {
                case '1':
                    // TO-BE-DONE
                    boolean subsalir = false;
                    char subopcion;
                    do {
                        System.out.println("1. Añadir Articulo");
                        System.out.println("2. Mostrar Articulos");
                        System.out.println("0. Salir");
                        subopcion = pedirOpcion("1,2 o 0");
                        switch (subopcion) {
                            case '1':
                                vistaAnadirArticulo();
                                break;
                            case '2':
                                vistaMostrarArticulos();
                                break;
                            case '0':
                                subsalir = true;
                                break;
                        }
                    } while (!subsalir);
                    break;
                case '2':
                    // TO-BE-DONE
                    System.out.println("1. Añadir Cliente");
                    System.out.println("2. Mostrar Clientes");
                    System.out.println("3. Mostrar Clientes Estándar");
                    System.out.println("4. Mostrar Clientes Premium");
                    System.out.println("0. Salir");
                    subopcion = pedirOpcion("1,2,3,4 o 0");

                    break;
                case '3':
                    // TO-BE-DONE
                    System.out.println("1. Añadir Pedido");
                    System.out.println("2. Eliminar Pedido");
                    System.out.println("3. Mostrar Pedidos Pendientes Envío");
                    System.out.println("4. Mostrar Pedidos Enviados");
                    System.out.println("0. Salir");
                    subopcion = pedirOpcion("1,2,3,4 o 0");

                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

    public void vistaAnadirArticulo() {
        System.out.println("Inserte codigo producto a crear");
        String codigo = teclado.next();
        System.out.println("Inserte descripcion");
        String descripcion = teclado.next();
        System.out.println("Inserte precioVenta (ej: 1050.32)");
        float precioVenta = teclado.nextFloat();
        System.out.println("Inserte gastoEnvio (ej: 5.50)");
        float gastoEnvio = teclado.nextFloat();
        System.out.println("Inserte tiempo preparación para el envio (en minutos, ej: 2)");
        int tiempo = teclado.nextInt();
        controlador.addArticulo(codigo,descripcion,precioVenta,gastoEnvio,tiempo);
    }
    public void vistaMostrarArticulos() {

    }

    // modificamos la función para pasarle en una variable el texto de las opciones y así poder reutilizar la misma función para los submenús
    char pedirOpcion(String textoOpciones) {
        String resp;
        System.out.println("Elige una opción ("+textoOpciones+"):");
        resp = teclado.next();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }
}
