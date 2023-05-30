import java.io.*;
import java.util.*;

public class UsandoArrayList {
	
 

	public static void main(String [] str){
		ArrayList <String> arList =new ArrayList <>(6);
		
		int a = 2;
		arList.add("23");
		arList.add("14");
		arList.add("michifus");
		//arList.add(3.14);
		//arList.add(false);
		arList.add("15");
		arList.add("16");
		
	
		
		System.out.println("Tamaño "+arList.size());
		System.out.println("Valor dentro del indice "+a+" >>> "+arList.get(a));
		
		System.out.println("---------------------------------------------------");
			// imprimir(arList);
		System.out.println("-------------------------------------------------");
			for(String i : arList){
			System.out.println(i);
		}
		/*
		System.out.println("------------------------------------------------");
			imprimir3(arList);*/
	}
	
	/*public static void imprimir(ArrayList arList){
		System.out.println("tamano "+arList.size()+" capacidad "+arList.capacity());
		Enumeration enumeration=arList.iterator();
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}
	}*/
	
	
	/*public static void imprimir3(ArrayList arList){
		for(int indice=0;indice<arList.size();indice++){
			int dato=(int)arList.get(indice);
			System.out.println("|indice >>> "+indice+" ELEMENTO-->> "+dato);
		}
	}*/
}