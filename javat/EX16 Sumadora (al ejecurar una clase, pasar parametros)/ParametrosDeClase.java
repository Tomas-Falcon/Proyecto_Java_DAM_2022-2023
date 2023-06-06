public class ParametrosDeClase{
	public static void main (String parametros []){
		//al ejecutar la clase, se le pasa un parametro
		for(int a = 0; a < parametros.length; a++){
			System.out.println(">>> " + parametros[a]);
		}
	}
}