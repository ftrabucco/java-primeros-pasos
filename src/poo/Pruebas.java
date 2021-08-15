package poo;

public class Pruebas {

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Paco");

		Empleados trabajador2 = new Empleados("Ana");

		Empleados trabajador3 = new Empleados("Carlos");

		Empleados trabajador4 = new Empleados("Franco");

		trabajador1.cambiaSeccion("RRHH");

		trabajador2.cambiaNombre("María");

		System.out.println(trabajador1.devuelveDatos());

		System.out.println(trabajador2.devuelveDatos());

		System.out.println(trabajador3.devuelveDatos());

		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());

	}
}

class Empleados {

	private String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;

	public Empleados(String nom) {

		nombre = nom;
		seccion = "Administracion";
		id = idSiguiente;
		idSiguiente++;
	}

	public String devuelveDatos() {

		return "El nombre es: " + nombre + " y la sección es " + seccion + " y el id es " + id;
	}

	public void cambiaSeccion(String seccion) {

		this.seccion = seccion;
	}

	public void cambiaNombre(String nombre) {

		this.nombre = nombre;
	}

	public static String dameIdSiguiente() {

		return "El idSiguiente es:" + idSiguiente;
	}

}