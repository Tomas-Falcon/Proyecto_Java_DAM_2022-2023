import java.io.*;
import java.util.*;

public class EcuacionDeSegundogrado{
	
	public static void main(String [] arg){
		
		
		String respuestaA = preguntas("Ingrese el valor de A: ");
		int a = Integer.parseInt(respuestaA);
		
		
		String respuestaB = preguntas("Ingrese el valor de B: ");
		int b = Integer.parseInt(respuestaB);
		
		
		String respuestaC = preguntas("Ingrese el valor de C: ");
		int c  = Integer.parseInt(respuestaC);
		
		System.out.println(a + " " + b + " " + c);
		
		ecuacion(a, b, c);
		
	}
	
	public static String preguntas(String pregunta){
		Console consola = System.console();
		System.out.print(pregunta);
		String respuesta = consola.readLine();
		return respuesta;
	}
	
	public static void ecuacion(int a, int b, int c){
		
		double denominador = 2*a;
		double raiz_Positivo = (-b) + (Math.sqrt((b*b)-4*a*c));
		double raiz_Negativo = (-b) - (Math.sqrt((b*b)-4*a*c));
		double x1 = raiz_Positivo/denominador;
		double x2 = raiz_Negativo/denominador;
		
		System.out.println("El valor de x1 es: "+x1);
		System.out.println("El valor de x2 es: "+x2);
	}
}
