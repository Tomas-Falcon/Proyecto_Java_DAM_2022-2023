/**
 * 
 * La clase Soldado representa un personaje de un videojuego con un nombre,
 * puntos de vida,
 * 
 * puntos de ataque y un arma equipada. Los objetos de esta clase pueden ser
 * creados con dos constructores,
 * 
 * uno que especifica todos los atributos y otro que solo toma el nombre y el
 * arma, en cuyo caso los puntos de vida y
 * 
 * los puntos de ataque se establecen en valores predeterminados.
 */
public class Soldado {

    private String nombre; // Nombre del soldado
    private int puntosVida; // Puntos de vida del soldado
    private int puntosAtaque; // Puntos de ataque base del soldado
    private Arma arma; // Arma equipada por el soldado

    /**
     * 
     * Constructor que crea un objeto Soldado con un nombre, puntos de vida, puntos
     * de ataque y un arma.
     * 
     * @param nombre       el nombre del soldado
     * @param puntosVida   los puntos de vida del soldado
     * @param puntosAtaque los puntos de ataque base del soldado
     * @param arma         el arma equipada por el soldado
     */
    public Soldado(String nombre, int puntosVida, int puntosAtaque, Arma arma) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
        this.arma = arma;
    }

    /**
     * 
     * Constructor que crea un objeto Soldado con un nombre y un arma. Los puntos de
     * vida y los puntos de ataque
     * se establecen en valores predeterminados.
     * 
     * @param nombre el nombre del soldado
     * @param arma   el arma equipada por el soldado
     */
    public Soldado(String nombre, Arma arma) {
        this.nombre = nombre;
        puntosVida = 50; // Valor predeterminado para los puntos de vida
        puntosAtaque = 10; // Valor predeterminado para los puntos de ataque
        this.arma = arma;
    }

    /**
     * 
     * Retorna el nombre del soldado.
     * 
     * @return el nombre del soldado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * Retorna el arma equipada por el soldado.
     * 
     * @return el arma equipada por el soldado
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * 
     * Retorna los puntos de vida del soldado.
     * 
     * @return los puntos de vida del soldado
     */
    public int getPuntosVida() {
        return puntosVida;
    }

    /**
     * 
     * Retorna los puntos de ataque del soldado, que es la suma de los puntos de
     * ataque base y
     * la bonificación de ataque proporcionada por el arma equipada.
     * 
     * @return los puntos de ataque del soldado
     */
    public int getPuntosAtaque() {
        return puntosAtaque + arma.getBonificacionAtaque();
    }

    /**
     * 
     * Reduce los puntos de vida del soldado en la cantidad especificada por el
     * ataque recibido.
     * Si los puntos de vida del soldado caen por debajo de cero, se establecen en
     * cero.
     * 
     * @param puntosAtaque la cantidad de puntos de ataque que se utilizan para
     *                     atacar al soldado
     */
    public void recibirAtaque(int puntosAtaque) {
        puntosVida -= puntosAtaque;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
    }

    /**
     * Retorna true si el soldado está vivo, es decir, si sus puntos de vida son
     * mayores que cero,
     * y false en caso contrario.
     *
     * @return true si el soldado está vivo, false en caso contrario
     */
    public boolean estaVivo() {
        if (puntosVida > 0) {
            return true;
        }
        return false;
    }

    /**
     * Retorna una cadena que representa al soldado y su estado actual, incluyendo
     * su nombre, puntos de vida
     * y puntos de ataque. La cadena tiene el siguiente formato: "nombre (PV:
     * puntosVida, PA: puntosAtaque)".
     *
     * @return una cadena que representa al soldado y su estado actual
     */
    public String toString() {
        return nombre + " (PV: " + puntosVida + ", PA: " + getPuntosAtaque() + ")";
    }
}