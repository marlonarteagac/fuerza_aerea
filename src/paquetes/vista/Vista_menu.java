package paquetes.Vista;

import java.util.List;
import java.util.Scanner;

import paquetes.Principal.Tareas;

public class Vista_menu {
    private Scanner entrada;
    private int opcionSeleccionada;

    public Vista_menu() {
        this.entrada = new Scanner(System.in);

    }

    public void MostrarMenu(List<String> opciones) {

        System.out.println("+-----------------------------------+");
        System.out.println("|          Menú Principal           |");
        System.out.println("+-----------------------------------+");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.println("| " + (i + 1) + ". " + opciones.get(i));
        }
        System.out.println("+-----------------------------------+");
        System.out.print("| Seleccione una opción: ");
        opcionSeleccionada = entrada.nextInt();
        entrada.nextLine();
        Tareas.LimpiarConsola();
    }

    public int OpcionSeleccionada() {

        return opcionSeleccionada;
    }

    public void MostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}