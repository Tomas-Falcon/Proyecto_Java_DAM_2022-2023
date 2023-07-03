import java.util.*;
import java.util.HashSet; 
public class EliminacionDuplicados {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		String[] numString=sc.nextLine().split(",");
		
		ArrayList<Integer> numeros=new ArrayList<>();
		for(String s:numString) {
			int numeroValor=Integer.parseInt(s);
			if(!numeros.contains(numeroValor)) {
				numeros.add(numeroValor);
			}
		}
		
		System.out.println("LISTA SIN DUPLICADOS \n");
		for(int i:numeros) {
			System.out.println(i);
		}
		
		HashSet<Integer> numerosUnicos=new HashSet<>(numeros);
		System.out.println("CONJUNTO SIN DUPLICADOS");
		
		for(int i: numerosUnicos){
			System.out.println(i);
		}

	}

}
