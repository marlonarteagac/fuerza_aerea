package paquetes.Controlador;

import java.util.Scanner;
import paquetes.Modelo.Modelo_login;
import paquetes.Modelo.Modelo_menu;
import paquetes.Modelo.Usuario;
import paquetes.Vista.Vista_login;
import paquetes.Vista.Vista_menu;
import paquetes.Principal.Tareas;

public class Controlador_login {

    private Modelo_login modelo_login;
    private Vista_login vista_login;
    private Scanner entrada;

    public Controlador_login(Modelo_login modelo_login, Vista_login vista_login) {
        this.modelo_login = modelo_login;
        this.vista_login = vista_login;
        this.entrada = new Scanner(System.in);

    }

    public void MostrarLogin() {

        int bandera = 0;

        while (bandera == 0) {
            // Mostrar pantalla de login
            vista_login.MostrarLogin();
            // Capturar credenciales del usuario
            System.out.print("| Usuario:  ");
            String usuario = entrada.nextLine();
            System.out.print("| Contraseña: ");
            String contraseña = entrada.nextLine();
            System.out.println("+-----------------------------------+");

            // Validar credenciales
            Usuario permitido = modelo_login.ValidarUsuario(usuario, contraseña);

            if (permitido != null) { // Si el usuario es válido
                Tareas.LimpiarConsola();
                vista_login.MostrarAcceso(permitido.getUsuario(), permitido.getRol());
                bandera = 1; // Salir del bucle
               
                // Iniciar menú después del login exitoso
                iniciarMenu(permitido);
   
            } else { // Si las credenciales son incorrectas
                Tareas.LimpiarConsola();
                vista_login.MostrarError();
                
            }
        }
    }

    private void iniciarMenu(Usuario usuario) {

        Modelo_menu modelo_menu = new Modelo_menu(usuario.getRol());
        Vista_menu vista_menu = new Vista_menu();
        Controlador_menu controlador_menu = new Controlador_menu(modelo_menu, vista_menu);
        controlador_menu.IniciarMenuPrincipal();
    }

    public Usuario ValidarLogin(String usuario, String contraseña) {
        return modelo_login.ValidarUsuario(usuario, contraseña);

    }
}
