public class FormandoUnRectangulo{
		public static void main(String ar []){
		int ancho = 5;
		int alto = 2;
		int fila = 0;
		int columna = 0;
		String numeral = "*"; //el "material" del rectanfulo
		
		while(columna < alto){
			while(fila < ancho){
				System.out.print(numeral);
				fila++;
			}
			System.out.println();
			fila = 0;
			columna++;
		}
	}
}