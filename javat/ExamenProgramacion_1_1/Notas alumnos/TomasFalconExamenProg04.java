import java.io.*;
public class TomasFalconExamenProg04{
	
	static int cantidadAlumnos;
	static String nombre [];
	static double nota1 [];
	static double nota2 [];
	static double nota3 [];
	static double nota4 [];
	
	public static void main(String ar []){
		Console consola = System.console();
		
		System.out.print("Ingrese la cantidad de alumnos: ");
		String cantidadP = consola.readLine();
		cantidadAlumnos = Integer.parseInt(cantidadP);
		nota1 = new double [cantidadAlumnos*4];
		nota2 = new double [cantidadAlumnos*4];
		nota3 = new double [cantidadAlumnos*4];
		nota4 = new double [cantidadAlumnos*4];
		nombre = new String [cantidadAlumnos];
		nombreA();
	}
	
	public static void nombreA(){
		Console consola = System.console();
		
		int i = 0;
		while(i < nombre.length){
		System.out.print("Ingrese el nombre del alumno: ");
		nombre [i] = consola.readLine();
		i++;
		}
		notas();
	}
	
	public static void notas(){
		Console consola = System.console();
		int i = 0;
		
		while(i < nota1.length){	
		System.out.print("Ingrese la nota de la actividad 1: ");
		String a = consola.readLine();
		nota1 [i] = Double.parseDouble(a);
		i++;
		
		System.out.print("Ingrese la nota de la actividad 2: ");
		a = consola.readLine();
		nota2 [i] = Double.parseDouble(a);
		i++;
		
		System.out.print("Ingrese la nota de la actividad 3: ");
		a = consola.readLine();
		nota3 [i] = Double.parseDouble(a);
		i++;
		
		System.out.print("Ingrese la nota de la actividad 4: ");
		a = consola.readLine();
		nota4 [i] = Double.parseDouble(a);
		i++;	
		}
		promedioAlumno();
	}
	
	public static void promedioAlumno(){
		/* Tengo un problema al hacer el promedio y no tengo el tiempo suficiente para solucuinarlo (se suman todos los valores y se dividen por la cantidad de valores sumados ejemplo 1+1+1+1 = 4, la cuenta del promedio es 4/4)
		System.out.println();
		System.out.println("**********Listado Notas**********");
		int i = 0;
		double promedio[] = new double [cantidadAlumnos];
		while( i < nombre.length){
			promedio[i] = (4 / (nota1[i] + nota2[i] + nota3[i] + nota4[i]));
			System.out.println("Alumno "+nombre [i]+" tienen un promedio de: "+promedio[i]);
			i++;
		}
		*/
	}
	
	
}