public class LosPrimerosCienMultiplosDeCinco{
	public static void main (String ar []){
		int a = 0;
		int [] multiplos = new int[100];
		while(a < multiplos.length){
			multiplos [a] = (a+1) * 5;
			System.out.println(multiplos[a]);
			a++;
		}
	}
}