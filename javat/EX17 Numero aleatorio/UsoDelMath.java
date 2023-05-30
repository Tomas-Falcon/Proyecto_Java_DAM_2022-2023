public class UsoDelMath{
	public static void main(String ar []){
		double x = Math.pow(2, 3);
		double b = 25;
		double a = Math.sqrt(b);// le asigna a la variable "a" el valor de la raiz cuadrada de la variable "b"
		double q = 3.2;
		double r = 3.7;
		double t = 3.7;
		double w = Math.ceil(q); //te da el numero entero positivo mas cercano (puede ser mayor o igual)
		double e = Math.floor(r); //te da el numero entero positivo mas cercano (puede ser menor o igual)
		double y = Math.round(t); //te da el numero entero positivo mas cercano (puede ser mayor, menor o igual)
		int num=Integer.parseInt("12");
		//metodos estaticos se ejecutan a traves de la clase
		//los metodos que no son estaticos se ejecutan a traves de una instancia
		double j = Math.random();//te da un pseudo numero random
		String h = "hola";
		System.out.println(h.toUpperCase()); // h.toUpperCase convierte el valor de la string de h a mayus 
		System.out.println(x);
		System.out.println(a);
		System.out.println(w);
		System.out.println(e);
		System.out.println(y);
		System.out.println(j);
			
		/* 
		
		primero va el nombre de la clase y despues un . y despues el metodo.
		en este caso utilizamos el "Math.pow(x , y);" hace que el primer valor sea potenciado por el segundo valor de x a la potencia de y
		
		el metodo min(a, b) de la clase Math asigna a el tipo de variable asociada (int, long, double, float) menor (entre a y b) a la variable asociada Ejemplo int a = 5; int b  = 6; int c = Math.min(a, b); eso asigna a c el valor minimo entre a y b (que es 5)
		
		el metodo max(a, b) de la clase Math asigna a el tipo de variable asociada (int, long, double, float) mayor (entre a y b) a la variable asociada Ejemplo int a = 5; int b  = 6; int c = Math.min(a, b); eso asigna a c el valor maximo entre a y b (que es 6)  
		
		*/
	}
}