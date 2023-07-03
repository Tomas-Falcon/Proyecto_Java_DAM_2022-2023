public class Calculadora {
	static double a;
	static double b;

	public static void main(String arg[]) {
		java.io.Console consola = System.console();
		System.out.print("Ingrese un valor ");
		String simbolo = consola.readLine();
		a = Double.parseDouble(simbolo);
		System.out.print("Ingrese un valor ");
		String simbolo2 = consola.readLine();
		b = Double.parseDouble(simbolo2);
		System.out.print("Ingrese la funcion ( +, -, *, / ) ");
		String funcion = consola.readLine();
		char f = funcion.charAt(0);
		if (f == 43) {
			suma();
		} else if (f == 45) {
			resta();
		} else if (f == 47) {
			dividiendo();
		} else if (f == 42) {
			multiplicando();
		} else
			System.out.println("Error!");
	}

	public static void suma() {
		double c = a + b;
		System.out.println("Sumando " + a + " con " + b + " da como resultado " + c);
		System.exit(0);
	}

	public static void resta() {
		double c = a - b;
		System.out.println("Restando " + a + " con " + b + " da como resultado " + c);
		System.exit(0);
	}

	public static void dividiendo() {
		double c = a / b;
		System.out.println("Dividiendo " + a + " entre " + b + " da como resultado " + c);
		System.exit(0);
	}

	public static void multiplicando() {
		double c = a * b;
		System.out.println("multiplicando " + a + " por " + b + " da como resultado " + c);
		System.exit(0);
	}
}