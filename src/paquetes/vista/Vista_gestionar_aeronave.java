package paquetes.Vista;

import java.util.Scanner;

import paquetes.Controlador.Controlador_gestionar_aeronave;
import paquetes.Controlador.Controlador_menu;
import paquetes.Principal.Tareas;

public class Vista_gestionar_aeronave {

    private Controlador_gestionar_aeronave controlador_gestionar_aeronave; // conectamos con el modelo_piloto y todo lo que// tenga
    private Scanner entrada; // Para leer la entrada del usuario
    private Controlador_menu controlador_menu;

    // inicamos el constructor
    public Vista_gestionar_aeronave(Controlador_gestionar_aeronave controlador_gestionar_aeronave, Controlador_menu controlador_menu) {
        this.controlador_gestionar_aeronave = controlador_gestionar_aeronave;
        this.entrada = new Scanner(System.in);
        this.controlador_menu = controlador_menu;
    }

    public void GestionarAeronaveMenu() {
        while (true) {
            // Menú principal
            System.out.println("+-----------------------------------+");
            System.out.println("|     Gestionar de aeronave         |");
            System.out.println("+-----------------------------------+");
            System.out.println("| 1. Registrar fuerza aeronave      |");
            System.out.println("| 2. Modificar fuerza aeronave      |");
            System.out.println("| 3. Eliminar fuerza aeronave       |");
            System.out.println("| 4. Consultar fuerza aeronave      |");
            System.out.println("| 5. Menú principal                 |");
            System.out.println("+-----------------------------------+");
            System.out.print("| Seleccione una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                Tareas.LimpiarConsola();
                    RegistrarAeronave(); // Registrar un piloto
           
                    break;
                case 2:
                Tareas.LimpiarConsola();
                    ConsultarAeronave(); // Consultar pilotos
                    ModificarAeronave(); // Modificar un piloto


                    break;

                case 3:
                Tareas.LimpiarConsola();
                    ConsultarAeronave(); // Consultar pilotos
                    EliminarAeronave(); // Eliminar un piloto

                    break;
                case 4:
                Tareas.LimpiarConsola();
                    ConsultarAeronave(); // Consultar pilotos

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

    private void RegistrarAeronave() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Registrar  aeronave        |");
        System.out.println("+-----------------------------------+");
        System.out.print("Placa: ");
        String placa = entrada.nextLine();
        System.out.print("Marca: ");
        String marca = entrada.nextLine();
        System.out.print("Color: ");
        String color = entrada.nextLine();
       // Llama al Controlador para registrar el piloto
        Tareas.LimpiarConsola();
        String resultado = controlador_gestionar_aeronave.RegistrarAeronave(placa,marca,color);
        System.out.println(resultado); // Muestra el resultado
    }

    private void ModificarAeronave() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        Modificar  aeronave        |");
        System.out.println("+-----------------------------------+");
        System.out.print("Placa: ");
        String placa = entrada.nextLine();
        System.out.print("Marca: ");
        String marca = entrada.nextLine();
        System.out.print("Color: ");
        String color = entrada.nextLine();

        // Llama al Controlador para modificar el piloto
        Tareas.LimpiarConsola();
        String resultado = controlador_gestionar_aeronave.ModificarAeronave(placa,marca,color);
        System.out.println(resultado); // Muestra el resultado
       
    }

    private void EliminarAeronave() {
        System.out.println("+-----------------------------------+");
        System.out.println("|         Eliminar aeronave         |");
        System.out.println("+-----------------------------------+");
        System.out.print("Identificación: ");
        String placa = entrada.nextLine();
        System.out.println("+-----------------------------------+");
        System.out.println("| Autoriza eliminar aeronave?       |");
        System.out.println("+-----------------------------------+");
        System.out.println("|       No = 0        Si = 1        |");
        System.out.println("+-----------------------------------+");
        int validar = entrada.nextInt();
        Tareas.LimpiarConsola();
        if (validar == 1) {
            // Llama al Controlador para eliminar el piloto
            String resultado = controlador_gestionar_aeronave.EliminarAeronave(placa);
            System.out.println(resultado); // Muestra el resultado

        } else {
            System.out.println("Aeronave no eliminada");
        }

    }

    private void VolverMenuPrincipal() {
        controlador_menu.IniciarMenuPrincipal();

    }

    private void ConsultarAeronave() {
        System.out.println("+-----------------------------------+");
        System.out.println("|    Consultar  aeronave            |");
        System.out.println("+-----------------------------------+");
        System.out.println(controlador_gestionar_aeronave.ConsultarAeronave());

    }
}
