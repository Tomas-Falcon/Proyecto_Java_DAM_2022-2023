package LeyendoFicheros;

import java.io.*;

public class LeyendoFicheros {

	public static void main(String[] args) {
		try {

            FileReader fileReader = new FileReader("C:\\Users\\Balles\\Desktop\\test\\ficherin.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al leer el archivo: " + e.getMessage());
        }

	}

}
