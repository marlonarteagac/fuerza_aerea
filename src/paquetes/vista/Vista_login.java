package paquetes.vista;

import java.util.Scanner;

import paquetes.contorlador.Controlador_login;
import paquetes.modelo.Usuario;

public class Vista_login {
    private Controlador_login controlador_login;
        private Scanner entrada;
        private Vista_login vista_login;
    
        public Vista_login(Controlador_login controlador_login) {
            this.controlador_login = controlador_login;
            this.entrada = new Scanner(System.in);
    }

    public void MostrarLogin() {
            System.out.println("+-----------------------------------+");
            System.out.println("|          Iniciar Sesión           |");
            System.out.println("+-----------------------------------+");
            System.out.println("+-----------------------------------+");
    }

    // Muestra un mensaje de éxito
    public void MostrarAcceso(String usuario, String rol) {
        System.out.println("+-----------------------------------+");
        System.out.println("|          Inicio de Sesión         |");
        System.out.println("+-----------------------------------+");
        System.out.println("| ¡Bienvenido, " + usuario + "! |");
        System.out.println("| Rol: " + rol + "                |");

    }

    public void MostrarError() {

        System.out.println("+-----------------------------------+");
        System.out.println("|          Error de Acceso          |");
        System.out.println("+-----------------------------------+");
        System.out.println("| Credenciales incorrectas.         |");
        System.out.println("| Por favor, inténtelo de nuevo.    |");
        System.out.println("+-----------------------------------+\n");

    }

}
