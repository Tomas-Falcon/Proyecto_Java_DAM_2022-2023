/**
* Esta clase representa al personaje
* @author Tomas Falcon
*/
public class Personaje{

	protected String nombre;
	protected String clase; //guerrero, mago, ladrón, etc
	protected double nivelExperiencia;
	protected double fuerza;
	protected double inteligencia;
	protected String destreza; //Liderazgo, velocidad, etc
	protected double resistencia;
	
	/**
	* Constructor de la clase Persona
	* @param nombre tipo String nombre del personaje
	* @param clase tipo String nombre de la clase
	* @param nivelExperiencia tipo double nivel de experiencia al crear la clase 
	* @param fuerza tipo double valor de la fuerza 
	* @param inteligencia tipo double valor de la inteligencia
	* @param destreza tipo String valor de la destreza
	* @param resistencia tipo double valor de la resistencia
	*
	*/
	
	Personaje(String nombre, String clase, double nivelExperiencia, double fuerza, double inteligencia, String destreza, double resistencia){
		this.nombre=nombre;
		this.clase=clase;
		this.nivelExperiencia=nivelExperiencia;
		this.fuerza=fuerza;
		this.inteligencia=inteligencia;
		this.destreza=destreza;
		this.resistencia=resistencia;
	}
	
	/**
	* Método para obtener el atributo nombre
	* @return nombre Retorna un Strin con el valor del nombre
	*/
	public String obtenerNombre(){
		return nombre;
	}
	
	/**
	* Método para obtener el atributo de la clase
	* @return clase Retorna un Strin con el valor de la clase
	*/
	public String obtenerClase(){
		return clase;
	}
	
	/**
	* Método para obtener el atributo del nivel de xp
	* @return nivelExperiencia Retorna un double con el nivel de experiencia del personaje
	*/
	public double obtenerNivelExperiencia(){
		return nivelExperiencia;
	}
	
	/**
	* Método para obtener el atributo fuerza
	* @return fuerza Retorna un double con el valor de la fuerza del personaje
	*/
	public double obtenerFuerza(){
		return fuerza;
	}
	
	/**
	* Método para obtener el atributo inteligencia
	* @return inteligencia Retorna un double con el valor de la inteligencia del personaje
	*/
	public double obtenerInteligencia(){
		return inteligencia;
	}	

	/**
	* Método para obtener el valor del atributo de la destreza
	* @return nombre Retorna un Strin con el valor de la destreza
	*/
	public String obtenerDestreza(){
		return destreza;
	}
	
	/**
	* Método para obtener el atributo representa
	* @return representa Retorna un double con el valor de la resistencia del personaje
	*/
	public double obtenerResistencia(){
		return resistencia;
	}
	
	/**
	* Método para establecer el atributo de Fuerza
	* @param fuerza Recive un double, indica cuanto el valor que tendra el atributo fuerza
	*
	*/
	public void establecerFuerza(double fuerza){
		this.fuerza = fuerza ;
	}
	
	/**
	* Método para establecer el atributo de inteligencia
	* @param inteligencia Recive un double, indica cuanto el valor que tendra el atributo inteligencia
	*
	*/
	public void establecerInteligencia(double inteligencia){
		this.inteligencia = inteligencia ;
	}
	
	/**
	* Método para establecer el atributo de inteligencia
	* @param destreza Recive un String, indica cuanto el valor que tendra el atributo inteligencia
	*
	*/
	public void establecerDestreza(String destreza){
		this.destreza = destreza ;
	}
	
	/**
	* Método para establecer el atributo de resistencia
	* @param resistencia Recive un double, indica cuanto el valor que tendra el atributo resistencia
	*
	*/
	public void establecerResistencia(double resistencia){
		this.resistencia = resistencia ;
	}
	
	/**
	* Método para imprimir
	*
	*/
	public void imprimirPersonaje(){
		System.out.println("El nombre del personaje :"+ nombre);
		System.out.println("La clase del personaje :"+ clase);
		System.out.println("La experiencia del personaje :"+ nivelExperiencia);
		System.out.println("La fuerza del personaje :"+ fuerza);
		System.out.println("La inteligencia del personaje :"+ inteligencia);
		System.out.println("La destreza del personaje :"+ destreza);
		System.out.println("La resistencia del personaje :"+ resistencia);
	}
}
