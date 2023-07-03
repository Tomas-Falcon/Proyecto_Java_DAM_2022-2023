/**
 * Clase cuadrado
 * @author Tomás
 *
 */


public class Cuadrado{
	
	double lado, areaCuadrado, perimetroCuadrado;
	
	/**
	 * 
	 * @param lado el lado del cuadrado
	 */
	Cuadrado (double lado){
		this.lado=lado;
		areaCuadrado(lado);
		perimetroCuadrado(lado);

	}
	
	/**
	 *  Esta funcion calcula el area del cuadrado, solo se le ingresa un lado
	 * @param lado el lado
	 */

	public void areaCuadrado (double lado){
		this.areaCuadrado=Math.pow(lado, 2);
	
	}
	
	/**
	 * Este metodo obtienen el perimetro del cuadrado
	 * @param lado el laado
	 */
	public void perimetroCuadrado (double lado){
		this.perimetroCuadrado=lado*4;
	
	}
	
}