package com.decroly.daw;
import java.time.LocalDate;
public abstract class Mascotas {

	
	protected String nombre;
	protected int edad;
	protected String estado;
	protected LocalDate fechaNacimiento;
	
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getEstado() {
		return estado;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Mascota: nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento;
	}
	
	public void cumpleaños(){

    }

    public void muerto(){
     
        this.setEstado("Fallecido");
    }

    public void habla(){
        
    }
	
}
