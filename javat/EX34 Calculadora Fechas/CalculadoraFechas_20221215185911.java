import java.util.*;
import java.io.*;
import java.text.*;
	public class CalculadoraFechas{
	
	static int diasFinDeSemana = 0;
	static int diasFestivos = 0;
	static int diasLaborales = 0;
		public static void main (String arg []){
		 Console consola = System.console();
			System.out.print("Ingrese la cantidad de dias a la que quiere hacer la cuenta de los proximos dias laborales (0 = a hoy, -1 es ayer y 1 es mañana): ");
		String dias = consola.readLine();
		int a = Integer.parseInt(dias);
		
			
			
			System.out.print("Ingrese cuantos dias quere chequear si son habiles: ");
			String diasF = consola.readLine();
			int b = Integer.parseInt(diasF);
			
		
			
			Calendar calendario = Calendar.getInstance();
	
			SimpleDateFormat modeloF = new SimpleDateFormat("dd/MM/yyyy");
			Date fecha = new Date();
			String elHoy = modeloF.format(fecha);
			
			try{
				fecha = modeloF.parse(elHoy);
			}catch(Exception e){
				System.out.println("------------ERROR en la cadena------------");
			}
		
			calendario.setTime(fecha);
			System.out.println(elHoy);
			
			
			System.out.println();
			int i = 0;
			System.out.println("Hoy es el dia: "+elHoy);
			while(i < b){
			calendario.add(Calendar.DATE, a);
			imprimir(calendario; b);
			i++;
			}
			System.out.println("Hay "+diasFinDeSemana+" dias de fin de semana");
		}
		
		public static void imprimir(Calendar calendario; int b){
			System.out.print("EL dia es: "+calendario.get(Calendar.DATE)+"/"+(calendario.get(Calendar.MONTH)+1)+"/"+calendario.get(Calendar.YEAR)+", Es el dia");
			boolean fn	 = false;
			switch(calendario.get(Calendar.DAY_OF_WEEK)){
				case Calendar.SATURDAY:
				System.out.println(" Sabado");
				fn	 = true;
				finDeSemana(fn);
				break;
				case Calendar.SUNDAY:
				System.out.println(" Domingo");
				fn	 = true;
				finDeSemana(fn);
				break;
				case Calendar.MONDAY:
				System.out.println(" Lunes");
				diasDeSemana(b;calendario);
				break;
				case Calendar.TUESDAY:
				System.out.println(" Martes");
				diasDeSemana(b;calendario);
				break;
				case Calendar.WEDNESDAY:
				System.out.println(" Miercoles");
				diasDeSemana(b;calendario);
				break;
				case Calendar.THURSDAY:
				System.out.println(" Jueves");
				diasDeSemana(b;calendario);
				break;
				case Calendar.FRIDAY:
				System.out.println(" Viernes");
				diasDeSemana(b;calendario);
				break;
			}
		}
		
		public static void finDeSemana(boolean fni){
			diasFinDeSemana ++;
			
		}
		
		public static void diasDeSemana(int a; Calendar calendario){
			DateFormat formateador= new SimpleDateFormat("dd/M");
			Date fecha= formateador.parse(calendario.get(Calendar.DATE)+"/"+(calendario.get(Calendar.MONTH)+1));
			diasLaborales++;
			int i = 0;
			Calendar t [] = { };
			while(i < a){
				i++;
				if(t[i] == calendario){
					diasLaborales--;
					diasFestivos++;
				}
			}
			
			
		}
		
	}