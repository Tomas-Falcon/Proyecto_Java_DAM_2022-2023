public class Perimetro{
	public static void main (String ar []){
		int ancho = 5;
		int alto = 3;
		int x = 0;
		int y = 0;  
		
		while(y < alto){
			while(x < ancho){
				if ((x == ancho - 1 )|| (x == 0) || (y == 0) || (y == alto -1))
					System.out.print("*");
				else System.out.print(" ");
				x++;
			}
			System.out.println();
			x = 0;
			y++;
		}
	}
}