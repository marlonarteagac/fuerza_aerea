package paquetes.vista;

import java.util.List;
import java.util.Scanner;

public class Vista_menu {
    private Scanner entrada;

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
    }

    public int OpcionSeleccionada() {
        return entrada.nextInt();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

}