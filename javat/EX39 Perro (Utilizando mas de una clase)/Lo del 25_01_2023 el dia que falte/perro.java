	public class Perro{

	public String nombre;
	String color;
	int edad;
	int numeroPatas;
	String género;
	boolean estaVacunado;
	String raza;
	
	//constructores
	
	public Perro(){
		nombre="desconocido";
	}
	
	public Perro(String n){
		nombre=n;
	}
	
	//metodos
	
	public int ladrar(int veces){
		int ladridos=0;
		for(int i=0; i<veces;i++){
			System.out.println("El perro ladra!!");
			ladridos++;
		}
		return ladridos;
	}
	
	public void morder(int numeroMordiscos){
		for(int i=0; i<numeroMordiscos;i++){
			System.out.println("El perro muerde!!");
		}
	}
	
	public boolean dormir(int horas){
		if(horas>0){
			return true;
		}else{
			return false;
		}
	}
	
	public String saltar(int saltos,String unidad){
		return saltar(saltos)+" "+unidad;
	}
	
	public double saltar(int saltos){
		double longitudZancada=1.5;
		String magnitud=" metros !!";
		double longitudSalto=saltos*longitudZancada;
		//System.out.println(longitudSalto+magnitud);
		//imprimirSalto(longitudSalto,magnitud);
		return longitudSalto;
	}
	
	public String salta(int saltos){
		return saltar(saltos)+" METROS";
	}
	
	public void imprimirSalto(double longitudSalto,String magnitud){
		System.out.println(longitudSalto+ magnitud);
	}
	
	public void comer(){
		System.out.println(nombre+"ya comio!!");
	}

	/*public void saltar(int saltos){
		double longitudZancada=1.5;
		String magnitud=" metros !!";
		double longitudSalto=saltos*longitudZancada;
		//System.out.println(longitudSalto+magnitud);
		imprimirSalto(longitudSalto,magnitud);
		//return longitudSalto;
	}*/	
	
	public void imprimir(){
		System.out.println("Perro: "+nombre+" edad: "+edad);
	}
	
	public void sumar(int... a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}



