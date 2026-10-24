public class AuthApple extends ProveedorIdentidad{
    public AuthApple() {
        super("apple");
    }
    public boolean validarToken(String tokenAcceso){
        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }
        System.out.println("verficando con la api de apple");
        return tokenAcceso.equals("apple123");
    }
}
