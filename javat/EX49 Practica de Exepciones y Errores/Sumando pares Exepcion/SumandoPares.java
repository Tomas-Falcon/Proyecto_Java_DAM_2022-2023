import java.io.*;
import java.util.*;
public class SumandoPares{
	
	public static void main(String aa[]){
		 ArrayList< Integer> listaNumeros = new ArrayList< Integer > ();
		int contador=0;
		int suma=0;
		while (6!=contador){
			int numero= solicitarNumero();
			contador ++;
			if(numero%2==0){
				//System.out.println("numero par");
				listaNumeros.add(numero);	
				//imprimirLista(listaNumeros);
			}
		
		}
		contador = 0 ; 
		try{
			while(6!=contador){
			suma+=listaNumeros.get(contador++);
		}
		}catch(Exception e){
			System.out.println("****");
		}

		System.out.println("La suma total es: "+suma);
	}
	
	public static int solicitarNumero(){
		Console consola = System.console();
        System.out.print("Introduzca un número: ");
        String strNumero = consola.readLine().trim();
        int numero = Integer.parseInt(strNumero);
        return numero;
	}
	
	public static void imprimirLista( ArrayList< Integer> listaNumeros ){
		for(int numero:listaNumeros){
			System.out.println(numero);
		}
	}
}
