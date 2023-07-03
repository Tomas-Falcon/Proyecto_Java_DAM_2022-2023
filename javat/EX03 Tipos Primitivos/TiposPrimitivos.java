public class TiposPrimitivos {
	public static void main(String args[]) {
		// Declaración e inicialización de variables
		byte numeroByte = 127;
		int entero = 10;
		double decimal = 3.14;
		boolean booleano = true;
		char caracter = 'A';

		// Operaciones con variables
		int suma = entero + numeroByte;
		double multiplicacion = decimal * 2;
		boolean negacion = !booleano;
		char siguienteCaracter = (char) (caracter + 1);

		// Impresión de los resultados
		System.out.println("Valor byte: " + numeroByte);
		System.out.println("Valor entero: " + entero);
		System.out.println("Valor decimal: " + decimal);
		System.out.println("Valor booleano: " + booleano);
		System.out.println("Valor caracter: " + caracter);
		System.out.println("Suma: " + suma);
		System.out.println("Multiplicación: " + multiplicacion);
		System.out.println("Negación: " + negacion);
		System.out.println("Siguiente caracter: " + siguienteCaracter);
	}
}