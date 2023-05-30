import java.awt.*;
import java.awt.event.*;

public class InterfazAWT extends Frame implements ActionListener{
    private Label etiquetaNombre, etiquetaApellido1, etiquetaApellido2, etiquetaEdad, etiquetaTelefono;
    private TextField cajaNombre, cajaApellido1, cajaApellido2, cajaEdad, cajaTelefono;
    private Button botonGuardar;

    public InterfazAWT() {
        setLayout(null);

        etiquetaNombre = new Label("Nombre:");
        etiquetaNombre.setBounds(50, 50, 100, 20);
        add(etiquetaNombre);

        cajaNombre = new TextField();
        cajaNombre.setBounds(160, 50, 150, 20);
        add(cajaNombre);

        etiquetaApellido1 = new Label("Apellido 1:");
        etiquetaApellido1.setBounds(50, 80, 100, 20);
        add(etiquetaApellido1);

        cajaApellido1 = new TextField();
        cajaApellido1.setBounds(160, 80, 150, 20);
        add(cajaApellido1);

        etiquetaApellido2 = new Label("Apellido 2:");
        etiquetaApellido2.setBounds(50, 110, 100, 20);
        add(etiquetaApellido2);

        cajaApellido2 = new TextField();
        cajaApellido2.setBounds(160, 110, 150, 20);
        add(cajaApellido2);

        etiquetaEdad = new Label("Edad:");
        etiquetaEdad.setBounds(50, 140, 100, 20);
        add(etiquetaEdad);

        cajaEdad = new TextField();
        cajaEdad.setBounds(160, 140, 150, 20);
        add(cajaEdad);

        etiquetaTelefono = new Label("Teléfono:");
        etiquetaTelefono.setBounds(50, 170, 100, 20);
        add(etiquetaTelefono);

        cajaTelefono = new TextField();
        cajaTelefono.setBounds(160, 170, 150, 20);
        add(cajaTelefono);

        botonGuardar = new Button("Guardar");
        botonGuardar.setBounds(160, 200, 80, 30);
       
        botonGuardar.addActionListener(this);
        add(botonGuardar);
        setTitle("Mi Aplicación");
        setSize(350, 250);
        setLocation(200, 200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        // Aquí puedes implementar la lógica para guardar los datos ingresados
        String nombre = cajaNombre.getText();
        String apellido1 = cajaApellido1.getText();
        String apellido2 = cajaApellido2.getText();
        String edad = cajaEdad.getText();
        String telefono = cajaTelefono.getText();

        // Ejemplo de impresión de los datos ingresados
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido 2: " + apellido2);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        // Ejemplo de modificacion de valores de las cajas
        cajaNombre.setText(nombre.toUpperCase());
        cajaApellido1.setText(apellido1.toUpperCase());
        cajaApellido2.setText(apellido2.toUpperCase());
    
        
    }
    public static void main(String[] args) {
        InterfazAWT aplicacion=new InterfazAWT();
    }
}