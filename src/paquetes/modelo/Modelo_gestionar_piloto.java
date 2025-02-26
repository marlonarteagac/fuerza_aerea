package paquetes.modelo;

import java.util.ArrayList;

public class Modelo_gestionar_piloto {
    private ArrayList<Piloto> pilotos; // lista de objetos que guarda los pilotos

    public Modelo_gestionar_piloto() {
        pilotos = new ArrayList<>(); // inicializamos la lista

    }

    // Metotodo para buscar si el piloto ya está en la lista
    private Piloto BuscarPiloto(int identificacion) {
        for (Piloto p : pilotos) {
            if (p.getIdentificacion() == identificacion) {
                return p; // Retorna el piloto si lo encuentra
            }
        }
        return null; // devuleve null si no encuenta la identificacion
    }

    // Agrega un piloto a la lista
    public String RegistrarPiloto(Piloto piloto) {
        if (BuscarPiloto(piloto.getIdentificacion()) != null) {
            return "El piloto ya existe."; // si es diferente de null es que ya esa identificacion existe
        }
        pilotos.add(piloto); // se agrega el piloto a la lista
        return "Piloto registrado exitosamente.";
    }

    // metodo para modificar un piloto
    public String ModificarPiloto(int identificacion, String nombre, String rango) {
        Piloto piloto = BuscarPiloto(identificacion);
        if (piloto != null) {
            piloto.setIdentificacion(identificacion); // Actualiza la identificacion
            piloto.setNombre(nombre); // Actualiza el nombre
            piloto.setRango(rango); // Actualiza el rango
            return "Piloto modificado exitosamente.";
        }
        return "Piloto no encontrado."; // Si el piloto no existe
    }

    // Elimina un piloto de la lista
    public String EliminarPiloto(int identificacion) {
        Piloto piloto = BuscarPiloto(identificacion);
        if (piloto != null) {
            pilotos.remove(piloto); // Elimina el piloto encontrado
            return "Piloto eliminado exitosamente.";
        }
        return "Piloto no encontrado."; // Si el piloto no existe
    }

    // consultar pilotos existentes en la lista
    public String ConsultarPiloto() {
        if (pilotos.isEmpty()) {

            return "No hay pilotos registrados.";
        }
        StringBuilder resultado = new StringBuilder("Lista de pilotos:\n");
        for (Piloto p : pilotos) {
            resultado.append("ID: ").append(p.getIdentificacion())
                    .append(", Nombre: ").append(p.getNombre())
                    .append(", Rango: ").append(p.getRango())
                    .append("\n");
        }
        return resultado.toString();

    }
}
