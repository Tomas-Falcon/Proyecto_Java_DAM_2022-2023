public class UsandoSecuenciasDeEscape{
	public static void main (String ar []){
		int a;
		int b;
		int d;
		// los /" o los /n o cualquier variacion de "/"  nos permite hacer muchas cosas en java al tener problemas con las "" o con tros simbolos.
		String nombre;
		String cadena;
		cadena = "\"hola mi nombre es";
		nombre = "\"Tomas\"\"";
		String pe;
		pe = "C:\\Users\\IEUser";
		a = 10;
		b = 13;
		System.out.println(a);
		System.out.println(b);
		System.out.println("hola \nmundo");
		System.out.println("hola,  mi nombre es \"Tomas\"!!");
		System.out.println("\"Manolo\" y \"Benito\"");
		System.out.println(cadena + nombre);
		System.out.println("Mi ruta es " + pe);
	}
}