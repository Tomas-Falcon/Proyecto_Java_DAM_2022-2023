import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClaseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void metodoTest() {
		String cadenaEvaluable = "Junit 5 ok";
		String resultadoCorrrercto = "JUnit 5 ok";
		
		assertEquals(cadenaEvaluable, resultadoCorrrercto);
	}
	
	@Test
	public void metodoTest2() {
		String cadenaEvaluable = "JUnit 5 ok";
		String resultadoCorrrercto = "JUnit 5 ok";
		
		assertEquals(cadenaEvaluable, resultadoCorrrercto);
	}


}
