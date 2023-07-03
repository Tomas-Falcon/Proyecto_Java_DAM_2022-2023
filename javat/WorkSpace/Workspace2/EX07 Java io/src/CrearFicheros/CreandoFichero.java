package CrearFicheros;
import java.io.*;
public class CreandoFichero {

	public static void main(String[] args) {
		File fichero = new File("C:\\Users\\Balles\\Desktop\\test\\ficherin.txt");
		try {
		FileOutputStream fos = new FileOutputStream(fichero);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeInt(8432111);
		dos.writeChars("\n Si se puede diego");
		dos.writeChars("\n Chueng ching swanng do");
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
