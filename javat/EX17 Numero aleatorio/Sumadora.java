public class Sumadora{
	public static void main(String ar []){
		
		int a = Integer.parseInt(ar[0]);
		int b = Integer.parseInt(ar[1]);
		int d = Integer.parseInt(ar[2]);
		int c = a + b;
		
			if(ar.length != 0)
				System.out.print("Sumando " + a + " y " + b + "  el resultado es igual a = " + c);
			else System.out.print("ERROR");
		
	}
}