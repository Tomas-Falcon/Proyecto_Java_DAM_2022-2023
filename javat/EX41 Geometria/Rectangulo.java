/**
*@author Tomas Francisco Falcon
*@version 1.0
*/


public class Rectangulo{
	
	double lado1, lado2 , areaRectangulo, perimetroRectangulo;
	
	
	Rectangulo (double lado1, double lado2){
		this.lado1=lado1;
		this.lado2=lado2;
		areaRectangulo(lado1, lado2);
		perimetroRectangulo(lado1, lado2);

	}

	public void areaRectangulo (double lado1, double lado2){
		this.areaRectangulo=lado1 * lado2;
	
	}
	
	public void perimetroRectangulo (double lado1, double lado2){
		this.perimetroRectangulo=2*(lado1 + lado2);
	
	}
	
}