package paquetes.modelo;

import java.util.ArrayList;

public class Modelo_piloto {
    private ArrayList<Piloto> pilotos;

    public Modelo_piloto() {
        pilotos = new ArrayList<>();
        // Agregar pilotos a la lista
    }

   public Piloto BuscarPiloto(String identificacion) {
        for (Piloto p : pilotos) {
            if (p.getIdentificacion().equals((identificacion))) {
                return p;
            }
        }
        return null;
    }
    public boolean AgregarPiloto(Piloto piloto) {
        if (BuscarPiloto(piloto.getIdentificacion()) == null) {
            pilotos.add(piloto);
            return true;
        }
        return false;
    }
    
    public boolean ActualizarPiloto(String identificacion, String nombre, String rango) {
        Piloto piloto = BuscarPiloto(identificacion);
        if (piloto != null) {
            piloto.setNombre(nombre);
            piloto.setRango(rango);
            return true;
        }
        return false;
    }

    public boolean EliminarPiloto(String identificacion) {
        Piloto piloto = BuscarPiloto(identificacion);
        if (piloto != null) {
            pilotos.remove(piloto);
            return true;
        }
        return false;
    }
}
