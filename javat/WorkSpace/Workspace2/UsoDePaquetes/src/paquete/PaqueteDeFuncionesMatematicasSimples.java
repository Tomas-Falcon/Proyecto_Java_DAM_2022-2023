package paquete;

public class PaqueteDeFuncionesMatematicasSimples {

	public static void imprimir() {
		System.out.println("Este es el paquete \"PaqueteDeFuncionesMatematicasSimples\" que nos permite sumar, restar, multiplicar, dividir y obtener el resto");
	}
	
	public static void sumar(double a, double b) {
		double c = a + b;
		System.out.println("La suma de "+a+" y de "+b+" es: "+c);
	}
	
	public static void restar(double a, double b) {
		double c = a - b;
		System.out.println("La resta de "+a+" menos "+b+" es: "+c);
	}
	
	public static void multiplicar(double a, double b) {
		double c = a * b;
		System.out.println("La multiplicacion de "+a+" x "+b+" es: "+c);
	}
	
	public static void division(double a, double b) {
		double c = a / b;
		System.out.println("La division de "+a+" de "+b+" es: "+c);
	}
	
	public static void resto(double a, double b) {
		double c = a % b;
		System.out.println("El restro de "+a+" entre "+b+" es: "+c);
	}
}