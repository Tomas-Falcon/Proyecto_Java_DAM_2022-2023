/**
 * @author Tomás
 *
 */
import java.io.*;
import java.util.*;

public class Menu {
	
	static  Console consola = System.console();
	private  ArrayList <Auto> autos = new ArrayList<>();
	private  ArrayList <Persona> personas = new ArrayList<>();
	
	
	/**
	 * @param respuesta
	 */
	public  void menuInicial(int respuesta){
		if(respuesta == 1){ //crear personas
			menuPersona();
		}
		else if(respuesta == 2){//crear autos
			ClaseMain.imprimirArrayPersonasParaAuto();
		}
		else if(respuesta == 3){//imprimir todo
			imprimirTodo();
		}
		else if(respuesta == 4){//salir
			System.exit(0);
		}
	}
	
	public void imprimirPersonasConSinCoche(){
		ClaseMain.pasarPersonas2();
	}
	
	/**
	 * @param personas
	 */
	public void imprimirPersonasConSinCoche(ArrayList <Persona> personas){
		this.personas = personas;
		imprimirPersonasSinCcC();
		
	}
	
	public void imprimirPersonasSinCcC(){
		int a = 0;
		while(a < personas.size()) {
			System.out.println("La persona llamada "+personas.get(a).getNombre()+" con el apellido "+personas.get(a).getApellido()+" con "+personas.get(a).getEdad()+" años, vive en "+personas.get(a).getDomiciolio().getCalle()+", "+personas.get(a).getDomiciolio().getAltura()+", codigo postal: "+personas.get(a).getDomiciolio().getCp()+", del pais "+personas.get(a).getDomiciolio().getPais());
			a++;
		}
		ClaseMain.main2();
	}
	
	public void menuPersona(){
		System.out.println("Ingrese los datos de la persona incluyendo su informacion personal segun se le pida.");
		System.out.print("Ingrese el nombre: ");
		String nombre = consola.readLine();
		
		System.out.print("Ingrese el apellido: ");
		String apellido = consola.readLine();
		
		System.out.print("Ingrese la edad: ");
		String edadStr = consola.readLine();
		int edad = Integer.parseInt(edadStr);
		ingresarDomicilio(nombre, apellido, edad);
	}
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public void ingresarDomicilio(String nombre, String apellido, int edad){
		CrearObjetos co = new CrearObjetos();
		
		System.out.print("Ingrese la direccion de "+nombre);
		
		System.out.print("\n Ingrese la calle: ");
		String calle = consola.readLine();
		
		System.out.print("Ingrese la altura o direccion (el numero): ");
		String alturaoStr = consola.readLine();
		
		System.out.print("Ingrese el codigo postal: ");
		String cp = consola.readLine();
		
		System.out.print("Ingrese el pais de residencia: ");
		String pais = consola.readLine();
		int altura = Integer.parseInt(alturaoStr);
		co.crearPersona_Domicilio(nombre, apellido, calle, cp, pais, edad, altura);
	}
	
	/**
	 * @param persona1
	 * @param persona2
	 */
	public void menuAuto(Persona persona1, Persona persona2){
		
		System.out.print("Ingrese la matricula del coche: ");
		String matricula = consola.readLine();
		
		System.out.print("Ingrese la marca del coche: ");
		String marca = consola.readLine();
		Auto auto = new Auto (persona1, persona2, matricula, marca);
		ClaseMain.auto(auto);
		
	}
	
	public void imprimirTodo(){
		System.out.print("¿Que desea imprimir?: \n1-Imprimir personas con coche: \n2-Imprimir a los coches y el pais al que pertenecen: \n3-Imprimir a las personas que tienen o no un coche: \n4-Ir al menu\n5-Salir del programa: ");
		String eleccionStr = consola.readLine();
		int respuesta = Integer.parseInt(eleccionStr);
		if(respuesta == 1){ //Imprimir informacio personal
			imnprimirInformacionPersonal();
		}
		else if(respuesta == 2){//Imprimir informacion de coches por pais
			imprimirAutoPorPais();
		}
		else if(respuesta == 3){//imprimir personas ccon o sin coche
			imprimirPersonasConSinCoche();
			
		}else if(respuesta == 5){//salir
			System.exit(0);
			
		}else if(respuesta == 4){//menu2
			ClaseMain.main2();
		}
			System.out.println("Al no elegir una opcion correcta, sera enviado al menu principal");
		ClaseMain.main2();
	}
	public void imnprimirInformacionPersonal(){
		ClaseMain.pasarPersona();
	}
	
	/**
	 * @param autos
	 */
	public void imnprimirInformacionPersonal(ArrayList <Auto> autos){
		this.autos = autos;
		imprimirAutos();
	}
	
	public void imprimirAutos(){
		int a = 0;
		while(a < autos.size()) {
			System.out.println("La persona llamada "+autos.get(a).getTitular().getNombre()+" con el apellido "+autos.get(a).getTitular().getApellido()+" con "+autos.get(a).getTitular().getEdad()+" años, vive en "+autos.get(a).getTitular().getDomiciolio().getCalle()+", "+autos.get(a).getTitular().getDomiciolio().getAltura()+", codigo postal: "+autos.get(a).getTitular().getDomiciolio().getCp()+", del pais"+autos.get(a).getTitular().getDomiciolio().getPais());
			a++;
		}
		ClaseMain.main2();
	}
	
	public void imprimirAutoPorPais(){
		
		ClaseMain.imprimirAutoPorPais();
	}
	
	/**
	 * @param autos
	 */
	public void imprimirAutoPorPais(ArrayList <Auto> autos){
		this.autos = autos;
		int a = 0;
		while(a < autos.size()) {
			String pais1 = autos.get(a).getTitular().getDomiciolio().getPais();
			String pais2 = autos.get(a).getCoConductor().getDomiciolio().getPais();
			if(pais1.equals(pais2)){
				if(autos.get(a).getCoConductor().getNombre() != "" ) {
				System.out.println("El vehiculo de la marca "+autos.get(a).getMarca() +", con la matricula "+autos.get(a).getMatricula()+" con el titular "+autos.get(a).getTitular().getNombre()+" "+autos.get(a).getTitular().getApellido()+"\n y su Cotitular llamado "+autos.get(a).getCoConductor().getNombre()+" "+autos.get(a).getCoConductor().getApellido()+", el vehiculo pertenece al pais de "+autos.get(a).getTitular().getDomiciolio().getPais());
					
				}else {
					System.out.println("El vehiculo de la marca "+autos.get(a).getMarca() +", con la matricula "+autos.get(a).getMatricula()+" con el titular "+autos.get(a).getTitular().getNombre()+" "+autos.get(a).getTitular().getApellido()+", pertenece al pais de "+autos.get(a).getTitular().getDomiciolio().getPais());
				}
			}
			a++;
		}
		ClaseMain.main2();
	}
	
}