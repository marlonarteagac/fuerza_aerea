package paquetes.Vista;

import java.util.Scanner;

import paquetes.Controlador.Controlador_gestionar_fuerza_publica;
import paquetes.Controlador.Controlador_menu;
import paquetes.Principal.Tareas;

public class Vista_gestionar_fuerza_publica {

    private Controlador_gestionar_fuerza_publica controlador_gestionar_fuerza_publica; // conectamos con el modelo_piloto y todo lo que// tenga
    private Scanner entrada; // Para leer la entrada del usuario
    private Controlador_menu controlador_menu;

    // inicamos el constructor
    public Vista_gestionar_fuerza_publica(Controlador_gestionar_fuerza_publica
     controlador_gestionar_fuerza_publica,
     Controlador_menu controlador_menu) {
        this.controlador_gestionar_fuerza_publica = controlador_gestionar_fuerza_publica;
        this.entrada = new Scanner(System.in);
        this.controlador_menu = controlador_menu;
    }

    public void GestionarfuerzaPublicaMenu() {
        while (true) {
            // Menú principal
            System.out.println("+-----------------------------------+");
            System.out.println("|          Gestionar de Piloto      |");
            System.out.println("+-----------------------------------+");
            System.out.println("| 1. Registrar fuerza publica       |");
            System.out.println("| 2. Modificar fuerza publica       |");
            System.out.println("| 3. Eliminar fuerza publica        |");
            System.out.println("| 4. Consultar fuerza publica       |");
            System.out.println("| 5. Menú principal                 |");
            System.out.println("+-----------------------------------+");
            System.out.print("| Seleccione una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                Tareas.LimpiarConsola();
                    RegistrarPiloto(); // Registrar un piloto
           
                    break;
                case 2:
                Tareas.LimpiarConsola();
                    ConsultarPiloto(); // Consultar pilotos
                    ModificarPiloto(); // Modificar un piloto


                    break;

                case 3:
                Tareas.LimpiarConsola();
                    ConsultarPiloto(); // Consultar pilotos
                    EliminarPiloto(); // Eliminar un piloto

                    break;
                case 4:
                Tareas.LimpiarConsola();
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
        System.out.println("|     Registrar fuerza publica      |");
        System.out.println("+-----------------------------------+");
        System.out.print("código: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

       // Llama al Controlador para registrar el piloto
        Tareas.LimpiarConsola();
        String resultado = controlador_gestionar_fuerza_publica.RegistrarfuerzaPublica(codigo, nombre);
        System.out.println(resultado); // Muestra el resultado
    }

    private void ModificarPiloto() {
        System.out.println("+-----------------------------------+");
        System.out.println("|      Modificar fuerza publica     |");
        System.out.println("+-----------------------------------+");
        System.out.print("Código: ");
        int codigo = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        // Llama al Controlador para modificar el piloto
        Tareas.LimpiarConsola();
        String resultado = controlador_gestionar_fuerza_publica.ModificarFuerzaPublica(codigo, nombre);
        System.out.println(resultado); // Muestra el resultado
       
    }

    private void EliminarPiloto() {
        System.out.println("+-----------------------------------+");
        System.out.println("|     Eliminar fuerza publica       |");
        System.out.println("+-----------------------------------+");
        System.out.print("Identificación: ");
        int codigo = entrada.nextInt();
        System.out.println("+-----------------------------------+");
        System.out.println("| Autoriza eliminar fuerza publica? |");
        System.out.println("+-----------------------------------+");
        System.out.println("|       No = 0        Si = 1        |");
        System.out.println("+-----------------------------------+");
        int validar = entrada.nextInt();
        Tareas.LimpiarConsola();
        if (validar == 1) {
            // Llama al Controlador para eliminar el piloto
            String resultado = controlador_gestionar_fuerza_publica.EliminarFuerzaPublica(codigo);
            System.out.println(resultado); // Muestra el resultado

        } else {
            System.out.println("fuerza publica no eliminada");
        }

    }

    private void VolverMenuPrincipal() {
        controlador_menu.IniciarMenuPrincipal();

    }

    private void ConsultarPiloto() {
        System.out.println("+-----------------------------------+");
        System.out.println("|          Consultar piloto          |");
        System.out.println("+-----------------------------------+");
        System.out.println(controlador_gestionar_fuerza_publica.ConsultarfuerzaPublica());

    }
}
