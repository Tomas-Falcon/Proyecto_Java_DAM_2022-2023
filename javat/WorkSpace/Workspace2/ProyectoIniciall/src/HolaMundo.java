
public class HolaMundo {
	
	static int edad = 20;
	static String nombre = "Tomas";
	static String apellido = "Falcon";
	
	public static void main(String[] args) {
		ImprimirHolaMundo holaMundo = new ImprimirHolaMundo();
		holaMundo.imprimirHolaMundo();
	
		imprimirHolaMundo2();
		
		
	}

	
	
	 public static void imprimirHolaMundo2(){
		System.out.println("Hello World");
		System.out.println(nombre+" "+apellido+" "+edad+" años");
		
	}

}
