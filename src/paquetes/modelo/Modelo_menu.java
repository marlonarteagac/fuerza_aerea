package paquetes.modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo_menu {
    private String rol;
    private List<String> opcion;


    private void LeerOpciones() {
        if (rol.equals("ADMINISTRADOR")) {
            opcion.add("Gestionar Piloto");
            opcion.add("Gestionar Aeronaves");
            opcion.add("Gestionar Fuerza Pública");
            opcion.add("Gestionar Vuelos");
            opcion.add("Consultar Información");
            opcion.add("Cerrar Sesión");
        } else {
            opcion.add("Gestionar Piloto");
            opcion.add("Gestionar Aeronaves");
            opcion.add("Gestionar Fuerza Pública");
            opcion.add("Consultar Información");
            opcion.add("Cerrar Sesión");
        }
    }

    public Modelo_menu(String rol) {
        this.rol = rol;
        this.opcion = new ArrayList<>();
        LeerOpciones();
    }
    
    public String getRol() {
        return rol;
    }

    public List<String> getopcion() {
        return opcion;
    }

}
