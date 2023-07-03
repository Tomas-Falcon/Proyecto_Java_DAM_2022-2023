import java.io.*;
public class MiPropioScanner{
	public static void main (String [] args){
		String cadena=preguntar("Dime una frase");
		int numero = preguntarInt("Dime una numero");
		System.out.println(cadena);
		System.out.println(numero);
		
	}
	public static String preguntar(String pregunta){
		System.out.println(pregunta);
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String retorno= null;
		try{
			retorno=br.readLine();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return retorno;
	}
	public static int preguntarInt(String pregunta){
		System.out.println(pregunta);
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String retornoS= null;
		Integer retorno=null;
		try{
			retornoS=br.readLine();
			retorno=Integer.parseInt(retornoS);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		if(retorno!=null){
			return retorno;
		}else{
			return preguntarInt(pregunta);
		}
	}
}