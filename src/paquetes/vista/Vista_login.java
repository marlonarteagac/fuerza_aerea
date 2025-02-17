package paquetes.vista;

import java.util.Scanner;

import paquetes.contorlador.Controlador_login;
import paquetes.modelo.Usuario;

public class Vista_login {
    private Controlador_login controlador_login;

    public Vista_login(Controlador_login controlador_login) {
        this.controlador_login = controlador_login;
    }

    Scanner entrada = new Scanner(System.in);

    public void MostrarLogin() {
        int bandera = 0;
        while (bandera == 0) {
            System.out.println("+-----------------------------------+");
            System.out.println("|          Iniciar Sesión           |");
            System.out.println("+-----------------------------------+");
            System.out.println("| [Enter] para ingresar             |\n");
            System.out.print("| Usuario: ");
            String usuario = entrada.nextLine();
            System.out.print("| Contraseña: ");
            String contraseña = entrada.nextLine();
            System.out.println("+-----------------------------------+");
            bandera = 1;

            Usuario permitido = controlador_login.ValidarLogin(usuario, contraseña);
            if (permitido !=null) {
                System.out.println("Bienvenido: " + usuario +"tu rol en el sistemas es: "+permitido.getRol());
            } else {
                System.out.println("Error: Credenciales incorrectas.");
                bandera = 0;
            }
        }
    }

}
