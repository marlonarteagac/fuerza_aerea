package paquetes.vista;

import java.util.Scanner;

import paquetes.controlador.Controlador_piloto;

public class Vista_piloto {

    private Controlador_piloto controlador_piloto; // conectamos con el modelo_piloto y todo lo que tenga
    private Scanner entrada; // Para leer la entrada del usuario


    //inicamos el constructor
    public Vista_piloto(Controlador_piloto controlador_piloto) {
        this.controlador_piloto = controlador_piloto;
        this.entrada = new Scanner(System.in);
    }




public void GestionarPilotoMenu() {
        while (true) {
            // Menú principal
            System.out.println("+-----------------------------------+");
            System.out.println("|          Menú de Pilotos          |");
            System.out.println("+-----------------------------------+");
            System.out.println("| 1. Registrar Piloto               |");
            System.out.println("| 2. Modificar Piloto               |");
            System.out.println("| 3. Eliminar Piloto                |");
            System.out.println("| 4. Menú principal                 |");
            System.out.println("+-----------------------------------+");
            System.out.print("| Seleccione una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                  RegistrarPiloto(); // Registrar un piloto
                    break;
                case 2:
                    ModificarPiloto(); // Modificar un piloto
                    break;

                case 3:
                    EliminarPiloto(); // Eliminar un piloto
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    
                    return; // Salir del programa
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void RegistrarPiloto() {
        System.out.print("Identificación: ");
        int identificacion = entrada.nextInt();
        entrada.nextLine(); 
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Rango: ");
        String rango = entrada.nextLine();

        // Llama al Controlador para registrar el piloto
        String resultado = controlador_piloto.RegistrarPiloto(identificacion, nombre, rango);
        System.out.println(resultado); // Muestra el resultado
    }

    private void ModificarPiloto() {
        System.out.print("Identificación: ");
        int identificacion = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Rango: ");
        String rango = entrada.nextLine();

        // Llama al Controlador para modificar el piloto
        String resultado = controlador_piloto.ModificarPiloto(identificacion, nombre, rango);
        System.out.println(resultado); // Muestra el resultado
    }

    private void EliminarPiloto() {
        System.out.print("Identificación: ");
        int identificacion = entrada.nextInt();

        entrada.nextLine(); // Limpiar el buffer

        // Llama al Controlador para eliminar el piloto
        String resultado = controlador_piloto.EliminarPiloto(identificacion);
        System.out.println(resultado); // Muestra el resultado
    }
}
