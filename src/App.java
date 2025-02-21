import paquetes.controlador.*;
import paquetes.modelo.*;
import paquetes.vista.*;

public class App {
    public static void main(String[] args) {

        // Crear modelo, controlador y vista
        Modelo_login modelo_login = new Modelo_login();
        Vista_login vista_login = new Vista_login();
        Controlador_login controlador_login = new Controlador_login(modelo_login, vista_login);

        controlador_login.MostrarLogin();      

}
}