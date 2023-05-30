/**
 * @author Tomás
 *
 */
public class Auto {

	private Persona titular;
	private Persona coConductor;
	private String matricula;
	private String marca;
	/**
	 * @param titular
	 * @param coConductor
	 * @param matricula
	 * @param marca
	 */
	public Auto(Persona titular, Persona coConductor, String matricula, String marca) {
		this.titular = titular;
		this.coConductor = coConductor;
		this.matricula = matricula;
		this.marca = marca;
	}
	
	/**
	 * @return the titular
	 */
	public Persona getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	/**
	 * @return the coConductor
	 */
	public Persona getCoConductor() {
		return coConductor;
	}
	/**
	 * @param coConductor the coConductor to set
	 */
	public void setCoConductor(Persona coConductor) {
		this.coConductor = coConductor;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
