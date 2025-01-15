package com.decroly.daw;


public abstract class Aves extends Mascotas{

	protected String pico;
	protected boolean vuela;
	


	@Override
	public String toString() {
		return "Animal: Ave -> pico = " + pico + ", ¿vuela? = " + vuela + ", nombre = " + nombre + ", edad = " + edad + ", estado = "
				+ estado + ", this.fechaNacimiento = " + fechaNacimiento;
	}
	
	public String volar() {
		String vuelo = "Se fue volando";
		return vuelo;
		
	}
}
