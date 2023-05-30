/**
*@author Tomas Francisco Falcon
*@version 1.0
*/


public class Circulo{
		
	double radio, areaCirculo, perimetroCirculo;
	
	
	Circulo (double radio){
		this.radio=radio;
		areaCirculo(radio);
		perimetroCirculo(radio);

	}

	public void areaCirculo (double radio){
	this.areaCirculo=Math.round((((Math.pow(radio, 2) * Math.PI))*100)/(double)100);
	
	}
	
	public void perimetroCirculo (double radio){
	this.perimetroCirculo=Math.round((radio*2*Math.PI)*100)/(double)100;
	
	}
	
}