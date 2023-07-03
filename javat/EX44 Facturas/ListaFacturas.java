import java.io.*;
public class ListaFacturas{
	static Procesos proceso = new Procesos();
	public static void main(String [] arg){
		ingresarDatosFac();
		proceso.imprimirFacturas();
		System.out.println("------------------------------------------------");
		System.out.print("La factura con mayor ingreso es de:"+proceso.facturaMayor()+" de las empresas: ");
		proceso.anadirFacMax();
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.print("La factura con menor ingreso es de"+proceso.facturaMenor()+" de las empresas:");
		proceso.anadirFacMin();
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("La factura mas antigua es de:"+proceso.facturaAntigua());
		System.out.println("------------------------------------------------");
		System.out.println("El calculo del iva total del las facturas es de:"+proceso.ivaTotal());
	}
	public static void ingresarDatosFac (){
		while(true){
			String nombre=preguntar("Introduzca el nombre de la empresa");
			if(nombre.equals(""))break;
			String fecha=preguntar("Introduzca la fecha con el siguiente formato dd/MM/yyyy ".trim());
			String importeString=preguntar("Introduzca el importe Bruto".trim());
			double importeBruto=Double.parseDouble(importeString);
			Factura newFac= new Factura(nombre,fecha,importeBruto);
			proceso.anadirFac(newFac);
		}
	}
	public static String preguntar(String pregunta){
		Console consola= System.console();
		System.out.println(pregunta);
		String retorno=consola.readLine();
		return retorno;
	}
}