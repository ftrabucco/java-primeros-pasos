package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Empleado empleado1=new Empleado("Paco G�mez",85000,1990,12,17);
		 * 
		 * Empleado empleado2=new Empleado("Ana L�pez",95000,1995,6,02);
		 * 
		 * Empleado empleado3=new Empleado("Paco G�mez",105000,2002,03,15);
		 * 
		 * empleado1.subeSueldo(5);
		 * 
		 * empleado2.subeSueldo(5);
		 * 
		 * empleado3.subeSueldo(5);
		 * 
		 * System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo: "+empleado1.
		 * dameSueldo()+ " Fecja de Alta: "+ empleado1.dameFechaContrato());
		 * 
		 * System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo: "+empleado2.
		 * dameSueldo()+ " Fecja de Alta: "+ empleado2.dameFechaContrato());
		 * 
		 * System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo: "+empleado3.
		 * dameSueldo()+ " Fecja de Alta: "+ empleado3.dameFechaContrato());
		 */

		Empleado[] misEmpleados = new Empleado[3];

		misEmpleados[0] = new Empleado("Paco G�mez", 85000, 1990, 12, 17);

		misEmpleados[1] = new Empleado("Ana L�pez", 95000, 1995, 6, 02);

		misEmpleados[2] = new Empleado("Paco G�mez", 105000, 2002, 03, 15);

		/*
		 * for(int i=0;i<3;i++) {
		 * 
		 * misEmpleados[i].subeSueldo(5);
		 * 
		 * }
		 * 
		 * for(int i=0;i<3;i++) {
		 * 
		 * System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "
		 * +misEmpleados[i].dameSueldo()+ " Fecja de Alta: "+
		 * misEmpleados[i].dameFechaContrato());
		 * 
		 * }
		 */

		for (Empleado e : misEmpleados) {

			e.subeSueldo(5);
		}

		for (Empleado e : misEmpleados) {

			System.out.println("Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecja de Alta: "
					+ e.dameFechaContrato());
		}

	}

}

class Empleado {

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private String seccion;

	public String dameNombre() {

		return nombre;
	}

	public double dameSueldo() {

		return sueldo;
	}

	public Date dameFechaContrato() {

		return altaContrato;
	}

	public void subeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;
	}

}