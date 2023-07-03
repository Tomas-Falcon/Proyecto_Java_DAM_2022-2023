import java.io.*;
public class TomasFalconExamenProg03{
	
	static int cantidadProductos;
	static String producto [];
	static double precio [];
	
	public static void main(String ar []){
		Console consola = System.console();
		
		System.out.print("Ingrese la cantidad de productos: ");
		String cantidadP = consola.readLine();
		cantidadProductos = Integer.parseInt(cantidadP);
		precio = new double [cantidadProductos];
		producto = new String [cantidadProductos];
		productos();
	}
	public static void productos(){
		Console consola = System.console();
		int i = 0;
		String b = "";
		while(i < producto.length){
			
		System.out.print("Ingrese el producto: ");
		producto [i] = consola.readLine();
		if(producto[i].equals(b))
			siNo();
		System.out.print("Ingrese el precio del producto: ");
		String a = consola.readLine();
		precio [i] = Double.parseDouble(a);
		i++;
		}
		total();
	}
	
	public static void siNo(){
		Console consola = System.console();
		System.out.print("¿Desea continual el programa? [S/N]: ");
				String si = consola.readLine();
		String ssi = si.toUpperCase();
		char sii = ssi.charAt(0);
		if(sii == 83){
			productos();
		}else if(sii == 78){
			total();
		}
	}
	public static void total(){
		int i = 0;
		double pTotal = 0;
		while(i < producto.length){
			pTotal += precio[i];
			i++;
		}
		System.out.println("Son "+i+" productos y el total a pagar es de $"+pTotal);
	}
}