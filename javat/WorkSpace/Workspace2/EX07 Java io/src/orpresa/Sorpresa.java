package orpresa;
import java.awt.*;
public class Sorpresa  extends Frame{

	public static void main(String[] args){
		Sorpresa sorpresa = new Sorpresa();

	}
	public Sorpresa() {
		super("WAT Wui Absolute Theme");
		setSize(700,400);
		setLayout(null);
		
		Button boton = new Button("Aceptar");
		boton.setSize(70,40);
		boton.setLocation(190, 350);
		add(boton);
		
		Label etiqueta = new Label("etiquetin");
		etiqueta.setBounds(10, 60, 200,50);
		add(etiqueta);
		
		TextField texto = new TextField();
		etiqueta.setBounds(220, 60, 100,50);
		add(texto);
		
		
		
		
		setVisible(true);
	}
}

