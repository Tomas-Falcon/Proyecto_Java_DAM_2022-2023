/**

Clase que contiene el método main del programa.
*/
import java.io.Console;
import java.util.*;
import java.io.*;
public class ClaseMain{
    static ArrayList <Arma> armas = new ArrayList <>(8);
    static ArrayList <Soldado> soldadosPorDefecto = new ArrayList <>(8);
    static Opciones opciones;
    static Console consola = System.console();
    static  Ejercito ejercito1 = new Ejercito("Los churros de Diego");
    static Ejercito ejercito2 = new Ejercito("Legion Condor");
    
    /**
     * Método principal del programa que se encarga de inicializar los objetos del juego y
     * mostrar el menú principal.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args){
    
        // Se inicializan las armas del juego.
        armas.add(new Arma("Pistola 9mm", 7) );
        armas.add(new Arma("Cuchillo Tactico", 3) );
        armas.add(new Arma("Kalashnikov", 13) );
        armas.add(new Arma("Corbata", 17) );
        armas.add(new Arma("Misil tactico", 15) );
       
        // Se inicializan los soldados por defecto del juego.
        soldadosPorDefecto.add(new Soldado("Sr.Cobarde", armas.get(0)));
        soldadosPorDefecto.add(new Soldado("Señorita Lisa", armas.get(1)));
        soldadosPorDefecto.add(new Soldado("Sr.Dos", armas.get(2)));
        soldadosPorDefecto.add(new Soldado("Sr.Corbata", armas.get(3)));
        soldadosPorDefecto.add(new Soldado("Sr.Muerte", armas.get(4)));
        
        // Se reclutan los soldados por defecto en los ejércitos.
        ejercito1.reclutarSoldado(soldadosPorDefecto.get(0));
        ejercito1.reclutarSoldado(soldadosPorDefecto.get(1));
        ejercito1.reclutarSoldado(soldadosPorDefecto.get(2));
        ejercito1.reclutarSoldado(soldadosPorDefecto.get(3));
        ejercito1.reclutarSoldado(soldadosPorDefecto.get(4));
    
        ejercito2.reclutarSoldado(soldadosPorDefecto.get(0));
        ejercito2.reclutarSoldado(soldadosPorDefecto.get(1));
        ejercito2.reclutarSoldado(soldadosPorDefecto.get(2));
        ejercito2.reclutarSoldado(soldadosPorDefecto.get(3));
        ejercito2.reclutarSoldado(soldadosPorDefecto.get(4));
    
        // Se muestra el menú principal.
        menu();
    }
    
    /**
     * Método que muestra el menú principal del juego y recibe la opción seleccionada por el usuario.
     */
    public static void menu(){
        
        System.out.println("|--------------------------|");
        System.out.println("|                          |");
        System.out.println("|           MENU           |");
        System.out.println("|                          |");
        System.out.println("|--------------------------|");
        System.out.println();
        System.out.println("|--------------------------|");
        System.out.println("|         OPCIONES:        |");
        System.out.println("|--------------------------|");
        System.out.println("|  _                       |");
        System.out.println("| |1| Iniciar Batalla      |");
        System.out.println("| |_|                      |");
        System.out.println("| |2| Agregar mas Soldades |");
        System.out.println("| |_|                      |");
        System.out.println("| |3| Salir del programa   |");
        System.out.println("| |_|                      |");
        System.out.println("|                          |");
        System.out.println("|--------------------------|");
        String respuesta = consola.readLine();
        System.out.println();
        opciones = new Opciones(respuesta);
    }

    public static void cuantosSoldadosSeAgregan(){
        Random rand = new Random();
        System.out.println("¿Cuantos soldados quiere agregar para cada ejercito?");
        String cantidadStr = consola.readLine();
        int cantidadSoldadosInt = Integer.parseInt(cantidadStr);
        int i = 0;
        while (i < cantidadSoldadosInt){
            int numeroAleatorio = rand.nextInt(5);
            ejercito2.reclutarSoldado(soldadosPorDefecto.get(numeroAleatorio));
            ejercito1.reclutarSoldado(soldadosPorDefecto.get(numeroAleatorio));
            System.out.println("El soldado " + soldadosPorDefecto.get(numeroAleatorio).getNombre() + " a sido añadido a los ejercitos \n");
            i++;
        }
        System.out.println();
        System.out.println("Se han añadido los soldados. . .\n");
        System.out.println("Sera redirigido al menu. . .\n");
        menu();
    }

    public static void iniciarBatallaMain(){
        Batalla batalla = new Batalla(ejercito1, ejercito2);
        batalla.iniciarBatalla();
    }
}
