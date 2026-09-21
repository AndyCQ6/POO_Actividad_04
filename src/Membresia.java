public abstract class Membresia {
    protected String idUsuario;
    protected String nombreUsuario;

    Membresia(String idUsuario, String nombreUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    public abstract boolean verificarAcceso();
    public void mostrarDatos() {
        System.out.println("ID del usuario: " + idUsuario + "\n" +
                "Nombre del usuario: " + nombreUsuario + ".");
    }
}