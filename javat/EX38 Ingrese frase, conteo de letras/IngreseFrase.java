import java.io.*;
import java.util.*;

public class IngreseFrase{
	
	static Console consola = System.console();
	static ArrayList <Character> origen = new ArrayList <>(100);
	static ArrayList <Character> comparacionletra = new ArrayList <>(100);
	
	static int vocales = 0;
	static int consonantes = 0;
	static int simbolos = 0;
	static int numeros = 0;
	static String frase;
	static int x = 0;
	static int tamaño = 0;
	
	public static void main(String sr []){
		arraylistLosAdd();
		System.out.print("Ingrese una frase u oracion: ");
		ingresefrase();
		x = frase.length();
		fin();		
	}
	
	public static void ingresefrase(){
		frase = consola.readLine();
		tochar(frase);
	}
	
	public static void arraylistLosAdd(){
		char i = 'A';
		char ii = 'N';
		comparacionletra.add('Ñ');
		origen.add('1');
		while(i < 'Z'){
			comparacionletra.add(i);
			i++;
		}
	}
	
	public static void tochar(String stra){
		int i = 0;
		int po = 0;
		while(i < x){
			String stra2 = stra.toUpperCase();
			origen.add(stra2.charAt(i));
			i++;
		}
		
		while(po < x){
			for(char ca : origen){
				if(ca <= 'B' && ca >= 'Z' || ca != 'E' || ca != 'I' || ca != 'O' || ca != 'U' || ca != ' '){
					consonantes++;
					tamaño++;
				}
				else if(ca.equals('A') || ca.equals('E') || ca.equals('I') || ca.equals('O') || ca.equals('U') || ca != ' '){
					vocales++;
					tamaño++;
				}
			}
			po++;
		}
		x = tamaño;
	}
	
	public static void fin(){
		System.out.println("La frase ingresada es: "+frase+" Cuenta con "+vocales+" vocales, cuenta con "+consonantes+" consonantes, la frase tiene una longitud de: "+x);
	}
}