public class Aplicacion{
	public static void main(String [] arg){
		try{
			
			ClaseSinError c=new ClaseSinError();
			System.out.println(c);
			
		/*}catch(ArithmeticException e){
			
			//e.printStackTrace(); muestra la pila del error
			System.out.println(e.getMessage()); 
			System.out.println("Error"); 
			
		}catch(ArrayIndexOutOfBoundsException ez){
			System.out.println(ez.getMessage()); */
			
		}catch(NullPointerException || ParseException e3){
			System.out.println(e3.getMessage());
		}
	}
}

/*APUNTES: 
 * HAY UNA SENTECIA COMPLEMENTARIA DEL CATCH:
 * finally, asegura de que el bloque critico se va a ejecutar 
 * parse es critico; format no lo es (simpleDateFormat)
 * 
 * */
