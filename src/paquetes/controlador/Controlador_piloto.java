package paquetes.controlador;

import paquetes.modelo.Modelo_piloto;
import paquetes.modelo.Piloto;

public class Controlador_piloto {
   
    private Modelo_piloto modelo_piloto;

    public Controlador_piloto(Modelo_piloto modelo_piloto){
        this.modelo_piloto = modelo_piloto;
    }

      // Registra un piloto
      public String RegistrarPiloto(int identificacion, String nombre, String rango) {
        Piloto piloto = new Piloto(identificacion, nombre, rango); // Crea un nuevo piloto
        return modelo_piloto.RegistrarPiloto(piloto); // Llama al Modelo para agregarlo
    }
    
       // Modifica un piloto
       public String ModificarPiloto(int identificacion, String nombre, String rango) {
        return modelo_piloto.ModificarPiloto(identificacion, nombre, rango); // Llama al Modelo para modificarlo
    }

     // Elimina un piloto
    public String EliminarPiloto(int identificacion) {
        return modelo_piloto.EliminarPiloto(identificacion); // Llama al Modelo para eliminarlo
    }
}
