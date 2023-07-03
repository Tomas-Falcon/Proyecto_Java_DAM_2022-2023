public class UsoDelFor{
	public static void main(String ar []){
		for(int a = 0; a <= 10; a++){
			System.out.println(a);
		}
		for(int b = 10; b >= 0; b--){
			System.out.println(b);
		}
		for(int c = 10; c >= 0; c-=2){
			System.out.println(c);
		}
		for(int d = 0, j = 0; j <= 100; j+=5){
			System.out.println(j);
			d+=5;
			System.out.println(d);
		}
	}
}