public class Perimetro2{
	public static void main (String ar []){
		java.io.Console consola = System.console();
		
		System.out.print("Introduzca el simbolo de la figura (alguno como: +, *, @, #, !, ?, ¿): ");
		String simbolo = consola.readLine();
		System.out.println();
		
		System.out.print("Introduzca la anchura de la figura: ");
		String c = consola.readLine();
		System.out.println();
		
		System.out.print("Introduzca la altura de la figura: ");
		String d = consola.readLine();
		int ancho = Integer.parseInt(c);
		int alto = Integer.parseInt(d);
		int x = 0;
		int y = 0;  
		
		while(y < alto){
			while(x < ancho){
				if ((x == ancho - 1 )|| (x == 0) || (y == 0) || (y == alto -1))
					System.out.print(simbolo);
				else System.out.print(" ");
				x++;
			}
			System.out.println();
			x = 0;
			y++;
		}
	}
}