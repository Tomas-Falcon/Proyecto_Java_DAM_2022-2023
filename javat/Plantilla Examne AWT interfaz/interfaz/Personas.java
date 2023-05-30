public class Personas {

	private String nombre;

	private String apellidos;

	private int edad;

	private int telefono;

	
	public Personas(String nombre, String apellidos, int edad, int telefono) {

		super();

		this.nombre = nombre;

		this.apellidos = apellidos;

		this.edad = edad;

		this.telefono = telefono;

	}

	public String getNombre() {

		return nombre;

	}


	public void setNombre(String nombre) {

		this.nombre = nombre;

	}


	public String getApellidos() {

		return apellidos;

	}


	public void setApellidos(String apellidos) {

		this.apellidos = apellidos;

	}


	public int getEdad() {

		return edad;

	}


	public void setEdad(int edad) {

		this.edad = edad;

	}


	public int getTelefono() {

		return telefono;

	}


	public void setTelefono(int telefono) {

		this.telefono = telefono;

	}

	// Por si se usa
	
	public void imprimir() {

		System.out.println("Nombre: " + nombre);

		System.out.println("Apellidos: " + apellidos);

		System.out.println("Edad: " + edad);

		System.out.println("Telefono: " + telefono);

	}

}