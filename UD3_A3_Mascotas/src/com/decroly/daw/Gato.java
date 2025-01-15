package com.decroly.daw;

import java.time.LocalDate;

public class Gato extends Mascotas{

	private String color;
	private boolean peloLargo;
	
	public Gato(String nombre, int edad, String estado, String color, boolean peloLargo) {
        
        this.peloLargo = peloLargo;
        this.color = color;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = LocalDate.now();
        this.estado = estado;   
    }
	
	@Override
	public String toString() {
		return "Animal: Gato -> color = " + color + ", ¿pelo largo? = " + peloLargo + ", nombre = " + nombre + ", edad = " + edad + ", estado = "
				+ estado + ", this.fechaNacimiento = " + fechaNacimiento;
	}
	
	@Override
    public void habla() {
        System.out.println("Maulla: Miau");
    }
}
