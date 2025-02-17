package paquetes.vista;

import java.util.Scanner;

import paquetes.contorlador.Controlador_login;

public class Vista_login {
     private Controlador_login controlador_login;

    public Vista_login(Controlador_login controlador_login) {
        this.controlador_login = controlador_login;
    }
    Scanner entrada = new Scanner(System.in);
    public void Mostrar_login() {
        
        System.out.println("+-----------------------------------+");
        System.out.println("|          Iniciar Sesión           |");
        System.out.println("+-----------------------------------+");
        System.out.print("| Usuario:  ");
        String usuario = entrada.nextLine();
        System.out.print("| Contraseña: ");
        String contraseña = entrada.nextLine();
        System.out.println("|                                   |");
        System.out.println("| [Ingresar]                        |");
        System.out.println("+-----------------------------------+");
        entrada.close();


        boolean permitido = controlador_login.Validar_login(usuario, contraseña);
        if (permitido) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Error: Credenciales incorrectas.");
        }
    }
}
