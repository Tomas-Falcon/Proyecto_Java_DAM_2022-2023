public class Perimetro{
	public static void main (String ar []){
		int ancho = 5;
		int alto = 3;
		int x = 0;
		int y = 0;  
		String material = "*"; //material de la figura
		String relleno = " "; //relleno de la figura
		while(y < alto){
			while(x < ancho){
				if ((x == ancho - 1 )|| (x == 0) || (y == 0) || (y == alto -1))
					System.out.print(material);
				else System.out.print(relleno);
				x++;
			}
			System.out.println();
			x = 0;
			y++;
		}
	}
}