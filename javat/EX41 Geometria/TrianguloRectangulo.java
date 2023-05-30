/**
*@author Tomas Francisco Falcon
*@version 1.0
*/

public class TrianguloRectangulo{
	
	double base, altura , areaTriangulo, perimetroTriangulo;
	
	
	TrianguloRectangulo (double base, double altura){
		this.base=base;
		this.altura=altura;
		areaTriangulo(base, altura);
		perimetroTriangulo(base, altura);

	}

	public void areaTriangulo (double base, double altura){
		this.areaTriangulo=(base * altura)/2;
	
	}
	
	public void perimetroTriangulo (double lado1, double lado2){
	this.perimetroTriangulo=base + altura +  Math.sqrt(Math.pow(base,2) + Math.pow(altura, 2));
	perimetroTriangulo=Math.round(perimetroTriangulo*100/(double) 100);
	}
	
}