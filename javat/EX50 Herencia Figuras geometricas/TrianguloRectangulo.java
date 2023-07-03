import java.lang.Math;
public class TrianguloRectangulo extends FiguraGeometrica{
	public TrianguloRectangulo(double base,double altura){
		super (base,altura);
		System.out.println("-------TrianguloRectangulo--------");
		areaTrianguloRectangulo();
		perimetroTrianguloRectangulo();
		System.out.println("----------------------------------");
		System.out.println();
	}
	public void areaTrianguloRectangulo(){
		double area = super.areaFigura();
		area=area/2;
		System.out.println("El área del Triangulo rectangulo es: " + area);
	}
	public void perimetroTrianguloRectangulo(){
		double perimetro = super.perimetroFigura();
		double hipotenusa=Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
		perimetro=perimetro+hipotenusa;
		System.out.println("El HIpotenusa del Triangulo rectangulo es: " + hipotenusa);
		System.out.println("El perímetro del Triangulo rectangulo es: " + perimetro);
		
	}
}