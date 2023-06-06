public class UsandoSecuenciasDeEscape {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		String nombre;
		String mensaje;
		String rutaArchivo;

		mensaje = "\"Hola, mi nombre es";
		nombre = "Tomas\"";
		rutaArchivo = "C:\\Users\\miUsuario";

		numero1 = 10;
		numero2 = 13;

		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println("Hola\nmundo");
		System.out.println("Hola, mi nombre es " + nombre + "!!");
		System.out.println("\"Manolo\" y \"Benito\"");
		System.out.println(mensaje + " " + nombre);
		System.out.println("Mi ruta es " + rutaArchivo);
	}
}
