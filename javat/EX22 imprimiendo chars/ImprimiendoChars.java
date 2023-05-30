public class ImprimiendoChars{
	public static void main(String arg []){
		String texto = "Mucho texto LOREM";
		char a[] = texto.toCharArray();
		for(int i = 0; i < a.length; i++){
			System.out.println("La letra en la posicion "+i+ " es " + a[i]);
		}
	}
}