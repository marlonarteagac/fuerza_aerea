package paquetes.Modelo;

import java.util.ArrayList;

public class Modelo_gestionar_aeronave {
    private ArrayList<Aeronave> aeronaves; // lista de objetos que guarda los pilotos

    public Modelo_gestionar_aeronave() {
        aeronaves = new ArrayList<>(); // inicializamos la lista
    }

    // Metotodo para buscar si el piloto ya está en la lista
    private Aeronave BuscarAeronave(String placa) {
        for (Aeronave a : aeronaves) {
            if (a.getPlaca() == placa) {
                return a; // Retorna el piloto si lo encuentra
            }
        }
        return null; // devuleve null si no encuenta la identificacion
    }

    // Agrega un piloto a la lista
    public String RegistrarAeronave(Aeronave aeronave) {
        if (BuscarAeronave(aeronave.getPlaca()) != null) {
            return "Aeronave ya existe."; // si es diferente de null es que ya esa identificacion existe
        }
        aeronaves.add(aeronave); // se agrega el piloto a la lista
        return "Aeronave registrada exitosamente.";
    }

    // metodo para modificar un piloto
    public String ModificarAeronave(String placa, String marca, String color) {
        Aeronave aeronave = BuscarAeronave(placa);
        if (aeronave != null) {
            aeronave.setPlaca(placa);// Actualiza la identificacion
            aeronave.setMarca(marca); // Actualiza el nombre
            aeronave.setColor(color); // Actualiza el color
            return "Aeronave modificada exitosamente.";
        }
        return "Aeronave no encontrada."; // Si el piloto no existe
    }

    // Elimina un piloto de la lista
    public String EliminarAeronave(String placa) {
        Aeronave aeronave = BuscarAeronave(placa);
        if (aeronave != null) {
            aeronaves.remove(aeronave); // Elimina el piloto encontrado
            return "Aeronave eliminada exitosamente.";
        }
        return "Aeronave no encontrada."; // Si el piloto no existe
    }

    // consultar pilotos existentes en la lista
    public String ConsultarAeronave() {
        if (aeronaves.isEmpty()) {
            return "No hay aeronaves registradas.";
        }
        StringBuilder resultado = new StringBuilder("Lista de aeronaves:\n");
        for (Aeronave aeronave : aeronaves) {
            resultado.append("Placa: ").append(aeronave.getPlaca());
            resultado.append(", Marca: ").append(aeronave.getMarca());
            resultado.append(", Color: ").append(aeronave.getColor());

            resultado.append("\n");
        }
        return resultado.toString();

    }
}
