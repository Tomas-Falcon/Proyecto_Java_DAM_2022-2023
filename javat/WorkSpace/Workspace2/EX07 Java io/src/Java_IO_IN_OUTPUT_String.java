
public class Java_IO_IN_OUTPUT_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.err.println("Segun eclipse es un error");
			System.out.println("Segun eclipse es mensaje normal");
			/*
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			
			String cadenaLeida = null;
			try{
				do {
					cadenaLeida = br.readLine();
					System.out.println(">> echo >>"+cadenaLeida);
				}while(cadenaLeida.equals("stop"));
				}catch(Exception e) {
					System.out.println(e.getMessage());
					}
			System.out.println("------fin de la cadena---------");
			*/
			System.out.println("Ingrese un valor a sumar");
			
		 	ClaseIntroduceDatos menu = new ClaseIntroduceDatos();
			int respuesta1 = menu.ingreseInt();
			System.out.println("Respuesta 1 = "+respuesta1);
			System.out.println("Ingrese otro valor a sumar");
			int respuesta2 = menu.ingreseInt();
			System.out.println("Respuesta 2 = "+respuesta2);
			int resultado = respuesta1 + respuesta2;
			System.out.println("Sumando "+respuesta1+" con "+respuesta2+" da como resultado: "+resultado);
		
			
		}

}
