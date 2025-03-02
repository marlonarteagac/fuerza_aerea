package paquetes.Principal;
import paquetes.Controlador.*;
import paquetes.Modelo.*;
import paquetes.Vista.*;

public class App {
    public static void main(String[] args) {

        // Crear modelo, controlador y vista
        Modelo_login modelo_login = new Modelo_login();
        Vista_login vista_login = new Vista_login();
        Controlador_login controlador_login = new Controlador_login(modelo_login, vista_login);

        controlador_login.MostrarLogin();      
}
}