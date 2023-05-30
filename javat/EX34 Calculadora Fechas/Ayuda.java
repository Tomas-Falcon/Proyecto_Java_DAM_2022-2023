public  class Ayuda{
	public static void main(String arg []){
		int a [] = {3,7,1,15,55};
		int b = 99;
		int d = 6;
		int c [] = new int [d];
		int i  = 0;
		c [5] = 99;
		
		
		System.out.println("--------------------------------------------------------");
		while(i < a.length){
			System.out.println("En la posicion: "+i+" en el array hay un valor de: "+a[i]);
			i++;
		}
		i = 0;
		
		while(i < a.length){
			c[i] = a[i];
			i++;
		}
		System.out.println("--------------------------------------------------------");
		i = 0;
		
		while(i < c.length){
			System.out.println("En la posicion: "+i+" en el array hay un valor de: "+c[i]);
			i++;
		}
		System.out.println("--------------------------------------------------------");
		i= 0;
		while(i < a.length){
			System.out.println("En la posicion: "+i+" en el array hay un valor de: "+a[i]);
			i++;
		}
		
		a[4] = 99;
		 System.out.println("En la posicion: 5 en el array hay un valor de: "+a[4]);
		
	}
}