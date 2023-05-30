public class SumadoraInfi{
	public static void main(String ar []){
		
		int a = 0;
		int b = 0;
		while(b < ar.length){
			int c = Integer.parseInt(ar[b]);
			a += c; 
			b++;
		}
		if(ar.length != 0)
				System.out.print("La suma de todos los valores ingresados dan como resultado " + a);
			else System.out.print("ERROR");
		
	}
}