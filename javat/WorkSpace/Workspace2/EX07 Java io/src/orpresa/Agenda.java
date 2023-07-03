package orpresa;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Agenda extends Frame{

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
	}
	
	public Agenda() {
		super("AGENDA");
		setSize(255,300);
		setLayout(null);
		Color colorBoton = Color.decode("#f2cf4f");
		Color colorFondo = Color.decode("#4f71f2");
		Color colorTextField = Color.decode("#EEEEEE");
		Color colorTexto = Color.decode("#ffffff");
		
		Label nombe = new Label("Nombre:");
		nombe.setBounds(10, 30, 50,30);
		add(nombe);
		
		TextField campoNombre = new TextField();
		campoNombre.setBounds(75, 30, 100,20);
		campoNombre.setBackground(colorTextField);
		add(campoNombre);
		
		
		Label apellido = new Label("Apellido:");
		apellido.setBounds(10, 70, 50,30);
		add(apellido);
		
		TextField campoApellido = new TextField();
		campoApellido.setBounds(75, 70, 100,20);
		campoApellido.setBackground(colorTextField);
		add(campoApellido);
		
		Label telefono = new Label("Telefono:");
		telefono.setBounds(10, 110, 60,30);
		add(telefono);
		
		TextField campoTel = new TextField();
		campoTel.setBounds(75, 110, 100,20);
		campoTel.setBackground(colorTextField);
		add(campoTel);
		
		Button boton = new Button("Agregar a la Agenda");
		boton.setSize(120,40);
		boton.setLocation(60, 180);
		boton.setBackground(colorBoton);
		
		setBackground(colorFondo);
		add(boton);
		
		
		
	
		
		
		
		
		setVisible(true);
	}
	
	
}
