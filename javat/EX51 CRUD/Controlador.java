import java.io.*;
import java.util.*;
import java.text.*;
public class Controlador{
	
	
	private Console consola = System.console();
	
	
	public void chequearEleccion(String eleccion){
		int eleccionInt = Integer.parseInt(eleccion);
		
		if (eleccionInt == 1){
			ClaseMain.agregarContacto();
		}
		else if (eleccionInt == 2){
			listarContacto();
		}
		else if (eleccionInt == 3){
			modificarContacto();
		}
		else if (eleccionInt == 4){
			eliminarContacto();
		}
		else if (eleccionInt == 5){
			salirDelPrograma();
		}
		else{
			System.out.println("La eleccion no fue correcta, sera llevado al menu para reingresar la opcion siguiendo los criterios de eleccion establecidos. ");
			System.out.println("#······························································································································#");
			ClaseMenu.menu();
		}
	}
	
	public void salirDelPrograma(){
		System.exit(0);
	}

	
}