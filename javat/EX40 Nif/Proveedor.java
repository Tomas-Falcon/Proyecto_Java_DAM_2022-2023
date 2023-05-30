import java.io.*;
import java.util.*;
	
public class Proveedor{


	public void verificadorDeNif(String a){
		char charArray [] = a.toCharArray();
		int i = 0; 
		int ultimaletra = charArray.length - 1;
		
		System.out.print("Su NIF es: ");

		while(i < charArray.length){
			int o = 0;
			int caracter =  charArray[i];
				if(o <  charArray.length && ultimaletra <= 9){
					
					if(caracter > 64 && caracter < 91 && i == ultimaletra){
						System.out.print(charArray[i]);
					}
						else if(i > ultimaletra){
							verificadorDeNif2("El NIF no cumple los requisitos");
						}
					if( caracter > 47 && caracter < 58){
						/*System.out.print("Numeros ");*/ System.out.print(charArray[i]);
					}
				}
				else {
					verificadorDeNif2("El NIF no cumple los requisitos");
				}
		 o++;
		 i++;
		}
		System.out.println();
	}
	
	public void verificadorDeNif2(String a){
		System.out.println(a);
		System.exit(0);
	}
}