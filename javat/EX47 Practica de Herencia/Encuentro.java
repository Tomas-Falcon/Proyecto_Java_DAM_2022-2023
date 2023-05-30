/**
* Esta clase representa el encuentro entre el enemigo y el jugador
* @author Tomas Falcon
*/

public class Encuentro {
	public static void main (String [] arg){
		System.out.println("*****BIENVENIDO AL JUEGO*******");
		System.out.println("\n");
		
		                                           //nombre,clase,experiencia,fuerza,inteligencia,destreza,resistencia
		PersonajeJugador jugador1=new PersonajeJugador("Pablo", "guerrero", 0, 7, 6, "velocidad", 2); 
		jugador1.imprimirPersonajeJugador();
		System.out.println("\n");
		jugador1.establecerExperiencia(jugador1.obtenerNivelExperiencia());
		//jugador1.imprimirPersonajeJugador();
		
		PersonajeEnemigo enemigo1=new PersonajeEnemigo("Pedro", "mago", 2, 3, 6, "velocidad", 2);
		enemigo1.imprimirPersonajeEnemigo();
		
		lucha(jugador1,enemigo1);
	}
	
	public static void lucha (PersonajeJugador jug1, PersonajeEnemigo eneg1){
		if(jug1.obtenerFuerza()>eneg1.obtenerFuerza()){
			System.out.println("\n");
			System.out.println("**LUCHA**  **LUCHA**  **LUCHA** ");
			System.out.println("\n");
			System.out.println("GANO EL JUGADOR 1 !!");
			jug1.aumentarExperciencia(eneg1.obtenerNivelExperiencia());
			System.out.println("Ahora tienes una experiencia de : " + jug1.obtenerNivelExperiencia());
		}else{
			System.out.println("GANO EL ENEMIGO 1 !!");
		}
	}
}
