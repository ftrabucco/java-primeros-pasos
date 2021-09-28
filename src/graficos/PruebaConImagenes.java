package graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebaConImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoImagen mimarco = new MarcoImagen();

		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame {

	public MarcoImagen() {

		setTitle("prueba con imagen");

		setSize(500, 500);

		LaminaConImagen milamina = new LaminaConImagen();

		add(milamina);

	}
}

class LaminaConImagen extends JPanel {

	private Image imagen;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		// File miimagen=new File("src/graficos/amarok.png");

		try {
			imagen = ImageIO.read(new File("src/graficos/java.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		int anchuraImagen = imagen.getWidth(this);
		int alturaImagen = imagen.getHeight(this);

		g.drawImage(imagen, 0, 0, null);

	}
}