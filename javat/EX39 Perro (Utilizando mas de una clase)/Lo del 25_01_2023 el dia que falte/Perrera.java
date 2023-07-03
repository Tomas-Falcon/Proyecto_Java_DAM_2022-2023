public class Perrera{
	public static void main(String [] arg){
		
		Perro p1 = new Perro();
		p1.nombre="Romám";
		p1.imprimir();
		//p1.sumar(2,3,45,5);
		
		Perro p2 = new Perro();
		//p2.nombre="Romám agresivo";
		p2.imprimir();
		
		//Perro p3 = new Perro();
		//p3.nombre="Romám alpargato";
		//p3.imprimir();
		/*en java la invocacion a metodos, los parametros si son de tipo 
		"primitivo" se pasara el valor y si "no es primitivo" se pasara la referencia*/
		
		Perro p3=p2;  //pasa a ser el mismo valor
		p3.nombre="Romám alpargato";
		p3.imprimir();
		p2.imprimir();
		
	}
}