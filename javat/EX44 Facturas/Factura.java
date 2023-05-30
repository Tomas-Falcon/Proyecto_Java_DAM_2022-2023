public class Factura{
	private String nombreEmpresa;
	private String fecha;
	private double importeBruto;
	private double importeNeto;
	private double iva;
	
	public Factura (String nombreEmpresa,String fecha,double importeBruto){
		this.nombreEmpresa=nombreEmpresa;
		this.fecha=fecha;
		this.importeBruto=importeBruto;
		this.iva=importeBruto*0.15;
		this.importeNeto=importeBruto+iva;
	}
	public String returnNombreEmpresa (){
		return nombreEmpresa;
	}
	public String returnFecha (){
		return fecha;
	}
	public double returnImporteBruto (){
		return importeBruto;
	}
	public double returnIva (){
		return iva;
	}
	public void imprimir(){
		System.out.println("*******FACTURA*******");
		System.out.println("El nombre de la empresa es:"+nombreEmpresa);
		System.out.println("La fecha es:"+fecha);
		System.out.println("El importe bruto es:"+importeBruto);
		System.out.println("El iva es:"+iva);
		System.out.println("El importe neto es:"+importeNeto);
	}
}