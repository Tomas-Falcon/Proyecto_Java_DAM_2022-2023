import java.util.*;

public class ClaseMain {
	
	static Stack <String> datos = new Stack<>(); 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("|-------MENU-------|\n|1- Ingrear Datos  |\n|2- Listar Datos   |\n|3- Borrar Datos   |\n|4- Salir          |\n|------------------|\n");
		int a = sc.nextInt();
	
		eleccion(a);

	}
	
	public static void menu() {
		System.out.println("|-------MENU-------|\n|1- Ingrear Datos  |\n|2- Listar Datos   |\n|3- Borrar Datos   |\n|4- Salir          |\n|------------------|\n");
		Scanner ssc = new Scanner(System.in);
		int a = ssc.nextInt();
		eleccion(a);
	}
	
	public static void eleccion(int eleccion) {
		if(eleccion == 1) {
			System.out.println("Ingrese los datos hasta que no quiera ingresar mas datos: ");
			ingresarDatos();
		}else if(eleccion == 2) {
			System.out.println(" Se listaran los datos: ");
			listarDatos();
			
		}else if(eleccion == 3) {
			System.out.println(" Se borraran los datos ");
			borrarDatos();
		}else if(eleccion == 4) {
			System.out.println("Se saldra del programa, tenga un buen dia! ");
			System.exit(0);
		}
	}
	
	public static void ingresarDatos() {
		while(true){
			Scanner sc = new Scanner(System.in);
			String dato =  sc.nextLine();
			if(dato.equals("")) {
				break;
			}else {
				datos.push(dato);
			}
		}
		menu();
	}
	
	public static void listarDatos() {
	    int a = 0;
	    int tamano = datos.size() + 1;

	    while (a < tamano) {

	        if (a < datos.size()) {
	            System.out.println("El dato en la posicion de " + a + " es: " + datos.get(a));
	            a++;
	        } else {
	            System.out.println("No hay mas datos para imprimir");
	            menu();
	        }

	    }
	    menu();
	}

	
	public static void borrarDatos() {
			int a = 0;
			
		
		if(a < datos.size()){
			System.out.println("El dato \"" + datos.pop() + "\" a sido borrado");
			
			
			a++;
			
		}else {
			System.out.println("No hay mas datos para borrar22");
		}
		
		System.out.println("Si quiere eliminar mas datos, re ingrese la opcion 3 en el menu, sera redirigido al menu");
		menu();
	}
}
