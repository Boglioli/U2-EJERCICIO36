public class AuthGitHub extends ProveedorIdentidad {
    public AuthGitHub() {
        super("hithub");
    }
    public boolean validarToken(String tokenAcceso) {
        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }
        System.out.println("verificando con la api de github");
        return tokenAcceso.equals("github123");
    }

}
