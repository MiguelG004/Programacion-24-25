package com.decroly.daw;

import java.time.LocalDate;

public class Loro extends Aves{

	private String origen;
	private boolean habla;
	
	public Loro(String nombre, int edad, String estado, String pico, boolean vuela, String origen, boolean habla) {
        this.origen = origen;
        this.habla = false;
        this.origen = origen;
        this.habla = false;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = LocalDate.now().toString();
        this.estado = estado;   
    }

	@Override
	public String toString() {
		return "Animal: Ave Loro -> nombre = " + nombre + ", pico = " + pico + ", ¿vuela? = " + vuela + ", origen = " + origen + ", ¿habla? = " + habla + ", edad = " + edad + ", estado = "
				+ estado + ", this.fechaNacimiento = " + fechaNacimiento;
	}
	
	public void saluda() {
		System.out.println("El loro ha saludado");
	}
	public String volar() {
		String vuelo = "Vuela";
		return vuelo;
		
	}
}
