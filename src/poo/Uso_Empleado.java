package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Empleado empleado1=new Empleado("Paco Gómez",85000,1990,12,17);
		 * 
		 * Empleado empleado2=new Empleado("Ana López",95000,1995,6,02);
		 * 
		 * Empleado empleado3=new Empleado("Paco Gómez",105000,2002,03,15);
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
		
		
		Jefatura jefe_RRHH=new Jefatura("Fran",50000,2000,07,07);
		
		jefe_RRHH.estableceIncentivo(9000);

		Empleado[] misEmpleados = new Empleado[5];

		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);

		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 6, 02);

		misEmpleados[2] = new Empleado("Paco Gómez", 105000, 2002, 03, 15);
		
		misEmpleados[3] = jefe_RRHH; //Polimorfismo en acción. Principio de sustitución
		
		misEmpleados[4]=new Jefatura("María",95000,1999,5,26);
		
		Jefatura jefe_Finanzas=(Jefatura)misEmpleados[4];
		
		jefe_Finanzas.estableceIncentivo(10500);
		
		System.out.println(jefe_Finanzas.tomar_decision("Dar más días de vacaciones a todos"
				+ "los empleados"));
		
		for (Empleado e : misEmpleados) {

			e.subeSueldo(5);
		}
		
		Arrays.sort(misEmpleados);

		for (Empleado e : misEmpleados) {

			System.out.println(e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de Alta: "
					+ e.dameFechaContrato());
		}

	}

}

class Empleado implements Comparable{

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();
		++idSiguiente;
		id=idSiguiente;
	}

	public Empleado(String nom) {

		this(nom,30000,2000,01,01);
	}

	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private String seccion;
	private int id=1;
	private static int idSiguiente;
	
	public String dameNombre() {

		return "ID: "+ id +" Nombre: "+nombre;
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

	@Override
	public int compareTo(Object miObjeto) {
		// TODO Auto-generated method stub
		Empleado otroEmpleado=(Empleado)miObjeto;
		
		if(this.id<otroEmpleado.id) {
			return -1;
		}
		if(this.id>otroEmpleado.id) {
			return 1;
		}
		return 0;
	}
}

class Jefatura extends Empleado implements Jefe{

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	private double incentivo;
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe+incentivo;
	}

	@Override
	public String tomar_decision(String decision) {
		// TODO Auto-generated method stub
		return "Un miembro de la dirección ha tomado la decisión de:" + decision;
	}
	
	
	
}



