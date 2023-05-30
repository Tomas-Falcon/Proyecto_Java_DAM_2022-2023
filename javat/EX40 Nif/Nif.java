import java.io.*;
import java.util.*;

public class Nif{
	
	static Console consola = System.console();
	static Proveedor p1 = new Proveedor();
	static CodigoPostal cP = new CodigoPostal();
	
	public static void main(String arg []){
		
		
		 // Esto esta bien, es el nif
		System.out.print("Ingrese su NIF: ");
		String nif = consola.readLine();
		String nif2 = nif.toUpperCase();
		p1.verificadorDeNif(nif2);
		
		 // Esto esta bien, es el nif
		System.out.print("Ingrese su Codigo postal: ");
		String codigoPostal = consola.readLine();
		cP.codigoPostalBase(codigoPostal);
		
	}
	
}	