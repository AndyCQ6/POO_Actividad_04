public class MembresiaBasica extends Membresia{
    private int visitasRestantes;
    MembresiaBasica(String idUsuario, String nombreUsuario, int visitasRestantes){
        super(idUsuario,nombreUsuario);
        this.visitasRestantes = visitasRestantes;
    }

    @Override
    public boolean verificarAcceso(){
        if(visitasRestantes == 0){
            System.out.println("Sin accesos, debe renovar su suscripcion.");
            return false;
        }
        visitasRestantes --;
        System.out.println("Hola, le quedan "+ visitasRestantes + " visitas restantes.");
        return true;
    }
}

