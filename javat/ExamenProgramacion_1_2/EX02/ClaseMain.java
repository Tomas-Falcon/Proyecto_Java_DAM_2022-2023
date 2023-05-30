import java.io.*;
import java.util.*;

public class ClaseMain{
	
	
	
	public static void main(String arg []){
		
		// valores para el auto
		double valorCoche = 100;
		String marcaCoche = "marca";
		String matriculaCoche = "matricula";
		
		// valores para los tipo "comercial"
		String nombre = "Nombre";
		String apellido = "Apellido";
		double horas = 15;
		
		
		// variuables
		double valorDeLaVenta = 19;
		
		Coche coche1 = new Coche(valorCoche);
		Coche coche2 = new Coche(marcaCoche, matriculaCoche, valorCoche);
		
		ComercialInterno comercialInterno1 = new ComercialInterno(nombre, apellido, horas); 
		comercialInterno1.anadirVentas(valorDeLaVenta);
		
		ComercialExterno comercialExterno1 = new ComercialExterno(nombre, apellido, horas, coche1);
		comercialExterno1.anadirVentas(valorDeLaVenta);
		
		ComercialExterno comercialExterno2 = new ComercialExterno(nombre, apellido, horas);
		comercialExterno2.anadirVentas(valorDeLaVenta);
		comercialExterno2.anadirVentas(valorDeLaVenta);
		
		comercialExterno1.imprimirVentasTotales();
		System.out.println("--------");
		
	}
	
	
}
