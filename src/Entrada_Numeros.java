import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 = JOptionPane.showInputDialog("Introduce un n�mero");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.print("La ra�z cuadrada de "+ num2+ " es ");
		
		System.out.printf("%1.4f",Math.sqrt(num2));
	}

}
