public class ClaseMain{
	
	public static void main(String args []){
		ClaseHijaHija claseSuperHija = new ClaseHijaHija();
		claseSuperHija.metodo1();
		System.out.println();
		
		System.out.println("--Se imprime el metodo 1 de la primera clase abstracta (super padre )");
		System.out.println();
		
		claseSuperHija.metodo2();
		System.out.println();
		
		System.out.println("--Se imprime el metodo 2 de la clase ClaseNormalHIja --");
		System.out.println();
		
		claseSuperHija.METODO3();
		System.out.println("Se imprime el metodo 3 de la clase ClaseNormalHIja, es un metodo constante");
		
	}
	
}