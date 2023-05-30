/**
 * Clase del Rectangulo
 * @author Tomás
 *	clase Rectangulo
 */


public class Rectangulo{
	
	double lado1, lado2 , areaRectangulo, perimetroRectangulo;
	
	/**
	 * 
	 * @param lado1 lado uno del rectngulo
	 * @param lado2 lado dos del rectangulo
	 */
	Rectangulo (double lado1, double lado2){
		this.lado1=lado1;
		this.lado2=lado2;
		areaRectangulo(lado1, lado2);
		perimetroRectangulo(lado1, lado2);

	}
/**
 *  Funcion que calcula el area del rectangulo
 * @param lado1 lado uno del rectngulo
* @param lado2 lado dos del rectangulo
 */
	public void areaRectangulo (double lado1, double lado2){
		this.areaRectangulo=lado1 * lado2;
	
	}
	
	/**
	 *  Funcion que calcula el perimetro del rectangulo
	 *@param lado1 lado uno del rectngulo
	 * @param lado2 lado dos del rectangulo
	 */
	public void perimetroRectangulo (double lado1, double lado2){
		this.perimetroRectangulo=2*(lado1 + lado2);
	
	}
	
}