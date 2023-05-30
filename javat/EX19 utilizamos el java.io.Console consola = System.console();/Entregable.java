public class Entregable {
    public static void main(String arara[]) {
        java.io.Console consola = System.console();
        System.out.print("Introduzca la cantidad de alunmos: ");
        String cantAlumnos = consola.readLine();
        int b = Integer.parseInt(cantAlumnos);
        int a = 0;
        int c = 0;

		String nombreMax = "";
		String nombreMin = "";
		double nMax = 0;
		double nMin = 10;
		double sum = 0;
		
        String nombrear[] = new String[b];
        double notaor[] = new double[b];
        while (a < b) {
            System.out.print("Introduzca el nombre y apellido del alumno: ");
            String nombre = consola.readLine();
			System.out.print("Introduzca la nota del alumno: ");
            String nota = consola.readLine();
			double notaDouble = Double.parseDouble(nota);// se obtienen los valores y se tranforman a lo que se tiene que transformar
			if(notaDouble <= 10 || notaDouble >=0)
			{
				nombrear[a] = nombre;// se asignan dichos valores a unos arrays
				notaor[a] = notaDouble;
				
				if(notaor[a] < nMin){
				nMin = notaor [a];
				}
				if(notaor[a] > nMax){
				nMax = notaor[a];
				}
				a++;
				sum += notaDouble;// se suma todos los variables
			}
			else System.out.println("Ingrese una nota entre 0 el y el 10");
		}
			
		  
			double media = sum / b; // se saca el promedio
			System.out.println("La nota media de la clase es " + media);
			
			
		while(c < b){
			if(nMax == notaor[c]){
				nombreMax = nombrear[c]; 
				System.out.print(nombreMax + ", " );
			}
			c++;
		}
		System.out.print("Tienen la nota maxima");
		System.out.println();
		System.out.println();
			c = 0;
		while(c < b){
						
			if(nMin == notaor[c]){
				nombreMin = nombrear[c]; 
				System.out.print(nombreMin+", ");				
			}
			c++;
		}
		System.out.print("Tienen la nota minima");
		
    }
}