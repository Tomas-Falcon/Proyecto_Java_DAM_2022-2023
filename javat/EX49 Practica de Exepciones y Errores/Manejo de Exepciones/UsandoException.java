import java.io.*;
public class UsandoException{
	public static void main(String aa[]){
		
	int numero=0;
	
		try{
			numero=Integer.parseInt(aa[0]);	
			if(numero%13==0){
				//throw new MiExcepcion();
				//MiExcepcion ex=new MiExcepcion();
			}
		}catch(ArithmeticException e){
			
		    System.out.println(e.getMessage()); 
		    
		}
		 System.out.println("El numero introducido es ..."+ numero); 	
	}
}
