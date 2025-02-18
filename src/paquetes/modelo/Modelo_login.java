package paquetes.modelo;

public class Modelo_login {

    private Usuario[] usuarios;

    public Modelo_login() {

        usuarios = new Usuario[] {
                new Usuario("as_admin", "0123", "ASISTENTE"),
                new Usuario("as_vuelo", "4567", "ADMINISTRADOR")
        };
    }

    public Usuario ValidarUsuario(String usuario, String contraseña) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)) {
                return u;
            }
        }
        return null;
    }
}
