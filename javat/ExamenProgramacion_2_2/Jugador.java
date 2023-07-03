public class Jugador{
	
	private int edad;
	private String nombre;
	private String nacionalidad;
	
	public Jugador(String nombre, int edad, String nacionalidad){
		
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		
	}
	
	public int getEdad(){
		int edad1 = edad;
		return edad1;
	}
	
	public String getNombre(){
		String nombre1 = nombre;
		return nombre1;
	}
	
	public String getNacionalidad(){
		String nacionalidad1 = nacionalidad;
		return nacionalidad1;
	}
	
	public void imprimir(){
		System.out.println("--------JUGADOR--------");
		System.out.println("--Nombre: "+nombre);
		System.out.println("--Edad: "+edad);
		System.out.println("--Nacionalidad: "+nacionalidad);
		System.out.println();
		System.out.println("--------------------");
		ClaseMenu.menu();
	}
	
}