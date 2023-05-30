import java.util.*;
import java.text.*;
public class Fechas1 {
	public static void main(String [] arg){
		try{
			metodo();
		}catch(ParseException e){
			System.out.println(e.getMessage());
		}
		
	}
	public static void metodo () throws ParseException{
		System.out.println("hola");
	}
}
