public class ClaseString{
	public static void main(String ar []){

		int a = 0;
		String b = "hola";
		char c [] = {'h','o','l','a'};
		//String b = (String)c;		
		//el grapper envuelve var de tipo primitivo
		//las cadenas se comparan con el metodo "equals" retorna una exprecion boolean b.equals(c)
		// utilizando compareTo (te da un numero entero) b.compareTo(c) 
		
		int d = "abuela".compareTo("abuela");
		System.out.println(d);
		while(a < c.length){
		System.out.print(c[a]);
		a++;
		}
		/*
		byte c = 1;
		while(a < 5){
		System.out.print(b[a]);
		a++;
		}*/
	}
}