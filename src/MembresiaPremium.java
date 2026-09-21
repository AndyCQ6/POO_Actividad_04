public class MembresiaPremium extends Membresia{
    private int pasesInvitado;
    MembresiaPremium(String idUsuario, String nombreUsuario, int pasesInvitado){
        super(idUsuario, nombreUsuario);
        this.pasesInvitado = pasesInvitado;
    }

    @Override
    public boolean verificarAcceso() {
        System.out.println("Bienvenido");
        return true;
    }

    public boolean ingresarConInvitado(){
        if(pasesInvitado == 0){
            System.out.println("No se le permite el acceso al invitado.");
            return false;
        }
        pasesInvitado--;
        System.out.println("Bienvenido");
        return true;
    }
}