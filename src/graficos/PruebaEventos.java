package graficos;

import java.awt.*;

import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.event.*;

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

		setBounds(700, 300, 500, 300);

		LaminaConBotones milamina = new LaminaConBotones();

		add(milamina);

	}
}

class LaminaConBotones extends JPanel implements ActionListener {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");

	public LaminaConBotones() {

		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);

		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object botonPulsado=e.getSource();
		
		if(botonPulsado==botonAzul) {
			setBackground(Color.BLUE);
		}
		else if(botonPulsado==botonAmarillo) {
			setBackground(Color.YELLOW);
		} else {
			setBackground(Color.RED);
		}
		

	}
}