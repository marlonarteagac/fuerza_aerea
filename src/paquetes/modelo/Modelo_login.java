package paquetes.modelo;

public class Modelo_login {
    private Usuario[] usuarios;

    public Modelo_login() {
        // Inicializar con algunos usuarios de prueba
        usuarios = new Usuario[] {
            new Usuario("as_admin", "0123", "asistente"),
            new Usuario("as_vuelo", "4567", "administrador")
        };
    }

    public boolean ValidarUsuario(String usuario, String contraseña) {
        for (Usuario usuarios : usuarios) {
            if (usuarios.getUsuario().equals(usuario) && usuarios.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }
}
