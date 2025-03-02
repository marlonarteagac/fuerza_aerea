package paquetes.Vista;

public class Vista_login {
  

    //Inicio de sesion en consola
    public void MostrarLogin() {
        System.out.println("+-----------------------------------+");
        System.out.println("|          Iniciar Sesión           |");
        System.out.println("+-----------------------------------+");
        System.out.println("+[Enter] para ingresar              +");
    }

    //Mensaje de exito si se valida correcto el usuario
    public void MostrarAcceso(String usuario, String rol) {
        System.out.println("\n+-----------------------------------+");
        System.out.println("|          Inicio de Sesión         |");
        System.out.println("+-----------------------------------+");
        System.out.println("| ¡Bienvenido, " + usuario + "! ");
        System.out.println("| Rol: " + rol + "                ");
        System.out.println("+-----------------------------------");
    }
//mensjae de error si no se validan las credenciales
    public void MostrarError() {
        System.out.println("\n+-----------------------------------+");
        System.out.println("|          Error de Acceso          |");
        System.out.println("+-----------------------------------+");
        System.out.println("| Credenciales incorrectas.         |");
        System.out.println("| Por favor, inténtelo de nuevo.    |");
        System.out.println("+-----------------------------------+\n");
    }

}
