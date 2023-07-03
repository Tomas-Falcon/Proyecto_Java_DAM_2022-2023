import java.util.Scanner;
import java.util.HashMap;
public class ClaseMain {

	public static void main(String[] args) {
		Scanner  pedirUsuario = new Scanner(System.in);
		System.out.print("Ingrese una frace: ");
		String fraceUsuario = pedirUsuario.nextLine();
		pedirUsuario.close();
		String oracionSeparada [] = fraceUsuario.split(" ");
		
		HashMap<String, Integer> miHashMap = new HashMap<>();
		
		for(String palabra : oracionSeparada) {
			Integer contador = miHashMap.get(palabra);
			
			if(contador == null){
				miHashMap.put(palabra, 1);
			}else {
				miHashMap.put(fraceUsuario, contador+1);
			}
			
//			System.out.println(miHashMap.get(palabra)); MAL
			
		}
		

		
	}

}
