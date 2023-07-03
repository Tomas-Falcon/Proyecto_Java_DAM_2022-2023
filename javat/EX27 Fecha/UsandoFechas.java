import java.util.*;
import java.text.*;

public class UsandoFechas {

	public static void main(String arg[]) {

		Date fecha = new Date();
		System.out.println(fecha);
		long milisegundos = fecha.getTime();
		long segundos = fecha.getTime() / 1000;
		long minutos = fecha.getTime() / (1000 * 60);
		long dias = fecha.getTime() / (60 * 60 * 24 * 1000);

		System.out.println("pasaron " + milisegundos + " milisegundos desde 1 enero del 1930");
		System.out.println("pasaron " + segundos + " seguindos desde 1 enero del 1930");
		System.out.println("pasaron " + minutos + " minutos desde 1 enero del 1930");
		System.out.println("pasaron " + dias + " dias desde 1 enero del 1930");
		/*
		 * Date fecha2 = new Date(2022,11,7);
		 * System.out.println(fecha2);
		 * long dias2 = fecha2.getTime()+(60+60+24+1000);
		 * System.out.println(dias2);
		 * System.out.println(fecha2.getTime());
		 */

		SimpleDateFormat formato = new SimpleDateFormat("hh:mm  dd/MM/yyyy");
		String fecha2 = formato.format(fecha);
		System.out.println(fecha2);
		System.out.println();
		System.out.println();
		SimpleDateFormat formato2 = new SimpleDateFormat("kk:mm:ss DDD");
		String horaMinSec = formato2.format(fecha);
		System.out.println(horaMinSec);
	}

}