package com.decroly.daw;
import java.time.LocalDate;
public class Perro extends Mascotas{

	private String raza;
	private boolean pulgas;
	
	
	public Perro(String nombre, int edad, String estado, String raza, boolean pulgas) {
        
        this.raza = raza;
        this.pulgas = false;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = LocalDate.now();
        this.estado = estado;   
    }

	@Override
	public String toString() {
		return "Animal: Perro -> raza = " + raza + ", pulgas = " + pulgas + ", nombre = " + nombre + ", edad = " + edad + ", estado = "
				+ estado + ", this.fechaNacimiento = " + fechaNacimiento;
	}
	
	@Override
    public void habla() {
        System.out.println("Ladra: Guau");
    }
}
