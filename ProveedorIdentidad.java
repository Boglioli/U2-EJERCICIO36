public abstract class ProveedorIdentidad {
    String nombreProveedor;
    public ProveedorIdentidad(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public abstract boolean validarToken(String tokenAcceso);
}
