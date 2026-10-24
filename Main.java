public class Main {
    public static void main(String[] args) {
        ProveedorIdentidad[] proveedores = {
                new AuthGoogle(), new AuthGitHub(), new AuthApple()
        };
        String[] tokens = {
                "google123" , "tokenIncorrecto" , "apple123"
        };
        for (int i = 0; i < proveedores.length; i++) {
            boolean acceso = proveedores[i].validarToken(tokens[i]);
            System.out.println("proveedor: ");
            if (acceso) {
                System.out.println("acceso permitido");
            } else {
                System.out.println("acceso denegado");
            }
            System.out.println("______________________");
        }
    }
}
