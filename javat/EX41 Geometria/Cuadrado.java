/**
*@author Tomas Francisco Falcon
*@version 1.0
*/


public class Cuadrado{
	
	double lado, areaCuadrado, perimetroCuadrado;
	
	
	Cuadrado (double lado){
		this.lado=lado;
		areaCuadrado(lado);
		perimetroCuadrado(lado);

	}

	public void areaCuadrado (double lado){
		this.areaCuadrado=Math.pow(lado, 2);
	
	}
	
	public void perimetroCuadrado (double lado){
		this.perimetroCuadrado=lado*4;
	
	}
	
}