package paquetes.Controlador;


import paquetes.Modelo.Aeronave;
import paquetes.Modelo.Modelo_gestionar_aeronave;

public class Controlador_gestionar_aeronave {

    private Modelo_gestionar_aeronave modelo_gestionar_aeronave;

    public Controlador_gestionar_aeronave(Modelo_gestionar_aeronave modelo_gestionar_aeronave) {

        this.modelo_gestionar_aeronave = modelo_gestionar_aeronave;
    }

    // Registra un piloto
    public String RegistrarAeronave(String placa, String marca, String color) {
        Aeronave a = new Aeronave(placa, marca, color); // Crea un nuevo piloto
        return modelo_gestionar_aeronave.RegistrarAeronave(a); // Llama al Modelo para agregarlo
    }

    // Modifica un piloto
    public String ModificarAeronave(String placa, String marca, String color) {
        return modelo_gestionar_aeronave.ModificarAeronave(placa, marca, color); // Llama al Modelo para //                                                                             // modificarlo
    }

    // Elimina un piloto
    public String EliminarAeronave(String placa) {

        return modelo_gestionar_aeronave.EliminarAeronave(placa); // Llama al Modelo para eliminarlo
    }

    public String ConsultarAeronave() {

        return modelo_gestionar_aeronave.ConsultarAeronave(); // Llama al método en el Modelo
    }
}
