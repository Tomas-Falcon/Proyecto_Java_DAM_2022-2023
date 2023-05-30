import java.util.*;
import java.text.*;
import java.io.*;
public class ClaseMain {
	
	static Console consola = System.console();
	static ArrayList <Contacto> contactos = new ArrayList <> (5);
	
	public static void main(String [] args){
		menu();
	}
	
	public static void menu(){
		
		System.out.print(" Opciones disponibles:\n-Introducir a un nuevo jugaor (1)\n-Listar a los participantes (2)\n-Eliminar participante (3)\n-Salir del programa (4)\n-Utiice el numero de opcion correspondiente para eligir (1, 2, 3, 4)\n-Ingrese su eleccion: ");
		
		String eleccion = consola.readLine();
		System.out.println("#···································································#");
		
		controlador.chequearEleccion(eleccion);
	}
	
	public static void agregarContacto(){
		System.out.print("Ingrese el nombre");
		String nombre = consola.readLine();
		System.out.println();
		
		System.out.print("Ingrese el apellido");
		String apellido = consola.readLine();
		System.out.println();
		
		System.out.print("Ingrese el numero de telefono");
		String telefono = consola.readLine();
		System.out.println();
		int telefonoInt = integer.parseInt(telefono);
		
		System.out.print("¿Desea editar algun valor? \n SI = 11\n NO = 12");
		String respuesta = consola.readLine();
		int respuestaInt = integer.parseInt(respuesta);
		if(respuestaInt == 12){
			System.out.println("#···································································#");
			menu();
		}
		else{
			
		}
		System.out.println("#···································································#");
	}
}
