public class UsandoOperadores {

	public static void main(String[] args) {
		// Declaración e inicialización de variables
		int numero1 = 5; // Primer número para realizar las operaciones
		int numero2 = 2; // Segundo número para realizar las operaciones

		// Operaciones aritméticas
		int suma = numero1 + numero2; // Suma de los dos números
		int resta = numero1 - numero2; // Resta de los dos números
		float division = (float) numero1 / numero2; // División de los dos números (con casting a float)
		float modulo = (float) numero1 % numero2; // Cálculo del módulo de los dos números (con casting a float)

		// Impresión de los resultados
		System.out.println("Sumando el número " + numero1 + " y el número " + numero2 + ", el resultado es " + suma);
		System.out.println("Restando el número " + numero1 + " y el número " + numero2 + ", el resultado es " + resta);
		System.out.println("Dividiendo el número " + numero1 + " entre el número " + numero2 + ", el resultado es " + division);
		System.out.println("Calculando el módulo del número " + numero1 + " y el número " + numero2 + ", el resto es " + modulo);
	}
}
