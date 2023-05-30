package CrearFicheros;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFicheros {
	public static void main(String[] args) {
		File fichero = new File("C:\\Users\\Balles\\Desktop\\test\\ficherin2.txt");
		try {
		FileOutputStream fos = new FileOutputStream(fichero,true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		String msj = "el valor de 243 en ";
		
		dos.writeChars(msj+";");
		dos.writeInt(243);	
		dos.close();
		bos.close();
		fos.close();
		System.out.println("Fichero creado");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
