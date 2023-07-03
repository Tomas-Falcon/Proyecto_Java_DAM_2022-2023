/**
 * 
 */
package App02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import App01.Operacion;


/**
 * @author Balles
 *
 */
public class ClaseMainAplicacion2 extends Frame implements ActionListener{
	private Button boton;
	private Label etiquetaRuta, etiquetaValor2, etiquetaResultado;
	private TextField cajaRuta, cajaValor1,  cajaValor2, cajaResultado, cajaFecha;
	private Label etiquetaValor1;
	private String direccionArchjivo;
	private String valor1, valor2, resultadoStr, fecha;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClaseMainAplicacion2 interfazGrafica = new ClaseMainAplicacion2();
	}

	public ClaseMainAplicacion2(){
		super ("Calculadora Leer");
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
		
		
		etiquetaResultado = new Label ("Fecha de la operacion");
		etiquetaResultado .setBounds(150,340,130,70);
		add (etiquetaResultado);
		
		cajaFecha = new TextField ();
		cajaFecha.setBounds (300, 340, 300, 25);
		cajaFecha.setBackground(colorTextField);
		add (cajaFecha);

		boton = new Button("Cargar archivo");
		boton.addActionListener(this);
		boton.setSize(100,40);
		boton.setLocation(90,150);
		boton.setBackground(colorBoton);
		add (boton);
		

		
		setBackground(colorFondo);

		setVisible (true);
	}
@Override
	public void actionPerformed(ActionEvent e) {

		
		
		direccionArchjivo = cajaRuta.getText();
		File fichero = new File(direccionArchjivo);
		leerFichero(fichero);
		
		
	}

	public void metodoDePaso() {
		cajaRuta.setText(direccionArchjivo);
		cajaValor1.setText(valor1);
		cajaValor2.setText(valor2);
		cajaResultado.setText(resultadoStr);
		cajaFecha.setText(fecha);
	}
	
	
	public void leerFichero(File fichero) {
		try {
			FileInputStream fis = new FileInputStream(fichero);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			System.out.println("------------------------------------------");
			System.out.println("Leyendo el fichero " + fichero.getName());
			System.out.println("------------------------------------------");
			try { 

				while (true) { 
					dis.readUTF();
					valor1 = dis.readUTF();
			
					valor2 = dis.readUTF();
				
					resultadoStr	= dis.readUTF();
					fecha = dis.readUTF();
					System.out.println(valor1);
					System.out.println(valor2);
					System.out.println(resultadoStr);
					System.out.println(fecha);
				}

			} catch (EOFException e) {
				System.out.println("No hay más fichero");
			}

			dis.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	metodoDePaso();
	}

}
