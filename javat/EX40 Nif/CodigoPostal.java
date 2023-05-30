import java.io.*;
import java.util.*;
	
public class CodigoPostal{
	
	
	String comunidad;
	char codigoPostalArrayCh [] = new char [5];

	public void codigoPostalBase(String x){
		
		char codigoPostalArrayCh2 [] = x.toCharArray();
		int d = 0;
		while (d < codigoPostalArrayCh2.length){
			codigoPostalArrayCh[d] = codigoPostalArrayCh2 [d];
			d++;
		}
		int i = 0;
		int c = 0;
		while(i < codigoPostalArrayCh.length){
			if(i < codigoPostalArrayCh.length){
				if(codigoPostalArrayCh [i] == 00){
					System.out.println("El codigo postal es incorrecto.");
					System.exit(0);
				}
			}
			while(c < codigoPostalArrayCh.length){
				c++;
			}
			if(c > 5){
				System.out.println("El codigo postal es incorrecto.");
				System.exit(0);
			}
			else{
				comunidadDe();
			}
			i++;
		}
		finDelPrograma();
	}

	public void comunidadDe(){
		if(codigoPostalArrayCh [0] == '0'){
			if(codigoPostalArrayCh [1] == '1'){comunidad = "Álava";}
			else if(codigoPostalArrayCh [1] == '2'){comunidad = "Albacete";}
			else if(codigoPostalArrayCh [1] == '3'){comunidad = "Alicante";}
			else if(codigoPostalArrayCh [1] == '4'){comunidad = "Almería";}
			else if(codigoPostalArrayCh [1] == '5'){comunidad = "Ávila";}
			else if(codigoPostalArrayCh [1] == '6'){comunidad = "Badajoz";}
			else if(codigoPostalArrayCh [1] == '7'){comunidad = "Islas Baleares1";}
			else if(codigoPostalArrayCh [1] == '8'){comunidad = "Barcelona";}
			else if(codigoPostalArrayCh [1] == '9'){comunidad = "Burgos";}
		}
		else if(codigoPostalArrayCh [0] == '1'){
			if(codigoPostalArrayCh [1] == '0'){comunidad = "Cáceres";}
			else if(codigoPostalArrayCh [1] == '1'){comunidad = "Cádiz";}
			else if(codigoPostalArrayCh [1] == '2'){comunidad = "Castellón";}
			else if(codigoPostalArrayCh [1] == '3'){comunidad = "Ciudad Real";}
			else if(codigoPostalArrayCh [1] == '4'){comunidad = "Córdoba";}
			else if(codigoPostalArrayCh [1] == '5'){comunidad = "La Coruña";}
			else if(codigoPostalArrayCh [1] == '6'){comunidad = "Cuenca";}
			else if(codigoPostalArrayCh [1] == '7'){comunidad = "Gerona";}
			else if(codigoPostalArrayCh [1] == '8'){comunidad = "Granada";}
			else if(codigoPostalArrayCh [1] == '9'){comunidad = "Guadalajara";}
		}
		else if(codigoPostalArrayCh [0] == '2'){
			if(codigoPostalArrayCh [1] == '0'){comunidad = "Guipúzcoa";}
			else if(codigoPostalArrayCh [1] == '1'){comunidad = "Huelva";}
			else if(codigoPostalArrayCh [1] == '2'){comunidad = "Huesca";}
			else if(codigoPostalArrayCh [1] == '3'){comunidad = "Jaén";}
			else if(codigoPostalArrayCh [1] == '4'){comunidad = "León";}
			else if(codigoPostalArrayCh [1] == '5'){comunidad = "Lérida";}
			else if(codigoPostalArrayCh [1] == '6'){comunidad = "La Rioja";}
			else if(codigoPostalArrayCh [1] == '7'){comunidad = "Lugo";}
			else if(codigoPostalArrayCh [1] == '8'){comunidad = "Madrid";}
			else if(codigoPostalArrayCh [1] == '9'){comunidad = "Málaga";}
		}
		else if(codigoPostalArrayCh [0] == '3'){
			if(codigoPostalArrayCh [1] == '0'){comunidad = " Murcia";}
			else if(codigoPostalArrayCh [1] == '1'){comunidad = "Navarra";}
			else if(codigoPostalArrayCh [1] == '2'){comunidad = "Orense";}
			else if(codigoPostalArrayCh [1] == '3'){comunidad = "Asturias";}
			else if(codigoPostalArrayCh [1] == '4'){comunidad = "Palencia";}
			else if(codigoPostalArrayCh [1] == '5'){comunidad = "Las Palmas";}
			else if(codigoPostalArrayCh [1] == '6'){comunidad = "Pontevedra";}
			else if(codigoPostalArrayCh [1] == '7'){comunidad = "Salamanca";}
			else if(codigoPostalArrayCh [1] == '8'){comunidad = "Santa Cruz de Tenerife";}
			else if(codigoPostalArrayCh [1] == '9'){comunidad = "Cantabria";}
		}
		else if(codigoPostalArrayCh [0] == '4'){
			if(codigoPostalArrayCh [1] == '0'){comunidad = "Segovia";}
			else if(codigoPostalArrayCh [1] == '1'){comunidad = "Sevilla";}
			else if(codigoPostalArrayCh [1] == '2'){comunidad = "Soria";}
			else if(codigoPostalArrayCh [1] == '3'){comunidad = "Tarragona";}
			else if(codigoPostalArrayCh [1] == '4'){comunidad = "Teruel";}
			else if(codigoPostalArrayCh [1] == '5'){comunidad = "Toledo";}
			else if(codigoPostalArrayCh [1] == '6'){comunidad = "Valencia";}
			else if(codigoPostalArrayCh [1] == '7'){comunidad = "Valladolid";}
			else if(codigoPostalArrayCh [1] == '8'){comunidad = "Vizcaya";}
			else if(codigoPostalArrayCh [1] == '9'){comunidad = "Zamora";}
		}
		else if(codigoPostalArrayCh [0] == '5'){
			if(codigoPostalArrayCh [1] == '0'){comunidad = "Zaragoza";}
			else if(codigoPostalArrayCh [1] == '1'){comunidad = "Ceuta";}
			else if(codigoPostalArrayCh [1] == '2'){comunidad = "Melilla";}
		}
		else{
			verificador("El codigo postal no cumple los requisitos");
		}
	}
	
	public void verificador(String a){
		System.out.println(a);
		System.exit(0);
	}
	
	public void finDelPrograma(){
		System.out.println("Su codigo postal es: "+codigoPostalArrayCh[0] + codigoPostalArrayCh[1] + codigoPostalArrayCh[2] + codigoPostalArrayCh[3] + codigoPostalArrayCh[4] + " y pertenece a la comunidad de " + comunidad);
	}
}
