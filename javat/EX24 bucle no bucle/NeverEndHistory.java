public class NeverEndHistory{
	public static void main(String arg[]){
		metodo1();
	}
	public static void metodo1(){
		System.out.println("metodo1()");
		metodo2();
		}
	public static void metodo2(){
		int i =0;
		System.out.println("metodo1()");
		i++;
		if (i < 2)
			System.exit(0);
		metodo1();
	}
	
}