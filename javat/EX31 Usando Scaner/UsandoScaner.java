import java.io.*;
import java.util.*;
public class UsandoScaner{
static int i = 0;
	public static void main(String arg []){
			Console consola = System.console();
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Ingrese la edad");
			 int edad = sc.nextInt();
			 System.out.println("Ingrese su altura");		
			 double altura = sc.nextDouble();
			 System.out.println("Su edad es: "+edad+" años y su altura es: "+altura);
			 System.out.println();
			 System.out.println("Introdusca su Pasworrd");
			char[] respuesta = consola.readPassword();
			String valoresinteoducidos = new String(respuesta);
			System.out.println("Su password es: "+valoresinteoducidos);
	}
}



