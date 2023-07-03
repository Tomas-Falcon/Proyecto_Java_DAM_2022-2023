public class CalculadoraMetodo{

	public static void main(String arg[]){
		double num1 = obtenerNumero("Introduzca el primer numero");
		double num2 = obtenerNumero("Introduzca el segundo numero");
	}
	public static double obtenerNumero(String msj){
		
		java.io.Console consola = System.console();
		String a = consola.readLine();
		String b = consola.readLine();
		double c = 0;

		/*try{
			String a = consola.readLine();
			
		
		
		}
		catch(Exception e){
			System.out.println("********ERROR********");
			System.out.println("RE INGRESE EL NUMERO");
			obtenerNumero();
		}*/
		return(c);
	}
}