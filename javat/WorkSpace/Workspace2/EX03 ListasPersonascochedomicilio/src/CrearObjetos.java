/**
 * @author Tomás
 *
 */

public class CrearObjetos {

	/**
	 * @param nombre
	 * @param apellido
	 * @param calle
	 * @param cp
	 * @param pais
	 * @param edad
	 * @param altura
	 */
	public void crearPersona_Domicilio(String nombre, String apellido, String calle, String cp, String pais, int edad, int altura){
		Domicilio domicilio = new Domicilio(calle, altura , cp, pais);
		Persona persona = new Persona(nombre, apellido , edad, domicilio);
		ClaseMain.persona(persona);
	}
	
	/**
	 * @param titular
	 * @param coConductor
	 * @param matricula
	 * @param marca
	 */
	public void crearAuto(Persona titular, Persona coConductor, String matricula, String marca){
		
		Auto auto = new Auto(titular, coConductor, matricula, marca);
		ClaseMain.auto(auto);
	}
}
