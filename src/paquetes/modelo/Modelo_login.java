package paquetes.modelo;

public class Modelo_login {
    private Usuario[] usuarios;

    public Modelo_login() {
        // Inicializar con algunos usuarios de prueba
        usuarios = new Usuario[] {
            new Usuario("as_admin", "0123", "ASISTENTE"),
            new Usuario("as_vuelo", "4567", "ADMINISTRADOR")
        };
    }

    public Usuario ValidarUsuario(String usuario, String contraseña) {
        for (Usuario usuarios : usuarios) {
            if (usuarios.getUsuario().equals(usuario) && usuarios.getContraseña().equals(contraseña)) {
                return usuarios;
            }
        }
        return null;
    }
}
