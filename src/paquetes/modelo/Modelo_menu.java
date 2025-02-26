package paquetes.modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo_menu {
    private String rol;
    private List<String> opciones;


    private void LeerOpciones() {
        if (rol.equals("ADMINISTRADOR")) {
            opciones.add("Gestionar Piloto");
            opciones.add("Gestionar Aeronaves");
            opciones.add("Gestionar Fuerza Pública");
            opciones.add("Gestionar Vuelos");
            opciones.add("Consultar Información");
            opciones.add("Cerrar Sesión");
        } else {
            opciones.add("Gestionar Piloto");
            opciones.add("Gestionar Aeronaves");
            opciones.add("Gestionar Fuerza Pública");
            opciones.add("Consultar Información");
            opciones.add("Cerrar Sesión");
        }
    }

    public Modelo_menu(String rol) {
        this.rol = rol;
        this.opciones = new ArrayList<>();
        LeerOpciones();
    }
    
    public String getRol() {
        return rol;
    }

    public List<String> getOpciones() {
        return opciones;
    }

}
