/**
* Esta clase representa al personaje del jugador
* @author Tomas Falcon
*/
public class PersonajeJugador extends Personaje{
	
	
	
	/**
	* Constructor de la clase PersonajeJugador
	* @param nombre tipo String nombre del personaje
	* @param clase tipo String nombre de la clase
	* @param nivelExperiencia tipo double nivel de experiencia al crear la clase 
	* @param fuerza tipo double valor de la fuerza 
	* @param inteligencia tipo double valor de la inteligencia
	* @param destreza tipo String valor de la destreza
	* @param resistencia tipo double valor de la resistencia
	*
	*/
	
	PersonajeJugador(String nombre, String clase, double nivelExperiencia, double fuerza, double inteligencia, String destreza, double resistencia){
		super(nombre,clase,nivelExperiencia,fuerza,inteligencia,destreza,resistencia);
	}
	
	/**
	* Este metodo reestablece el nivel del jugador a 1
	* @param nivelExperiencia Recive un double
	*
	*/
	
	public void establecerExperiencia(double nivelExperiencia){
		this.nivelExperiencia=1;
	}
	
	
	/**
	* Método para aumentar la experiencia del jugador
	* @param aumento Recive un double, indica cuanto aumenta la xp
	*
	*/
	public void aumentarExperciencia(double aumento){
		this.nivelExperiencia=nivelExperiencia + aumento;
		//System.out.println("Ahora tienes una experiencia de : " + nivelExperiencia);
	}
	
	
	/**
	* Método para imprimir
	*
	*/
	public void imprimirPersonajeJugador(){
		System.out.println("#####--- EL JUGADOR ES ---####");
		System.out.println("El nombre del personaje :"+ obtenerNombre());
		System.out.println("La clase del personaje :"+ obtenerClase());
		System.out.println("La experiencia del personaje :"+ obtenerNivelExperiencia());
		System.out.println("La fuerza del personaje :"+ obtenerFuerza());
		System.out.println("La inteligencia del personaje :"+ obtenerInteligencia());
		System.out.println("La destreza del personaje :"+ obtenerDestreza());
		System.out.println("La resistencia del personaje :"+ obtenerResistencia());
	}
}
