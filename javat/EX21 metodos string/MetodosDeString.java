public class MetodosDeString{
	public static void main(String arg []){
		
		
		char [] palabra = {'h','o','l','a'};
		String StrA = new String(palabra);
		String StrPalabra = "Hola animal";
		String libro = "En un lugar de la mancha cuyo nombre no quiero acordarme";
		String listaPalabra = "Que,pelotudo,que,es,Diego,que,no,se,da,cuenta,de,cosas,tan,basicas,como,esto";
		String [] trozos = libro.split(" ");
		String [] trozos2 = listaPalabra.split(",");
		String StrMayu = StrPalabra.toUpperCase();
		String StrMin = StrMayu.toLowerCase();
		String SubCadena = StrPalabra.substring(1,4);//esto lo que hace es mostrar desde la posicion 0 a la anterior a 4
		char LetraPos = StrPalabra.charAt(3);//esto lo que hace es mostrar el caracter en la posicion de 3
		int indice = StrPalabra.indexOf("a",4);//empieza desde la posicion indicada (4) y te devuelve la posicion del caracter solicitado en relacion a 4
		int indice2=StrPalabra.lastIndexOf("a");
		System.out.println("imprime la cariable StrA "+StrA);
		System.out.println("imprime la cariable StrPalabra "+StrPalabra);
		System.out.println("imprime la cariable StrMayu "+StrMayu);
		System.out.println("imprime la cariable StrMin "+StrMin);
		System.out.println("imprime la cariable SubCadena "+SubCadena);
		System.out.println("imprime la cariable StrAStrA "+LetraPos);
		for(int i = 0; i < trozos.length; i++){
		System.out.println(trozos[i]);
		}
		System.out.println();
		for(int i2 = 0; i2 < trozos2.length; i2++){
		System.out.println(trozos2[i2]);
		}
	}
}