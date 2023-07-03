import java.io.*;
public class ExamenTest{
	
	static String [] maracaArray = new String [100];
	static double [] precioArray = new double [100];
	static String [] matriculaArray = new String [100];
	
	static int coontador=0;
	
	public static void main (String or []){
		introducuirCoches();
	}
	
	public static void introducuirCoches(){
		Console consola = System.console();
		System.out.println("INGRESA LOS DATOS DE UN COCHE");
		System.out.print("Marca: ");
		String marcaConsola = consola.readLine();
		maracaArray[coontador] = marcaConsola;
		String a = "";
			if(marcaConsola.equals(a)){
				yesno();
			}
			else{
				resto();
			}
	}
	public static void resto(){
		Console consola = System.console();
		System.out.print("Precio: ");
		String precioString = consola.readLine();
		double precioConsola = Double.parseDouble(precioString);
		precioArray[coontador] = precioConsola;
		
		
		System.out.print("Matricula: ");
		String matriculaConsola = consola.readLine();
		matriculaArray[coontador] = matriculaConsola;
		coontador++;
		introducuirCoches();
	}
	public static void yesno(){
		Console consola=System.console();
		System.out.println("Deseas volver a intruducir un coche Y\\N ?");
		String yn = consola.readLine();
		String yynn = yn.toUpperCase();
		char yesno = yynn.charAt(0);
		if(yesno == 89){
			introducuirCoches();
		}else if(yesno == 78){
			listaDeCoches();
		}
	}
	public static void listaDeCoches(){
		int x = 0;
		for(x = 0; x < coontador; x++){
			System.out.println("la marca del auto es "+maracaArray[x]+" y su precio es "+precioArray[x]+" y la matricula es "+matriculaArray[x]);
		}
		restoDelPrograma();
	}
	public static void restoDelPrograma(){
		//Auto mas caro
		double cochemascaro=0;
		String maracamascaro=""; 
		for(int x = 0 ; x < coontador ; x++ ){
			if (precioArray[x] >cochemascaro) {
				cochemascaro = precioArray[x];
			}
		}
		for(int y = 0 ; y < coontador ; y++ ){
				// imprimir mas caro
				if(cochemascaro == precioArray[y]){
					maracamascaro = maracaArray[y];
				System.out.print("el auto mas caro es "+maracamascaro+" y vale "+cochemascaro);
				}
		}
	}
	
}