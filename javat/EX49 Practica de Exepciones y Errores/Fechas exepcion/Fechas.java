import java.util.*;
import java.text.*;
public class Fechas {
	public static void main(String [] arg)throws ParseException{
		
			metodo();

	}
		public static void metodo () throws ParseException{
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String blackFridayString = "25/11/2022";
	
			Date blackFriday = new Date();
				
			blackFriday =sdf.parse(blackFridayString);
			System.out.println("Fecha: "+ blackFriday); 

		}
}
