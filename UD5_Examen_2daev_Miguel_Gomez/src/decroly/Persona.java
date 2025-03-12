package decroly;
import java.time.*;
public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento;
	private String dni;
	private String direccion;
	
	
	
	public Persona(String nombre, LocalDate fechaNacimiento, String dni, String direccion) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public String getDireccion() {
		return direccion;
	}
	
	
	@Override
	public String toString() {
		return "[nombre=" + nombre +  ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", direccion="
				+ direccion;
	}
	
	
	
	
	
}
