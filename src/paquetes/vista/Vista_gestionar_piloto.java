package paquetes.Vista;

import java.util.Scanner;

import paquetes.Controlador.Controlador_gestionar_piloto;
import paquetes.Controlador.Controlador_menu;
import paquetes.Principal.Tareas;

public class Vista_gestionar_piloto {

    private Controlador_gestionar_piloto controlador_gestionar_piloto; // conectamos con el modelo_piloto y todo lo que
                                                                       // tenga
    private Scanner entrada; // Para leer la entrada del usuario
    private Controlador_menu controlador_menu;

    // inicamos el constructor
    public Vista_gestionar_piloto(Controlador_gestionar_piloto controlador_gestionar_piloto,
            Controlador_menu controlador_menu) {
        this.controlador_gestionar_piloto = controlador_gestionar_piloto;
        this.entrada = new Scanner(System.in);
        this.controlador_menu = controlador_menu;
    }

    public void GestionarPilotoMenu() {
        while (true) {
            // Menú principal
            System.out.println("+-----------------------------------+");
            System.out.println("|          Gestionar de Piloto      |");
            System.out.println("+-----------------------------------+");
            System.out.println("| 1. Registrar Pilotos               |");
            System.out.println("| 2. Modificar Pilotos               |");
            System.out.println("| 3. Eliminar Pilotos                |");
            System.out.println("| 4. Consultar pilotos               |");
            System.out.println("| 5. Menú principal                 |");
            System.out.println("+-----------------------------------+");
            System.out.print("| Seleccione una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    RegistrarPiloto(); // Registrar un piloto
                    ConsultarPiloto(); // Consultar pilotos
                    break;
                case 2:
                    ModificarPiloto(); // Modificar un piloto
                    break;

                case 3:
                    EliminarPiloto(); // Eliminar un piloto
                    break;
                case 4:
                    ConsultarPiloto(); // Consultar pilotos

                    break;
                case 5:
                    Tareas.LimpiarConsola();
                    VolverMenuPrincipal();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private void RegistrarPiloto() {
        System.out.println("+-----------------------------------+");
        System.out.println("|          Registrar piloto         |");
        System.out.println("+-----------------------------------+");
        System.out.print("Identificación: ");
        int identificacion = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Rango: ");
        String rango = entrada.nextLine();

        // Llama al Controlador para registrar el piloto
        String resultado = controlador_gestionar_piloto.RegistrarPiloto(identificacion, nombre, rango);
        System.out.println(resultado); // Muestra el resultado
    }

    private void ModificarPiloto() {
        System.out.println("+-----------------------------------+");
        System.out.println("|          Modificar piloto         |");
        System.out.println("+-----------------------------------+");
        System.out.print("Identificación: ");
        int identificacion = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Rango: ");
        String rango = entrada.nextLine();

        // Llama al Controlador para modificar el piloto
        String resultado = controlador_gestionar_piloto.ModificarPiloto(identificacion, nombre, rango);
        System.out.println(resultado); // Muestra el resultado
    }

    private void EliminarPiloto() {
        System.out.println("+-----------------------------------+");
        System.out.println("|          Eliminar piloto          |");
        System.out.println("+-----------------------------------+");
        System.out.print("Identificación: ");
        int identificacion = entrada.nextInt();
        System.out.println("+-----------------------------------+");
        System.out.println("| ¿Autoriza eliminar el piloto??    |");
        System.out.println("+-----------------------------------+");
        System.out.println("|       No = 0        Si = 1        |");
        System.out.println("+-----------------------------------+");
        int validar = entrada.nextInt();
        if (validar == 1) {
            // Llama al Controlador para eliminar el piloto
            String resultado = controlador_gestionar_piloto.EliminarPiloto(identificacion);
            System.out.println(resultado); // Muestra el resultado

        } else {
            System.out.println("piloto no eliminado");
        }

    }

    private void VolverMenuPrincipal() {
        controlador_menu.IniciarMenuPrincipal();
    }

    private void ConsultarPiloto() {
        System.out.println(controlador_gestionar_piloto.ConsultarPiloto());
    }
}
