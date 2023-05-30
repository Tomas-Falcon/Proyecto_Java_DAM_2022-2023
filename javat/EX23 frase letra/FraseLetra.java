public class FraseLetra{
	public static void main(String arg []){
		java.io.Console consola = System.console();
		System.out.print("Ingrese una oracion: ");
		String oracion2 = consola.readLine();
		String oracion = oracion2.toLowerCase();
		char a[] = oracion.toCharArray();
		int v = 0;
		int p = 0;
		int cE = 0;
		int num = 0;
		int valorEnAscii = 0; 
		for(int i = 0; i < a.length; i++){
			if( a[i] >= 97 || a[i] <= 122){
				p++;
			}
			if( 'a' == a[i] || 'e' == a[i] || 'i' == a[i] || 'o' == a[i] || 'u' == a[i]){
			v++;
			}
			else if( a[i] < 97 || a[i] > 122){
				cE++;
			}
			else if(48 >= a[i] || 57 <= a[i]){
				num++;
			}
			
			
			
			valorEnAscii = (int)a[i];
			System.out.println("El valor ascii de "+a[i]+ " es "+valorEnAscii);
		}
		p = p - v;
		System.out.println();
		System.out.println("Tu oracion es "+oracion);
		System.out.println("Tiene "+v+" vocales");
		System.out.println("Tiene "+p+" consonantes");
		System.out.println("Tiene "+cE+" Caracteres Especiales");
		System.out.println("Tiene "+num+" numeros");
	
	}
}