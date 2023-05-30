/**
 * La clase Rectangulo es una subclase de FiguraGeometrica que representa un rectángulo.
 */
public class Rectangulo extends FiguraGeometrica{
	/**
	 * Constructor de la clase Rectangulo que recibe la base y la altura del rectángulo.
	 *@param base La base del rectángulo
	 *@param altura La altura del rectángulo
	 */
	public Rectangulo(double base,double altura){
		super (base,altura);
		System.out.println("------------Rectangulo------------");
		areaRectangulo();
		perimetroRectangulo();
		System.out.println("----------------------------------");
		System.out.println();
	}
	public void areaRectangulo(){
		double area = super.areaFigura();
		System.out.println("El área del rectangulo es: " + area);
	}
	public void perimetroRectangulo(){
		double perimetro = super.perimetroFigura();
		System.out.println("El perímetro del rectangulo es: " + perimetro);
	}
}