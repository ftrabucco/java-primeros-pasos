package graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones mimarco = new MarcoBotones();

		mimarco.setVisible(true);

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}






class MarcoBotones extends JFrame {

	public MarcoBotones() {

		setTitle("Botones y eventos");

		setBounds(700,300,500,300);

		LaminaConBotones milamina = new LaminaConBotones();

		add(milamina);

	}
}

class LaminaConBotones extends JPanel {
	

	public void paintComponent(Graphics g) {




	}
}