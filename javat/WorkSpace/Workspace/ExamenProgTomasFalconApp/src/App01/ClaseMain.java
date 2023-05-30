/**
 * 
 */
package App01;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 * @author Tomas
 *
 */
public class ClaseMain extends Frame implements ActionListener{

	
	private Button boton;
	private Label etiquetaRuta, etiquetaValor2, etiquetaResultado;
	private TextField cajaRuta, cajaValor1,  cajaValor2, cajaResultado;
	private Label etiquetaValor1;
	private String direccionArchjivo;
	private String valor1, valor2, resultadoStr, fecha;

	public static void main(String[] args) {
		ClaseMain interfazGrafica = new ClaseMain();

	}

	public ClaseMain(){
		super ("Calculadora Escribir");
		setSize(900,600);
		setLayout (null);
		Color colorBoton = Color.decode("#f2cf4f");
		Color colorFondo = Color.decode("#4f71f2");
		Color colorTextField = Color.decode("#EEEEEE");
		
		etiquetaRuta= new Label ("Ruta del Archivo y nombre (C:\\ejemplo\\texto.txt):");
		etiquetaRuta.setBounds(20,60,260,70);
		add (etiquetaRuta);

		cajaRuta = new TextField ();
		cajaRuta.setBounds (300, 85, 300, 25);
		cajaRuta.setBackground(colorTextField);
		add (cajaRuta);

		etiquetaValor1= new Label ("Valor 1:");
		etiquetaValor1.setBounds(220,130,70,70);
		add (etiquetaValor1);

		cajaValor1 = new TextField ();
		cajaValor1.setBounds (300, 150, 300, 25);
		cajaValor1.setBackground(colorTextField);
		add (cajaValor1);

		etiquetaValor2 = new Label ("Valor 2:");
		etiquetaValor2.setBounds(220,195,70,70);

		add (etiquetaValor2);

		cajaValor2 = new TextField ();
		cajaValor2.setBounds (300, 215, 300, 25);
		cajaValor2.setBackground(colorTextField);

		add (cajaValor2);

		etiquetaResultado = new Label ("Resultado de la suma:");
		etiquetaResultado .setBounds(150,260,130,70);
		add (etiquetaResultado);

		cajaResultado = new TextField ();
		cajaResultado.setBounds (300, 280, 300, 25);
		cajaResultado.setBackground(colorTextField);
		add (cajaResultado);

		boton = new Button("Sumar y Guardar");
		boton.addActionListener(this);
		boton.setSize(100,40);
		boton.setLocation(400,350);
		boton.setBackground(colorBoton);
		add (boton);
		

		
		setBackground(colorFondo);
		
	

		setVisible (true);
	}

	public void actionPerformed(ActionEvent e) {
		Operacion operacion = new Operacion();
		
		
		direccionArchjivo = cajaRuta.getText();
		valor1 = cajaValor1.getText();
		valor2 = cajaValor2.getText();
		int valor1Int = Integer.parseInt(valor1);
		int valor2Int = Integer.parseInt(valor2);
		int resultado = valor1Int + valor2Int;
		resultadoStr = String.valueOf(resultado);
		System.out.println("El resultado de sumar "+ valor1Int + " con "+ valor2Int + " es: "+ resultadoStr);
		//	cajaRuta.setText("");
		//	cajaValor1.setText("");
		//	cajaValor2.setText("");
		cajaResultado.setText(resultadoStr);
		fecha = operacion.operar(valor1Int, valor2Int);
		introducirEnFichero();

	}
	
	


	public void introducirEnFichero() {
		File fichero = new File(direccionArchjivo);
		System.out.println("Se a guardado con exito el archivo");
		boolean verdadero_falso = false;
		//dejo el valor en falso xq se da a entender que cada fichero riene una cuenta con una fecha de operacion
		try {
			FileOutputStream fos = new FileOutputStream(fichero, verdadero_falso);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeUTF(direccionArchjivo);
	
			dos.writeUTF(valor1);
	
			dos.writeUTF(valor2);
		
			dos.writeUTF(resultadoStr);
			dos.writeUTF(fecha);
			dos.close();

			System.out.println();
			System.out.println("Fichero con los resultados de la suma creado");
			System.out.println();
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.println("Exepcion del FOS");
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
		//leerFichero(fichero);
	}

	

}
