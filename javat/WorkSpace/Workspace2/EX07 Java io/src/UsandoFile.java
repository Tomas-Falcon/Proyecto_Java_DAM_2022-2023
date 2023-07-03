import java.io.*;
public class UsandoFile{
	public static void main (String [] args){
		File f =new File("C:\\Users\\Balles\\Desktop\\textito.txt");
		File f2=new File("C:\\Users\\Balles\\Desktop");
		System.out.println(f.exists());
		System.out.println(f.getFreeSpace());
		System.out.println(f.isFile());
		System.out.println(f.getUsableSpace());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.length());
		System.out.println(f.lastModified());
		File[] lista=f2.listFiles();
		for (File x: lista){
			System.out.println(x);
		}
		System.out.println(f.getName());
		System.out.println(f2.pathSeparator);
		System.out.println(f2.pathSeparatorChar);
		System.out.println(f2.separator);
		System.out.println(f2.separatorChar);
		
	}
	public class pequeña {
		public static void main(String []args){
			System.out.println("hola");
		}
		public static void menu(){
			System.out.println("hola");
		}
	}
}