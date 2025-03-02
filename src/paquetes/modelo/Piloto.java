package paquetes.Modelo;

public class Piloto {

    private int identificacion;
    private String nombre;
    private String rango;

    public Piloto(int identificacion, String nombre, String rango) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.rango = rango;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }


}
