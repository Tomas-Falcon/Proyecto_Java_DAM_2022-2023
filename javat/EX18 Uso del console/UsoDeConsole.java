public class UsoDeConsole{
public static void main (String ar []){
		java.io.Console consola=System.console();
		System.out.println("Introduzca su nombre:");
		String nombre = consola.readLine();
		System.out.println("Introduzca su apellido:");
		String apellido = consola.readLine();
		String saludo = "Hola, "+nombre+" "+apellido+", ¿como estas?";
		System.out.println(saludo);
		
	}
}