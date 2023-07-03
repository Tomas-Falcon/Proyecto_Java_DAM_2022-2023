package orpresa;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agenda2  extends Frame implements ActionListener{
	
	Button boton;
	Panel panel;
	boolean color = false;
	TextField cajaDeTexto;
	Label labelin = new Label("Introduzca un textin");
	String respuesta;
	public static void main(String[] args) {
		Agenda2 agenda2 = new Agenda2();

	}
	
	public void actionPerformed(ActionEvent e) {
		respuesta = cajaDeTexto.getText();
		if(!color) {
			panel.setBackground(Color.YELLOW);
			System.out.println("amarillo");
			color = true;
		}else {
			panel.setBackground(Color.black);
			System.out.println("negro");
			color = false;
		}
		System.out.println(respuesta);
	}
	
	public Agenda2() {
		super("AGENDA");
		//setSize(255,300);
		setSize(500,600);
		setLayout(null);
		panel = new Panel();
		panel.setSize(400, 500);
		panel.setLocation(30, 50);
		panel.add(labelin);
		cajaDeTexto = new TextField(10);
		panel.add(cajaDeTexto);

		boton = new Button("Boton");
		boton.addActionListener(this);
		
		Color colorBoton = Color.decode("#fefe");
		panel.setBackground(colorBoton);
		panel.add(boton);
		add(panel);
		
		
		/*
		super("AGENDA");
			setSize(255,300);
			Color colorBoton = Color.decode("#feccfe");
			Color colorFondo = Color.decode("#CCFFCC");
			Color colorTextField = Color.decode("#EEEEEE");
			
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
		*/
		setVisible(true);
	}

		

	
	

}
