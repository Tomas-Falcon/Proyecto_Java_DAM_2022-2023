import java.io.*;
public class TomasFalconExamenProg01{
	public static void main(String arg[]){
		Console consola=System.console();
		
		System.out.print("Intoduzca algun valor que quisiera factorizar: ");
		String valorI= consola.readLine();
		
		int valorT= Integer.parseInt(valorI);
		int resFact=1;
		System.out.print("Los valores que conforman el factorial son ");
		int i=valorT;
		while(i>0){
			resFact=resFact*i;
			System.out.print(i+" * ");
			i--;
		}
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("El factorial del numero "+valorI+" es "+resFact);
	}
}