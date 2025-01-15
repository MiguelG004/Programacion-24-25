package com.decroly.daw;

import java.time.LocalDate;

public class Canario extends Aves{

	private String color;
	private boolean canta;
	
	public Canario(String nombre, int edad, String estado, String pico, boolean vuela, String color, boolean canta) {
        this.color = color;
        this.canta = false;
        this.pico = pico;
        this.vuela = false;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = LocalDate.now();
        this.estado = estado;   
    }

	@Override
	public String toString() {
		return "Animal: Ave Canario -> nombre = " + nombre + ", pico = " + pico + ", ¿vuela? = " + vuela + ", color = " + color + ", ¿canta? = " + canta + ", edad = " + edad + ", estado = "
				+ estado + ", this.fechaNacimiento = " + fechaNacimiento;
	}
	

	public void habla() {
		System.out.println("Pia: pio pio");
	}
	public String volar() {
		String vuelo = "Se fue volando";
		return vuelo;
		
	}
	
}
