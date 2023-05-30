import java.io.*;
import java.util.*;

public class AlumnosVector {

	static Console consola = System.console();
	static Vector <String> vector = new Vector<>();
	static Vector <Integer> vector2 = new Vector<>();
	static Enumeration enumeration=vector.elements();
	static int dato;
	
   public static void main(String arara[]) {
	    ingrese();	
    }
	
	public static void ingrese(){
		System.out.print("Introduzca el nombre del alumno: ");
        String nombAlumnos = consola.readLine();
		String a = "";
		if(a.equals(nombAlumnos)){
			fin();	
		}
        vector(nombAlumnos);
	}
	
	public static void vector(String alumno){
		
		int longi;
		vector.add("");
		vector2.add(0);
		
		while(enumeration.hasMoreElements()){
			logngi = alumno.length();
			vector.add(alumno);
			vector2.add(longi);
			ingrese();
		}
	}
	public static void fin(){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("El que tiene el nombre mas largo es: "+""+""+" y tiene un tamaño de: "+"");
		System.exit(0);
	}
}