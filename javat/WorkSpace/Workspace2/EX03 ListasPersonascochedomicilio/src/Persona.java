/**
 * @author Tomás
 *
 */
public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private Domicilio domiciolio;
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param domiciolio
	 */
	public Persona(String nombre, String apellido, int edad, Domicilio domiciolio) {
		
		this.nombre = nombre.toLowerCase();
		this.apellido = apellido.toLowerCase();
		this.edad = edad;
		this.domiciolio = domiciolio;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the domiciolio
	 */
	public Domicilio getDomiciolio() {
		return domiciolio;
	}
	/**
	 * @param domiciolio the domiciolio to set
	 */
	public void setDomiciolio(Domicilio domiciolio) {
		this.domiciolio = domiciolio;
	}
}
