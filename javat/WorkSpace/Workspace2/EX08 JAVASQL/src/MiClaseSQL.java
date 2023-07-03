import java.sql.*;
public class MiClaseSQL {

	public static void main(String[] args) {
		try {	
				//0_ Importar java.sql.*;
			
				//1_ Registrar el Driver
				Class.forName("com.mysql.jdbc.Driver");
			
				
				//2_ Crear la coneccion con el servidor
				String url = "jdbc:mysql://localhost/mybasededatos";
				String usuario = "root";
				String passwd = "mysql";
				Connection conexion  = DriverManager.getConnection(url,usuario,passwd);
				if(conexion != null) {
					System.out.println("Conexion establecida a la base de datos");
				}
				
				//5_ Cerrar recurso
				conexion.close();
				
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		//3_ Crear la sentencia
		//4_ Ejecutar sentencia
		
	}

}
