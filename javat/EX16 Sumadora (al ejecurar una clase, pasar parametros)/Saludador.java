public class Saludador{
	public static void main(String args []){
			
			String nombre = args[0];
			String nombre2 = args[1];
			String apellido = args[2];
			// imprimir el contenido de las variables que es asignado del array(el contenido es el array que metemos en consola)
			if(args.length <= 3)
				System.out.print("Hola, " + nombre + " " + nombre2 + " " + apellido + " BUENAS NOCHES!!!");
			else System.out.print("ERROR");
			
			
			/* imprimir directamente el array
			if(args.length <= 3)
				System.out.print("Hola, " + args[0] + " " + args[1] + " " + args[2] + " BUENAS NOCHES!!!");
			else System.out.print("ERROR");
			*/
			
		}
	}