package graficos;

import java.awt.Toolkit;

import javax.swing.*;

import java.awt.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado marco= new MarcoCentrado();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);
		
		
		
	}

}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado() {
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
	
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int altoPantalla=tamanoPantalla.height;
		
		int anchoPantalla=tamanoPantalla.width;
		
		setSize(anchoPantalla/2, altoPantalla/2);
		
		setLocation(anchoPantalla/4,altoPantalla/4);
		
		setTitle("marcoCentrado");
		
		Image miIcono=mipantalla.getImage("icono.gif");
		
		setIconImage(miIcono);
	};
}
