public class OperadoresDos{
	public static void main (String ar []){
		int a = 5;
		int b = a * 2;
		int c =- b + 1;
		int d = 4;
		int e = a % d;
		int f = a < b?15:10;
		int g = 0;
		String j = "pepito fuma marihuana con manu";
		boolean x = j instanceof String;
		while(g <= 2){
			System.out.println (g);
			g++;
			//siempre que g sea menor o igual a 5 se va a sumer un 1 a g
		}
		
		System.out.println ("Es el valor de a " + a);
		System.out.println ("Es el valor de b " + b);
		System.out.println ("Es el valor de c " + c);
		System.out.println ("Es el valor de d " + d);
		System.out.println ("Es el valor de e " + e);
		System.out.println ("Es el valor de f " + f);
		System.out.println ("Es el valor de j " + x);
	}
}