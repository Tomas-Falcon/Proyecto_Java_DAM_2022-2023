import java.text.*;
import java.util.*;
public class UtilizandoFormatParse{
	
	
	public static void main(String args []){
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String fechaStr = "kk/kk/kkkk";
		// String fechaStr = "05/06/2002";
		// Date fecha;
		try{
			Date fecha = formato.parse(fechaStr);
			System.out.println(fecha);
		}
		catch(ParseException e){
			System.out.println("Error \n");
			e.printStackTrace();
		}
	}
}