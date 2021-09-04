package poo;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {

		Reloj mireloj = new Reloj(3000, true);

		mireloj.enMarcha();

		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");

		System.exit(0);
	}

}

class Reloj {
	
	private int intervalo;

	private boolean sonido;

	public Reloj(int intervalo, boolean sonido) {

		this.intervalo = intervalo;

		this.sonido = sonido;

	}

	public void enMarcha() {

		ActionListener oyente = new DameLaHora2();

		Timer mitemporizador = new Timer(intervalo, oyente);

		mitemporizador.start();
	}
	
	private class DameLaHora2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Date ahora=new Date();
			
			System.out.println("Te pongo la hora cada 3 seg"+ahora);
			
			if (sonido) {
				
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
	}
}
