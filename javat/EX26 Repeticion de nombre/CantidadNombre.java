public class CantidadNombre {

	public static void main(String arg[]) {
		java.io.Console consola = System.console();
		System.out.print("Ingrese la cantidad de veces que quiere que se repita el nombre: ");
		String cantidad = consola.readLine();
		int cantidad2 = Integer.parseInt(cantidad);
		int b = 0;
		for (int i = 0; i <= cantidad2; i++) {
			i++;
			b++;
			nombre(b);
		}
		System.exit(0);
	}

	public static void nombre(int b) {
		java.io.Console consola = System.console();
		System.out.print("Ingrese un nombre ");
		String nombre = consola.readLine();
		System.out.print(nombre + " " + b);
	}

}