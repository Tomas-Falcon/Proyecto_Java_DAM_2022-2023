public class ImprimiendoChars{
	public static void main(String arg []){
		String texto = "Mucho texto LOREM";
		char a[] = texto.toCharArray();// se combierte el string a un array de chars
		for(int i = 0; i < a.length; i++){
			System.out.println("La letra en la posicion "+i+ " es " + a[i]);//se imprime cada uno
		}
	}
}