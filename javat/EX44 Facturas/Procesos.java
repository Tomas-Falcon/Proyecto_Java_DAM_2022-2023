import java.util.*;
import java.text.*;
public class Procesos{
	private ArrayList <Factura> lisFac=new ArrayList<>();
	private ArrayList <Factura> lisFacMax=new ArrayList<>();
	private ArrayList <Factura> lisFacMin=new ArrayList<>();
	public Procesos(){
	
	}
	public void anadirFac(Factura facNew){
		lisFac.add(facNew);
	}
	public void imprimirFacturas(){
		for(int x=0;x<lisFac.size();x++){
			lisFac.get(x).imprimir();
		}
	}
	public double facturaMayor (){
		double facturaMayor=0;
		for (int i=0; i<lisFac.size(); i++){
			double importeArray=lisFac.get(i).returnImporteBruto();
			if(importeArray > facturaMayor){
				facturaMayor=importeArray;
			}
		}	
		return facturaMayor;
	}
	public double facturaMenor (){
		double facturaMenor=90000000;
		for (int i=0; i<lisFac.size(); i++){
			double importeArray=lisFac.get(i).returnImporteBruto();
			if(importeArray< facturaMenor){
				facturaMenor=importeArray;
			}
		}	
		return facturaMenor;
	}
	public void anadirFacMin(){
		double facturaMenor=facturaMenor();
		for(int x=0;x<lisFac.size();x++){
			Factura facMin=lisFac.get(x);
			if(facMin.returnImporteBruto()==facturaMenor){
				lisFacMin.add(facMin);
				System.out.print(facMin.returnNombreEmpresa()+" ");
			}
		}
	}
	public void anadirFacMax(){
		double facturaMayor=facturaMayor();
		for(int x=0;x<lisFac.size();x++){
			Factura facMax=lisFac.get(x);
			if(facMax.returnImporteBruto()==facturaMayor){
				lisFacMax.add(facMax);
				System.out.print(facMax.returnNombreEmpresa()+" ");
			}
		}
	}
	public String facturaAntigua(){
		Date fechaMasAntigua=new Date();
		for (int i=0 ; i < lisFac.size() ; i++){
			String fechaIntroducida=lisFac.get(i).returnFecha();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaTransformada=null;
			try{
				fechaTransformada = formato.parse(fechaIntroducida);
			}catch (Exception e){
				System.out.println ("--------------ERROR---------------");
			}
			if (fechaTransformada.before(fechaMasAntigua)){
				fechaMasAntigua=fechaTransformada;
			}
		}
		String fechaString=dateAString(fechaMasAntigua);
		return fechaString;
	}
	public double ivaTotal(){
		double ivaTotal=0;
		for(int x=0;x<lisFac.size();x++){
			double ivaArray=lisFac.get(x).returnIva();
			ivaTotal=ivaTotal+ivaArray;
		}
		return ivaTotal;
	}
	public String dateAString(Date fecha){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return formato.format(fecha);
	}	
}
	