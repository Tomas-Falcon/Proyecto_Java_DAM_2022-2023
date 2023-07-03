public class PalabraAleatoria{
	public static void main(String ar []){

		String []b = {"hola", "adios", "tio", "diego el molesto", "martin", "jose", "chao", "boludo", "manu", "man el pesao"};
		double a = Math.random()*b.length + 1;
		int d = (int) a;
		System.out.println(b[d]);	
	}
}