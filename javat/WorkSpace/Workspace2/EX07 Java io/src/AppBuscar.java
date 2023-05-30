import java.io.*;
import java.lang.*;
public class AppBuscar {
	public static void main(String []args){
		File f2=new File("C:\\Users\\Balles\\Desktop");
		String palabra = "java";
		File[] lista=f2.listFiles();
		for (File x: lista){
			long tamano=((x.length())/1024)/1024;
			if(x.getName().endsWith(palabra) && tamano>1){
				System.out.println(x);
			}
		}
	}
}
