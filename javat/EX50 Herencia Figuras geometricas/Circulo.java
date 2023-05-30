import java.lang.Math;
public class Circulo extends FiguraGeometrica{
	final double PI=Math.PI;
	public Circulo(double radio){
		super (radio);
		System.out.println("-------------Circulo--------------");
		areaCirculo();
		perimetroCirculo();
		System.out.println("----------------------------------");
		System.out.println();
	}
	public void areaCirculo(){
		double area = super.areaFigura();
		area=PI*area;
		System.out.println("El área del Circulo es: " + area);
	}
	public void perimetroCirculo(){
		double perimetro = super.perimetroFigura();
		perimetro=PI*(perimetro/2);
		System.out.println("El perímetro del Circulo es: " + perimetro);
	}
}