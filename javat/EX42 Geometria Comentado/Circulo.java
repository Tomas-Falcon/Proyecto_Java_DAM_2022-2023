/**
 *  Clase del circulo
 * @author Tomás
 *
 */
public class Circulo{
		
	double radio, areaCirculo, perimetroCirculo;
	
	/**
	 *  Se le pasa al circula su radio (la mitad del circulo)
	 * @param radio Es el valor del radio
	 */
	Circulo (double radio){
		//aunque yo hubiera preferido pasar un circulo entero y dividirlo a la mitad y asi obtener el radio "a" y el radio "b"
		this.radio=radio;
		areaCirculo(radio);
		perimetroCirculo(radio);

	}
	
/**
 * este metodo calcula el area del circulo
 * @param radio con el radio se calcula el area 
 */
	public void areaCirculo (double radio){
	this.areaCirculo=Math.round((((Math.pow(radio, 2) * Math.PI))*100)/(double)100);
	
	}
	/**
	 * con este metodo se calula el perimetro de un circulo
	 * @param radio con su radio se calcula el perimetro
	 */
	public void perimetroCirculo (double radio){
	this.perimetroCirculo=Math.round((radio*2*Math.PI)*100)/(double)100;
	
	}
	
}