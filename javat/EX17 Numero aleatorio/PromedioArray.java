public class PromedioArray{
	public static void main(String ar []){
		
		int a = 0;
		int b = 0;
		while(b < ar.length){
			int c = Integer.parseInt(ar[b]);
			a += c; 
			b++;
		}
		double d = Double.valueOf(a) /  Double.valueOf(ar.length);
		if(ar.length != 0)
				System.out.print("El promedio de los numeros ingresados da como resultado " + d);
			else System.out.print("ERROR");
	}
}