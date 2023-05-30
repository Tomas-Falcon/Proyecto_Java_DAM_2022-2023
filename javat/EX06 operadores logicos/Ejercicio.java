public class Ejercicio{
	public static void main (String arg []){
		int edad = 55;
		int div = 6;
		int dos = 2;
		int cero = 0;
		int resto;
		int q = 50;
		resto = div % dos;
		boolean requisitos = resto == cero && edad >= q;
		
	
		System.out.println("El numero cumple las condiciones " + requisitos + " la edad es " + edad);
		
		
	}
}