/**
*Clase del TrianguloRectangulo
*@author Tomas Francisco Falcon
*@version 1.0
*/

public class TrianguloRectangulo{
	
	double base, altura , areaTriangulo, perimetroTriangulo;
	
	/**
	 * 
	 * @param base: la base del rectangulo
	 * @param altura: la altura del rectangulo
	 */
	
	TrianguloRectangulo (double base, double altura){
		this.base=base;
		this.altura=altura;
		areaTriangulo(base, altura);
		perimetroTriangulo(base, altura);

	}
	
	/**
	 *  Esta funcion calcula el area del Triangulo, se le ingresa la base y la altura.
	 * @param base la base
	 * @param altura la altura
	 */
	public void areaTriangulo (double base, double altura){
		this.areaTriangulo=(base * altura)/2;
	
	}
	/**
	 * Este metodo obtienen el perimetro del trianguloRectángulo usando los dos lados.
	 * @param lado1 el lado 1
	 * @param lado2 el lado 2
	 */
	public void perimetroTriangulo (double lado1, double lado2){
	this.perimetroTriangulo=base + altura +  Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
	perimetroTriangulo=Math.round(perimetroTriangulo*100/(double) 100);
	}
	
}