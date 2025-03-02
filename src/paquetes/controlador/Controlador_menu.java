package paquetes.Controlador;
import java.util.List;
import paquetes.Modelo.Modelo_gestionar_piloto;
import paquetes.Modelo.Modelo_menu;
import paquetes.Vista.Vista_gestionar_piloto;
import paquetes.Vista.Vista_menu;
import paquetes.Principal.Tareas;


public class Controlador_menu {
    private Modelo_menu modelo_menu;
    private Vista_menu vista_menu;
    private Modelo_gestionar_piloto modelo_gestionar_piloto;  // Mantener una única instancia
    private Controlador_gestionar_piloto controlador_gestionar_piloto;

    
    public Controlador_menu(Modelo_menu modelo_menu, Vista_menu vista_menu) {
        this.modelo_menu = modelo_menu;
        this.vista_menu = vista_menu;
        this.modelo_gestionar_piloto = new Modelo_gestionar_piloto();
        this.controlador_gestionar_piloto = new Controlador_gestionar_piloto(modelo_gestionar_piloto);
        
    }


    private void EjecutarOpcion(int opcion) {
        switch (opcion)  {

            case 1:
                vista_menu.MostrarMensaje("Gestionar Piloto seleccionado.");
                Tareas.LimpiarConsola();
                MostrarGestionPiloto();
                
             
                break;
            case 2:
                vista_menu.MostrarMensaje("Gestionar Aeronaves seleccionado.");
                break;
            case 3:
                vista_menu.MostrarMensaje("Gestionar Fuerza Pública seleccionado.");
                break;
            case 4:
                vista_menu.MostrarMensaje(modelo_menu.getRol().equals("ADMINISTRADOR") ? "Gestionar Vuelos seleccionado."
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

    private void MostrarGestionPiloto() {
        Vista_gestionar_piloto vista_gestionar_piloto = new Vista_gestionar_piloto(controlador_gestionar_piloto, this);
        vista_gestionar_piloto.GestionarPilotoMenu();

    }
    

}
