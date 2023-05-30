public class Saludador{
	public static void main(String ar []){
			
			String nombre = ar[0];
			String nombre2 = ar[1];
			String apellido = ar[2];
			// imprimir el contenido de las variables (el contenido es el array que metemos en consola)
			if(ar.length <= 3)
				System.out.print("Hola, " + nombre + " " + nombre2 + " " + apellido + " BUENAS NOCHES!!!");
			else System.out.print("ERROR");
			
			
			/* imprimir directamente el array
			if(ar.length <= 3)
				System.out.print("Hola, " + ar[0] + " " + ar[1] + " " + ar[2] + " BUENAS NOCHES!!!");
			else System.out.print("ERROR");
			*/
			
		}
	}