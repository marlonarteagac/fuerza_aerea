package paquetes.contorlador;

import java.util.List;

import paquetes.modelo.Modelo_menu;
import paquetes.vista.Vista_menu;

public class Controlador_menu {
        private Modelo_menu modelo_menu;
    private Vista_menu vista_menu;

    public Controlador_menu(Modelo_menu modelo_menu, Vista_menu vista_menu) {
        this.modelo_menu = modelo_menu;
        this.vista_menu = vista_menu;
    }
     public void IniciarMenu() {
        List<String> options = modelo_menu.getopcion();
        vista_menu.MostrarMenu(options);
        int opcion_seleccionada = vista_menu.OpcionSeleccionada();
        EjecutarOpcion(opcion_seleccionada);
    }

 private void EjecutarOpcion(int option) {
        switch (option) {
            case 1:
                vista_menu.displayMessage("Gestionar Piloto seleccionado.");
                break;
            case 2:
            vista_menu.displayMessage("Gestionar Aeronaves seleccionado.");
                break;
            case 3:
            vista_menu.displayMessage("Gestionar Fuerza Pública seleccionado.");
                break;
            case 4:
            vista_menu.displayMessage(modelo_menu.getRol().equals("ADMINISTRADOR") ? "Gestionar Vuelos seleccionado." : "Consultar Información seleccionado.");
                break;
            case 5:
                if (modelo_menu.getRol().equals("ADMINISTRADOR")) {
                    vista_menu.displayMessage("Consultar Información seleccionado.");
                } else {
                    vista_menu.displayMessage("Cerrando sesión...");
                    System.exit(0);
                }
                break;
            case 6:
                if (modelo_menu.getRol().equals("ADMINISTRADOR")) {
                    vista_menu.displayMessage("Cerrando sesión...");
                    System.exit(0);
                }
                break;
            default:
                vista_menu.displayMessage("Opción no válida.");
        }
    }

}
