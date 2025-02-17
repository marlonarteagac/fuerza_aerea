import paquetes.contorlador.Controlador_login;
import paquetes.modelo.Modelo_login;
import paquetes.vista.Vista_login;

public class App {
    public static void main(String[] args) throws Exception {
        Modelo_login modelo_login = new Modelo_login();
        Controlador_login controlador_login = new Controlador_login(modelo_login);
        Vista_login vista_login = new Vista_login(controlador_login);

        vista_login.MostrarLogin();

    }
    
}
