import java.util.Scanner;
import paquetes.contorlador.Controlador_login;
import paquetes.contorlador.Controlador_menu;
import paquetes.modelo.Modelo_login;
import paquetes.modelo.Modelo_menu;
import paquetes.modelo.Usuario;
import paquetes.vista.Vista_login;
import paquetes.vista.Vista_menu;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Crear modelo, controlador y vista
        Modelo_login modelo_login = new Modelo_login();
        Controlador_login controlador_login = new Controlador_login(modelo_login);
        Vista_login vista_login = new Vista_login();

        int bandera = 0;
        while (bandera == 0) {
            // Mostrar pantalla de login
            vista_login.MostrarLogin();

            // Capturar credenciales
            System.out.print("| Usuario:  ");
            String usuario = entrada.nextLine();
            System.out.print("| Contraseña: ");
            String contraseña = entrada.nextLine();
            System.out.println("+-----------------------------------+");

            // Validar credenciales
            Usuario permitido = controlador_login.ValidarLogin(usuario, contraseña);

            if (permitido != null) { // Si el usuario existe
                vista_login.MostrarAcceso(permitido.getUsuario(), permitido.getRol());
                bandera = 1; // Salir del bucle

                Modelo_menu modelo_menu = new Modelo_menu(permitido.getRol());
                Vista_menu vista_menu = new Vista_menu();
                Controlador_menu controlador_menu = new Controlador_menu(modelo_menu, vista_menu);
                controlador_menu.IniciarMenu();
            } else { // Si las credenciales son incorrectas
                vista_login.MostrarError();

            }

        }
        // cierra la entrada de datos
        entrada.close();

    }

}
