import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola "+ nombre_usuario + ". El a�o que viene tendr�s " + edad_usuario + " a�os");
		
	}
    
}
