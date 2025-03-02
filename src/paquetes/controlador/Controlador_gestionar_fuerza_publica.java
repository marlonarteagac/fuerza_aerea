package paquetes.Controlador;

import paquetes.Modelo.Modelo_gestionar_fuerza_publica;
import paquetes.Modelo.Fuerza_publica;

public class Controlador_gestionar_fuerza_publica {

    private Modelo_gestionar_fuerza_publica modelo_gestionar_fuerza_publica;

    public Controlador_gestionar_fuerza_publica(Modelo_gestionar_fuerza_publica modelo_gestionar_fuerza_publica) {

        this.modelo_gestionar_fuerza_publica = modelo_gestionar_fuerza_publica;
    }

    // Registra un piloto
    public String RegistrarfuerzaPublica(int codigo, String nombre) {
        Fuerza_publica fp = new Fuerza_publica(codigo, nombre); // Crea un nuevo piloto
        return modelo_gestionar_fuerza_publica.RegistrarfuerzaPublica(fp); // Llama al Modelo para agregarlo
    }

    // Modifica un piloto
    public String ModificarFuerzaPublica(int codigo, String nombre) {
        return modelo_gestionar_fuerza_publica.ModificarFuerzaPublica(codigo, nombre); // Llama al Modelo para //                                                                             // modificarlo
    }

    // Elimina un piloto
    public String EliminarFuerzaPublica(int codigo) {

        return modelo_gestionar_fuerza_publica.EliminarFuerzaPublica(codigo); // Llama al Modelo para eliminarlo
    }

    public String ConsultarfuerzaPublica() {

        return modelo_gestionar_fuerza_publica.ConsultarFuerzaPublica(); // Llama al método en el Modelo
    }
}
