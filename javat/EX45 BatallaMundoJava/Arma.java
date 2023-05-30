/**
 * 
 * Esta clase representa un arma que puede ser utilizada por un soldado.
 */
public class Arma {
    private String nombre; // El nombre del arma
    private int bonificacionAtaque; // La bonificación de ataque que otorga el arma

    /**
     * 
     * Crea un nuevo objeto Arma con el nombre y la bonificación de ataque
     * especificados.
     * 
     * @param nombre             el nombre del arma
     * @param bonificacionAtaque la bonificación de ataque que otorga el arma
     */
    public Arma(String nombre, int bonificacionAtaque) {
        this.nombre = nombre;
        this.bonificacionAtaque = bonificacionAtaque;
    }

    /**
     * 
     * Retorna el nombre del arma.
     * 
     * @return el nombre del arma
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * Retorna la bonificación de ataque que otorga el arma.
     * 
     * @return la bonificación de ataque que otorga el arma
     */
    public int getBonificacionAtaque() {
        return bonificacionAtaque;
    }
}