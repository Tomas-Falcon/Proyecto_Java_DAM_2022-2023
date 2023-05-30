public class UsandoSwitchCase{
	public static void main(String ar []){
		//switch case , serie de casos
		int dia = 7;
		switch (dia){
			case 1:
			System.out.println("El dia de hoy es Lunes");
			break;
			case 2:
			System.out.println("El dia de hoy es Martes");
			break;
			case 3:
			System.out.println("El dia de hoy es Miercoles");
			break;
			case 4:
			System.out.println("El dia de hoy es Jueves");
			break;
			case 5:
			System.out.println("El dia de hoy es Viernes");
			break;
			case 6:
			System.out.println("El dia de hoy es Sabado");
			break;
			case 7:
			System.out.println("El dia de hoy es Domingo");
			break;
			case 8: case 9:
			System.out.println("Mañana y pasado se trabaja");
			break;
			default: System.out.println("No entiendo el numero");
		}
	}
}