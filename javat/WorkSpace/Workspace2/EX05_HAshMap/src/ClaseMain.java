/**
 *  Impirtamos la coleccion HashMap
 */
import java.util.HashMap;
/**
 * @author Tomas
 *
 */
public class ClaseMain {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		// Creamos un nuevo HashMap
		HashMap<Integer, String> miHashMap = new HashMap<>();

		// Añadimos algunos valores al HashMap
		miHashMap.put(1, "Hola");
		miHashMap.put(2, "Mundo");
		miHashMap.put(3, "!");
		        
		// Imprimimos los valores del HashMap
		System.out.println(miHashMap);

		System.out.println("tamaño del HashMap "+miHashMap.size());
		System.out.println("El HashMap esta vacio? = "+miHashMap.isEmpty());
		
		
	}
}
