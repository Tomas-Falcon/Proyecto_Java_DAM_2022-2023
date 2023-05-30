import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class PruebaExamen extends Frame implements ActionListener{

	static GestionInformacion gestion= new GestionInformacion();
	static ArrayList<Personas> listaPersonas = new ArrayList<Personas>();
	private Button boton;
	private Button boton2;
	private Label etiquetaNombre;
	private TextField cajaNombre;
	private Label etiquetaApellidos;
	private TextField cajaApellido;
	private Label etiquetaEdad;
	private TextField cajaEdad;
	private Label etiquetaTelefono;
	private TextField cajaTelefono;

	public static void main(String[] args) {
		PruebaExamen interfazGrafica = new PruebaExamen();

	}

	public PruebaExamen(){
		super ("Examen");
		setSize(900,600);
		setLayout (null);

		etiquetaNombre= new Label ("Nombre:");
		etiquetaNombre.setBounds(220,60,70,70);
		add (etiquetaNombre);

		cajaNombre = new TextField ();
		cajaNombre.setBounds (300, 85, 300, 25);
		add (cajaNombre);

		etiquetaApellidos= new Label ("Apellido:");
		etiquetaApellidos.setBounds(220,130,70,70);
		add (etiquetaApellidos);

		cajaApellido = new TextField ();
		cajaApellido.setBounds (300, 150, 300, 25);
		add (cajaApellido);

		etiquetaEdad = new Label ("Edad:");
		etiquetaEdad.setBounds(220,195,70,70);
		add (etiquetaEdad);

		cajaEdad = new TextField ();
		cajaEdad.setBounds (300, 215, 300, 25);
		add (cajaEdad);

		etiquetaTelefono = new Label ("Telefono:");
		etiquetaTelefono .setBounds(220,260,70,70);
		add (etiquetaTelefono);

		cajaTelefono = new TextField ();
		cajaTelefono.setBounds (300, 280, 300, 25);
		add (cajaTelefono);

		boton = new Button("Guardar");
		boton.addActionListener(this);
		boton.setSize(70,40);
		boton.setLocation(400,350);
		add (boton);

		boton2= new Button ("Bobo");
		boton2.addActionListener(this);
		boton2.setSize(70,40);
		boton2.setLocation(500,350);
		add (boton2);

		setVisible (true);
	}

	public void actionPerformed(ActionEvent e) {

		// En caso de que pida dos botones con funcionalidades diferentes 
		
		//if (e.getSource() == boton) {
		//String nombreIntroducido = cajaNombre.getText();
		//String apellidoIntroducido = cajaApellido.getText();
		//String edadIntroducida = cajaEdad.getText();
		//int edadTransformada = Integer.parseInt(edadIntroducida);
		//String telefonoIntroducido = cajaTelefono.getText();
		//int telefonoTransformado = Integer.parseInt(telefonoIntroducido);
		//
		//Personas p1 = new Personas (nombreIntroducido, apellidoIntroducido, edadTransformada, telefonoTransformado);
		//gestion.añadirAlArray(p1);
		//gestion.introducirEnFichero(p1);
		//}else if (e.getSource() == boton2) {
		//      
		//    }

		// Cojo la información de la interfazGrafica y la meto en el objeto Persona.
		
		String nombreIntroducido = cajaNombre.getText();
		String apellidoIntroducido = cajaApellido.getText();
		String edadIntroducida = cajaEdad.getText();
		int edadTransformada = Integer.parseInt(edadIntroducida);
		String telefonoIntroducido = cajaTelefono.getText();
		int telefonoTransformado = Integer.parseInt(telefonoIntroducido);
		Personas p1 = new Personas (nombreIntroducido, apellidoIntroducido, edadTransformada, telefonoTransformado);
		gestion.añadirAlArray(p1);
		gestion.introducirEnFichero(p1);

		cajaNombre.setText("");
		cajaApellido.setText("");
		cajaEdad.setText("");
		cajaTelefono.setText("");

	}

}
