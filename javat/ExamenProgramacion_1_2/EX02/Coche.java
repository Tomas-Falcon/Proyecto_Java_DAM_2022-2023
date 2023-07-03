import java.io.*;
import java.util.*;

public class Coche{
	
	private String marca;
	private String matricula;
	private double costeMensual;
	
	public Coche(String marca, String matricula, double costeMensual){
		this.marca = marca;
		this.matricula = matricula;
		this.costeMensual = costeMensual;
	}
	
	public Coche(double costeMensual){
		this.costeMensual = costeMensual;
	} 
	
	public double valorCoche(){
		return costeMensual;
	}
	
}
