package paquetes.Controlador;

import paquetes.Modelo.Modelo_gestionar_piloto;
import paquetes.Modelo.Piloto;
import paquetes.Principal.Tareas;

public class Controlador_gestionar_piloto {

    private Modelo_gestionar_piloto modelo_gestionar_piloto;

    public Controlador_gestionar_piloto(Modelo_gestionar_piloto modelo_gestionar_piloto) {
        Tareas.LimpiarConsola();
        this.modelo_gestionar_piloto = modelo_gestionar_piloto;
    }

    // Registra un piloto
    public String RegistrarPiloto(int identificacion, String nombre, String rango) {
        Tareas.LimpiarConsola();
        Piloto piloto = new Piloto(identificacion, nombre, rango); // Crea un nuevo piloto
        return modelo_gestionar_piloto.RegistrarPiloto(piloto); // Llama al Modelo para agregarlo
    }

    // Modifica un piloto
    public String ModificarPiloto(int identificacion, String nombre, String rango) {
        Tareas.LimpiarConsola();
        return modelo_gestionar_piloto.ModificarPiloto(identificacion, nombre, rango); // Llama al Modelo para //
                                                                                       // modificarlo
    }

    // Elimina un piloto
    public String EliminarPiloto(int identificacion) {
        Tareas.LimpiarConsola();

        return modelo_gestionar_piloto.EliminarPiloto(identificacion); // Llama al Modelo para eliminarlo
    }

    public String ConsultarPiloto() {
        Tareas.LimpiarConsola();
        return modelo_gestionar_piloto.ConsultarPiloto(); // Llama al método en el Modelo
    }
}
