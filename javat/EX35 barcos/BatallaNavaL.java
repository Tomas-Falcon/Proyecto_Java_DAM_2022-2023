import java.io.*;
import java.util.*;

public class BatallaNaval {
    static int b = 10;
    static Console consola = System.console();
    static int tablero[][] = new int[b][b];
    static int tableroVisto[][] = new int[b][b];
    static int barcosUndidos = 0;
    static int disparos = 0;
    static int puntuacion = 0;
    static int a = 0;
    static Random aleatorio = new Random();

    public static void main(String arg[]) {
        inicializarTableros();
        colocarBarcos();
        jugar();
        mostrarPuntuacion();
    }

    public static void inicializarTableros() {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                tablero[i][j] = 0;
                tableroVisto[i][j] = 0;
            }
        }
    }

    public static void colocarBarcos() {
        int numBarcos = aleatorio.nextInt(16) + 5; 
		a = numBarcos - 1;

        for (int i = 0; i < numBarcos; i++) {
            int fila = aleatorio.nextInt(b);
            int columna = aleatorio.nextInt(b);
            tablero[fila][columna] = 1;
        }
		
        System.out.println("¿Deseas ver el tablero con los barcos puestos? (si responde con \"n\", vera el mapa sin los barcos, si es un \"s\", lo vera con barcos)");
        String respuesta = consola.readLine();
        if (respuesta.equals("s")) {
            imprimirTablero(tablero);
        }
		if (respuesta.equals("n")) {
            imprimirTablero(tableroVisto);
        }
    }

    public static void imprimirTablero(int tablero[][]) {
        imprimirColumnas();
        for (int i = 0; i < b; i++) {
            System.out.print((char)(i+'A') + " ");
            for (int j = 0; j < b; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirColumnas() {
        System.out.print("  ");
        for (int i = 1; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
	    public static void mostrarPuntuacion() {
        System.out.println("Puntuación final: " + puntuacion);
        System.out.println("Deseas terminar el juego? (s/n)");
        String respuesta = consola.readLine();
        if (respuesta.equals("s")) {
            for(int i = 0; i < b; i++) {
                for(int j = 0; j < b; j++) {
                    if(tablero[i][j] == 1) {
                        if(tableroVisto[i][j] == 1) {
                            tablero[i][j] = 2;
                        } else {
                            tablero[i][j] = 1;
                        }
                    }
                }
            }
            imprimirTablero(tablero);
            System.out.println("Gracias por jugar!");
        }
    }

    public static void jugar() {
        while (barcosUndidos < a) {
            System.out.println("Ingresa la posición del disparo (ejemplo: A1): ");
            String posicion = consola.readLine();
            int fila = (int) posicion.charAt(0) - 'A';
            int columna = Integer.parseInt(posicion.substring(1)) - 1;
            disparos++;
            if (tablero[fila][columna] == 1) {
                System.out.println("Felicidades, hundiste un barco!");
                barcosUndidos++;
                puntuacion += 100;
                tableroVisto[fila][columna] = 1;
            } else {
                System.out.println("Lo siento, no hay ningún barco en esa posición.");
                puntuacion -= 25;
                tableroVisto[fila][columna] = 1;
            }
        }

        int c = (disparos - 10) * -1;
        if (disparos == 10) {
            System.out.println("Se acabaron tus disparos. Game over.");
        } else {
            System.out.println("Te quedan " + c + " disparos");
        }

        mostrarPuntuacion();
    }

}