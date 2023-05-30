import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Tomas Falcon
 *
 */
public class IntroduceDatos {


		/**
		 * Este metodo lee y retorna un String
		 * @return Retorna un String
		 */
		public String ingreseString() {
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
		
			String cadenaLeida = null;
			try{
				do {
					cadenaLeida = br.readLine();
					//System.out.println("Su mensaje introducido es: >> "+cadenaLeida);
				}while(cadenaLeida.equals("stop"));
				}catch(Exception e) {
					System.out.println(e.getMessage());
			}
			//System.out.println("---------------");
			
			return cadenaLeida;
		}
		
	/**
	 * Este metodo lee y retorna un Int
	 * @return Retorna un int
	 */
	public int ingreseInt() {
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
		
			String cadenaLeida = null;
			try{
				do {
					cadenaLeida = br.readLine();
					//System.out.println("Su mensaje introducido es: >> "+cadenaLeida);
				}while(cadenaLeida.equals("stop"));
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
			}
			//System.out.println("---------------");
			int resultado = Integer.parseInt(cadenaLeida);
			return resultado;
		}

		/**
		 * Este metodo lee y retorna un double
		 * @return Retorna un double
		 */
		public double ingreseDouble() {
		
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);

			String cadenaLeida = null;
			try{
				do {
					cadenaLeida = br.readLine();
					//System.out.println("Su mensaje introducido es: >> "+cadenaLeida);
				}while(cadenaLeida.equals("stop"));
				}catch(Exception e) {
					System.out.println(e.getMessage());
			}
			//System.out.println("---------------");
			double resultado = Double.parseDouble(cadenaLeida);
			return resultado;
		}
		
	}
