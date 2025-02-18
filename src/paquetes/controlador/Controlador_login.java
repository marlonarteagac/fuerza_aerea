package paquetes.controlador;

import paquetes.modelo.Modelo_login;
import paquetes.modelo.Usuario;

public class Controlador_login {
    
    private Modelo_login modelo_login;

    public Controlador_login(Modelo_login modelo_login) {
        this.modelo_login = modelo_login;
    }

    public Usuario ValidarLogin(String usuario, String contraseña) {
        return modelo_login.ValidarUsuario(usuario, contraseña);
    }
}
