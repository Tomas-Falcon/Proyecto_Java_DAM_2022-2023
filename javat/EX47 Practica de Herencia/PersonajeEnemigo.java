/**
* Esta clase representa al enemigo del jugador
* @author Tomas Falcon
*/
public class PersonajeEnemigo extends Personaje{
	
	//Constructor 
	
	PersonajeEnemigo(String nombre, String clase, double nivelExperiencia, double fuerza, double inteligencia, String destreza, double resistencia){
		super(nombre,clase,nivelExperiencia,fuerza,inteligencia,destreza,resistencia);
	}
	
	//Método para calcular el nivel de experiencia que se obtiene al derrotar al enemigo
	
	
	//Método para establecer el nivel experiencia
	
	/**
	* Método para imprimir
	*
	*/
	public void imprimirPersonajeEnemigo(){
		System.out.println("#####--- EL ENEMIGO ES : ---####");	
		System.out.println("El nombre del personaje :"+ obtenerNombre());
		System.out.println("La clase del personaje :"+ obtenerClase());
		System.out.println("La experiencia del personaje :"+ obtenerNivelExperiencia());
		System.out.println("La fuerza del personaje :"+ obtenerFuerza());
		System.out.println("La inteligencia del personaje :"+ obtenerInteligencia());
		System.out.println("La destreza del personaje :"+ obtenerDestreza());
		System.out.println("La resistencia del personaje :"+ obtenerResistencia());
	}

}
