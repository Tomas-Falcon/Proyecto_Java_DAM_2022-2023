public class TiposDeDatos {
	public static void main(String ar[]) {

		// Declaración e inicialización de variables
		byte miByte = 10;
		short miShort = 20;
		int miEntero = 30;
		long miLong = 40L;
		float miFloat = 3.14f;
		double miDouble = 3.1416;
		char miCaracter = 'A';
		boolean miBooleano = true;

		// Operaciones con variables
		int resultado1 = miEntero + miShort;
		double resultado2 = miDouble * miFloat;
		boolean resultado3 = miBooleano || (miEntero > miByte);

		// Impresión de los resultados
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);

	}
}