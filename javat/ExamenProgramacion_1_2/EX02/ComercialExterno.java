import java.io.*;
import java.util.*;

public class ComercialExterno{
	

	private String nombre;
	private String apellido;
	private double horas;
	private Coche cocheEmpresa;
	private double ventaBruto;
	private double ventaNeto;
	private double sueldoPorHora = 5.5;
	private double valorMensualDelCoche = cocheEmpresa.valorCoche();
	
	public ComercialExterno(String nombre, String apellido, double horas, Coche cocheEmpresa){
		this.cocheEmpresa = cocheEmpresa;
		this.nombre = nombre;
		this.apellido = apellido;
		this.horas = horas;
	}
	
	public ComercialExterno(String nombre, String apellido, double horas){
		this.nombre = nombre;
		this.apellido = apellido;
		this.horas = horas;
	}
	
	public void anadirVentas(double ventaBruto){
		this.ventaBruto += ventaBruto;
		ventasNeto(ventaBruto);
	}
	
	public void ventasNeto(double ventaBruto){
		double ventaNeto1 = ventaBruto + (0.21 * ventaBruto);
		this.ventaNeto += ventaNeto1;
	}
	
	public void imprimirVentasTotales(){
		System.out.println("Las ventas neto totales hechas por "+ nombre +" "+apellido +" son de €: "+ventaNeto);
		System.out.println("Las ventas bruto totales hechas por "+ nombre +" "+apellido +" son de €: "+ventaBruto);
		if(cocheEmpresa != null){
			System.out.println("El coste por vehiculos de "+ nombre +" "+apellido +" es de: €"+valorMensualDelCoche);
		}
	}
	
	public void imprimirBalance(){
		if(cocheEmpresa != null){
		double balance = ventaNeto - valorMensualDelCoche;
		System.out.println("El balance de "+ nombre +" "+apellido + " es de: €"+balance);
		}
		else System.out.println("El balance de "+ nombre +" "+apellido + " es de: €"+ventaNeto+", al no tener auto, no se le descuenta el valor del mismo");
	}
	
	public void imprimirTarifaPorHora(double horas1){
		double sueldoTotalPorHora = horas1 * sueldoPorHora;
		System.out.println("El sueldo total por las "+horas+" horas trabajadas es de: "+sueldoTotalPorHora);
	}
	
	public void imprimirTarifaPorSemana(double semana){
		double semanasTrabajadas = horas / (40 * semana);
		double sueldoTotalPorHora = horas * sueldoPorHora;
		System.out.println("El sueldo total por las "+semanasTrabajadas+" semanas trabajadas es de: "+sueldoTotalPorHora);
	}
	
	public void imprimirTarifaPorDia(double dia){
		double diasTrabajadas = horas / (8 * dia);
		double sueldoTotalPorHora = horas * sueldoPorHora;
		System.out.println("El sueldo total por los "+diasTrabajadas+" dias trabajadas es de: "+sueldoTotalPorHora);
	}
}
