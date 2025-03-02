package paquetes.Modelo;

import java.util.ArrayList;

public class Modelo_gestionar_fuerza_publica {
    private ArrayList<Fuerza_publica> fuerzas_publicas; // lista de objetos que guarda los pilotos

    public Modelo_gestionar_fuerza_publica() {
        fuerzas_publicas = new ArrayList<>(); // inicializamos la lista

    }

    // Metotodo para buscar si el piloto ya está en la lista
    private Fuerza_publica BuscarFuerzaPublica(int codigo) {
        for (Fuerza_publica fp : fuerzas_publicas) {
            if (fp.getCodigo() == codigo) {
                return fp; // Retorna el piloto si lo encuentra
            }
        }
        return null; // devuleve null si no encuenta la identificacion
    }

    // Agrega un piloto a la lista
    public String RegistrarfuerzaPublica(Fuerza_publica fuerza_publica) {
        if (BuscarFuerzaPublica(fuerza_publica.getCodigo()) != null) {
            return "fuerza publica ya existe."; // si es diferente de null es que ya esa identificacion existe
        }
        fuerzas_publicas.add(fuerza_publica); // se agrega el piloto a la lista
        return "fuerza publica registrada exitosamente.";
    }

    // metodo para modificar un piloto
    public String ModificarFuerzaPublica(int codigo, String nombre) {
        Fuerza_publica fuerza_publica = BuscarFuerzaPublica(codigo);
        if (fuerza_publica != null) {
            fuerza_publica.setCodigo(codigo);// Actualiza la identificacion
            fuerza_publica.setNombre(nombre); // Actualiza el nombre
            return "Fuerza publica modificada exitosamente.";
        }
        return "Fuerza publica no encontrado."; // Si el piloto no existe
    }

    // Elimina un piloto de la lista
    public String EliminarFuerzaPublica(int codigo) {
        Fuerza_publica fuerza_publica = BuscarFuerzaPublica(codigo);
        if (fuerza_publica != null) {
            fuerzas_publicas.remove(fuerza_publica); // Elimina el piloto encontrado
            return "fuerza publica eliminada exitosamente.";
        }
        return "Fuerza publcia no encontrada."; // Si el piloto no existe
    }

    // consultar pilotos existentes en la lista
    public String ConsultarFuerzaPublica() {
        if (fuerzas_publicas.isEmpty()) {

            return "No hay fuerzas publicas registradas.";
        }
        StringBuilder resultado = new StringBuilder("Lista de pilotos:\n");
        for (Fuerza_publica fp : fuerzas_publicas) {
            resultado.append("Codigo: ").append(fp.getCodigo())
                    .append(", Nombre: ").append(fp.getNombre())
                    .append("\n");
        }
        return resultado.toString();

    }
}
