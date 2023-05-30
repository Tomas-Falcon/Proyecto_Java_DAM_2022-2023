import java.io.*;
import java.util.*;
/**
 * @author Tomas
 *
 */

public class ClaseMain {

	
	static ArrayList <Persona> personas = new ArrayList <>();
	static ArrayList <Domicilio> domicilios = new ArrayList <>();
	static ArrayList <Auto> autos = new ArrayList <>();
	static  Console consola = System.console();
	static  Menu menu = new Menu();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("|---------MENU---------|\n|1- Ingresar Personas  |\n|2- Agregar Coches     |\n|3- Imprimir           |\n|4- Salir              |\n|----------------------|\n");
		String eleccionStr = consola.readLine();
		int eleccion = Integer.parseInt(eleccionStr);
		menu.menuInicial(eleccion);
		
	}
	/**
	 * @param persona
	 */
	public static void persona(Persona persona){
	  personas.add(persona);
	  domicilio(persona.getDomiciolio());
	}
	
	/**
	 * @param domicilio
	 */
	public static void domicilio(Domicilio domicilio){
		domicilios.add(domicilio);
		main2();
	}
	

	public static void personaPrint(){
		int a = 0;
		while(a < personas.size()) {
			System.out.println("Estos son los datos de la persona con el identificador de: "+a+" "+personas.get(a).getNombre());
			a++;
		}
	}
	
	/**
	 * @param auto
	 */
	public static void auto(Auto auto){
		autos.add(auto);
		main2();
	}
	
	/**
	 * 
	 */
	public static void imprimirArrayPersonasParaAuto(){
		
		int a = 0;
		while(a < personas.size()){
			System.out.println("La persona llamada "+personas.get(a).getNombre()+" tiene el ID "+a);
			a++;
		}
		System.out.println("Seleccione a la persona titular del auto (Utilizando el ID) ");
		String eleccionDePersonaAutoStr1 = consola.readLine();
		int eleccionDePersonaAuto1 = Integer.parseInt(eleccionDePersonaAutoStr1);
		
		System.out.println("Seleccione a la persona que es Co-titular del auto (si elege la opcion anterior (el ID), el cotitular estara en blanco, su opcion anteioro fue "+eleccionDePersonaAuto1+" )");
		String eleccionDePersonaAutoStr2 = consola.readLine();
		int eleccionDePersonaAuto2 = Integer.parseInt(eleccionDePersonaAutoStr2);
		int c = 0;
		String cc = "";
		Domicilio domiciolioTest = new Domicilio(cc, c, cc, cc);
		Persona personaTest = new Persona(cc, cc, c, domiciolioTest);
		if(eleccionDePersonaAuto2 == eleccionDePersonaAuto1) {
			menu.menuAuto(personas.get(eleccionDePersonaAuto1), personaTest);
		}else {
			
			menu.menuAuto(personas.get(eleccionDePersonaAuto1), personas.get(eleccionDePersonaAuto2));
		}
		
	}
	
	public static void main2(){
		System.out.println("|---------MENU---------|\n|1- Ingresar Personas  |\n|2- Agregar Coches     |\n|3- Listar Todo        |\n|4- Salir              |\n|----------------------|\n");
		String eleccionStr = consola.readLine();
		int eleccion = Integer.parseInt(eleccionStr);
		menu.menuInicial(eleccion);
		}
	
	public static void pasarPersona() {
		menu.imnprimirInformacionPersonal(autos);
	}
	
	public static void imprimirAutoPorPais() {
		menu.imprimirAutoPorPais(autos);
	}
	
	
	
	public static void pasarPersonas2() {
		menu.imprimirPersonasConSinCoche(personas);
	}
}
