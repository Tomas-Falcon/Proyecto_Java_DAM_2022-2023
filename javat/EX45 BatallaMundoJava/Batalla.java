import java.util.*;

public class Batalla {
    private Ejercito ejercito1;
    private Ejercito ejercito2;
    private Random rand = new Random();
    private Random rand2 = new Random();

    public Batalla(Ejercito ejercito1, Ejercito ejercito2) {
        this.ejercito1 = ejercito1;
        this.ejercito2 = ejercito2;
    }

    public void iniciarBatalla() {
        System.out.println(
                "Comienza la batalla entre " + ejercito1.getNombre() + " y " + ejercito2.getNombre() + "...\n");
        int turno = 1;

        while (ejercito1.estaVivo() && ejercito2.estaVivo()) {
            int a = rand.nextInt(ejercito1.getSoldados().size());
            int b = rand2.nextInt(ejercito2.getSoldados().size());
            System.out.println("Turno " + turno + ":\n");
            Soldado atacante;
            Soldado atacado;
            if (turno % 2 == 1) {
                atacante = ejercito1.getSoldados().get(a);
                atacado = ejercito2.getSoldados().get(b);
            } else {
                atacante = ejercito2.getSoldados().get(b);
                atacado = ejercito1.getSoldados().get(a);
            }
            Arma armaAtacante = atacante.getArma();
            int danio = atacante.getPuntosAtaque() + armaAtacante.getBonificacionAtaque();
            System.out.println(
                    atacante.getNombre() + " ataca a " + atacado.getNombre() + " con " + danio + " puntos de daño.\n");
            atacado.recibirAtaque(danio);
            if (!atacado.estaVivo()) {
                System.out.println(atacado.getNombre() + " muere en este turno.\n");
            }
            turno++;

        }
        int vidaTotal = ejercito1.vidaTotal();
        // int vidaTota2 = ejercito2.vidaTotal();
        // No se cumple la condicion del if, por lo tanto siempre gana el mismo ejercito
        if (vidaTotal > 0) {
            System.out.println("La batalla ha terminado. El ejército ganador es " + ejercito1.getNombre() + "!\n");
            System.out.println("Fin del Juego, si quiere volver a jugar, vuelva a iniciar el programa");

        } else {
            System.out.println("La batalla ha terminado. El ejército ganador es " + ejercito2.getNombre() + "!\n");
            System.out.println("Fin del Juego, si quiere volver a jugar, vuelva a iniciar el programa");
        }
    }
}