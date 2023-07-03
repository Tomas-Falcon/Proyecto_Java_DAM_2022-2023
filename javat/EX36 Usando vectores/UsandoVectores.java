import java.util.*;
public class UsandoVectores{
	public static void main (String [] arr){
		Vector <Integer>vector=new Vector<>();
		int a = 2;
		vector.add(23);
		vector.add(13);
		// vector.add("melu");
		//vector.add(3.14);
		//vector.add(false);
		vector.add(13);
		vector.add(13);
		
	
		
		System.out.println("Tamaño "+vector.size());
		System.out.println("Valor dentro del indice "+a+" >>> "+vector.elementAt(a));
		
		System.out.println("#####################################################");
			imprimir(vector);
		System.out.println("#####################################################");
			imprimir2(vector);
		
		System.out.println("#####################################################");
			imprimir3(vector);
	}
	public static void imprimir(Vector vector){
		System.out.println("tamano "+vector.size()+" capacidad "+vector.capacity());
		Enumeration enumeration=vector.elements();
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement());
		}
	}
	
	public static void imprimir2(Vector vector){
		for(Enumeration e =vector.elements();e.hasMoreElements();){
			System.out.println(e.nextElement());
		}
		//nextelemnt de enumeration me proporciona un dato de tipo object ese dato para convertirlo en el dato obtenido final se le tendra que someter  o aun casting
		//Integer tmp (Integer) (e.nextelemnt())
		// tambien podemos tipar al dato enumeration 
		
	}
	public static void imprimir3(Vector vector){
		for(int indice=0;indice<vector.size();indice++){
			int dato=(int)vector.get(indice);
			System.out.println("|indice >>> "+indice+" ELEMENTO-->> "+dato);
		}
	}
}