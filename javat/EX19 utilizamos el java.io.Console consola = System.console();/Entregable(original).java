public class Entregable{
public static void main (String arara []){
		java.io.Console consola = System.console();
		System.out.println("Introduzca la cantidad de alunmos:");
		String cantAlumnos = consola.readLine();
		int b = Integer.parseInt(cantAlumnos);
		int a = 0;
		
		double sum = 0;
		double maximo = 0;
		double minimo = 0;
		String nombrear [] = new String [b];
		double notaor [] = new double [b];
		while(a < b){
			System.out.println("Introduzca el nombre y apellido del alumno:");
			String nombre = consola.readLine();
			System.out.println("Introduzca la nota del alumno:");
			String nota = consola.readLine();
			double notaDouble = Double.parseDouble(nota);
			//se obtienen  los valores y se tranforman a lo que se tiene que transformar
			nombrear [a] = nombre;
			notaor [a] = notaDouble;
			maximo = Math.max(notaor [a], notaor [a]);
			minimo = Math.min(notaor [a], notaor [a]);
			//se asignan dichos valores a unos arrays
			a++;
			sum +=notaDouble;
			//se suma todos los variables
			
		}
		double media = sum/b;		//se saca el promedio
		System.out.println("La nota media de la clase es "+media);		
		System.out.println("El o los alumnos con la mejor nota es: "+maximo);		
		System.out.println("El o los alumnos con la peor nota es: "+minimo);		
		
	}
}