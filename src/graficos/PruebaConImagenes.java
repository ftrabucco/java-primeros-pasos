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

		setBounds(750, 300, 300, 200);

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
			imagen = ImageIO.read(new File("src/graficos/amarok.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		g.drawImage(imagen, 5, 5, null);

	}
}
