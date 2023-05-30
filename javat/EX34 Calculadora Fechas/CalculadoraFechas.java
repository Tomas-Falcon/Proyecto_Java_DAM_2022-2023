import java.util.*;
import java.text.*;
public class CalculadoraFechas{
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	static int diasHabiles = 0;
	static int diasHabiles3 = 0;
	static int diasHabiles2 = 0;
	static int diasFestivos = 0;
	static int diasFin = 0;
	static Calendar fechaCalendar= Calendar.getInstance();
	static String [] arrayFestivos = new String[100];
	static String cadenahabil = null;
	///////////////
	public static void main (String or []){
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingresa una fecha con el siguiente formato dd/mm/yyyy");
		String fechaString=scan.nextLine();
		System.out.println("Ingrese los dias habiles");
		diasHabiles = scan.nextInt();
		diasHabiles3 = diasHabiles;
		arrayFestivos[0] = "24/12/2022";
		arrayFestivos[1] = "25/12/2022";
		arrayFestivos[2] = "01/01/2023";
		arrayFestivos[3] = "06/01/2023";
		arrayFestivos[4] = "14/04/2023";
		arrayFestivos[5] = "15/04/2023";
		arrayFestivos[6] = "02/05/2023";
		arrayFestivos[7] = "15/08/2023";
		arrayFestivos[8] = "01/11/2023";
		arrayFestivos[9] = "06/12/2023";
		arrayFestivos[10] = "08/12/2023";
		arrayFestivos[11] = "24/12/22023";
		arrayFestivos[12] = "25/12/2023";
		arrayFestivos[13] = "31/12/2023";
		arrayFestivos[14] = "01/01/2024";
		arrayFestivos[15] = "06/01/2024";
		arrayFestivos[16] = "14/04/2024";
		arrayFestivos[17] = "15/04/2024";
		arrayFestivos[18] = "02/05/2024";
		arrayFestivos[19] = "15/08/2024";
		arrayFestivos[20] = "01/11/2024";
		arrayFestivos[21] = "06/12/2024";
		arrayFestivos[22] = "08/12/2024";
		arrayFestivos[23] = "24/12/22024";
		arrayFestivos[24] = "25/12/2024";
		arrayFestivos[25] = "31/12/2024";
		
		Date fechaDate=stringADate(fechaString);
		fechaCalendar.setTime(fechaDate);
		compararFechas();
	}
	public static Date stringADate(String fechaString){
		Date fecha=null;
		try{
			fecha=sdf.parse(fechaString);
		}catch(Exception e){
			System.out.println("*****ERROR*****");
		}
		return fecha;
	}
	public static String dateAString(Date fecha){
		return sdf.format(fecha);
	}
	public static void compararFechas(){
		fechaCalendar.add(Calendar.DATE, -1);
		for(int x=0;x<diasHabiles;x++){
			fechaCalendar.add(Calendar.DATE, 1);
			sinoeshabil();
		}
		System.out.println("En "+diasHabiles3+" hay: "+diasHabiles2+" dias habiles, "+diasFestivos+" dias festivos y "+diasFin+" dias de fin de semana.");
	}
	public static void sinoeshabil(){
		switch(fechaCalendar.get(Calendar.DAY_OF_WEEK)){
			case Calendar.SATURDAY:
			diasHabiles2--;
				diasFin++;
				diasHabiles++;
				imprimir();
				System.out.println(" es fin de semana");
				System.out.println("------------------------------");
				break;
			case Calendar.SUNDAY:
			diasHabiles2--;
				diasFin++;
				diasHabiles++;
				imprimir();
				System.out.println(" es fin de semana");
				System.out.println("------------------------------");
				break;
			case Calendar.MONDAY:
			diasHabiles2++;
				siEsFestivo();
				imprimir();
				System.out.println(cadenahabil);
				System.out.println("------------------------------");
				break;
			case Calendar.TUESDAY:
			diasHabiles2++;
				siEsFestivo();					
				imprimir();
				System.out.println(cadenahabil);
				System.out.println("------------------------------");
				break;
			case Calendar.WEDNESDAY:
			diasHabiles2++;
				siEsFestivo();
				imprimir();
				System.out.println(cadenahabil);
				System.out.println("------------------------------");
				break;
			case Calendar.THURSDAY:
			diasHabiles2++;
				siEsFestivo();
				imprimir();
				System.out.println(cadenahabil);
				System.out.println("------------------------------");
				break;
			case Calendar.FRIDAY:
			diasHabiles2++;
				siEsFestivo();
				imprimir();
				System.out.println(cadenahabil);
				System.out.println("------------------------------");
				break;	
		}
	}
	public static void siEsFestivo(){
		int x = 0;
		while(x<arrayFestivos.length){
			Date fechaDatevacia = fechaCalendar.getTime();
			String fechaStringvacia=sdf.format(fechaDatevacia);
			if(fechaStringvacia.equals(arrayFestivos[x])){
				cadenahabil=" Es dia festivo";
				diasFestivos++;
				diasHabiles2--;
				break;
				}
				else if(fechaStringvacia!=arrayFestivos[x]){
				cadenahabil=" es habil";
			}
			x++;
		}
		
	}
	public static void imprimir(){
		System.out.print("La FECHA: "
									+fechaCalendar.get(Calendar.DATE)+"/"
									+(fechaCalendar.get(Calendar.MONTH)+1)+"/"
									+fechaCalendar.get(Calendar.YEAR)
									);
	}
}