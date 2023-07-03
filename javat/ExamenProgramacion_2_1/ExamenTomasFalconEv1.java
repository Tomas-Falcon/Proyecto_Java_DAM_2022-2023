import java.io.*;
public class ExamenTomasFalconEv1{
	
static String maracaArray []; 
static String matriculaArray []; 
static double kmArray [];
static double tiempoArray [];
static int contador = 0;
static int i = 0;

	public static void main(String arg[]){
		Console consola = System.console();
		System.out.print("Ingrese la cantidad de coches que quiere ingresar al sistema: ");
		String cantidadCoches = consola.readLine();
		i  = Integer.parseInt(cantidadCoches);
		maracaArray = new String [i];
		matriculaArray = new String [i];
		kmArray = new double [i];
		tiempoArray = new double [i];
		marcaVehiculos();
	}
	
	
	public static void marcaVehiculos(){
		Console consola = System.console();
		System.out.println("INGRESA LOS DATOS DE UN COCHE");
		System.out.print("Marca: ");
		String marcaConsola = consola.readLine();
		System.out.println();
		maracaArray[contador] = marcaConsola;
		String a = "";
		if(marcaConsola.equals(a)){
			yesno();
		}
		else{
			metros();
		}
	}
	
	public static void yesno(){
		Console consola = System.console();
		System.out.println("Deseas agregar mas coches Y\\N ?");
		String yn = consola.readLine();
		String yynn = yn.toUpperCase();
		char yesno = yynn.charAt(0);
		if(yesno == 89){
			marcaVehiculos();
		}else if(yesno == 78){
			listaDeCoches();
		}
	}
	
	public static void metros(){
		Console consola = System.console();
		System.out.print("La cantidad de metros recorridos: ");
		String metrosString = consola.readLine();
		System.out.println();
		double metrosConsola = Double.parseDouble(metrosString);
		kmArray[contador] = metrosConsola/1000;
		tiempo();
	}
	public static void tiempo(){
		Console consola = System.console();
		System.out.print("La cantidad de tiempo que tardo en recorrer esa cantidad de metros: ");
		String minutosTotal = consola.readLine();
		System.out.println();
		double minutos = Double.parseDouble(minutosTotal);
		tiempoArray[contador] = minutos;
		matricula();
	}
	
	public static void matricula(){
		Console consola = System.console();
		System.out.print("La matricula: ");
		String matriculaString = consola.readLine();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		matriculaArray[contador] = matriculaString;
		contador++;
		if(i == contador){
			listaDeCoches();
		} 
		else{
		marcaVehiculos();
		}
	}
	public static void listaDeCoches(){
	
		for(int x = 0; x < contador; x++){
			double vPromedio = kmArray[x] / tiempoArray[x];
			System.out.println("La marca del auto es "+maracaArray[x]+" y su kilometraje es (El resultadoes ingresado en metros pero devuealto en km) "+kmArray[x]+" tardo "+tiempoArray[x]+" minutos en recorrer esa distancia, su la matricula es "+matriculaArray[x]+" y su tiempo medio es de "+vPromedio);
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
		}
		restoDelPrograma();
	}
	
	public static void restoDelPrograma(){
		//mas km
		double masKm=0;
		String mejorKm=""; 
		for(int x = 0 ; x < contador ; x++ ){
			if (kmArray[x] >masKm) {
				masKm = kmArray[x];
			}
		}
		for(int y = 0 ; y < contador ; y++ ){
				// imprimir mas km
				if(masKm == kmArray[y]){
					mejorKm = matriculaArray[y];
				System.out.println("EL auto con mas kilometros es "+mejorKm+" y son "+masKm+" tardo "+tiempoArray[y]);
				}
		}
		System.out.println();
		tiempototal();
	}
	public static void tiempototal(){
		double tiempoTototal = 0;
		int c = 0;
		while(c < contador){
			tiempoTototal += tiempoArray[c];
			c++;
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
		System.out.println("El tiempo total de todos los vehiculos es: "+tiempoTototal);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
		msj();
	}
	
	public static void msj(){
		System.out.println();
		System.out.println("Lo siento, no puede ingresar mas vehiculos, este es el final del programa");
		System.exit(0);
	}
	
	
 }
 