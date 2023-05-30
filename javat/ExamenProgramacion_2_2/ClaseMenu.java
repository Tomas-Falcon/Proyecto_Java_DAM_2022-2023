import java.io.*;
import java.util.*;
public class ClaseMenu{
	static Console consola = System.console();
	static Controlador controlador = new Controlador();
	
	public static void main(String args []){
		menu();
	}
	
	public static void menu(){
		
		System.out.println("Opciones disponibles:");
		System.out.println("-Introducir a un nuevo jugaor (1)");
		System.out.println("-Listar a los participantes (2)");
		System.out.println("-Eliminar participante (3)");
		System.out.println("-Salir del programa (4)");
		System.out.println("-Utiice el numero de opcion correspondiente para eligir (1, 2, 3, 4)");
		System.out.println();
		System.out.print("Ingrese su eleccion: ");
		
		String eleccion = consola.readLine();
		controlador.chequearEleccion(eleccion);
		
	}
	public static void agregarJugador(){
		
		// nombre
		System.out.print("Ingrese el nombre del jugador: ");
		String nombreStr = consola.readLine();
		System.out.println();
		
		// edad
		System.out.print("Ingrese su edad: ");
		String edadStr = consola.readLine();
		System.out.println();
		
		// Nacionalidad
		System.out.print("Ingrese su Nacionalidad: ");
		String nacionalidadSrt = consola.readLine();
		System.out.println();
		
		int edad = Integer.parseInt(edadStr);
		
		Jugador jugadorNuevo = new Jugador(nombreStr, edad, nacionalidadSrt);
		controlador.anadirJugador(jugadorNuevo);
		
		
		System. out.println("------------------------------------------------------------");
		System.out.println();
		ClaseMenu.menu();
	}
	
}