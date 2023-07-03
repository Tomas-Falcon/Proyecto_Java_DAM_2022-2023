public class UnArray{
	public static void main (String ar []){
		/*
			int [] = a;
			a = new int [5];
			eso significa que el tamalo de int (32 bits) y se crean x espacios de memoria por el tama;o del array, el "array" es lo mismo que en c, solo que se define el valor d emanera distinta (a = new int [7]; a [2] = 5;) mientras que en c es (int a[2] = 12;)
		*/
		int [] a;
		int [] b = {30, 4, 5, 6, 1, 15, 35, 50};
		int c = 0;
			a = new int [3];
			a[0] = 17;
			a[1] = 23;
			a[2] = 33;
		//int tamano = b.length; //te da el tamaño del array A
			while(c < 15){
				//System.out.println(a[c]);
				System.out.println(b[c]);
				c++;
				
			}
			System.out.println("El tamaño del array es " + tamano);
	}
}