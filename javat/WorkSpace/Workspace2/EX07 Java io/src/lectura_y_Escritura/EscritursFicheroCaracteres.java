package lectura_y_Escritura;

import java.io.*;

public class EscritursFicheroCaracteres {
	
	public static void main(String[] args) throws Exception{
		File archivo = new File("C:\\Users\\Balles\\Desktop\\test\\2dotest\\archivin.txt");
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("introduce el texto a guardar:\n");
		FileOutputStream fos = new FileOutputStream(archivo, true);
		DataOutputStream  dos = new DataOutputStream(fos);
		
		String linea = "";
		boolean leerMas = false;
		// Se supone que tiene que haber algo que lea el archivo ya existente
		while(linea != null) {
			if(leerMas) {
				dos.writeUTF(linea);
			}else {leerMas = true; }linea = leer.readLine();
		}
		dos.close();
		fos.close();
	}
}
