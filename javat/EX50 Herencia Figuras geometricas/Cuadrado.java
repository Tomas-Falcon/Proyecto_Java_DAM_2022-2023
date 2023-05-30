public class Cuadrado extends FiguraGeometrica{
	public Cuadrado(double lado){
		super (lado);
		System.out.println("-------------CUADRADO-------------");
		areaCuadrado();
		perimetroCuadrado();
		System.out.println("----------------------------------");
		System.out.println();
	}
	public void areaCuadrado(){
		double area = super.areaFigura();
		System.out.println("El área del cuadrado es: " + area);
	}
	public void perimetroCuadrado(){
		double perimetro = super.perimetroFigura();
		System.out.println("El perímetro del cuadrado es: " + perimetro);
	}
}