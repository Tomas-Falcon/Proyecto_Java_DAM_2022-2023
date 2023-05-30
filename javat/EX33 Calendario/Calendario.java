import java.util.*;
import java.io.*;
import java.text.*;
	public class Calendario{
		public static void main (String or []){
			// Calendar cal11 = Calendar.getInstance();
			// Calendar cal12 = new GregorianCalendar();
			// System.out.println(cal11);
			// System.out.println(cal12);
			Console consola = System.console();
			System.out.print("Ingrese la cantidad de dias que quiere avanzar o retroceder (avanzar = 1; retroceder = -1): ");
			String dias = consola.readLine();
			int a = Integer.parseInt(dias);
			
			Calendar cal13 = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			Date bf = new Date();
			String bfString = sdf.format(bf); //fecha
			try{
				bf = sdf.parse(bfString);
			}catch(Exception e){
				System.out.println("------------ERROR en la cadena------------");
			}
			cal13.setTime(bf);			
			// System.out.println(cal13);
			System.out.println();
			
			Date fecha2 = cal13.getTime();
			// System.out.println(sdf.format(fecha2));
			System.out.println();
			
			imprimir(cal13);
			cal13.add(Calendar.DATE, a);
			imprimir(cal13);
		}
		
		public static void imprimir(Calendar cal13){
			System.out.print("FECHA: "+cal13.get(Calendar.DATE)+"/"+(cal13.get(Calendar.MONTH)+1)+"/"+cal13.get(Calendar.YEAR)+" Es el dia");
			
			switch(cal13.get(Calendar.DAY_OF_WEEK)){
				case Calendar.SATURDAY:
				System.out.print(" Sabado");
				System.out.println();
				System.out.println();
				break;
				case Calendar.SUNDAY:
				System.out.print(" Domingo");
				System.out.println();
				System.out.println();
				break;
				case Calendar.MONDAY:
				System.out.print(" Lunes");
				System.out.println();
				System.out.println();
				break;
				case Calendar.TUESDAY:
				System.out.print(" Martes");
				System.out.println();
				System.out.println();
				break;
				case Calendar.WEDNESDAY:
				System.out.print(" Miercoles");
				System.out.println();
				System.out.println();
				break;
				case Calendar.THURSDAY:
				System.out.print(" Jueves");
				System.out.println();
				break;
				case Calendar.FRIDAY:
				System.out.print(" Viernes");
				System.out.println();
				System.out.println();
				break;
			}
			
			
		}
	}