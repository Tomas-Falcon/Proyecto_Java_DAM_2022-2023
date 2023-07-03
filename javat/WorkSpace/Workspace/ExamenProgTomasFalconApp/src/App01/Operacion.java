package App01;
import java.text.*;
import java.util.*;
public class Operacion {
	//esto esta xq se pide una instancia de la clase "Operacion"
	public String  operar(int var1, int var2){
		int resultado = var1 + var2;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		Date bf = new Date();
		String fechaOperacion = sdf.format(bf); //fecha
		try{
			bf = sdf.parse(fechaOperacion);
		}catch(Exception e){
			System.out.println("------------ERROR en la cadena------------");
		}
		System.out.println(fechaOperacion);
		return fechaOperacion;
	}
}
