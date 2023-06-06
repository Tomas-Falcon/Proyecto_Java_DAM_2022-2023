public class Bucles {
	public static void main(String[] args) {
		int a = 0;
		
		while (a <= 100) {
			System.out.println(a + " impar!\n");
			a += 5;
			if (a % 2 != 0)
				continue;
			System.out.println("par!");
		}
	}
}

