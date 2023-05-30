import java.io.*;
import java.util.*;

public class CentroCanino{
   
	public static void main(String arg []){
		Perro p1 = new Perro();
		p1.comer();
		p1.saltar(9);
		p1.dormir(12);
	
		p1.nombre = "Blaki";
		System.out.println(p1.nombre);
		
		/*
			PREGUNTA DE EXAMMEN:
				en java la invocacion a metodos, los parametros si son de tipo 
				"primitivo" se pasara el valor y si "no es primitivo" se pasara la referencia
		*/
		
	}
}