import java.io.*;
import java.util.*;

public class GestionInformacion {

	private ArrayList<Personas> listaPersonas;

	public GestionInformacion() {

		listaPersonas = new ArrayList<Personas>();
	}

	public void añadirAlArray(Personas p1) {

		listaPersonas.add(p1);

	}

	public void introducirEnFichero(Personas p1) {
		File fichero = new File("C:\\Users\\Balles\\Desktop\\tusmuertos.txt");

		try {
			FileOutputStream fos = new FileOutputStream(fichero, true); // Si quiero poner una sola persona, quito el
																		// true
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeUTF("-------------------------------------------");
			dos.writeUTF("Datos del cliente");
			dos.writeUTF("-------------------------------------------");
			dos.writeUTF("");
			dos.writeUTF("Nombre:" + p1.getNombre());
			dos.writeUTF("");
			dos.writeUTF("Apellido:" + p1.getApellidos());
			dos.writeUTF("");
			dos.writeUTF("Edad: ");
			dos.writeInt(p1.getEdad());
			dos.writeUTF("");
			dos.writeUTF("");
			dos.writeUTF("Telefono: ");
			dos.writeInt(p1.getTelefono());
			dos.writeUTF("");
			dos.close();

			System.out.println();
			System.out.println("Fichero con los datos del cliente creado");
			System.out.println();
			System.out.println();
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
		leerFichero(fichero);
	}

	public void leerFichero(File fichero) { // Si quiero 1 sola persona, borro:
		try {
			FileInputStream fis = new FileInputStream(fichero);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			System.out.println("------------------------------------------");
			System.out.println("Leyendo el fichero " + fichero.getName());
			System.out.println("------------------------------------------");
			try { // 1.- Try

				while (true) { // 2.- Borro while true, dejo los syso.
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.print(dis.readUTF());
					System.out.print(dis.readInt());
					System.out.println(dis.readUTF());
					System.out.println(dis.readUTF());
					System.out.print(dis.readUTF());
					System.out.print(dis.readInt());
					System.out.println(dis.readUTF());
				}

			} catch (EOFException e) { // 3. Este catch del try
				System.out.println("No hay más fichero");
			}

			dis.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
