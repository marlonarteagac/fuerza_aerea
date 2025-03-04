package paquetes.Controlador;

import java.util.List;

import paquetes.Modelo.Modelo_gestionar_aeronave;
import paquetes.Modelo.Modelo_gestionar_fuerza_publica;
import paquetes.Modelo.Modelo_gestionar_piloto;
import paquetes.Modelo.Modelo_menu;
import paquetes.Vista.Vista_gestionar_aeronave;
import paquetes.Vista.Vista_gestionar_fuerza_publica;
import paquetes.Vista.Vista_gestionar_piloto;
import paquetes.Vista.Vista_menu;

public class Controlador_menu {
    private Modelo_menu modelo_menu;
    private Vista_menu vista_menu;
    private Modelo_gestionar_piloto modelo_gestionar_piloto; // Mantener una única instancia
    private Controlador_gestionar_piloto controlador_gestionar_piloto;

    private Modelo_gestionar_fuerza_publica modelo_gestionar_fuerza_publica;// Mantener una única instancia
    private Controlador_gestionar_fuerza_publica controlador_gestionar_fuerza_publica;

    private Modelo_gestionar_aeronave modelo_gestionar_aeronave;// Mantener una única instancia
    private Controlador_gestionar_aeronave controlador_gestionar_aeronave;


    public Controlador_menu(Modelo_menu modelo_menu, Vista_menu vista_menu) {
        this.modelo_menu = modelo_menu;
        this.vista_menu = vista_menu;
        this.modelo_gestionar_piloto = new Modelo_gestionar_piloto();
        this.controlador_gestionar_piloto = new Controlador_gestionar_piloto(modelo_gestionar_piloto);

        this.modelo_gestionar_fuerza_publica = new Modelo_gestionar_fuerza_publica();
        this.controlador_gestionar_fuerza_publica = new Controlador_gestionar_fuerza_publica(modelo_gestionar_fuerza_publica);

        this.modelo_gestionar_aeronave = new Modelo_gestionar_aeronave();
        this.controlador_gestionar_aeronave = new Controlador_gestionar_aeronave(modelo_gestionar_aeronave);
    }

    private void EjecutarOpcion(int opcion) {
        switch (opcion) {

            case 1:
                vista_menu.MostrarMensaje("Gestionar Piloto seleccionado.");
                MostrarGestionPiloto();

                break;
            case 2:
                vista_menu.MostrarMensaje("Gestionar Fuerza Pública seleccionado.");
                MostrarGestionFuerzaPublica();
                break;
            case 3:
                vista_menu.MostrarMensaje("Gestionar Aeronaves seleccionado.");
                MostrarGestionAeronave();
                break;
            case 4:
                vista_menu
                        .MostrarMensaje(modelo_menu.getRol().equals("ADMINISTRADOR") ? "Gestionar Vuelos seleccionado."
                                : "Consultar Información seleccionado.");
                break;
            case 5:
                if (modelo_menu.getRol().equals("ADMINISTRADOR")) {
                    vista_menu.MostrarMensaje("Consultar Información seleccionado.");
                } else {
                    vista_menu.MostrarMensaje("Cerrando sesión...");
                    System.exit(0);
                }
                break;
            case 6:
                if (modelo_menu.getRol().equals("ADMINISTRADOR")) {
                    vista_menu.MostrarMensaje("Cerrando sesión...");
                    System.exit(0);
                }
                break;
            default:
                vista_menu.MostrarMensaje("Opción no válida.");
        }
    }

    public void IniciarMenuPrincipal() {

        List<String> opcion = modelo_menu.getOpciones();
        vista_menu.MostrarMenu(opcion);
        int opcion_seleccionada = vista_menu.OpcionSeleccionada();
        EjecutarOpcion(opcion_seleccionada);

    }

    //mustra el menu de gestionar los pilotos
    private void MostrarGestionPiloto() {
        Vista_gestionar_piloto vista_gestionar_piloto = new Vista_gestionar_piloto(controlador_gestionar_piloto, this);
        vista_gestionar_piloto.GestionarPilotoMenu();

    }
//mustra el menu de gestionar fuerzas
    private void MostrarGestionFuerzaPublica() {
        Vista_gestionar_fuerza_publica vista_gestionar_fuerza_publica = new Vista_gestionar_fuerza_publica(
                controlador_gestionar_fuerza_publica, this);
        vista_gestionar_fuerza_publica.GestionarfuerzaPublicaMenu();
    }

    private void MostrarGestionAeronave() {
        Vista_gestionar_aeronave vista_gestionar_aeronave = new Vista_gestionar_aeronave(
                controlador_gestionar_aeronave, this);
        vista_gestionar_aeronave.GestionarAeronaveMenu();
    }

}
