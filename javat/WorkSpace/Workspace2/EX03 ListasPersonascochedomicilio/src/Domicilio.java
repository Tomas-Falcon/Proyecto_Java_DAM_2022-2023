/**
 * @author Tomas
 *
 */

public class Domicilio {
	
	private String calle;
	private  int altura;
	private  String cp;
	private String pais;
	
	/**
	 * @param calle
	 * @param altura
	 * @param cp
	 * @param pais
	 */
	public Domicilio(String calle, int altura, String cp, String pais) {
		this.calle = calle.toLowerCase();
		this.altura = altura;
		this.cp = cp.toUpperCase();
		this.pais = pais.toLowerCase();
	}

	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

}
