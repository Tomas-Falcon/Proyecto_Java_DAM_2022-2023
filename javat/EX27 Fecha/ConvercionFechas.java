 import java.util.*;
 import java.text.*;
public class ConvercionFechas{

	public static void main(String arg[]){
		Date hoy= fecha();
	}
	public static Date fecha(){
		Date fecha = new Date();

		java.io.Console consola = System.console();
		System.out.print("Ingrese una fecha en el formarto \"dd/MM/yyyy\": ");
		String a = consola.readLine();
		Date c = null;

		try{
			SimpleDateFormat ss11=new SimpleDateFormat("dd-MM-yyyy");
			Date f11s=ss11.parse(a);
			c = f11s;
			String fecha1 = ss11.format(c);
			System.out.print("La fecha ingresada es: "+fecha1);	
		}
		catch(Exception e){
			System.out.println("ERROR EN LA CADENA");
			System.out.println("INTENTE CON OTRO FORMATO DE FECHA ");
			fecha();
		}
		return(c);
	}
}	