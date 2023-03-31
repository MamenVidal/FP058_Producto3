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
        char subOpcion;

        do {
            System.out.println("1. Gestión Articulos");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedidos");
            System.out.println("0. Salir");
            opcion = pedirOpcion("1,2,3 o 0");
            switch (opcion) {
                case '1':
                    // TO-BE-DONE
                    System.out.println("1. Añadir Articulo");
                    System.out.println("2. Mostrar Articulos");
                    System.out.println("0. Salir");
                    subOpcion = pedirOpcion("1,2 o 0");

                    break;
                case '2':
                    // TO-BE-DONE
                    System.out.println("1. Añadir Cliente");
                    System.out.println("2. Mostrar Clientes");
                    System.out.println("3. Mostrar Clientes Estándar");
                    System.out.println("4. Mostrar Clientes Premium");
                    System.out.println("0. Salir");
                    opcion = pedirOpcion("1,2,3,4 o 0");

                    break;
                case '3':
                    // TO-BE-DONE
                    System.out.println("1. Añadir Pedido");
                    System.out.println("2. Eliminar Pedido");
                    System.out.println("3. Mostrar Pedidos Pendientes Envío");
                    System.out.println("4. Mostrar Pedidos Enviados");
                    System.out.println("0. Salir");
                    opcion = pedirOpcion("1,2,3,4 o 0");

                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

    // modificamos la función para pasarle en una variable el texto de las opciones y así poder reutilizar la misma función para los submenús
    char pedirOpcion(String textoOpciones) {
        String resp;
        System.out.println("Elige una opción ("+textoOpciones+"):");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }
}
