package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {
	
	public static void main(String[] args) {
		
		DameLaHora oyente=new DameLaHora();
		
		Timer miTemporizador=new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener");
		
		System.exit(0);
	}

	
}

class DameLaHora implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 seg:"+ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}