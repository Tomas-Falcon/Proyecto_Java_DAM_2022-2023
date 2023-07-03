import java.io.*;
public class TomasFalconExamenProg02{
	
	static int edad = 0;
	static String nombre;
	
	public static void main(String ar []){
		años();
	}
	
	public static void años(){
		Console consola = System.console();
		System.out.print("Ingrese su nombre: ");
		nombre = consola.readLine();
		
		System.out.print("Ingrese su edad: ");
		String edad2 = consola.readLine();
		 edad = Integer.parseInt(edad2);
		
		if (edad >= 65)
			estaJuvilado();
		else noEstaJuvilado();
	}
	
	public static void estaJuvilado(){
		int años = 65;
		int haceAños = edad - 65;
		System.out.println(nombre+" esta juvilado hace "+haceAños+" años");
	}
	
	public static void noEstaJuvilado(){
		int años = 65;
		int haceAños = 65 - edad;
		System.out.println("A "+nombre+" le faltan "+haceAños+" años para jubilarse");
	}
}