import java.io.*;
import java.util.*;
public class Controlador{
	
	private ArrayList <Jugador> listaJugadores = new ArrayList <>(20);
	private Console consola = System.console();
	
	
	public void chequearEleccion(String eleccion){
		int eleccionInt = Integer.parseInt(eleccion);
		
		if (eleccionInt == 1){
			ClaseMenu.agregarJugador();
		}
		else if (eleccionInt == 2){
			listarJugadores();
		}
		else if (eleccionInt == 3){
			eliminarJugadores();
		}
		else if (eleccionInt == 4){
			salirDelPrograma();
		}
		else{
			System.out.println("La eleccion no fue correcta, sera llevado al menu para reingresar la opcion siguiendo los criterios de eleccion establecidos. ");
			System.out.println("------------------");
			ClaseMenu.menu();
		}
	}
	
	public void listarJugadores(){
		int i = 0;
		System.out.println("Listado de jugadores: ");
		System.out.println();
		while(i < listaJugadores.size()){
			String nombre = listaJugadores.get(i).getNombre();
			String nacionalidad = listaJugadores.get(i).getNacionalidad();
			int edad =  listaJugadores.get(i).getEdad();
			System.out.println("El jugador: " + nombre + " con " + edad + " años, de la nacionalidad " + nacionalidad);
			i++;
		}
		System. out.println("Esos fue la lista total de jugadores, sera enviado al menu");
		System. out.println("------------------------------------------------------------");
		System.out.println();
		ClaseMenu.menu();
	}
	public void anadirJugador(Jugador jugador){
		listaJugadores.add(jugador);
		jugador.imprimir();
		ClaseMenu.menu();
	}
	
	public void eliminarJugadores(){
		int i = 0;
		System.out.println("Listado de jugadores: ");
		System.out.println();
		while(i < listaJugadores.size()){
			String nombre = listaJugadores.get(i).getNombre();
			String nacionalidad = listaJugadores.get(i).getNacionalidad();
			int edad =  listaJugadores.get(i).getEdad();
			System.out.println("El jugador: " + nombre + " con " +edad + " años, de la nacionalidad " + nacionalidad + " el numero de jugador es: "+i);
			i++;
		}
		
		System.out.print(" seleccione el numer odel jugador a eliminar ");
		
		String seleccionStr = consola.readLine();
		int selecionPosicion = Integer.parseInt(seleccionStr);
		
		listaJugadores.remove(selecionPosicion);
		System. out.println("Se elimino con exito al jugador, sera enviado al menu");
		System. out.println("------------------------------------------------------------");
		ClaseMenu.menu();
		
		
	}
	
	public void salirDelPrograma(){
		System.out.println("Gracias por utilizar el programa ");
		System.exit(0);
		
	}
	
	
	
}