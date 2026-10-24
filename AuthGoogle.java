public class AuthGoogle extends ProveedorIdentidad{
    public AuthGoogle(){
        super("google");
    }
    public boolean validarToken(String tokenAcceso) {
        if (tokenAcceso == null || tokenAcceso.isEmpty()) {
            return false;
        }
        System.out.println("verificando con la api de google");
        return tokenAcceso.equals("google123");
    }
}
