public class Ejercicio {
	public static void main(String[] args) {
		int edad = 55; // Edad para evaluar los requisitos
		int divisor = 6; // Número divisor para calcular el resto
		int divisor2 = 2; // Segundo número divisor para calcular el resto
		int cero = 0; // Valor cero para comparación del resto
		int resto; // Variable para almacenar el resultado del resto
		int edadMinima = 50; // Edad mínima requerida
		boolean requisitos; // Variable para verificar si se cumplen los requisitos

		// Cálculo del resto y evaluación de los requisitos
		resto = divisor % divisor2; // Cálculo del resto
		requisitos = resto == cero && edad >= edadMinima; // Verificación de los requisitos

		// Impresión del resultado
		System.out.println("El número cumple las condiciones: " + requisitos + ", la edad es: " + edad);
	}
}
