import java.io.*;
import java.util.*;

public class Perro{
   
	int nPpatas = 0;
	int horasDormidas = 0;
	String raza = "";
	String nombre = "";
	String color = "";
	boolean esMacho;
	boolean estaDurmiendo;

	
	public float ladrar(){
		System.out.println("Perro ladra");
		return (0);
	}

	public boolean dormir(int horasD){
		if(horasD > 0){
			System.out.println("Perro duerme");
			estaDurmiendo = true;
		}
		else {
			System.out.println("Perro no duerme");
			estaDurmiendo = false;
		}
		return (estaDurmiendo);
	}

	public double saltar(int salto){
		double longitudZancad = 1.5;
		double longitudSalto = salto * longitudZancad;
		System.out.println("Perro salta y su salto tiene una longitud de: "+longitudSalto+" metros");
		return (longitudSalto);
	}
	
	public void comer(){
		System.out.println("Perro come");
	}
}