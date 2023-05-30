/**
*@author Tomas Francisco Falcon
*@version 1.0
*/

public class Profesor{
	
	public static void main (String args[]){
	
		Circulo c1 = new Circulo(5);
		Cuadrado cu1 = new Cuadrado(3);
		Rectangulo r1 = new Rectangulo(3, 5);
		TrianguloRectangulo t1 = new TrianguloRectangulo(3, 5);
		
		System.out.println();
		System.out.println("La circunferencia de radio " + c1.radio + " tiene un area de " + c1.areaCirculo + " y un perimetro de "+ c1.perimetroCirculo);
		System.out.println();
		System.out.println("El cuadrado de lado " + cu1.lado + " tiene un area de " + cu1.areaCuadrado + " y un perimetro de "+ cu1.perimetroCuadrado);	
		System.out.println();
		System.out.println("El rectangulo de lados " + r1.lado1 + " y " + r1.lado2 + " tiene un area de " + r1.areaRectangulo + " y un perimetro de "+ r1.perimetroRectangulo);	
		System.out.println();
		System.out.println("El triangulo de base " + t1.base + " y altura " + t1.altura + " tiene un area de " + t1.areaTriangulo + " y un perimetro de "+ (Math.round(t1.perimetroTriangulo*100)/100));	
		
	}
}
