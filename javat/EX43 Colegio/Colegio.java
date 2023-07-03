/**
*@author Tomas Francisco Falcon
*@version 1.0
*/
import java.io.*;
import java.util.*;

public class Colegio{
	
	static Console consola = System.console();

	
	// ArrayList Alumno
	static ArrayList <Alumno> arList = new ArrayList <>(20);
	
	
	//para quitar espacion al principio y al final ".trim();"
	
	public static void main (String args[]){
	
		while(true){
			// nombre
			System.out.print("Ingrese el nombre del alumno: ");
			String nombre = consola.readLine();
			System.out.println();
			
			if(nombre.equals("")){
				fin();
			}
			
			// edad
			System.out.print("Ingrese su edad: ");
			String edadStr = consola.readLine();
			System.out.println();
			
			// nota
			System.out.print("Ingrese su Nota: ");
			String notaStr = consola.readLine();
			System.out.println();
			
			int edad = Integer.parseInt(edadStr);
			double nota = Double.parseDouble(notaStr);
			
			arList.add(new Alumno(nombre, edad, nota));
		}
		// System.out.println();
		
	}
	
	public static void fin(){
		int a = 0;
		double mayorNota = 0;
		int mejorEdad = 0;
		double edadTotal = 0;
		double notaS = 0;
		String mejorNombre = "";
		while(a < arList.size()){
			if (mayorNota <= arList.get(a).nota){
				mayorNota = arList.get(a).nota;
				mejorNombre = arList.get(a).nombre;
				mejorEdad = arList.get(a).edad;
			}
			notaS += arList.get(a).nota;
			edadTotal += arList.get(a).edad;
			a++;
		}
		double notasMedia = notaS / arList.size();
		double edadMedia = edadTotal / arList.size();
		System.out.println("La mejor nota es: " + mayorNota + ", su nombre es: " + mejorNombre + " y su edad es: " + mejorEdad);
		System.out.println("La media es de la cloase es: " + notasMedia + " y la edad media es: " + edadMedia);
		
		System.exit(0);
	}
}

/*
academia:
	Alumnos:
	-Edad (listo)
	-Nombre (listo)
	-Notas (listo)
#se meteran alumnos hasta que el ncampo nombre este vacio (listo)
#se tendra la media de las notas (listo)
#el nombre del lumno con con mejor nota (listo)
#listado de alumnos aprovados (Notas >= 5) (falta)
*/