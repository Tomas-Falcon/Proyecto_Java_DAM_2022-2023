public class FiguraGeometrica{
	protected double base;
	protected double altura;
	protected double area;
	protected double perimetro;
	
	public FiguraGeometrica(double base){
		this.base=base;
		this.altura=base;
		
		areaFigura();
		perimetroFigura();
		
	}
	public FiguraGeometrica(double base,double altura){
		this.base=base;
		this.altura=altura;
		areaFigura();
		perimetroFigura();
	}
	public void imprimir(){
		System.out.println("El area de la figuara es "+area);
		System.out.println("El perimetro de la figuara es "+perimetro);
	}
	public double areaFigura(){
		double retorno;
		retorno=base*altura;
		return retorno;
	}
	public double perimetroFigura(){
		double retorno;
		retorno=2*(base+altura);
		return retorno;
	}
}