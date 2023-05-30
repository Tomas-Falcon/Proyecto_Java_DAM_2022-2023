import java.io.*;
import java.util.*;
public class Controlador{
	
	private String{nombre, apellido};
	private int telefono;
	
	public Cotacto(String nombre, String apelliso, int telefono){
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	
	public int getTelefono(){
		int telefono = telefono;
		return telefono;
	}

	public String getApellido(){
		String apellido = apellido;
		return apellido;
	}	
	
	public String getNombre(){
		String nombre = nombre;
		return nombre;
	}	
	
	public void setTelefono(int telefono){
		this.telefono = telefono;
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	}	
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	
}