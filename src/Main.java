import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Membresia> Membresias = new ArrayList<>();
        Membresias.add(new MembresiaPremium("001", "Andy", 100));
        Membresias.add(new MembresiaPremium("002", "Leo",1));
        Membresias.add(new MembresiaBasica("003", "Oscar",10));
        Membresias.add(new MembresiaPremium("004", "Angel",0));
        Membresias.add(new MembresiaBasica("005", "Noe",0));


        for(Membresia x : Membresias){
            x.mostrarDatos();
            x.verificarAcceso();
            if(x instanceof MembresiaPremium a){
                a.ingresarConInvitado();
            }
            System.out.println();
        }

        // Membresia hola = new Membresia("000", " ");
    }
}