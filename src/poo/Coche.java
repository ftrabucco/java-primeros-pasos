package poo;

public class Coche {

	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;
	
	private int peso_total;
	
	private String color;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;
		
		}
	
	public String dime_datos_generales() { // GETTER
		
		return "La plataforma del veh�culo tiene " + ruedas + " ruedas "+
	". Mide " + largo/1000 + " metros con un ancho de " + ancho +
	" cm y un peso de " + peso_plataforma + " kg";
	}
	
	
	public void establece_color(String color_coche) { 
		
		color = color_coche;
	}
	
	public void configura_asientos(String asientos_cuero) { // SETTER
		
		if(asientos_cuero=="si") {
			
			this.asientos_cuero=true;
			
		} else {
			
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() { // GETTER
		
		if(asientos_cuero=true) {
			
			return "El coche tiene asientos de cuero";
			
		} else {
			
			return "El coche tiene asientos de serie";
		}
	}
	
	
	

}
