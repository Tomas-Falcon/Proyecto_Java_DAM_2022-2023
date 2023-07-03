import java.io.*;
public class UsandoPrintWriter{
	public static void main (String [] args){
	
		System.out.println("hola mundo");

		PrintWriter pw= new PrintWriter (System.out,true);
		pw.println("Imprime una cadena");
		int contador =0;
		while(contador<10){
			pw.print(">"+(contador++));
		} 
	}
}